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

package org.opennms.netmgt.config.translator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class EventTranslatorConfigurationTest extends XmlTestNoCastor<EventTranslatorConfiguration> {

    public EventTranslatorConfigurationTest(final EventTranslatorConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        EventTranslatorConfiguration eventTranslatorConfiguration = new EventTranslatorConfiguration();
        Translation trans = new Translation();
        eventTranslatorConfiguration.setTranslation(trans);
        EventTranslationSpec snmpLinkDown = new EventTranslationSpec();
        snmpLinkDown.setUei("uei.opennms.org/generic/traps/SNMP_Link_Down");
        Mappings mappings = new Mappings();
        snmpLinkDown.setMappings(mappings);
        Mapping mapping = new Mapping();

        Assignment ueiAss = new Assignment();
        ueiAss.setName("uei");
        ueiAss.setType("field");
        Value v1 = new Value();
        v1.setType("constant");
        v1.setResult("uei.opennms.org/translator/traps/SNMP_Link_Down");
        mapping.addAssignment(ueiAss);

        Assignment ifDescrAss = new Assignment();
        ifDescrAss.setName("ifDescr");
        ifDescrAss.setType("parameter");
        Value v2 = new Value();
        v2.setType("sql");
        v2.setResult("SELECT snmp.snmpIfDescr FROM snmpInterface snmp WHERE snmp.nodeid = ?::integer AND snmp.snmpifindex = ?::integer");
        Value v2v1 = new Value();
        v2v1.setType("field");
        v2v1.setName("nodeid");
        v2v1.setMatches(".*");
        v2v1.setResult("${0}");
        v2.addValue(v2v1);
        Value v2v2 = new Value();
        v2v2.setType("parameter");
        v2v2.setName("~^\\.1\\.3\\.6\\.1\\.2\\.1\\.2\\.2\\.1\\.1\\.([0-9]*)$");
        v2v2.setMatches(".*");
        v2v2.setResult("${0}");
        v2.addValue(v2v2);
        ifDescrAss.setValue(v2);
        mapping.addAssignment(ifDescrAss);

        Assignment ifNameAss = new Assignment();
        ifNameAss.setName("ifName");
        ifNameAss.setType("parameter");
        Value v3 = new Value();
        v3.setType("sql");
        v3.setResult("SELECT snmp.snmpIfName FROM snmpInterface snmp WHERE snmp.nodeid = ?::integer AND snmp.snmpifindex = ?::integer");
        Value v3v1 = new Value();
        v3v1.setType("field");
        v3v1.setName("nodeid");
        v3v1.setMatches(".*");
        v3v1.setResult("${0}");
        v3.addValue(v3v1);
        Value v3v2 = new Value();
        v3v2.setType("parameter");
        v3v2.setName("~^\\.1\\.3\\.6\\.1\\.2\\.1\\.2\\.2\\.1\\.1\\.([0-9]*)$");
        v3v2.setMatches(".*");
        v3v2.setResult("${0}");
        v3.addValue(v3v2);
        ifNameAss.setValue(v3);
        mapping.addAssignment(ifNameAss);


        mappings.addMapping(mapping);

        return Arrays.asList(new Object[][] { {
                eventTranslatorConfiguration,
"<event-translator-configuration>\n" +
"  <translation>\n" +
"    <event-translation-spec uei=\"uei.opennms.org/generic/traps/SNMP_Link_Down\">\n" +
"      <mappings>\n" +
"        <mapping>\n" +
"          <assignment name=\"uei\" type=\"field\" >\n" +
"            <value type=\"constant\" result=\"uei.opennms.org/translator/traps/SNMP_Link_Down\" />\n" +
"          </assignment>\n" +
"          <assignment name=\"ifDescr\" type=\"parameter\">\n" +
"            <value type=\"sql\" result=\"SELECT snmp.snmpIfDescr FROM snmpInterface snmp WHERE snmp.nodeid = ?::integer AND snmp.snmpifindex = ?::integer\" >\n" +
"              <value type=\"field\" name=\"nodeid\" matches=\".*\" result=\"${0}\" />\n" +
"              <value type=\"parameter\" name=\"~^\\.1\\.3\\.6\\.1\\.2\\.1\\.2\\.2\\.1\\.1\\.([0-9]*)$\" matches=\".*\" result=\"${0}\" />\n" +
"            </value>\n" +
"          </assignment>\n" +
"          <assignment name=\"ifName\" type=\"parameter\">\n" +
"            <value type=\"sql\" result=\"SELECT snmp.snmpIfName FROM snmpInterface snmp WHERE snmp.nodeid = ?::integer AND snmp.snmpifindex = ?::integer\" >\n" +
"              <value type=\"field\" name=\"nodeid\" matches=\".*\" result=\"${0}\" />\n" +
"              <value type=\"parameter\" name=\"~^\\.1\\.3\\.6\\.1\\.2\\.1\\.2\\.2\\.1\\.1\\.([0-9]*)$\" matches=\".*\" result=\"${0}\" />\n" +
"            </value>\n" +
"          </assignment>\n" +
"        </mapping>\n" +
"      </mappings>\n" +
"    </event-translation-spec>\n" +
"  </translation>\n" +
"</event-translator-configuration>",
                "target/classes/xsds/translator-configuration.xsd", }, });
    }
}
