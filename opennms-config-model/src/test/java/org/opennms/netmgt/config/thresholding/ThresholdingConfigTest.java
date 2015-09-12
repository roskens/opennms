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

package org.opennms.netmgt.config.thresholding;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class ThresholdingConfigTest extends XmlTest<ThresholdingConfig> {

    private static Expression addExpression(Group group, String type, String expression, String dsType, String dsLabel, Double value, Double rearm, Integer trigger) {
        Expression expr = new Expression();
        expr.setType(type);
        expr.setExpression(expression);
        expr.setDsType(dsType);
        expr.setDsLabel(dsLabel);
        expr.setValue(value);
        expr.setRearm(rearm);
        expr.setTrigger(trigger);
        group.addExpression(expr);
        return expr;
    }

    private static void addResourceFilter(Expression ex3, String field, String filter) {
        ResourceFilter rFilter = new ResourceFilter();
        rFilter.setField(field);
        rFilter.setContent(filter);
        ex3.addResourceFilter(rFilter);
    }

    public ThresholdingConfigTest(final ThresholdingConfig sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        ThresholdingConfig config = new ThresholdingConfig();
        Group mib2 = new Group();
        config.addGroup(mib2);
        mib2.setName("mib2");
        mib2.setRrdRepository("${install.share.dir}/rrd/snmp");
        Threshold thold = new Threshold();
        thold.setType("high");
        thold.setDsName("tcpInErrors");
        thold.setDsType("node");
        thold.setValue(1D);
        thold.setRearm(0D);
        thold.setTrigger(1);
        mib2.addThreshold(thold);
        addExpression(mib2, "high", "ifInErrors + ifOutErrors", "if", "ifName", 1D, 0D, 2);
        addExpression(mib2, "high", "ifInDiscards + ifOutDiscards", "if", "ifName", 1D, 0D, 2);
        Expression ex3 = addExpression(mib2, "high", "ifInOctets * 8 / 1000000 / ifHighSpeed * 100", "if", "ifName", 90.0D, 75.0D, 3);
        addResourceFilter(ex3, "ifHighSpeed", "^[1-9]+[0-9]*$");
        Expression ex4 = addExpression(mib2, "high", "ifOutOctets * 8 / 1000000 / ifHighSpeed * 100", "if", "ifName", 90.0D, 75.0D, 3);
        addResourceFilter(ex4, "ifHighSpeed", "^[1-9]+[0-9]*$");

        return Arrays.asList(new Object[][]{{
            config,
            "<thresholding-config>\n"
            + "   <group name=\"mib2\" rrdRepository=\"${install.share.dir}/rrd/snmp\">\n"
            + "      <threshold type=\"high\" ds-type=\"node\" value=\"1.0\" rearm=\"0.0\" trigger=\"1\" ds-name=\"tcpInErrors\"/>\n"
            + "      <expression type=\"high\" ds-type=\"if\" value=\"1.0\" rearm=\"0.0\" trigger=\"2\" ds-label=\"ifName\" expression=\"ifInErrors + ifOutErrors\"/>\n"
            + "      <expression type=\"high\" ds-type=\"if\" value=\"1.0\" rearm=\"0.0\" trigger=\"2\" ds-label=\"ifName\" expression=\"ifInDiscards + ifOutDiscards\"/>\n"
            + "      <expression type=\"high\" ds-type=\"if\" value=\"90.0\" rearm=\"75.0\" trigger=\"3\" ds-label=\"ifName\" expression=\"ifInOctets * 8 / 1000000 / ifHighSpeed * 100\">\n"
            + "         <resource-filter field=\"ifHighSpeed\">^[1-9]+[0-9]*$</resource-filter>\n"
            + "      </expression>\n"
            + "      <expression type=\"high\" ds-type=\"if\" value=\"90.0\" rearm=\"75.0\" trigger=\"3\" ds-label=\"ifName\" expression=\"ifOutOctets * 8 / 1000000 / ifHighSpeed * 100\">\n"
            + "         <resource-filter field=\"ifHighSpeed\">^[1-9]+[0-9]*$</resource-filter>\n"
            + "      </expression>\n"
            + "   </group>\n"
            + "</thresholding-config>",
            "target/classes/xsds/thresholding-config.xsd",},});
    }
}
