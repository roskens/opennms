/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2005-2014 The OpenNMS Group, Inc.
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

package org.opennms.reporting.availability;

import static org.junit.Assert.assertEquals;

/*
 * @author jsartin
 * 
 * Test cases for building calendar table used in availability reports
 * 
 */

import java.util.Calendar;
import java.util.Locale;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CalendarTableBuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLocaleFrench() {
		Locale.setDefault(Locale.FRENCH);
		CalendarTableBuilder builder = new CalendarTableBuilder(2005,05);
		CalendarTable section = builder.getTable();
		DaysOfWeek days = section.getDaysOfWeek();
		assertEquals(days.getDayName(0),"lun.");
		}
	@Test
	public void testLocaleEnUs() {
		Locale.setDefault(Locale.US);
		CalendarTableBuilder builder = new CalendarTableBuilder(2005,05);
		CalendarTable section = builder.getTable();
		DaysOfWeek days = section.getDaysOfWeek();
		assertEquals(days.getDayName(0),"Sun");
		}
	@Test
	public void testVisibleDays() {
		testVisibleDays(Locale.US, 2004, Calendar.FEBRUARY, 1);
	}

	private void testVisibleDays(Locale locale, int year, int month, int dayOfMonth) {
		Locale.setDefault(locale);
		CalendarTableBuilder builder = new CalendarTableBuilder(year,month);
		for (int i= 0; i < builder.m_days.length; i++) {
			System.out.println("day " + i + " " + builder.m_days[i].getVisible());
			
		}
		int firstWeekDay = getDayOfWeek(locale, year, month, dayOfMonth);
		int daysInMonth = getDaysInMonth(locale, year, month);
		int numWeeks = (firstWeekDay + daysInMonth + 6) / 7 ;
		@SuppressWarnings("unused")
        int displayDays = numWeeks * 7;

	}
	
	@Test
	public void testGetDaysInMonth() {
		assertEquals(29, getDaysInMonth(Locale.US, 2004, Calendar.FEBRUARY));
		assertEquals(28, getDaysInMonth(Locale.US, 2005, Calendar.FEBRUARY));
	}
	
	
	private int getDaysInMonth(Locale locale, int year, int month) {
		Calendar cal = Calendar.getInstance(locale);
		cal.set(year, month, 1);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private int getDayOfWeek(Locale locale, int year, int month, int dayOfMonth) {
		Calendar cal = Calendar.getInstance(locale);
		cal.set(year, month, dayOfMonth);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}
