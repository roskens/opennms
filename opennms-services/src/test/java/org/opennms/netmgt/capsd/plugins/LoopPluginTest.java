/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2002-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.capsd.plugins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.opennms.core.test.logging.TestCasePrinterRule;
import org.junit.Rule;
import org.junit.After;
import org.junit.Before;

import org.opennms.core.utils.InetAddressUtils;
import org.opennms.netmgt.poller.monitors.support.LoopPlugin;
public class LoopPluginTest {
    @Rule
    public TestCasePrinterRule m_printerRule = new TestCasePrinterRule(System.out);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /*
     * Test method for 'org.opennms.netmgt.capsd.plugins.LoopPlugin.getProtocolName()'
     */
    @Test
    public void testGetProtocolName() {
        LoopPlugin plugin = new LoopPlugin();
        assertEquals("LOOP", plugin.getProtocolName());
    }

    /*
     * Test method for 'org.opennms.netmgt.capsd.plugins.LoopPlugin.isProtocolSupported(InetAddress)'
     */
    @Test
    public void testIsProtocolSupportedInetAddress() throws UnknownHostException {
        LoopPlugin plugin = new LoopPlugin();
        assertFalse(plugin.isProtocolSupported(InetAddressUtils.addr("127.0.0.1")));
    }

    /*
     * Test method for 'org.opennms.netmgt.capsd.plugins.LoopPlugin.isProtocolSupported(InetAddress, Map)'
     */
    @Test
    public void testIsProtocolSupportedInetAddressMap() throws UnknownHostException {
        Map<String, Object> qualifiers = new HashMap<String, Object>();
        qualifiers.put("ip-match", "127.*.*.1-2");
        qualifiers.put("is-supported", "true");
        LoopPlugin plugin = new LoopPlugin();
        assertTrue(plugin.isProtocolSupported(InetAddressUtils.addr("127.0.0.1"), qualifiers));
        assertFalse(plugin.isProtocolSupported(InetAddressUtils.addr("127.0.0.3"), qualifiers));

    }

}
