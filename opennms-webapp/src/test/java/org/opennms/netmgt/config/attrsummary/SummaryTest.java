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

package org.opennms.netmgt.config.attrsummary;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class SummaryTest extends XmlTestNoCastor<Summary> {

    public SummaryTest(final Summary sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        Summary summary = new Summary();
        Resource r1 = new Resource();
        summary.addResource(r1);
        r1.setName("resource1");
        Attribute r1a1 = new Attribute();
        r1.addAttribute(r1a1);
        r1a1.setName("r1a1");
        r1a1.setAverage(45.0D);
        r1a1.setMax(55.0D);
        r1a1.setMin(40.0D);
          
        Resource r2 = new Resource();
        summary.addResource(r2);
        r2.setName("resource2");
        Attribute r2a1 = new Attribute();
        r2.addAttribute(r2a1);
        r2a1.setName("r2a1");
        r2a1.setAverage(75.0D);
        r2a1.setMax(95.0D);
        r2a1.setMin(20.0D);

        return Arrays.asList(new Object[][] { {
                summary,
                "<summary>"
                  + "<resource>"
                  + "<name>resource1</name>"
                  + "<attribute>"
                  + "<name>r1a1</name>"
                  + "<min>40.0</min>"
                  + "<average>45.0</average>"
                  + "<max>55.0</max>"
                  + "</attribute>"
                  + "</resource>"
                  + "<resource>"
                  + "<name>resource2</name>"
                  + "<attribute>"
                  + "<name>r2a1</name>"
                  + "<min>20.0</min>"
                  + "<average>75.0</average>"
                  + "<max>95.0</max>"
                  + "</attribute>"
                  + "</resource>"
                  + "</summary>" ,
                
                "target/classes/xsds/attr-summary.xsd", }, });
    }
}
