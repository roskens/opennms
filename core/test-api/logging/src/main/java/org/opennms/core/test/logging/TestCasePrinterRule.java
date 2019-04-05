/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2019-2019 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2019 The OpenNMS Group, Inc.
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

package org.opennms.core.test.logging;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;

import org.junit.rules.ExternalResource;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestCasePrinterRule implements TestRule {
    private OutputStream m_out = null;
    private final TestCasePrinter m_printer = new TestCasePrinter();
    private static final DecimalFormat DF = new DecimalFormat("0.000");

    private String m_beforeContent = null;
    private String m_afterContent = null;
    private long m_timeStart;
    private long m_timeEnd;

    public TestCasePrinterRule(OutputStream os) {
        m_out = os;
    }

    private class TestCasePrinter extends ExternalResource {
        @Override
        protected void before() throws Throwable {
            m_timeStart = System.currentTimeMillis();
            m_out.write(m_beforeContent.getBytes());
        };


        @Override
        protected void after() {
            try {
                m_timeEnd = System.currentTimeMillis();
                double seconds = (m_timeEnd-m_timeStart)/1000.0;
                m_out.write(("Time elapsed: "+DF.format(seconds)+" sec\n").getBytes());
                m_out.write(m_afterContent.getBytes());
            } catch (IOException ioe) { /* ignore */
            }
        };
    }

    @Override
    public final Statement apply(Statement statement, Description description) {
        m_beforeContent = "------------ begin test "+description.getMethodName()+" ------------\n";
        m_afterContent =  "------------ end test "+description.getMethodName()+" ------------\n";
        return m_printer.apply(statement, description);
    }
}
