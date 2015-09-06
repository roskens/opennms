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

package org.opennms.netmgt.xml.rtc;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class EuiLevelTest extends XmlTestNoCastor<EuiLevel> {

    public EuiLevelTest(final EuiLevel sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        EuiLevel euiLevel = new EuiLevel();
        Header hdr = new Header();
        hdr.setVer("1.0");
        hdr.setCreated("Thursday, November 3, 2011 9:28:08 PM GMT");
        hdr.setMstation("master.nmanage.com");
        euiLevel.setHeader(hdr);
        Category category = new Category();
        euiLevel.addCategory(category);
        category.setCatlabel("Routers");
        category.setCatvalue(99.99D);
        Node node1 = new Node();
        category.addNode(node1);
        node1.setNodeid(1);
        node1.setNodevalue(99.99D);
        node1.setNodesvccount(5L);
        node1.setNodesvcdowncount(0L);

        return Arrays.asList(new Object[][]{{
            euiLevel,
            "<euiLevel>"
            + "<header>"
            + "  <ver>1.0</ver>"
            + "  <created>Thursday, November 3, 2011 9:28:08 PM GMT</created>"
            + "</header>"
            + "<category>"
                    +"<catlabel>Routers</catlabel>"
                    +"<catvalue>99.99</catvalue>"
                    +"<node>"
                    +"<nodeid>1</nodeid>"
                    +"<nodevalue>99.99</nodevalue>"
                    +"<nodesvccount>5</nodesvccount>"
                    +"<nodesvcdowncount>0</nodesvcdowncount>"
                    +"</node>"
            + "</category>"
            + "</euiLevel>", /* configuration */
            "target/classes/xsds/rtceui.xsd",},});
    }
}
