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

package org.opennms.netmgt.config.discovery;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class DiscoveryConfigurationTest extends XmlTestNoCastor<DiscoveryConfiguration> {

    public DiscoveryConfigurationTest(final DiscoveryConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        DiscoveryConfiguration config = new DiscoveryConfiguration();
        config.setThreads(1);
        config.setPacketsPerSecond(1);
        config.setInitialSleepTime(30000L);
        config.setRestartSleepTime(86400000L);
        config.setRetries(1);
        config.setTimeout(2000L);
        IncludeRange ir = new IncludeRange();
        config.addIncludeRange(ir);
        ir.setBegin("192.168.0.1");
        ir.setEnd("192.168.0.254");
        IncludeUrl incUrl1 = new IncludeUrl();
        config.addIncludeUrl(incUrl1);
        incUrl1.setContent("file:/opt/opennms/etc/include.txt");
        IncludeUrl incUrl2 = new IncludeUrl();
        config.addIncludeUrl(incUrl2);
        incUrl2.setContent("http://example.com/ip-address-list.txt");

        return Arrays.asList(new Object[][]{{
            config,
            "<discovery-configuration"
            + "    threads=\"1\" packets-per-second=\"1\"\n"
            + "    initial-sleep-time=\"30000\" restart-sleep-time=\"86400000\"\n"
            + "    retries=\"1\" timeout=\"2000\">\n"
            + " <include-range>\n"
            + "   <begin>192.168.0.1</begin>\n"
            + "   <end>192.168.0.254</end>\n"
            + " </include-range>\n"
            + " <include-url>file:/opt/opennms/etc/include.txt</include-url>\n"
            + " <include-url>http://example.com/ip-address-list.txt</include-url>\n"
            + "</discovery-configuration>",
            "target/classes/xsds/discovery-configuration.xsd",},});
    }
}
