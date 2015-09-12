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

package org.opennms.netmgt.config.reporting.jasperReports;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class JasperReportsTest extends XmlTest<JasperReports> {

    private static void addReport(JasperReports jasperReports, String id, String template, String engine) {
        Report report = new Report();
        report.setId(id);
        report.setTemplate(template);
        report.setEngine(engine);
        jasperReports.addReport(report);
    }

    public JasperReportsTest(final JasperReports sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        JasperReports jasperReports = new JasperReports();
        addReport(jasperReports, "Early-Morning-Report", "Early-Morning-Report.jrxml", "jdbc");
        addReport(jasperReports, "Response-Time-Summary-Report", "ResponseTimeSummary.jrxml", "jdbc");
        addReport(jasperReports, "Node-Availability-Report", "NodeAvailabilityReport.jrxml", "jdbc");
        addReport(jasperReports, "Availability-Summary-Report", "AvailabilitySummary.jrxml", "jdbc");

        return Arrays.asList(new Object[][]{{
            jasperReports,
            "<jasper-reports>"
            + " <report id=\"Early-Morning-Report\" template=\"Early-Morning-Report.jrxml\" engine=\"jdbc\" />"
            + " <report id=\"Response-Time-Summary-Report\" template=\"ResponseTimeSummary.jrxml\" engine=\"jdbc\" />"
            + " <report id=\"Node-Availability-Report\" template=\"NodeAvailabilityReport.jrxml\" engine=\"jdbc\" />"
            + " <report id=\"Availability-Summary-Report\" template=\"AvailabilitySummary.jrxml\" engine=\"jdbc\" />"
            + "</jasper-reports>",
            "target/classes/xsds/jasper-reports.xsd",},});
    }
}
