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

package org.opennms.netmgt.config.filter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class DatabaseSchemaTest extends XmlTest<DatabaseSchema> {

    private static void addTable(DatabaseSchema databaseSchema, String tableName, String[] columns, String visible) {
        Table t = new Table();
        t.setName(tableName);
        t.setVisible(visible);
        for(String column : columns) {
            Column c = new Column();
            c.setName(column);
            t.addColumn(c);
        }
        databaseSchema.addTable(t);
    }

    public DatabaseSchemaTest(final DatabaseSchema sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        DatabaseSchema databaseSchema = new DatabaseSchema();
        addTable(databaseSchema, "distPoller", new String[] { "dpNumber", "dpName", "dpIP", "dpComment", "dpDiscLimit", "dpAdminState", "dpRunState" }, "false");

        return Arrays.asList(new Object[][] { {
                databaseSchema,
                "<database-schema>\n" +
"        <table name=\"distPoller\" visible=\"false\">\n" +
"                <column name=\"dpNumber\"/>\n" +
"                <column name=\"dpName\"/>\n" +
"                <column name=\"dpIP\"/>\n" +
"                <column name=\"dpComment\"/>\n" +
"                <column name=\"dpDiscLimit\"/>\n" +
"                <column name=\"dpAdminState\"/>\n" +
"                <column name=\"dpRunState\"/>\n" +
"        </table>\n" +
"</database-schema>",
                "target/classes/xsds/database-schema.xsd", }, });
    }
}
