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

package org.opennms.netmgt.config.databaseReports;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class DatabaseReportsTest extends XmlTestNoCastor<DatabaseReports> {

    public DatabaseReportsTest(final DatabaseReports sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    private static void addReport(DatabaseReports dbReport, final String id, final String displayName, final String reportService, final String description) {
        Report r1 = new Report();
        r1.setId(id);
        r1.setDisplayName(displayName);
        r1.setReportService(reportService);
        r1.setDescription(description);
        dbReport.addReport(r1);

    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        DatabaseReports databaseReports = new DatabaseReports();
        addReport(databaseReports, "defaultCalendarReport", "Default calendar report", "availabilityReportService", "standard opennms report in calendar format");
        addReport(databaseReports, "defaultClassicReport", "Default classic report", "availabilityReportService", "standard opennms report in tabular format");

        return Arrays.asList(new Object[][] { {
                databaseReports,
                "<database-reports>\n" +
"<report id=\"defaultCalendarReport\" display-name=\"Default calendar report\"\n" +
"                report-service=\"availabilityReportService\" description=\"standard opennms report in calendar format\" />\n" +
"        <report id=\"defaultClassicReport\" display-name=\"Default classic report\"\n" +
"                report-service=\"availabilityReportService\" description=\"standard opennms report in tabular format\" />\n" +
"</database-reports>",
                "target/classes/xsds/database-reports.xsd", }, });
    }
}
