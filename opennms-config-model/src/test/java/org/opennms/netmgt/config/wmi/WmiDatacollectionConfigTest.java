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

package org.opennms.netmgt.config.wmi;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class WmiDatacollectionConfigTest extends XmlTest<WmiDatacollectionConfig> {

    private static void addAttrib(Wpm wpm, String name, String alias, String wmiObject, String type) {
        Attrib attr = new Attrib();
        attr.setName(name);
        attr.setAlias(alias);
        attr.setWmiObject(wmiObject);
        attr.setType(type);
        wpm.addAttrib(attr);
    }

    public WmiDatacollectionConfigTest(final WmiDatacollectionConfig sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        WmiDatacollectionConfig wmiDatacollectionConfig = new WmiDatacollectionConfig();
        wmiDatacollectionConfig.setRrdRepository("${install.share.dir}/rrd/snmp");
        WmiCollection wmiCollection = new WmiCollection();
        wmiDatacollectionConfig.addWmiCollection(wmiCollection);
        wmiCollection.setName("default");
        Rrd rrd = new Rrd();
        wmiCollection.setRrd(rrd);
        rrd.setStep(300);
        rrd.addRra("RRA:AVERAGE:0.5:1:2016");
        rrd.addRra("RRA:AVERAGE:0.5:12:1488");
        rrd.addRra("RRA:AVERAGE:0.5:288:366");
        rrd.addRra("RRA:MAX:0.5:288:366");
        rrd.addRra("RRA:MIN:0.5:288:366");
        Wpms wpms = new Wpms();
        wmiCollection.setWpms(wpms);
        Wpm wpm = new Wpm();
        wpm.setName("wmiOSMemory");
        wpm.setWmiClass("Win32_PerfFormattedData_PerfOS_Memory");
        wpm.setWmiNamespace("root/cimv2");
        wpm.setKeyvalue("Name");
        wpm.setRecheckInterval(3600000);
        wpm.setIfType("all");
        wpm.setResourceType("node");
        addAttrib(wpm, "AvailableBytes", "wmiOSMemAvailBytes", "AvailableBytes", "Gauge");
        addAttrib(wpm, "CacheBytes", "wmiOSMemCacheBytes", "CacheBytes", "Gauge");
        addAttrib(wpm, "CacheFaultsPerSec", "wmiOSMemCacheFaults", "CacheFaultsPerSec", "Counter");
        addAttrib(wpm, "CommitLimit", "wmiOSMemCommitLimit", "CommitLimit", "Gauge");
        addAttrib(wpm, "CommittedBytes", "wmiOSMemCommitted", "CommittedBytes", "Gauge");
        wpms.addWpm(wpm);

        return Arrays.asList(new Object[][]{{
            wmiDatacollectionConfig,
            "<wmi-datacollection-config rrdRepository=\"${install.share.dir}/rrd/snmp\">"
            + "<wmi-collection name=\"default\">"
            + "  <rrd step=\"300\">"
            + "    <rra>RRA:AVERAGE:0.5:1:2016</rra>"
            + "    <rra>RRA:AVERAGE:0.5:12:1488</rra>"
            + "    <rra>RRA:AVERAGE:0.5:288:366</rra>"
            + "    <rra>RRA:MAX:0.5:288:366</rra>"
            + "    <rra>RRA:MIN:0.5:288:366</rra>"
            + "  </rrd>"
            + "  <wpms>"
            + "    <wpm name=\"wmiOSMemory\" wmiClass=\"Win32_PerfFormattedData_PerfOS_Memory\" wmiNamespace=\"root/cimv2\""
            + "                 keyvalue=\"Name\" recheckInterval=\"3600000\" ifType=\"all\" resourceType=\"node\">"
            + "      <attrib name=\"AvailableBytes\" alias=\"wmiOSMemAvailBytes\" wmiObject=\"AvailableBytes\" type=\"Gauge\"/>\n"
            + "      <attrib name=\"CacheBytes\" alias=\"wmiOSMemCacheBytes\" wmiObject=\"CacheBytes\" type=\"Gauge\"/>\n"
            + "      <attrib name=\"CacheFaultsPerSec\" alias=\"wmiOSMemCacheFaults\" wmiObject=\"CacheFaultsPerSec\" type=\"Counter\"/>\n"
            + "      <attrib name=\"CommitLimit\" alias=\"wmiOSMemCommitLimit\" wmiObject=\"CommitLimit\" type=\"Gauge\"/>\n"
            + "      <attrib name=\"CommittedBytes\" alias=\"wmiOSMemCommitted\" wmiObject=\"CommittedBytes\" type=\"Gauge\"/>\n"
            + "    </wpm>"
            + "  </wpms>"
            + "</wmi-collection>"
            + "</wmi-datacollection-config>",
            "target/classes/xsds/wmi-datacollection.xsd",},});
    }
}
