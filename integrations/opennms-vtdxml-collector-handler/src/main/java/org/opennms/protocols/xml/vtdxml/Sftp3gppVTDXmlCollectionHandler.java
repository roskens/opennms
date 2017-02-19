/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2011-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.protocols.xml.vtdxml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.opennms.core.utils.ParameterMap;
import org.opennms.netmgt.collection.api.AttributeGroupType;
import org.opennms.netmgt.collection.api.CollectionAgent;
import org.opennms.netmgt.collection.api.CollectionException;
import org.opennms.netmgt.collection.api.CollectionStatus;
import org.opennms.netmgt.model.ResourcePath;
import org.opennms.protocols.sftp.Sftp3gppUrlConnection;
import org.opennms.protocols.sftp.Sftp3gppUrlHandler;
import org.opennms.protocols.xml.collector.Sftp3gppUtils;
import org.opennms.protocols.xml.collector.UrlFactory;
import org.opennms.protocols.xml.collector.XmlCollectionResource;
import org.opennms.protocols.xml.collector.XmlCollectionSet;
import org.opennms.protocols.xml.config.Request;
import org.opennms.protocols.xml.config.XmlDataCollection;
import org.opennms.protocols.xml.config.XmlSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ximpleware.VTDNav;

/**
 * The custom implementation of the interface XmlCollectionHandler for 3GPP XML Data.
 * <p>This supports the processing of several files ordered by filename, and the
 * timestamp between files won't be taken in consideration.</p>
 * <p>The state will be persisted on disk by saving the name of the last successfully
 * processed file.</p>
 * <p>This implementation contains basically the same implementation for the method
 * from Sftp3gppXmlCollectionHandler, but using the VTD-XML parser instead of DOM
 * parser for faster performance.</p>
 * 
 * @author <a href="mailto:agalue@opennms.org">Alejandro Galue</a>
 */
public class Sftp3gppVTDXmlCollectionHandler extends AbstractVTDXmlCollectionHandler {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(Sftp3gppVTDXmlCollectionHandler.class);

    /* (non-Javadoc)
     * @see org.opennms.protocols.xml.collector.XmlCollectionHandler#collect(org.opennms.netmgt.collectd.CollectionAgent, org.opennms.protocols.xml.config.XmlDataCollection, java.util.Map)
     */
    @Override
    public XmlCollectionSet collect(CollectionAgent agent, XmlDataCollection collection, Map<String, Object> parameters) throws CollectionException {
        // Create a new collection set.
        XmlCollectionSet collectionSet = new XmlCollectionSet();
        collectionSet.setCollectionTimestamp(new Date());
        collectionSet.setStatus(CollectionStatus.UNKNOWN);

        // Create a map of parameters from the service to use in URLs, etc.
        Map<String, String> params = filterParameters(parameters);

        // TODO We could be careful when handling exceptions because parsing exceptions will be treated different from connection or retrieval exceptions
        DateTime startTime = new DateTime();
        Sftp3gppUrlConnection connection = null;
        try {
            // FIXME: Does not support storeByFS
            ResourcePath resourcePath = ResourcePath.get(Integer.toString(agent.getNodeId()));
            for (XmlSource source : collection.getXmlSources()) {
                if (!source.getUrl().startsWith(Sftp3gppUrlHandler.PROTOCOL)) {
                    throw new CollectionException("The 3GPP SFTP Collection Handler can only use the protocol " + Sftp3gppUrlHandler.PROTOCOL);
                }
                String urlStr = parseUrl(source.getUrl(), agent, collection.getXmlRrd().getStep(), params);
                Request request = parseRequest(source.getRequest(), agent, collection.getXmlRrd().getStep(), params);
                URL url = UrlFactory.getUrl(urlStr, request);
                String lastFile = Sftp3gppUtils.getLastFilename(getResourceStorageDao(), getServiceName(), resourcePath, url.getPath());
                connection = (Sftp3gppUrlConnection) url.openConnection();
                if (lastFile == null) {
                    lastFile = connection.get3gppFileName();
                    LOG.debug("collect(single): retrieving file from {}{}{} from {}", url.getPath(), File.separatorChar, lastFile, agent.getHostAddress());
                    VTDNav doc = getVTDXmlDocument(urlStr, request);
                    fillCollectionSet(agent, collectionSet, source, doc);
                    Sftp3gppUtils.setLastFilename(getResourceStorageDao(), getServiceName(), resourcePath, url.getPath(), lastFile);
                    Sftp3gppUtils.deleteFile(connection, lastFile);
                } else {
                    connection.connect();
                    List<String> files = connection.getFileList();
                    long lastTs = connection.getTimeStampFromFile(lastFile);
                    boolean collected = false;
                    for (String fileName : files) {
                        if (connection.getTimeStampFromFile(fileName) > lastTs) {
                            LOG.debug("collect(multiple): retrieving file {} from {}", fileName, agent.getHostAddress());
                            InputStream is = connection.getFile(fileName);
                            try {
                                VTDNav doc = getVTDXmlDocument(is, request);
                                fillCollectionSet(agent, collectionSet, source, doc);
                            } finally {
                                IOUtils.closeQuietly(is);
                            }
                            Sftp3gppUtils.setLastFilename(getResourceStorageDao(), getServiceName(), resourcePath, url.getPath(), fileName);
                            Sftp3gppUtils.deleteFile(connection, fileName);
                            collected = true;
                        }
                    }
                    if (!collected) {
                        LOG.warn("collect: could not find any file after {} on {}", lastFile, agent);
                    }
                }
            }
            collectionSet.setStatus(CollectionStatus.SUCCEEDED);
            return collectionSet;
        } catch (Exception e) {
            collectionSet.setStatus(CollectionStatus.FAILED);
            throw new CollectionException(e.getMessage(), e);
        } finally {
            String status = CollectionStatus.SUCCEEDED.equals(collectionSet.getStatus()) ? "finished" : "failed";
            DateTime endTime = new DateTime();
            LOG.debug("collect: {} collection {}: duration: {} ms", status, collection.getName(), endTime.getMillis()-startTime.getMillis());
            UrlFactory.disconnect(connection);
        }
    }

    /* (non-Javadoc)
     * @see org.opennms.protocols.xml.collector.AbstractXmlCollectionHandler#fillCollectionSet(java.lang.String, org.opennms.protocols.xml.config.Request, org.opennms.netmgt.collection.api.CollectionAgent, org.opennms.protocols.xml.collector.XmlCollectionSet, org.opennms.protocols.xml.config.XmlSource)
     */
    @Override
    protected void fillCollectionSet(String urlString, Request request, CollectionAgent agent, XmlCollectionSet collectionSet, XmlSource source) throws Exception {
        // This handler has a custom implementation of the collect method, so there is no need to do something special here.
    }

    /* (non-Javadoc)
     * @see org.opennms.protocols.xml.collector.AbstractXmlCollectionHandler#processXmlResource(org.opennms.protocols.xml.collector.XmlCollectionResource, org.opennms.netmgt.config.collector.AttributeGroupType)
     */
    @Override
    protected void processXmlResource(XmlCollectionResource resource, AttributeGroupType attribGroupType) {
        Sftp3gppUtils.processXmlResource(resource, attribGroupType);
    }

}
