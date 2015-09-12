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

package org.opennms.netmgt.config.notificationCommands;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class NotificationCommandsTest extends XmlTest<NotificationCommands> {

    public NotificationCommandsTest(final NotificationCommands sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        NotificationCommands config = new NotificationCommands();
        Header hdr = new Header();
        hdr.setVer(".9");
        hdr.setCreated("Wednesday, February 6, 2002 10:10:00 AM EST");
        hdr.setMstation("master.nmanage.com");
        config.setHeader(hdr);
        
        Command c1 = new Command();
        c1.setBinary("false");
        c1.setName("javaPagerEmail");
        c1.setExecute("org.opennms.netmgt.notifd.JavaMailNotificationStrategy");
        c1.setComment("class for sending pager email notifications");
        c1.setContactType("pagerEmail");
        Argument c1a1 = new Argument();
        c1a1.setStreamed("false");
        c1a1.setSwitch("-subject");
        c1.addArgument(c1a1);
        Argument c1a2 = new Argument();
        c1a2.setStreamed("false");
        c1a2.setSwitch("-pemail");
        c1.addArgument(c1a2);
        Argument c1a3 = new Argument();
        c1a3.setStreamed("false");
        c1a3.setSwitch("-tm");
        c1.addArgument(c1a3);
        config.addCommand(c1);
        
        Command c2 = new Command();
        c2.setBinary("false");
        c2.setName("javaEmail");
        c2.setExecute("org.opennms.netmgt.notifd.JavaMailNotificationStrategy");
        c2.setComment("class for sending email notifications");
        c2.setContactType("email");
        Argument c2a1 = new Argument();
        c2a1.setStreamed("false");
        c2a1.setSwitch("-subject");
        c2.addArgument(c2a1);
        Argument c2a2 = new Argument();
        c2a2.setStreamed("false");
        c2a2.setSwitch("-email");
        c2.addArgument(c2a2);
        Argument c2a3 = new Argument();
        c2a3.setStreamed("false");
        c2a3.setSwitch("-tm");
        c2.addArgument(c2a3);
        config.addCommand(c2);
        
        Command c3 = new Command();
        c3.setBinary("true");
        c3.setName("textPage");
        c3.setExecute("/usr/bin/qpage");
        c3.setComment("text paging program");
        c3.setContactType("textPage");
        Argument c3a1 = new Argument();
        c3a1.setStreamed("false");
        c3a1.setSwitch("-p");
        c3.addArgument(c3a1);
        Argument c3a2 = new Argument();
        c3a2.setStreamed("false");
        c3a2.setSwitch("-t");
        c3.addArgument(c3a2);
        config.addCommand(c3);
        
        return Arrays.asList(new Object[][] { {
                config,
                "<notification-commands>\n" +
"    <header>\n" +
"        <ver>.9</ver>\n" +
"        <created>Wednesday, February 6, 2002 10:10:00 AM EST</created>\n" +
"        <mstation>master.nmanage.com</mstation>\n" +
"    </header>\n" +
"    <command binary=\"false\">\n" +
"        <name>javaPagerEmail</name>\n" +
"        <execute>org.opennms.netmgt.notifd.JavaMailNotificationStrategy</execute>\n" +
"        <comment>class for sending pager email notifications</comment>\n" +
"        <contact-type>pagerEmail</contact-type>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-subject</switch>\n" +
"        </argument>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-pemail</switch>\n" +
"        </argument>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-tm</switch>\n" +
"        </argument>\n" +
"    </command>\n" +
"    <command binary=\"false\">\n" +
"        <name>javaEmail</name>\n" +
"        <execute>org.opennms.netmgt.notifd.JavaMailNotificationStrategy</execute>\n" +
"        <comment>class for sending email notifications</comment>\n" +
"        <contact-type>email</contact-type>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-subject</switch>\n" +
"        </argument>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-email</switch>\n" +
"        </argument>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-tm</switch>\n" +
"        </argument>\n" +
"    </command>\n" +
"    <command binary=\"true\">\n" +
"        <name>textPage</name>\n" +
"        <execute>/usr/bin/qpage</execute>\n" +
"        <comment>text paging program</comment>\n" +
"        <contact-type>textPage</contact-type>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-p</switch>\n" +
"        </argument>\n" +
"        <argument streamed=\"false\">\n" +
"            <switch>-t</switch>\n" +
"        </argument>\n" +
"    </command>" +
                        "</notification-commands>", /* configuration */
                "target/classes/xsds/notificationCommands.xsd", }, });
    }
}
