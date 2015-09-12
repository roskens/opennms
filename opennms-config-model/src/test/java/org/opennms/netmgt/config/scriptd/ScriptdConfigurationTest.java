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

package org.opennms.netmgt.config.scriptd;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class ScriptdConfigurationTest extends XmlTest<ScriptdConfiguration> {

    public ScriptdConfigurationTest(final ScriptdConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        ScriptdConfiguration scriptdConfiguration = new ScriptdConfiguration();
        Engine engine = new Engine();
        engine.setLanguage("beanshell");
        engine.setClassName("bsh.util.BeanShellBSFEngine");
        engine.setExtensions("bsh");
        scriptdConfiguration.addEngine(engine);
        StartScript start = new StartScript();
        scriptdConfiguration.addStartScript(start);
        StopScript stop = new StopScript();
        scriptdConfiguration.addStopScript(stop);
        EventScript event = new EventScript();
        scriptdConfiguration.addEventScript(event);
        start.setLanguage("beanshell");
        start.setContent("\nimport org.opennms.netmgt.scriptd.ins.events.InsServerListener;\n"
            + "import org.opennms.netmgt.config.DataSourceFactory;\n"
            + "log = bsf.lookupBean(\"log\");\n"
            + "log.debug(\"Starting Script\");\n"
            + "log.debug(\"Start TCP PROXY for INS Event \");\n"
            + "InsServerListener isl = new InsServerListener();\n"
            + "isl.setCriteriaRestriction(\"eventuei = 'uei.opennms.org/internal/alarms/AlarmRaised' and EXISTS (select 1 from alarms where alarmtype = 1 and severity > 3 and eventoperinstruct = alarmid and eventtime > lasteventtime)\");\n"
            + "isl.start();\n");
        stop.setLanguage("beanshell");
        stop.setContent("\nisl.interrupt();\n"
            + "log.debug(\"executing a stop script\");\n");
        event.setLanguage("beanshell");
        event.setContent("\n"
            + "event = bsf.lookupBean(\"event\");\n"
            + "if ((event.uei.equals(\"uei.opennms.org/internal/alarms/NotificationAlarm\"))\n"
            + "    || (event.uei.equals(\"uei.opennms.org/internal/alarms/AlarmCleared\"))\n"
            + "    || (event.uei.equals(\"uei.opennms.org/internal/alarms/AlarmRaised\"))) {\n"
            + "  isl.flushEvent(event);\n"
            + "}\n");

        return Arrays.asList(new Object[][]{{
            scriptdConfiguration,
            "<scriptd-configuration>\n"
            + "<engine language=\"beanshell\" className=\"bsh.util.BeanShellBSFEngine\" extensions=\"bsh\"/>\n"
            + "<start-script language=\"beanshell\">\n"
            + "import org.opennms.netmgt.scriptd.ins.events.InsServerListener;\n"
            + "import org.opennms.netmgt.config.DataSourceFactory;\n"
            + "log = bsf.lookupBean(\"log\");\n"
            + "log.debug(\"Starting Script\");\n"
            + "log.debug(\"Start TCP PROXY for INS Event \");\n"
            + "InsServerListener isl = new InsServerListener();\n"
            + "isl.setCriteriaRestriction(\"eventuei = 'uei.opennms.org/internal/alarms/AlarmRaised' and EXISTS (select 1 from alarms where alarmtype = 1 and severity > 3 and eventoperinstruct = alarmid and eventtime > lasteventtime)\");\n"
            + "isl.start();\n"
            + "</start-script>\n"
            + "<stop-script language=\"beanshell\">\n"
            + "isl.interrupt();\n"
            + "log.debug(\"executing a stop script\");\n"
            + "</stop-script>\n"
            + "<event-script language=\"beanshell\">\n"
            + "event = bsf.lookupBean(\"event\");\n"
            + "if ((event.uei.equals(\"uei.opennms.org/internal/alarms/NotificationAlarm\"))\n"
            + "    || (event.uei.equals(\"uei.opennms.org/internal/alarms/AlarmCleared\"))\n"
            + "    || (event.uei.equals(\"uei.opennms.org/internal/alarms/AlarmRaised\"))) {\n"
            + "  isl.flushEvent(event);\n"
            + "}\n"
            + "</event-script>\n"
            + "</scriptd-configuration>",
            "target/classes/xsds/scriptd-configuration.xsd",},});
    }
}
