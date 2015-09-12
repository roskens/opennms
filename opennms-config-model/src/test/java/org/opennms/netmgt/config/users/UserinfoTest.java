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

package org.opennms.netmgt.config.users;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class UserinfoTest extends XmlTest<Userinfo> {
    
    public UserinfoTest(final Userinfo sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }
    
    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        
        Userinfo userinfo = new Userinfo();
        Header hdr = new Header();
        hdr.setRev(".9");
        hdr.setCreated("Thursday, November 3, 2011 9:28:08 PM GMT");
        hdr.setMstation("master.nmanage.com");
        userinfo.setHeader(hdr);
        Users users = new Users();
        userinfo.setUsers(users);
        User user = new User();
        user.setUserId("admin");
        user.setFullName("Administrator");
        user.setUserComments("Default administrator, do not delete");
        Password pass = new Password();
        pass.setContent("21232F297A57A5A743894A0E4A801FC3");
        user.setPassword(pass);
        users.addUser(user);
        
        return Arrays.asList(new Object[][]{{
            userinfo,
            "<userinfo>"
            + "    <header>"
            + "        <rev>.9</rev>"
            + "        <created>Thursday, November 3, 2011 9:28:08 PM GMT</created>"
            + "        <mstation>master.nmanage.com</mstation>"
            + "    </header>"
            + "    <users>"
            + "        <user>"
            + "            <user-id>admin</user-id>"
            + "            <full-name>Administrator</full-name>"
            + "            <user-comments>Default administrator, do not delete</user-comments>"
            + "            <password>21232F297A57A5A743894A0E4A801FC3</password>"
            + "        </user>"
            + "    </users>"
            + "</userinfo>",
            "target/classes/xsds/users.xsd",},});
    }
}
