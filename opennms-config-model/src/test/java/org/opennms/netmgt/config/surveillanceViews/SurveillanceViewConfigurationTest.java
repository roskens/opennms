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

package org.opennms.netmgt.config.surveillanceViews;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class SurveillanceViewConfigurationTest extends XmlTestNoCastor<SurveillanceViewConfiguration> {

    private static void addRowDef(Rows rows, String label, String category) {
        RowDef rDef = new RowDef();
        rDef.setLabel(label);
        Category cat = new Category();
        cat.setName(category);
        rDef.addCategory(cat);
        rows.addRowDef(rDef);
    }

    private static void addColumnDef(Columns columns, String label, String category) {
        ColumnDef cDef = new ColumnDef();
        cDef.setLabel(label);
        Category cat = new Category();
        cat.setName(category);
        cDef.addCategory(cat);
        columns.addColumnDef(cDef);
    }

    public SurveillanceViewConfigurationTest(final SurveillanceViewConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        SurveillanceViewConfiguration config = new SurveillanceViewConfiguration();
        config.setDefaultView("default");
        Views views = new Views();
        config.setViews(views);
        View view = new View();
        views.addView(view);
        view.setName("default");
        view.setRefreshSeconds("300");
        Rows rows = new Rows();
        view.setRows(rows);
        addRowDef(rows, "Routers", "Routers");
        addRowDef(rows, "Switches", "Switches");
        addRowDef(rows, "Servers", "Servers");
        Columns columns = new Columns();
        view.setColumns(columns);
        addColumnDef(columns, "PROD", "Production");
        addColumnDef(columns, "TEST", "Test");
        addColumnDef(columns, "DEV", "Development");

        return Arrays.asList(new Object[][]{{
            config,
            "<surveillance-view-configuration default-view=\"default\">"
            + "  <views>"
            + "    <view name=\"default\" refresh-seconds=\"300\">"
            + "      <rows>"
            + "        <row-def label=\"Routers\" >"
            + "          <category name=\"Routers\"/>"
            + "        </row-def>"
            + "        <row-def label=\"Switches\" >"
            + "          <category name=\"Switches\" />"
            + "        </row-def>"
            + "        <row-def label=\"Servers\" >"
            + "          <category name=\"Servers\" />"
            + "        </row-def>"
            + "      </rows>"
            + "      <columns>"
            + "        <column-def label=\"PROD\" >"
            + "          <category name=\"Production\" />"
            + "        </column-def>"
            + "        <column-def label=\"TEST\" >"
            + "          <category name=\"Test\" />"
            + "        </column-def>"
            + "        <column-def label=\"DEV\" >"
            + "          <category name=\"Development\" />"
            + "        </column-def>"
            + "      </columns>"
            + "    </view>"
            + "  </views>"
            + "</surveillance-view-configuration>", /* configuration */
            "target/classes/xsds/surveillance-views.xsd",},});
    }
}
