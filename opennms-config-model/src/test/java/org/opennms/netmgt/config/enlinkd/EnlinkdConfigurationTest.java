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

package org.opennms.netmgt.config.enlinkd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class EnlinkdConfigurationTest extends XmlTest<EnlinkdConfiguration> {

    public EnlinkdConfigurationTest(final EnlinkdConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        EnlinkdConfiguration enlinkdConfiguration = new EnlinkdConfiguration();
        enlinkdConfiguration.setInitial_sleep_time(60000L);
        enlinkdConfiguration.setRescan_interval(86400000L);
        enlinkdConfiguration.setThreads(5);
        enlinkdConfiguration.setUseBridgeDiscovery(Boolean.FALSE);
        enlinkdConfiguration.setUseCdpDiscovery(Boolean.FALSE);
        enlinkdConfiguration.setUseIsisDiscovery(Boolean.FALSE);
        enlinkdConfiguration.setUseLldpDiscovery(Boolean.FALSE);
        enlinkdConfiguration.setUseOspfDiscovery(Boolean.FALSE);

        return Arrays.asList(new Object[][] { {
                enlinkdConfiguration,
                "<enlinkd-configuration threads=\"5\" \n" +
"                     initial_sleep_time=\"60000\"\n" +
"                     rescan_interval=\"86400000\" \n" +
"                     use-cdp-discovery=\"false\"\n" +
"                     use-bridge-discovery=\"false\"\n" +
"                     use-lldp-discovery=\"false\"\n" +
"                     use-ospf-discovery=\"false\"\n" +
"                     use-isis-discovery=\"false\"\n" +
"                     />", /* configuration */
                "target/classes/xsds/enlinkd-configuration.xsd", }, });
    }
}
