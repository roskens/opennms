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

package org.opennms.netmgt.config.siteStatusViews;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class SiteStatusViewConfigurationTest extends XmlTestNoCastor<SiteStatusViewConfiguration> {

    private static void addRow(Rows rows, String label, String categoryName) {
        RowDef rowDef = new RowDef();
        rowDef.setLabel(label);
        Category category = new Category();
        category.setName(categoryName);
        rows.addRowDef(rowDef);
    }

    public SiteStatusViewConfigurationTest(final SiteStatusViewConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        SiteStatusViewConfiguration config = new SiteStatusViewConfiguration();
        config.setDefaultView("default");
        Views views = new Views();
        View view = new View();
        view.setName("default");
        Rows rows = new Rows();
        addRow(rows, "Routers", "Routers");
        addRow(rows, "Switches", "Switches");
        addRow(rows, "Servers", "Servers");
        view.setRows(rows);
        views.addView(view);
        config.setViews(views);

        return Arrays.asList(new Object[][]{{
            config,
            "<site-status-view-configuration default-view=\"default\">\n"
            + "  <views>\n"
            + "    <view name=\"default\" >\n"
            + "      <rows>\n"
            + "        <row-def label=\"Routers\">\n"
            + "          <category name=\"Routers\"/>\n"
            + "        </row-def>\n"
            + "        <row-def label=\"Switches\">\n"
            + "          <category name=\"Switches\"/>\n"
            + "        </row-def>\n"
            + "        <row-def label=\"Servers\">\n"
            + "          <category name=\"Servers\"/>\n"
            + "        </row-def>\n"
            + "      </rows>\n"
            + "    </view>\n"
            + "  </views>\n"
            + "</site-status-view-configuration>",
            "target/classes/xsds/site-status-views.xsd",},});
    }
}
