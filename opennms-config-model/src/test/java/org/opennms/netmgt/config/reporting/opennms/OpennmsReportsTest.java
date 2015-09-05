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
package org.opennms.netmgt.config.reporting.opennms;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.opennms.core.test.xml.XmlTestNoCastor;
import org.opennms.netmgt.config.reporting.DateParm;
import org.opennms.netmgt.config.reporting.DefaultTime;
import org.opennms.netmgt.config.reporting.IntParm;
import org.opennms.netmgt.config.reporting.Parameters;
import org.opennms.netmgt.config.reporting.StringParm;

public class OpennmsReportsTest extends XmlTestNoCastor<OpennmsReports> {

    private static void addCalendarReport(OpennmsReports opennmsReports) {
        Report report = new Report();
        opennmsReports.addReport(report);
        report.setId("defaultCalendarReport");
        report.setType("calendar");
        report.setLogo("logo.gif");
        report.setSvgTemplate("SVGAvailReport.xsl");
        report.setPdfTemplate("PDFAvailReport.xsl");
        report.setHtmlTemplate("HTMLAvailReport.xsl");
        Parameters params = new Parameters();

        StringParm sParm = new StringParm();
        sParm.setName("reportCategory");
        sParm.setDisplayName("report category");
        sParm.setInputType("reportCategorySelector");
        params.addStringParm(sParm);

        DateParm dateParm = new DateParm();
        dateParm.setName("endDate");
        dateParm.setDisplayName("end date");
        dateParm.setUseAbsoluteDate(false);
        dateParm.setDefaultInterval("day");
        dateParm.setDefaultCount(1);
        DefaultTime defTime = new DefaultTime();
        defTime.setHours(23);
        defTime.setMinutes(59);
        dateParm.setDefaultTime(defTime);
        params.addDateParm(dateParm);
        
        IntParm intParm = new IntParm();
        intParm.setName("offenderCount");
        intParm.setDisplayName("top offender count");
        intParm.setInputType("freeText");
        intParm.setDefault(20);
        params.addIntParm(intParm);
        
        report.setParameters(params);
        opennmsReports.addReport(report);
    }

    private static void addClassicReport(OpennmsReports opennmsReports) {
        Report report = new Report();
        opennmsReports.addReport(report);
        report.setId("defaultClassicReport");
        report.setType("classic");
        report.setLogo("logo.gif");
        report.setPdfTemplate("PDFAvailReport.xsl");
        report.setHtmlTemplate("HTMLAvailReport.xsl");
        Parameters params = new Parameters();

        StringParm sParm = new StringParm();
        sParm.setName("reportCategory");
        sParm.setDisplayName("report category");
        sParm.setInputType("reportCategorySelector");
        params.addStringParm(sParm);

        DateParm dateParm = new DateParm();
        dateParm.setName("endDate");
        dateParm.setDisplayName("end date");
        dateParm.setUseAbsoluteDate(false);
        dateParm.setDefaultInterval("day");
        dateParm.setDefaultCount(1);
        DefaultTime defTime = new DefaultTime();
        defTime.setHours(23);
        defTime.setMinutes(59);
        dateParm.setDefaultTime(defTime);
        params.addDateParm(dateParm);
        
        IntParm intParm = new IntParm();
        intParm.setName("offenderCount");
        intParm.setDisplayName("top offender count");
        intParm.setInputType("freeText");
        intParm.setDefault(20);
        params.addIntParm(intParm);
        
        report.setParameters(params);
        opennmsReports.addReport(report);
    }

    public OpennmsReportsTest(final OpennmsReports sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @org.junit.runners.Parameterized.Parameters
    public static Collection<Object[]> data() throws ParseException {

        OpennmsReports opennmsReports = new OpennmsReports();
        addCalendarReport(opennmsReports);
        addClassicReport(opennmsReports);

        return Arrays.asList(new Object[][]{{
            opennmsReports,
            "<opennms-reports>"
            + "  <report id=\"defaultCalendarReport\" "
            + "    type=\"calendar\">"
            + "    <logo>logo.gif</logo>"
            + "    <svg-template>SVGAvailReport.xsl</svg-template>"
            + "    <pdf-template>PDFAvailReport.xsl</pdf-template>"
            + "    <html-template>HTMLAvailReport.xsl</html-template>"
            + "    <parameters>"
            + "      <string-parm name=\"reportCategory\" display-name=\"report category\" input-type=\"reportCategorySelector\" />"
            + "      <date-parm name=\"endDate\" display-name=\"end date\" use-absolute-date=\"false\">"
            + "        <default-interval>day</default-interval>"
            + "        <default-count>1</default-count>"
            + "        <default-time>"
            + "          <hours>23</hours>"
            + "          <minutes>59</minutes>"
            + "        </default-time>"
            + "      </date-parm>"
            + "      <int-parm name=\"offenderCount\" display-name=\"top offender count\" input-type=\"freeText\">"
            + "        <default>20</default>"
            + "      </int-parm>"
            + "    </parameters>"
            + "  </report>"
            + "  <report id=\"defaultClassicReport\" "
            + "    type=\"calendar\">"
            + "    <logo>logo.gif</logo>"
            + "    <pdf-template>PDFAvailReport.xsl</pdf-template>"
            + "    <html-template>HTMLAvailReport.xsl</html-template>"
            + "    <parameters>"
            + "      <string-parm name=\"reportCategory\" display-name=\"report category\" input-type=\"reportCategorySelector\" />"
            + "      <date-parm name=\"endDate\" display-name=\"end date\" use-absolute-date=\"false\">"
            + "        <default-interval>day</default-interval>"
            + "        <default-count>1</default-count>"
            + "        <default-time>"
            + "          <hours>23</hours>"
            + "          <minutes>59</minutes>"
            + "        </default-time>"
            + "      </date-parm>"
            + "      <int-parm name=\"offenderCount\" display-name=\"top offender count\" input-type=\"freeText\">"
            + "        <default>20</default>"
            + "      </int-parm>"
            + "    </parameters>"
            + "  </report>"
            + "</opennms-reports>", /* configuration */
            "target/classes/xsds/opennms-reports.xsd",},});
    }
}
