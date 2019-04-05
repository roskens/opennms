/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2014 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.dao.jaxb.collector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.junit.Test;
import org.opennms.core.test.logging.TestCasePrinterRule;
import org.junit.Rule;
import org.junit.After;
import org.junit.Before;

import org.opennms.netmgt.dao.jaxb.InvocationAnticipator;
import org.opennms.netmgt.dao.jaxb.collector.DataCollectionConfigFile;
import org.opennms.netmgt.dao.jaxb.collector.DataCollectionVisitor;
import org.springframework.core.io.ClassPathResource;

public class DataCollectionConfigFileTest {
    @Rule
    public TestCasePrinterRule m_printerRule = new TestCasePrinterRule(System.out);
    
    private InvocationAnticipator m_invocationAnticipator;
    private DataCollectionVisitor m_visitor;
    

    @Before
    public void setUp() throws Exception {
        
        InvocationHandler noNullsAllowed = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                assertNotNull(args);
                assertEquals(1, args.length);
                assertNotNull(args[0]);
                return null;
            }
            
        };
        m_invocationAnticipator = new InvocationAnticipator(DataCollectionVisitor.class);
        m_invocationAnticipator.setInvocationHandler(noNullsAllowed);
        
        m_visitor = (DataCollectionVisitor)m_invocationAnticipator.getProxy();
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testVisit() throws IOException {
        
        ClassPathResource resource = new ClassPathResource("/datacollectionconfigfile-testdata.xml");
        DataCollectionConfigFile configFile = new DataCollectionConfigFile(resource.getFile());
        
        anticipateVisits(1, "DataCollectionConfig");
        anticipateVisits(1, "SnmpCollection");
        anticipateVisits(1, "Rrd");
        anticipateVisits(4, "Rra");
        anticipateVisits(26, "SystemDef");
        anticipateVisits(4, "SysOid");
        anticipateVisits(22, "SysOidMask");
        anticipateVisits(0, "IpList");
        anticipateVisits(26, "Collect");
        anticipateVisits(69, "IncludeGroup");
        anticipateVisits(57, "Group");
        anticipateVisits(0, "SubGroup");
        anticipateVisits(809, "MibObj");
        
        configFile.visit(m_visitor);
        
        m_invocationAnticipator.verify();
        
    }

    private void anticipateVisits(int count, String visited) {
        m_invocationAnticipator.anticipateCalls(count, "visit"+visited);
        m_invocationAnticipator.anticipateCalls(count, "complete"+visited);
    }

}
