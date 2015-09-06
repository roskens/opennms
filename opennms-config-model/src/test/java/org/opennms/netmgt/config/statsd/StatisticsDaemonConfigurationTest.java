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

package org.opennms.netmgt.config.statsd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;
import org.opennms.netmgt.config.statsd.types.PackageReportStatusType;

public class StatisticsDaemonConfigurationTest extends XmlTestNoCastor<StatisticsDaemonConfiguration> {

    public StatisticsDaemonConfigurationTest(final StatisticsDaemonConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        StatisticsDaemonConfiguration config = new StatisticsDaemonConfiguration();
        Package pkg = new Package();
        config.addPackage(pkg);
        pkg.setName("ThroughputReports");
        PackageReport pkgReport = new PackageReport();
        pkg.addPackageReport(pkgReport);
        pkgReport.setName("TopN_InOctets");
        pkgReport.setDescription("Top 20 ifInOctets across all nodes");
        pkgReport.setSchedule("0 20 1 * * ?");
        pkgReport.setRetainInterval("2592000000");
        pkgReport.setStatus(PackageReportStatusType.OFF);
        Parameter p1 = new Parameter();
        p1.setKey("count");
        p1.setValue("20");
        pkgReport.addParameter(p1);
        Parameter p2 = new Parameter();
        p2.setKey("consolidationFunction");
        p2.setValue("AVERAGE");
        pkgReport.addParameter(p2);
        Parameter p3 = new Parameter();
        p3.setKey("relativeTime");
        p3.setValue("YESTERDAY");
        pkgReport.addParameter(p3);
        Parameter p4 = new Parameter();
        p4.setKey("resourceTypeMatch");
        p4.setValue("interfaceSnmp");
        pkgReport.addParameter(p4);
        Parameter p5 = new Parameter();
        p5.setKey("attributeMatch");
        p5.setValue("ifInOctets");
        pkgReport.addParameter(p5);

        return Arrays.asList(new Object[][]{{
            config,
            "<statistics-daemon-configuration>\n"
            + "  <package name=\"ThroughputReports\">\n"
            + "    <packageReport name=\"TopN_InOctets\" description=\"Top 20 ifInOctets across all nodes\"\n"
            + "                   schedule=\"0 20 1 * * ?\" retainInterval=\"2592000000\"\n"
            + "                   status=\"off\">\n"
            + "      <parameter key=\"count\" value=\"20\"/>\n"
            + "      <parameter key=\"consolidationFunction\" value=\"AVERAGE\"/>\n"
            + "      <parameter key=\"relativeTime\" value=\"YESTERDAY\"/>\n"
            + "      <parameter key=\"resourceTypeMatch\" value=\"interfaceSnmp\"/>\n"
            + "      <parameter key=\"attributeMatch\" value=\"ifInOctets\"/>\n"
            + "    </packageReport>\n"
            + "  </package>", /* configuration */
            "target/classes/xsds/statistics-daemon-configuration.xsd",},});
    }
}
