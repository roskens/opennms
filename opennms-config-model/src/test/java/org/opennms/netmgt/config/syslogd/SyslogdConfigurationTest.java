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

package org.opennms.netmgt.config.syslogd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class SyslogdConfigurationTest extends XmlTestNoCastor<SyslogdConfiguration> {

    public SyslogdConfigurationTest(final SyslogdConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        SyslogdConfiguration syslogdConf = new SyslogdConfiguration();
        Configuration conf = new Configuration();
        syslogdConf.setConfiguration(conf);
        conf.setSyslogPort(10514);
        conf.setNewSuspectOnMessage(Boolean.FALSE);
        conf.setParser("org.opennms.netmgt.syslogd.CustomSyslogParser");
        conf.setForwardingRegexp("^.*\\s(19|20)\\d\\d([-/.])(0[1-9]|1[012])\\2(0[1-9]|[12][0-9]|3[01])(\\s+)(\\S+)(\\s)(\\S.+)");
        conf.setMatchingGroupHost(6);
        conf.setMatchingGroupMessage(8);
        conf.setDiscardUei("DISCARD-MATCHING-MESSAGES");
        syslogdConf.addImportFile("syslog/ApacheHTTPD.syslog.xml");
        syslogdConf.addImportFile("syslog/LinuxKernel.syslog.xml");
        syslogdConf.addImportFile("syslog/OpenSSH.syslog.xml");
        syslogdConf.addImportFile("syslog/Procmail.syslog.xml");
        syslogdConf.addImportFile("syslog/Postfix.syslog.xml");
        syslogdConf.addImportFile("syslog/Sudo.syslog.xml");

        return Arrays.asList(new Object[][]{{
            syslogdConf,
            "<syslogd-configuration>\n"
            + "    <configuration\n"
            + "            syslog-port=\"10514\"\n"
            + "            new-suspect-on-message=\"false\"\n"
            + "            parser=\"org.opennms.netmgt.syslogd.CustomSyslogParser\"\n"
            + "            forwarding-regexp=\"^.*\\s(19|20)\\d\\d([-/.])(0[1-9]|1[012])\\2(0[1-9]|[12][0-9]|3[01])(\\s+)(\\S+)(\\s)(\\S.+)\"\n"
            + "            matching-group-host=\"6\"\n"
            + "            matching-group-message=\"8\"\n"
            + "            discard-uei=\"DISCARD-MATCHING-MESSAGES\"\n"
            + "            />\n"
            + "    <import-file>syslog/ApacheHTTPD.syslog.xml</import-file>\n"
            + "    <import-file>syslog/LinuxKernel.syslog.xml</import-file>\n"
            + "    <import-file>syslog/OpenSSH.syslog.xml</import-file>\n"
            + "    <import-file>syslog/Procmail.syslog.xml</import-file>\n"
            + "    <import-file>syslog/Postfix.syslog.xml</import-file>\n"
            + "    <import-file>syslog/Sudo.syslog.xml</import-file>\n"
            + "</syslogd-configuration>",
            "target/classes/xsds/syslogd-configuration.xsd",},});
    }
}
