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

package org.opennms.netmgt.config.opennmsDataSources;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class DataSourceConfigurationTest extends XmlTestNoCastor<DataSourceConfiguration> {

    public DataSourceConfigurationTest(final DataSourceConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        DataSourceConfiguration config = new DataSourceConfiguration();
        ConnectionPool cpool = new ConnectionPool();
        cpool.setFactory("org.opennms.core.db.C3P0ConnectionFactory");
        cpool.setIdleTimeout(600);
        cpool.setLoginTimeout(3);
        cpool.setMinPool(50);
        cpool.setMaxPool(50);
        cpool.setMaxSize(50);
        config.setConnectionPool(cpool);
        JdbcDataSource ds1 = new JdbcDataSource();
        config.addJdbcDataSource(ds1);
        ds1.setName("opennms");
        ds1.setDatabaseName("opennms");
        ds1.setClassName("org.postgresql.Driver");
        ds1.setUrl("jdbc:postgresql://localhost:5432/opennms");
        ds1.setUserName("opennms");
        ds1.setPassword("opennms");

        JdbcDataSource ds2 = new JdbcDataSource();
        config.addJdbcDataSource(ds2);
        ds2.setName("opennms-admin");
        ds2.setDatabaseName("template1");
        ds2.setClassName("org.postgresql.Driver");
        ds2.setUrl("jdbc:postgresql://localhost:5432/template1");
        ds2.setUserName("postgres");
        ds2.setPassword("postgres");

        return Arrays.asList(new Object[][]{{
            config,
            "<datasource-configuration>\n"
            + "  <connection-pool factory=\"org.opennms.core.db.C3P0ConnectionFactory\"\n"
            + "    idleTimeout=\"600\"\n"
            + "    loginTimeout=\"3\"\n"
            + "    minPool=\"50\"\n"
            + "    maxPool=\"50\"\n"
            + "    maxSize=\"50\" />\n"
            + "  <jdbc-data-source name=\"opennms\" \n"
            + "                    database-name=\"opennms\" \n"
            + "                    class-name=\"org.postgresql.Driver\" \n"
            + "                    url=\"jdbc:postgresql://localhost:5432/opennms\"\n"
            + "                    user-name=\"opennms\"\n"
            + "                    password=\"opennms\" />\n"
            + "  <jdbc-data-source name=\"opennms-admin\" \n"
            + "                    database-name=\"template1\" \n"
            + "                    class-name=\"org.postgresql.Driver\" \n"
            + "                    url=\"jdbc:postgresql://localhost:5432/template1\"\n"
            + "                    user-name=\"postgres\"\n"
            + "                    password=\"postgres\" />\n"
            + "</datasource-configuration>",
            "target/classes/xsds/opennms-datasources.xsd",},});
    }
}
