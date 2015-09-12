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
package org.opennms.netmgt.config.categories;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class CatinfoTest extends XmlTest<Catinfo> {

    public CatinfoTest(final Catinfo sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Header hdr = new Header();
        hdr.setRev("1.3");
        hdr.setCreated("Wednesday, February 6, 2002 10:10:00 AM EST");
        hdr.setMstation("checkers");

        Common common = new Common();
        common.setRule("IPADDR != '0.0.0.0'");
        
        Categories cats = new Categories();
        Category cat1 = new Category();
        cat1.setLabel("Overall Service Availability");
        cat1.setComment("This category reflects availability of all services currently being monitored by OpenNMS.");
        cat1.setNormal(99.99);
        cat1.setWarning(97d);
        cat1.setRule("IPADDR != '0.0.0.0'");
        cats.addCategory(cat1);

        Category cat2 = new Category();
        cat2.setLabel("Network Interfaces");
        cat2.setComment("This category reflects the ability to 'ping' managed devices and SNMP agents.  'Ping', using the ICMP protocol, tests a devices network connectivity/availability.");
        cat2.setNormal(99.99);
        cat2.setWarning(97d);
        cat2.addService("ICMP");
        cat2.addService("SNMP");
        cat2.setRule("(isICMP | isSNMP) & (IPADDR != '0.0.0.0')");
        cats.addCategory(cat2);
        
        Categorygroup cg = new Categorygroup();
        cg.setName("WebConsole");
        cg.setComment("Service Level Availability by Functional Group");
        cg.setCommon(common);
        cg.setCategories(cats);
        
        Catinfo catinfo = new Catinfo();
        catinfo.setHeader(hdr);
        catinfo.addCategorygroup(cg);

        return Arrays.asList(new Object[][]{{
            catinfo,
            "<catinfo xmlns=\"http://xmlns.opennms.org/xsd/categories\">"
            + "<header>"
            + "<rev>1.3</rev>"
            + "<created>Wednesday, February 6, 2002 10:10:00 AM EST</created>"
            + "<mstation>checkers</mstation>"
            + "</header>"
            + "<categorygroup>"
            + "<name>WebConsole</name>"
            + "<comment>Service Level Availability by Functional Group</comment>"
            + "<common>"
            + "<rule><![CDATA[IPADDR != '0.0.0.0']]></rule>"
            + "</common>"
            + "<categories>"
            + "<category>"
            + "<label><![CDATA[Overall Service Availability]]></label>"
            + "<comment>This category reflects availability of all services currently being monitored by OpenNMS.</comment>"
            + "<normal>99.99</normal>"
            + "<warning>97.0</warning>"
            + "<rule><![CDATA[IPADDR != '0.0.0.0']]></rule>"
            + "</category>"
            + "<category>"
            + "<label><![CDATA[Network Interfaces]]></label>"
            + "<comment>This category reflects the ability to 'ping' managed devices and SNMP agents.  'Ping', using the ICMP protocol, tests a devices network connectivity/availability.</comment>"
            + "<normal>99.99</normal>"
            + "<warning>97.0</warning>"
            + "<service>ICMP</service>"
            + "<service>SNMP</service>"
            + "<rule><![CDATA[(isICMP | isSNMP) & (IPADDR != '0.0.0.0')]]></rule>"
            + "</category>"
            + "</categories>"
            + "</categorygroup>"
            + "</catinfo>",
            "target/classes/xsds/categories.xsd",},});
    }
}
