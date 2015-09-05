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
package org.opennms.netmgt.config.rancid.adapter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class RancidConfigurationTest extends XmlTestNoCastor<RancidConfiguration> {

    private static void addMapping(RancidConfiguration config, String mask, String type) {
        Mapping mapping = new Mapping();
        mapping.setSysoidMask(mask);
        mapping.setType(type);
        config.addMapping(mapping);
    }

    public RancidConfigurationTest(final RancidConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        RancidConfiguration config = new RancidConfiguration();
        config.setDelay(60L);
        config.setRetries(1);
        addMapping(config, ".1.3.6.1.4.1.9.1", "cisco");
        addMapping(config, ".1.3.6.1.4.1.9.5", "cat5");
        addMapping(config, ".1.3.6.1.4.1.1916.2", "extreme");
        addMapping(config, ".1.3.6.1.4.1.2636.1", "juniper");
        addMapping(config, ".1.3.6.1.4.1.4874.1", "erx");
        addMapping(config, ".1.3.6.1.4.1.11.2.3.7.11", "hp");

        return Arrays.asList(new Object[][]{{
            config,
            "<rancid-configuration delay=\"60\" retries=\"1\">"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.9.1\" type=\"cisco\"/>"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.9.5\" type=\"cat5\"/>"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.1916.2\" type=\"extreme\"/>"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.2636.1\" type=\"juniper\"/>"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.4874.1\" type=\"erx\"/>"
            + "<mapping sysoid-mask=\".1.3.6.1.4.1.11.2.3.7.11\" type=\"hp\"/>"
            + "</rancid-configuration>",
            "target/classes/xsds/rancid-adapter-configuration.xsd",},});
    }
}
