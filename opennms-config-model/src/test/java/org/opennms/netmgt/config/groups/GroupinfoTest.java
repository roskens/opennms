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

package org.opennms.netmgt.config.groups;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class GroupinfoTest extends XmlTest<Groupinfo> {

    public GroupinfoTest(final Groupinfo sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Groupinfo groupinfo = new Groupinfo();
        Header header = new Header();
        header.setCreated("Wednesday, February 6, 2002 10:10:00 AM EST");
        header.setMstation("dhcp-219.internal.opennms.org");
        header.setRev("1.3");
        groupinfo.setHeader(header);
        Groups groups = new Groups();
        Group g1 = new Group();
        g1.setName("Admin");
        g1.setComments("The administrators");
        g1.addUser("admin");
        groups.addGroup(g1);
        Group g2 = new Group();
        g2.setName("Remoting Users");
        g2.setComments("Users with access for submitting remote poller management data.");
        g2.addUser("remoting");
        groups.addGroup(g2);
        groupinfo.setGroups(groups);

        return Arrays.asList(new Object[][]{{
            groupinfo,
            "<groupinfo  xmlns=\"http://xmlns.opennms.org/xsd/groups\">\n"
            + "        <header>\n"
            + "                <rev>1.3</rev>\n"
            + "                <created>Wednesday, February 6, 2002 10:10:00 AM EST</created>\n"
            + "                <mstation>dhcp-219.internal.opennms.org</mstation>\n"
            + "        </header>\n"
            + "        <groups>\n"
            + "                <group>\n"
            + "                        <name>Admin</name>\n"
            + "                        <comments>The administrators</comments>\n"
            + "                        <user>admin</user>\n"
            + "                </group>\n"
            + "                <group>\n"
            + "                        <name>Remoting Users</name>\n"
            + "                        <comments>Users with access for submitting remote poller management data.</comments>\n"
            + "                        <user>remoting</user>\n"
            + "                </group>\n"
            + "        </groups>\n"
            + "</groupinfo>", /* configuration */
            "target/classes/xsds/groups.xsd",},});
    }
}
