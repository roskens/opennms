/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2013-2014 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.ticketer.remedy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import java.io.File;
import java.util.Date;
import org.junit.After;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TestName;

import org.opennms.api.integration.ticketing.PluginException;
import org.opennms.api.integration.ticketing.Ticket;
import org.opennms.api.integration.ticketing.Ticket.State;

public class RemedyTicketerPluginTest {

	@Rule
	public TestName m_testName = new TestName();
		
	RemedyTicketerPlugin m_ticketer;
	
	Ticket m_ticket;
	
	
	String m_ticketId;
	
    /**
     * Don't run this test unless the runOtrsTests property
     * is set to "true".
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
        return "runRemedyTests";
    }

    @After
    public void tearDown() throws Exception {
        System.err.println("------------------- end "+m_testName.getMethodName()+" -----------------------");
    }

	 @Before
	 public void setUp() throws Exception {
            System.err.println("------------------- begin "+m_testName.getMethodName()+" ---------------------");

	        System.setProperty("opennms.home", "src" + File.separatorChar + "test" + File.separatorChar + "opennms-home");

	        m_ticketer = new RemedyTicketerPlugin();
	        	        
	        m_ticket = new Ticket();
	        m_ticket.setState(Ticket.State.OPEN);
	        m_ticket.setSummary("Test OpenNMS Integration");
	        m_ticket.setDetails("Created by Axis java client. Date: "+ new Date());
			m_ticket.setUser("antonio@opennms.it");
			
	}

	
	 
	@Test
	public void testSaveAndGet() {
	    		
		try {
            m_ticketer.saveOrUpdate(m_ticket);
            m_ticketId = m_ticket.getId();
			Ticket ticket = m_ticketer.get(m_ticketId);
			assertEquals(m_ticketId, ticket.getId());
			assertEquals(State.OPEN, ticket.getState());
		} catch (PluginException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testOpenCloseStatus() {
		testSaveAndGet();
		try {
			assertEquals(State.OPEN, m_ticket.getState());			
			
			// Close the Ticket
			m_ticket.setState(State.CLOSED);
			m_ticketer.saveOrUpdate(m_ticket);
			
			Ticket ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CLOSED, ticket.getState());

			//Reopen The Ticket
			m_ticket.setState(State.OPEN);
			m_ticketer.saveOrUpdate(m_ticket);
			
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.OPEN, ticket.getState());
			
			//Cancel the Ticket
			m_ticket.setState(State.CANCELLED);
			m_ticketer.saveOrUpdate(m_ticket);
			
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());

			// try to close
			m_ticket.setState(State.CLOSED);
			m_ticketer.saveOrUpdate(m_ticket);
			// but still cancelled
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());

			// try to re open
			m_ticket.setState(State.OPEN);
			m_ticketer.saveOrUpdate(m_ticket);
			// but still cancelled
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());

		} catch (PluginException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testClosedToCancelledStatus() {
		testSaveAndGet();
		try {
			Ticket ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.OPEN, ticket.getState());

			//Close the Ticket
			m_ticket.setState(State.CLOSED);
			m_ticketer.saveOrUpdate(m_ticket);
			
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CLOSED, ticket.getState());

			//Cancel the Ticket
			m_ticket.setState(State.CANCELLED);
			m_ticketer.saveOrUpdate(m_ticket);
			
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());
			
			// try to re open
			m_ticket.setState(State.OPEN);
			m_ticketer.saveOrUpdate(m_ticket);
			// but still cancelled
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());

			// try to close
			m_ticket.setState(State.CLOSED);
			m_ticketer.saveOrUpdate(m_ticket);
			// but still cancelled
			ticket = m_ticketer.get(m_ticketId);
			assertEquals(State.CANCELLED, ticket.getState());
		} catch (PluginException e) {
			e.printStackTrace();
		}
	}

}
