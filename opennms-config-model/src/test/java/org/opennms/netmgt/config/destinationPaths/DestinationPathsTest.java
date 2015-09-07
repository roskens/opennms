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

package org.opennms.netmgt.config.destinationPaths;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class DestinationPathsTest extends XmlTestNoCastor<DestinationPaths> {

    public DestinationPathsTest(final DestinationPaths sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        DestinationPaths destinationPaths = new DestinationPaths();
        Header hdr = new Header();
        hdr.setRev("1.2");
        hdr.setCreated("Wednesday, February 6, 2002 10:10:00 AM EST");
        hdr.setMstation("localhost");
        destinationPaths.setHeader(hdr);
        Path path = new Path();
        path.setName("Email-Admin");
        Target target = new Target();
        target.setName("Admin");
        target.addCommand("javaEmail");
        path.addTarget(target);
        destinationPaths.addPath(path);

        Path path2 = new Path();
        path2.setName("Page-Network/Systems/Management");
        Target target2 = new Target();
        target2.setInterval("15m");
        target2.setName("Network/Systems");
        target2.addCommand("textPage");
        target2.addCommand("javaPagerEmail");
        target2.addCommand("javaEmail");
        path2.addTarget(target2);
        Escalate esc = new Escalate();
        esc.setDelay("15m");
        Target escTarget = new Target();
        escTarget.setName("Management");
        escTarget.addCommand("textPage");
        escTarget.addCommand("javaPagerEmail");
        escTarget.addCommand("javaEmail");
        esc.addTarget(escTarget);
        path2.addEscalate(esc);
        destinationPaths.addPath(path2);

        return Arrays.asList(new Object[][]{{
            destinationPaths,
            "<destinationPaths>\n"
            + "    <header>\n"
            + "        <rev>1.2</rev>\n"
            + "        <created>Wednesday, February 6, 2002 10:10:00 AM EST</created>\n"
            + "        <mstation>localhost</mstation>\n"
            + "    </header>\n"
            + "    <path name=\"Email-Admin\">\n"
            + "        <target>\n"
            + "                <name>Admin</name>\n"
            + "                <command>javaEmail</command>\n"
            + "        </target>\n"
            + "    </path>\n"
            + "    <path name=\"Page-Network/Systems/Management\">\n"
            + "        <target interval=\"15m\">\n"
            + "                <name>Network/Systems</name>\n"
            + "                <command>textPage</command>\n"
            + "                <command>javaPagerEmail</command>\n"
            + "                <command>javaEmail</command>\n"
            + "        </target>\n"
            + "        <escalate delay=\"15m\">\n"
            + "            <target>\n"
            + "                <name>Management</name>\n"
            + "                <command>textPage</command>\n"
            + "                <command>javaPagerEmail</command>\n"
            + "                <command>javaEmail</command>\n"
            + "            </target>\n"
            + "        </escalate>\n"
            + "    </path>"
            + "</destinationPaths>", /* configuration */
            "target/classes/xsds/destinationPaths.xsd",},});
    }
}
