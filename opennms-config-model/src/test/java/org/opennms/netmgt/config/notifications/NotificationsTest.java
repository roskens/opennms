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
package org.opennms.netmgt.config.notifications;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class NotificationsTest extends XmlTestNoCastor<Notifications> {

    public NotificationsTest(final Notifications sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Notifications notifications = new Notifications();
        Header hdr = new Header();
        hdr.setRev("1.2");
        hdr.setCreated("Wednesday, February 6, 2002 10:10:00 AM EST");
        hdr.setMstation("localhost");
        notifications.setHeader(hdr);

        Notification noti1 = new Notification();
        notifications.addNotification(noti1);
        noti1.setName("interfaceDown");
        noti1.setStatus("on");
        noti1.setUei("uei.opennms.org/nodes/interfaceDown");
        noti1.setRule("IPADDR != '0.0.0.0'");
        noti1.setDestinationPath("Email-Admin");
        noti1.setTextMessage("All services are down on interface %interfaceresolve% (%interface%) "
                + "on node %nodelabel%.  New Outage records have been created "
                + "and service level availability calculations will be impacted "
                + "until this outage is resolved.\n");
        noti1.setSubject("Notice #%noticeid%: %interfaceresolve% (%interface%) on node %nodelabel% down.");
        noti1.setNumericMessage("111-%noticeid%");

        Notification noti2 = new Notification();
        notifications.addNotification(noti2);
        noti2.setName("nodeDown");
        noti2.setStatus("on");
        noti2.setUei("uei.opennms.org/nodes/nodeDown");
        noti2.setRule("IPADDR != '0.0.0.0'");
        noti2.setDestinationPath("Email-Admin");
        noti2.setTextMessage("All services are down on node %nodelabel%.  New Outage records have "
            + "been created and service level availability calculations will "
            + "be impacted until this outage is resolved.\n");
        noti2.setSubject("Notice #%noticeid%: node %nodelabel% down.");
        noti2.setNumericMessage("111-%noticeid%");

        Notification noti3 = new Notification();
        notifications.addNotification(noti3);
        noti3.setName("nodeLostService");
        noti3.setStatus("on");
        noti3.setUei("uei.opennms.org/nodes/nodeLostService");
        noti3.setRule("IPADDR != '0.0.0.0'");
        noti3.setDestinationPath("Email-Admin");
        noti3.setTextMessage("The %service% service poll on interface %interfaceresolve% (%interface%) "
            + "on node %nodelabel% failed at %time%.\n");
        noti3.setSubject("Notice #%noticeid%: %service% down on %interfaceresolve% (%interface%) on node %nodelabel%.");
        noti3.setNumericMessage("111-%noticeid%");

        return Arrays.asList(new Object[][]{{
            notifications,
            "<notifications>\n"
            + "    <header>\n"
            + "        <rev>1.2</rev>\n"
            + "        <created>Wednesday, February 6, 2002 10:10:00 AM EST</created>\n"
            + "        <mstation>localhost</mstation>\n"
            + "    </header>\n"
            + "    <notification name=\"interfaceDown\" status=\"on\">\n"
            + "        <uei>uei.opennms.org/nodes/interfaceDown</uei>\n"
            + "        <rule>IPADDR != '0.0.0.0'</rule>\n"
            + "        <destinationPath>Email-Admin</destinationPath>\n"
            + "        <text-message>All services are down on interface %interfaceresolve% (%interface%) on node %nodelabel%."
            + " New Outage records have been created "
            + "and service level availability calculations will be impacted "
            + "until this outage is resolved.\n"
            + "</text-message>\n"
            + "        <subject>Notice #%noticeid%: %interfaceresolve% (%interface%) on node %nodelabel% down.</subject>\n"
            + "        <numeric-message>111-%noticeid%</numeric-message>\n"
            + "    </notification>\n"
            + "    <notification name=\"nodeDown\" status=\"on\">\n"
            + "        <uei>uei.opennms.org/nodes/nodeDown</uei>\n"
            + "        <rule>IPADDR != '0.0.0.0'</rule>\n"
            + "        <destinationPath>Email-Admin</destinationPath>\n"
            + "        <text-message>All services are down on node %nodelabel%.  New Outage records have "
            + "been created and service level availability calculations will "
            + "be impacted until this outage is resolved.\n"
            + "</text-message>\n"
            + "        <subject>Notice #%noticeid%: node %nodelabel% down.</subject>\n"
            + "        <numeric-message>111-%noticeid%</numeric-message>\n"
            + "    </notification>\n"
            + "    <notification name=\"nodeLostService\" status=\"on\">\n"
            + "        <uei>uei.opennms.org/nodes/nodeLostService</uei>\n"
            + "        <rule>IPADDR != '0.0.0.0'</rule>\n"
            + "        <destinationPath>Email-Admin</destinationPath>\n"
            + "        <text-message>The %service% service poll on interface %interfaceresolve% (%interface%) "
            + "on node %nodelabel% failed at %time%.\n"
            + "</text-message>\n"
            + "        <subject>Notice #%noticeid%: %service% down on %interfaceresolve% (%interface%) on node %nodelabel%.</subject>\n"
            + "        <numeric-message>111-%noticeid%</numeric-message>\n"
            + "    </notification>"
            + "</notifications>", /* configuration */
            "target/classes/xsds/notifications.xsd",},});
    }
}
