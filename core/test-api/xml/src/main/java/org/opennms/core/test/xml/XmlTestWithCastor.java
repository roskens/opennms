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

package org.opennms.core.test.xml;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import static org.junit.Assert.assertNotNull;
import org.junit.Ignore;
import org.junit.Test;
import static org.opennms.core.test.xml.XmlTest.assertDepthEquals;
import org.opennms.core.xml.CastorUtils;
import org.opennms.core.xml.JaxbUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

public abstract class XmlTestWithCastor<T> extends XmlTest<T> {
    private static final Logger LOG = LoggerFactory.getLogger(XmlTestWithCastor.class);
    
    public XmlTestWithCastor(final T sampleObject, final Object sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Test
    public void marshalCastorAndCompareToXml() throws Exception {
        final String xml = marshalToXmlWithCastor();
        _assertXmlEquals(getSampleXml(), xml);
    }

    @Test
    public void unmarshalXmlAndCompareToCastor() throws Exception {
        final T obj = CastorUtils.unmarshal(getSampleClass(), getSampleXmlInputStream());
        LOG.debug("Sample object: {}\n\nCastor object: {}", getSampleObject(), obj);
        assertDepthEquals(getSampleObject(), obj);
    }

    @Test
    public void marshalCastorUnmarshalJaxb() throws Exception {
        final String xml = marshalToXmlWithCastor();
        final T obj = JaxbUtils.unmarshal(getSampleClass(), xml);
        LOG.debug("Generated Object: {}", obj);
        assertDepthEquals(getSampleObject(), obj);
    }

    @Test
    public void marshalJaxbUnmarshalCastor() throws Exception {
        final String xml = marshalToXmlWithJaxb();
        final T obj = CastorUtils.unmarshal(getSampleClass(), new ByteArrayInputStream(xml.getBytes()));
        LOG.debug("Generated Object: {}", obj);
        assertDepthEquals(getSampleObject(), obj);
    }

    @Test
    public void validateCastorObjectAgainstSchema() throws Exception {
        org.exolab.castor.xml.Unmarshaller unmarshaller = CastorUtils.getUnmarshaller(getSampleClass());
        unmarshaller.setValidation(true);
        @SuppressWarnings("unchecked")
        T obj = (T) unmarshaller.unmarshal(new InputSource(getSampleXmlInputStream()));
        assertNotNull(obj);
    }

    @Test
    public void unmarshalCastorMarshalCastor() throws Exception {
        final T obj = CastorUtils.unmarshal(getSampleClass(), getSampleXmlInputStream());
        final StringWriter writer = new StringWriter();
        CastorUtils.marshalWithTranslatedExceptions(obj, writer);
        _assertXmlEquals(getSampleXml(), writer.toString());
    }

    @Test
    public void marshalCastorUnmarshalCastor() throws Exception {
        final String xml = marshalToXmlWithCastor();
        final ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes());
        final T obj = CastorUtils.unmarshal(getSampleClass(), is, false);
        assertDepthEquals(getSampleObject(), obj);
    }
}
