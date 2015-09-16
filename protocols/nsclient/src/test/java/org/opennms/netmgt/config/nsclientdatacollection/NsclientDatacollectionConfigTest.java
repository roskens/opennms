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

package org.opennms.netmgt.config.nsclientdatacollection;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;
import org.opennms.netmgt.config.nsclient.Attrib;

public class NsclientDatacollectionConfigTest extends XmlTest<NsclientDatacollectionConfig> {

    @Before
    public void setup() {
        
    }
    
    public NsclientDatacollectionConfigTest(final NsclientDatacollectionConfig sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }
    
    private static void addAttrib(Wpm wpm, String name, String alias, String type) {
        addAttrib(wpm, name, alias, type, null, null);
    }

    private static void addAttrib(Wpm wpm, String name, String alias, String type, String min, String max) {
        Attrib attr = new Attrib();
        wpm.addAttrib(attr);
        attr.setName(name);
        attr.setAlias(alias);
        attr.setType(type);
        if (min != null) {
            attr.setMinval(min);
        }
        if (max != null) {
            attr.setMaxval(max);
        }
    }

    private static NsclientDatacollectionConfig buildConfig() {
        NsclientDatacollectionConfig config = new NsclientDatacollectionConfig();
        config.setRrdRepository("${install.share.dir}/rrd/snmp/");
        NsclientCollection coll = new NsclientCollection();
        config.addNsclientCollection(coll);
        coll.setName("default");
        Rrd rrd = new Rrd();
        coll.setRrd(rrd);
        rrd.setStep(300);
        rrd.addRra("RRA:AVERAGE:0.5:1:2016");
        rrd.addRra("RRA:AVERAGE:0.5:12:1488");
        rrd.addRra("RRA:AVERAGE:0.5:288:366");
        rrd.addRra("RRA:MAX:0.5:288:366");
        rrd.addRra("RRA:MIN:0.5:288:366");
        
        Wpms wpms = new Wpms();
        coll.setWpms(wpms);
        Wpm procWpm = new Wpm();
        wpms.addWpm(procWpm);
        procWpm.setName("Processor");
        procWpm.setKeyvalue("\\Processor(_Total)\\% Processor Time");
        procWpm.setRecheckInterval(3600000);
        addAttrib(procWpm, "\\Processor(_Total)\\% Processor Time", "cpuProcTime", "Gauge");
        addAttrib(procWpm, "\\Processor(_Total)\\% Interrupt Time", "cpuIntrTime", "Gauge");
        addAttrib(procWpm, "\\Processor(_Total)\\% Privileged Time", "cpuPrivTime", "Gauge");
        addAttrib(procWpm, "\\Processor(_Total)\\% User Time", "cpuUserTime", "Gauge");
        
        Wpm sysWpm = new Wpm();
        wpms.addWpm(sysWpm);
        sysWpm.setName("System");
        sysWpm.setKeyvalue("\\System\\ProcessorQueueLength");
        sysWpm.setRecheckInterval(86400000);
        addAttrib(sysWpm, "\\System\\ProcessorQueueLength", "winProcQueueLength", "Gauge");
        addAttrib(sysWpm, "\\System\\Processes", "winProcesses", "Gauge");
        addAttrib(sysWpm, "\\System\\Threads", "winThreads", "Gauge");
        return config;
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        return Arrays.asList(new Object[][] { {
                buildConfig(),
                "<ns:nsclient-datacollection-config rrdRepository=\"${install.share.dir}/rrd/snmp/\" xmlns=\"http://xmlns.opennms.org/xsd/config/nsclient-datacollection\" xmlns:ns=\"http://xmlns.opennms.org/xsd/config/nsclient-datacollection\">\n" +
"  <nsclient-collection name=\"default\">\n" +
"    <rrd step=\"300\">\n" +
"      <rra>RRA:AVERAGE:0.5:1:2016</rra>\n" +
"      <rra>RRA:AVERAGE:0.5:12:1488</rra>\n" +
"      <rra>RRA:AVERAGE:0.5:288:366</rra>\n" +
"      <rra>RRA:MAX:0.5:288:366</rra>\n" +
"      <rra>RRA:MIN:0.5:288:366</rra>\n" +
"    </rrd>\n" +
"    <wpms>\n" +
"      <wpm name=\"Processor\" keyvalue=\"\\Processor(_Total)\\% Processor Time\" recheckInterval=\"3600000\">\n" +
"      	<attrib name=\"\\Processor(_Total)\\% Processor Time\" alias=\"cpuProcTime\" type=\"Gauge\"/>\n" +
"      	<attrib name=\"\\Processor(_Total)\\% Interrupt Time\" alias=\"cpuIntrTime\" type=\"Gauge\"/>\n" +
"      	<attrib name=\"\\Processor(_Total)\\% Privileged Time\" alias=\"cpuPrivTime\" type=\"Gauge\"/>\n" +
"      	<attrib name=\"\\Processor(_Total)\\% User Time\" alias=\"cpuUserTime\" type=\"Gauge\"/>\n" +
"      </wpm>\n" +
"      <wpm name=\"System\" keyvalue=\"\\System\\ProcessorQueueLength\" recheckInterval=\"86400000\">\n" +
"      	<attrib name=\"\\System\\ProcessorQueueLength\" alias=\"winProcQueueLength\" type=\"Gauge\"/>\n" +
"      	<attrib name=\"\\System\\Processes\" alias=\"winProcesses\" type=\"Gauge\"/>\n" +
"      	<attrib name=\"\\System\\Threads\" alias=\"winThreads\" type=\"Gauge\"/>\n" +
"      </wpm>\n" +
"    </wpms>\n" +
"  </nsclient-collection>\n" +
"</ns:nsclient-datacollection-config>",
                "target/classes/xsds/nsclient-datacollection.xsd", }, });
    }
}
