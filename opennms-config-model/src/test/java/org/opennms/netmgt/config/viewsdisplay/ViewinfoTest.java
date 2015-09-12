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

package org.opennms.netmgt.config.viewsdisplay;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class ViewinfoTest extends XmlTest<Viewinfo> {

    public ViewinfoTest(final Viewinfo sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Viewinfo viewinfo = new Viewinfo();
        View view = new View();
        viewinfo.addView(view);
        view.setViewName("WebConsoleView");
        Section section1 = new Section();
        view.addSection(section1);
        section1.setSectionName("Categories");
        section1.setCategory(new String[]{"Network Interfaces", "Web Servers", "Email Servers", "DNS and DHCP Servers",
            "Database Servers", "JMX Servers", "Other Servers"});
        Section section2 = new Section();
        view.addSection(section2);
        section2.setSectionName("Total");
        section2.addCategory("Overall Service Availability");

        return Arrays.asList(new Object[][]{{
            viewinfo,
            "<viewinfo>"
            + "  <view>"
            + "    <view-name>WebConsoleView</view-name>"
            + "    <section>"
            + "      <section-name><![CDATA[Categories]]></section-name>"
            + "      <category><![CDATA[Network Interfaces]]></category>"
            + "      <category><![CDATA[Web Servers]]></category>"
            + "      <category><![CDATA[Email Servers]]></category>"
            + "      <category><![CDATA[DNS and DHCP Servers]]></category>"
            + "      <category><![CDATA[Database Servers]]></category>"
            + "      <category><![CDATA[JMX Servers]]></category>"
            + "      <category><![CDATA[Other Servers]]></category>"
            + "    </section>"
            + "    <section>"
            + "      <section-name><![CDATA[Total]]></section-name>"
            + "      <category><![CDATA[Overall Service Availability]]></category>"
            + "    </section>"
            + "  </view>"
            + "</viewinfo>", /* configuration */
            "target/classes/xsds/viewsdisplay.xsd",},});
    }
}
