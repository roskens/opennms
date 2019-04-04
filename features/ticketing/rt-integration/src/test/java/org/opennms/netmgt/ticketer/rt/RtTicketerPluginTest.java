/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2008-2014 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.ticketer.rt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import java.io.File;
import java.util.Date;
import org.junit.After;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

import org.opennms.api.integration.ticketing.PluginException;
import org.opennms.api.integration.ticketing.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RtTicketerPluginTest {
    private static final Logger LOG = LoggerFactory.getLogger(RtTicketerPluginTest.class);

    @Rule
    public TestName m_testName = new TestName();

    /**
     * Test Cases for RtTicketerPlugin
     * 
     * @author <a href="mailto:jonathan@opennms.org">Jonathan Sartin</a>
     */

    RtTicketerPlugin m_ticketer;

    Ticket m_ticket;

    /**
     * Don't run this test unless the runRtTests property is set to "true".
     */
    @BeforeClass
    public void runTest() throws Throwable {
        assumeTrue(isRunTest());
        if (!isRunTest()) {
            System.err.println("Skipping test '" + m_testName.getMethodName() + "' because system property '" + getRunTestProperty() + "' is not set to 'true'");
            return;
        }
    }

    private boolean isRunTest() {
        return Boolean.parseBoolean(System.getProperty(getRunTestProperty()));
    }

    private String getRunTestProperty() {
        return "runRtTests";
    }

    @After
    public void tearDown() throws Exception {
        System.err.println("------------------- end "+m_testName.getMethodName()+" -----------------------");
    }

    @Before
    public void setUp() throws Exception {
        System.err.println("------------------- begin "+m_testName.getMethodName()+" ---------------------");
        final String testHome = System.getProperty("user.home") + File.separatorChar + ".opennms" + File.separatorChar + "test-home";
        final File testProp = new File(testHome + File.separatorChar + "etc" + File.separatorChar + "rt.properties");
        if (testProp.exists()) {
            LOG.debug("{} exists, using it instead of src/test/opennms-home", testHome);
            System.setProperty("opennms.home", testHome);
        } else {
            System.setProperty("opennms.home", "src" + File.separatorChar + "test" + File.separatorChar + "opennms-home");
        }

        m_ticketer = new RtTicketerPlugin();

        m_ticket = new Ticket();
        m_ticket.setState(Ticket.State.OPEN);
        m_ticket.setSummary("Ticket Summary for ticket: " + new Date());
        m_ticket.setDetails("First Article for ticket: " + new Date());
        m_ticket.setUser("root@localhost");

    }

    @Test
    public void testSaveAndGet() {

        try {
            m_ticketer.saveOrUpdate(m_ticket);
            Ticket retrievedTicket = m_ticketer.get(m_ticket.getId());
            assertTicketEquals(m_ticket, retrievedTicket);
        } catch (final PluginException e) {
            e.printStackTrace();
            fail("Something failed in the ticketer plugin");
        }

    }

    @Test
    public void testUpdateAndGet() {

        try {
            m_ticketer.saveOrUpdate(m_ticket);
            Ticket savedTicket = m_ticketer.get(m_ticket.getId());
            assertTicketEquals(m_ticket, savedTicket);
            m_ticket.setState(Ticket.State.CLOSED);
            m_ticketer.saveOrUpdate(m_ticket);
            System.out.println("before update, ticket status was " + savedTicket.getState().toString());
            Ticket updatedTicket = m_ticketer.get(m_ticket.getId());
            System.out.println("after update, ticket status was " + updatedTicket.getState().toString());
            assertTicketEquals(m_ticket, updatedTicket);
        } catch (PluginException e) {
            fail("Something failed in the ticketer plugin");
            e.printStackTrace();
        }

    }

    @Test
    public void testStateConversions() {
        assertEquals(Ticket.State.OPEN, m_ticketer.rtToOpenNMSState("open"));
        assertEquals(Ticket.State.OPEN, m_ticketer.rtToOpenNMSState("new"));
        assertEquals(Ticket.State.CLOSED, m_ticketer.rtToOpenNMSState("resolved"));
        assertEquals(Ticket.State.CANCELLED, m_ticketer.rtToOpenNMSState("cancelled"));
        assertEquals(Ticket.State.OPEN, m_ticketer.rtToOpenNMSState("INVALID_STRING"));

        assertEquals("new", m_ticketer.openNMSToRTState(Ticket.State.OPEN));
        assertEquals("resolved", m_ticketer.openNMSToRTState(Ticket.State.CLOSED));
        assertEquals("cancelled", m_ticketer.openNMSToRTState(Ticket.State.CANCELLED));
    }

    private void assertTicketEquals(final Ticket existing, final Ticket retrieved) {
        assertEquals(existing.getId(), retrieved.getId());
        assertEquals(existing.getState(), retrieved.getState());
        assertEquals(existing.getUser(), retrieved.getUser());
        assertEquals(existing.getSummary(), retrieved.getSummary());
    }

}
