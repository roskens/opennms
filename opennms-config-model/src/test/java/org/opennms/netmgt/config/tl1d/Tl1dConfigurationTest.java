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

package org.opennms.netmgt.config.tl1d;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class Tl1dConfigurationTest extends XmlTestNoCastor<Tl1dConfiguration> {

    public Tl1dConfigurationTest(final Tl1dConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Tl1dConfiguration tl1dConfiguration = new Tl1dConfiguration();
        Tl1Element tl1 = new Tl1Element();
        tl1.setHost("127.0.0.1");
        tl1.setPort(15001);
        tl1.setUserid("opennms");
        tl1.setPassword("opennms");
        tl1.setReconnectDelay(30000L);
        tl1.setTl1ClientApi("org.opennms.netmgt.tl1d.Tl1ClientImpl");
        tl1.setTl1MessageParser("org.opennms.netmgt.tl1d.Tl1AutonomousMessageProcessor");
        tl1dConfiguration.addTl1Element(tl1);

        return Arrays.asList(new Object[][]{{
            tl1dConfiguration,
            "<tl1d-configuration>"
            + "  <tl1-element host=\"127.0.0.1\""
            + "    port=\"15001\" "
            + "    password=\"opennms\""
            + "    reconnect-delay=\"30000\""
            + "    tl1-client-api=\"org.opennms.netmgt.tl1d.Tl1ClientImpl\""
            + "    tl1-message-parser=\"org.opennms.netmgt.tl1d.Tl1AutonomousMessageProcessor\""
            + "    userid=\"opennms\"/>"
            + "</tl1d-configuration>", /* configuration */
            "target/classes/xsds/tl1d-configuration.xsd",},});
    }
}
