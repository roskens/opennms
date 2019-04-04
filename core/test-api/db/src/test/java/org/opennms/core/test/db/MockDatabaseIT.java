/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2004-2014 The OpenNMS Group, Inc.
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

package org.opennms.core.test.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import org.opennms.core.utils.InetAddressUtils;
import org.opennms.core.utils.Querier;
import org.opennms.netmgt.mock.MockEventUtil;
import org.opennms.netmgt.mock.MockInterface;
import org.opennms.netmgt.mock.MockNetwork;
import org.opennms.netmgt.mock.MockNode;
import org.opennms.netmgt.mock.MockService;
import org.opennms.netmgt.mock.MockService.SvcMgmtStatus;
import org.opennms.netmgt.xml.event.Event;

/**
 * @author brozow
 */
public class MockDatabaseIT {

    private MockNetwork m_network;
    private MockDatabase m_db;
    private MockDatabase m_secondDb;

    @Before
    public void setUp() throws Exception {

        m_network = new MockNetwork();
        m_network.setCriticalService("ICMP");
        m_network.addNode(1, "Router");
        m_network.addInterface("192.168.1.1");
        m_network.addService("ICMP");
        m_network.addService("SMTP");
        m_network.addInterface("192.168.1.2");
        m_network.addService("ICMP");
        m_network.addService("SMTP");
        m_network.addNode(2, "Server");
        m_network.addInterface("192.168.1.3");
        m_network.addService("ICMP");
        // set the initial status to N as a test
        m_network.addService("HTTP").setMgmtStatus(SvcMgmtStatus.NOT_POLLED);
        m_network.addInterface("192.168.1.2");
        m_network.addPathOutage(1, InetAddressUtils.addr("192.168.1.1"), "ICMP");
        
        m_db = new MockDatabase();
        m_db.populate(m_network);
        

    }

    @After
    protected void tearDown() throws Exception {
        
        m_db.drop();
        if (m_secondDb != null) m_secondDb.drop();
    }
    
    @Test
    public void testNodeQuery() {
        Querier querier = new Querier(m_db, "select * from node") {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                int nodeId = rs.getInt("nodeId");
                String label = rs.getString("nodeLabel");
                MockNode node = m_network.getNode(nodeId);
                assertNotNull(node);
                assertEquals(nodeId, node.getNodeId());
                assertEquals(label, node.getLabel());
            }
        };
        querier.execute();
        assertEquals(m_network.getNodeCount(), querier.getCount());
    }
    
    @Test
    public void testMultipleDatabases() throws Exception {
    		m_secondDb = new MockDatabase(m_db.getTestDatabase() + "_test2");
    	
    		Querier secondQuerier = new Querier(m_secondDb, "select * from node");
    		secondQuerier.execute();
    		Querier querier = new Querier(m_db, "select * from node");
    		querier.execute();
    		assertFalse(secondQuerier.getCount() == querier.getCount());
    		
    		MockNode node = m_network.getNode(1);
    		m_secondDb.writeNode(node);
    		secondQuerier = new Querier(m_secondDb, "select * from node");
    		secondQuerier.execute();
    		assertEquals(1, secondQuerier.getCount());
    		
    }
    
    @Test
    public void testIFQuery() {
        Querier querier = new Querier(m_db, "select * from ipInterface") {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                int nodeId = rs.getInt("nodeId");
                String ipAddr = rs.getString("ipAddr");
                MockInterface iface = m_network.getInterface(nodeId, ipAddr);
                assertNotNull(iface);
                assertEquals(nodeId, iface.getNodeId());
                assertEquals(ipAddr, iface.getIpAddr());
            }
        };
        querier.execute();
        assertEquals(m_network.getInterfaceCount(), querier.getCount());
    }
    
    @Test
    public void testServiceQuery() {
        Querier querier = new Querier(m_db, "select node.nodeid as nodeId, ipinterface.ipaddr as ipAddr, ifServices.status as status, ifServices.serviceId as serviceId, service.serviceName as serviceName from ifServices, ipinterface, node, service where ifServices.serviceId = service.serviceId and ipinterface.id = ifServices.ipInterfaceId and node.nodeid = ipinterface.nodeid;") {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                int nodeId = rs.getInt("nodeId");
                String ipAddr = rs.getString("ipAddr");
                int serviceId = rs.getInt("serviceId");
                String serviceName = rs.getString("serviceName");
                String status = rs.getString("status");
                MockService svc = m_network.getService(nodeId, ipAddr, serviceName);
                assertNotNull(svc);
                assertEquals("Assertion failed: " + svc, svc.getNodeId(), nodeId);
                assertEquals("Assertion failed: " + svc, svc.getIpAddr(), ipAddr);
                assertEquals("Assertion failed: " + svc, svc.getSvcName(), serviceName);
                assertEquals("Assertion failed: " + svc, svc.getSvcId(), serviceId);
                assertEquals("Assertion failed: " + svc, svc.getMgmtStatus().toDbString(), status);
            }
        };
        querier.execute();
        assertEquals(m_network.getServiceCount(), querier.getCount());
    }
    
    @Test
    public void testCascade() {
        m_db.update("delete from node where nodeid = '1'");
        assertEquals(0, m_db.countRows("select * from node where nodeid = '1'"));
        assertEquals(0, m_db.countRows("select * from ipInterface where nodeid = '1'"));
        assertEquals(0, m_db.countRows("select * from ifServices, ipInterface, node where ifServices.ipInterfaceId = ipInterface.id and ipInterface.nodeid = node.nodeId and node.nodeid = '1'"));
    }

    @Test
    public void testOutage() {
        final MockService svc = m_network.getService(1, "192.168.1.1", "ICMP");
        Event svcLostEvent = MockEventUtil.createNodeLostServiceEvent("TEST", svc);

        m_db.writeEvent(svcLostEvent);
        m_db.createOutage(svc, svcLostEvent);
        assertEquals(1, m_db.countOutagesForService(svc));
        Querier querier = new Querier(m_db, "select node.nodeid as nodeid, ipinterface.ipaddr as ipaddr, ifservices.serviceid as serviceid from outages, ifservices, ipinterface, node where outages.ifserviceid = ifservices.id and ifservices.ipinterfaceid = ipinterface.id and ipinterface.nodeid = node.nodeid") {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                int nodeId = rs.getInt("nodeId");
                String ipAddr = rs.getString("ipAddr");
                int serviceId = rs.getInt("serviceId");
                assertEquals(nodeId, svc.getNodeId());
                assertEquals(ipAddr, svc.getIpAddr());
                assertEquals(serviceId, svc.getSvcId());
            }
        };
        querier.execute();
        assertEquals(1, querier.getCount());
    }

    @Test
    public void testUpdateNodeSequence() {
        int maxNodeId = m_db.getJdbcTemplate().queryForObject("select max(nodeid) from node", Integer.class);
        int nextSeqNum = m_db.getJdbcTemplate().queryForObject("select nextval('nodeNxtId')", Integer.class);
        assertTrue(nextSeqNum > maxNodeId);
        
    }
    
    @Test
    public void testSetServiceStatus() {
        MockService svc = m_network.getService(1, "192.168.1.1", "SMTP");
        assertEquals('A', m_db.getServiceStatus(svc));
        m_db.setServiceStatus(svc, 'U');
        assertEquals('U', m_db.getServiceStatus(svc));
    }
    
    

}
