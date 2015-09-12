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

package org.opennms.netmgt.config.eventd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class EventdConfigurationTest extends XmlTest<EventdConfiguration> {

    public EventdConfigurationTest(final EventdConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        EventdConfiguration eventdConfiguration = new EventdConfiguration();
        eventdConfiguration.setTCPAddress("127.0.0.1");
        eventdConfiguration.setTCPPort(5817);
        eventdConfiguration.setUDPAddress("127.0.0.1");
        eventdConfiguration.setUDPPort(5817);
        eventdConfiguration.setReceivers(5);
        eventdConfiguration.setGetNextEventID("SELECT nextval('eventsNxtId')");
        eventdConfiguration.setSocketSoTimeoutPeriod(3000);
        eventdConfiguration.setSocketSoTimeoutRequired("yes");

        return Arrays.asList(new Object[][]{{
            eventdConfiguration,
            "<EventdConfiguration\n"
            + "        TCPAddress=\"127.0.0.1\"\n"
            + "        TCPPort=\"5817\"\n"
            + "        UDPAddress=\"127.0.0.1\"\n"
            + "        UDPPort=\"5817\"\n"
            + "        receivers=\"5\"\n"
            + "        getNextEventID=\"SELECT nextval('eventsNxtId')\"\n"
            + "        socketSoTimeoutRequired=\"yes\"\n"
            + "        socketSoTimeoutPeriod=\"3000\" />\n",
            "target/classes/xsds/eventd-configuration.xsd",},});
    }
}
