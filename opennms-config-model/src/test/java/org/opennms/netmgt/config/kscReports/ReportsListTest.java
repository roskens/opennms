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

package org.opennms.netmgt.config.kscReports;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class ReportsListTest extends XmlTestNoCastor<ReportsList> {

    public ReportsListTest(final ReportsList sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        ReportsList reportsList = new ReportsList();
        Report report1 = new Report();
        report1.setId(0);
        report1.setTitle("Test");
        report1.setShow_timespan_button(Boolean.FALSE);
        report1.setShow_graphtype_button(Boolean.FALSE);
        report1.setGraphs_per_line(0);
        Graph graph1 = new Graph();
        graph1.setTitle("blah");
        graph1.setResourceId("node[8].responseTime[216.216.217.254]");
        graph1.setTimespan("7_day");
        graph1.setGraphtype("ssh");
        report1.addGraph(graph1);
        reportsList.addReport(report1);
        Report report2 = new Report();
        report2.setId(1);
        report2.setTitle("Test 2");
        report2.setShow_timespan_button(Boolean.FALSE);
        report2.setShow_graphtype_button(Boolean.FALSE);
        report2.setGraphs_per_line(0);
        Graph graph2 = new Graph();
        graph2.setTitle("blah");
        graph2.setResourceId("node[8].responseTime[216.216.217.254]");
        graph2.setTimespan("7_day");
        graph2.setGraphtype("ssh");
        report2.addGraph(graph2);
        reportsList.addReport(report2);
                

        return Arrays.asList(new Object[][] { {
                reportsList,
                "<ReportsList>\n" +
"    <Report id=\"0\" title=\"Test\" show_timespan_button=\"false\" show_graphtype_button=\"false\" graphs_per_line=\"0\">\n" +
"        <Graph title=\"blah\" resourceId=\"node[8].responseTime[216.216.217.254]\" timespan=\"7_day\" graphtype=\"ssh\" />\n" +
"    </Report>\n" +
"    <Report id=\"1\" title=\"Test 2\" show_timespan_button=\"false\" show_graphtype_button=\"false\" graphs_per_line=\"0\">\n" +
"        <Graph title=\"blah\" resourceId=\"node[8].responseTime[216.216.217.254]\" timespan=\"7_day\" graphtype=\"ssh\" />\n" +
"    </Report>\n" +
"</ReportsList>", /* configuration */
                "target/classes/xsds/ksc-performance-reports.xsd", }, });
    }
}
