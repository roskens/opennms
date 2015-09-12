/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2015 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2015 The OpenNMS Group, Inc.
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

package org.opennms.core.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.XMLFilterImpl;

public class MultipleNamespacesFilter extends XMLFilterImpl {

    private static final Logger LOG = LoggerFactory.getLogger(MultipleNamespacesFilter.class);

    private final String m_primaryNamespaceUri;
    private final List<String> m_namespaceUris;
    private boolean m_addedNamespace = false;

    public MultipleNamespacesFilter(final String namespaceUri, final Set<String> extraNamespaceUris) {
        super();
        this.m_namespaceUris = new ArrayList<>();

        LOG.trace("MultipleNamespacesFilter initalized with primary NS {}, extra Namespaces {}", namespaceUri, extraNamespaceUris);
        m_primaryNamespaceUri = namespaceUri.intern();
        this.m_namespaceUris.addAll(extraNamespaceUris);
    }

    @Override
    public void startDocument() throws SAXException {
        LOG.trace("startDocument");
        super.startDocument();
        startControlledPrefixMapping();
    }
    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) throws SAXException {
        LOG.trace("startElement: uri = {}, new uri = {}, localName = {}, qName = {}, attributes = {}", uri, m_namespaceUris, localName, qName, attributes);

        final String type = attributes.getValue("http://www.w3.org/2001/XMLSchema-instance", "type");

        // we found an xsi:type annotation, ignore to avoid, eg:
        // org.xml.sax.SAXParseException: cvc-elt.4.2: Cannot resolve 'events' to a type definition for element 'events'.
        if (type != null) {
            final AttributesImpl att = new AttributesImpl();
            for (int i = 0; i < attributes.getLength(); i++) {
                if (!attributes.getLocalName(i).equals("type") || !attributes.getURI(i).equals("http://www.w3.org/2001/XMLSchema-instance")) {
                    att.addAttribute(attributes.getURI(i), attributes.getLocalName(i), attributes.getQName(i), attributes.getType(i), attributes.getValue(i));
                }
            }
            super.startElement(m_primaryNamespaceUri, localName, qName, att);
        } else {
            super.startElement(m_primaryNamespaceUri, localName, qName, attributes);
        }
    }

    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        LOG.trace("endElement:   uri = {}, new uri = {}, localName = {}, qName = {}", uri, m_primaryNamespaceUri, localName, qName);
        super.endElement(m_primaryNamespaceUri, localName, qName);
    }

    @Override
    public void startPrefixMapping(final String prefix, final String url) throws SAXException {
        LOG.trace("startPrefixMapping: prefix = {}, url = {}", prefix, url);
        this.startControlledPrefixMapping();
    }

    private void startControlledPrefixMapping() throws SAXException {
        LOG.trace("startControlledPrefixMapping");
        if (!m_addedNamespace) {
            //We should add namespace since it is set and has not yet been done.
            super.startPrefixMapping("".intern(), m_primaryNamespaceUri);

            //Make sure we don't do it twice
            m_addedNamespace = true;
        }
    }

    @Override
    public String toString() {
        return "MultipleNamespacesFilter[primaryNamespaceUri="+m_primaryNamespaceUri+",namespaceUris="+m_namespaceUris+"]";
    }
}
