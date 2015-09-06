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

package org.opennms.netmgt.config.threshd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class ThreshdConfigurationTest extends XmlTestNoCastor<ThreshdConfiguration> {

    public ThreshdConfigurationTest(final ThreshdConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        ThreshdConfiguration config = new ThreshdConfiguration();
        config.setThreads(5);
        Package mib2 = new Package();
        Filter mib2filter = new Filter();
        mib2filter.setContent("IPADDR != '0.0.0.0'");
        mib2.setFilter(mib2filter);
        IncludeRange ipv4Range = new IncludeRange();
        ipv4Range.setBegin("1.1.1.1");
        ipv4Range.setEnd("254.254.254.254");
        mib2.addIncludeRange(ipv4Range);
        IncludeRange ipv6Range = new IncludeRange();
        ipv6Range.setBegin("::1");
        ipv6Range.setEnd("ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");
        mib2.addIncludeRange(ipv6Range);
        Service snmpSvc = new Service();
        snmpSvc.setName("SNMP");
        snmpSvc.setInterval(300000L);
        snmpSvc.setUserDefined("false");
        snmpSvc.setStatus("on");
        Parameter p1 = new Parameter();
        p1.setKey("thresholding-group");
        p1.setValue("mib2");
        snmpSvc.addParameter(p1);
        config.addPackage(mib2);
        Package hrstorage = new Package();
        Filter filter2 = new Filter();
        filter2.setContent("IPADDR != '0.0.0.0' &amp; (nodeSysOID LIKE '.1.3.6.1.4.1.311.%' | nodeSysOID LIKE '.1.3.6.1.4.1.2.3.1.2.1.1.3.%')");
        mib2.setFilter(filter2);
        mib2.addIncludeRange(ipv4Range);
        mib2.addIncludeRange(ipv6Range);
        Service snmpSvc2 = new Service();
        snmpSvc2.setName("SNMP");
        snmpSvc2.setInterval(300000L);
        snmpSvc2.setUserDefined("false");
        snmpSvc2.setStatus("on");
        Parameter p2 = new Parameter();
        p2.setKey("thresholding-group");
        p2.setValue("hrstorage");
        snmpSvc2.addParameter(p2);
        config.addPackage(hrstorage);

        return Arrays.asList(new Object[][]{{
            config,
            "<threshd-configuration threads=\"5\">\n"
            + "<package name=\"mib2\">\n"
            + "  <filter>IPADDR != '0.0.0.0'</filter>     \n"
            + "  <include-range begin=\"1.1.1.1\" end=\"254.254.254.254\"/>\n"
            + "  <include-range begin=\"::1\" end=\"ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff\" />\n"
            + "  <service name=\"SNMP\" interval=\"300000\" user-defined=\"false\" status=\"on\">\n"
            + "    <parameter key=\"thresholding-group\" value=\"mib2\"/>\n"
            + "  </service>\n"
            + "</package>\n"
            + "<package name=\"hrstorage\">\n"
            + "  <filter>IPADDR != '0.0.0.0' &amp; (nodeSysOID LIKE '.1.3.6.1.4.1.311.%' | nodeSysOID LIKE '.1.3.6.1.4.1.2.3.1.2.1.1.3.%')</filter>       \n"
            + "  <include-range begin=\"1.1.1.1\" end=\"254.254.254.254\"/>\n"
            + "  <include-range begin=\"::1\" end=\"ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff\" />\n"
            + "  <service name=\"SNMP\" interval=\"300000\" user-defined=\"false\" status=\"on\">\n"
            + "    <parameter key=\"thresholding-group\" value=\"hrstorage\"/>\n"
            + "  </service>\n"
            + "</package>" + "</threshd-configuration>",
            "target/classes/xsds/threshd-configuration.xsd",},});
    }
}
