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

/**
 * 
 */
package org.opennms.web.svclayer.dao.support;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Collection;
import java.util.Iterator;

import org.opennms.core.test.MockLogAppender;
import org.opennms.netmgt.config.CategoryFactory;
import org.opennms.netmgt.config.categories.Category;
import org.opennms.netmgt.mock.MockCategoryFactory;
import org.opennms.test.mock.MockUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * @author jsartin
 *
 */
public class DefaultCategoryConfigDaoTest {
    @Rule
    public TestName m_testName = new TestName();
	
	DefaultCategoryConfigDao m_dao;
	protected MockCategoryFactory m_catFactory;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		MockUtil.println("------------ Begin Test "+m_testName.getMethodName()+" --------------------------");
        MockLogAppender.setupLogging();
		m_catFactory = new MockCategoryFactory();
		CategoryFactory.setInstance(m_catFactory);
		m_dao = new DefaultCategoryConfigDao();
	}

	   @After
	    public void runTest() throws Throwable {
	        MockLogAppender.assertNoWarningsOrGreater();
	        MockUtil.println("------------ End Test "+m_testName.getMethodName()+" --------------------------");
	    }

	    @Test
	    public void testNothing() {
	        // test that setUp() / tearDown() works
	    }
	    
	/**
	 * Test method for {@link org.opennms.web.svclayer.dao.support.DefaultCategoryConfigDao#findAll()}.
	 */
	@Test
	public void testFindAll() {
		Collection<Category> catColl = m_dao.findAll();
		assertFalse(catColl.isEmpty());
		assertEquals(catColl.size(),2);
		Iterator<Category> i = catColl.iterator();
		assertEquals(i.next().getLabel(),"Network Interfaces");
		assertEquals(i.next().getLabel(),"Web Servers");
		/*Iterator i = list.iterator();
		while(i.hasNext()) {
			Category cat = (Category)i.next();
			MockUtil.println("found a category --" + cat.getLabel());
			
		}*/
	}

}
