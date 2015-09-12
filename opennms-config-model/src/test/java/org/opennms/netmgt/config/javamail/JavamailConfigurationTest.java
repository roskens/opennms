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

package org.opennms.netmgt.config.javamail;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class JavamailConfigurationTest extends XmlTest<JavamailConfiguration> {

    public JavamailConfigurationTest(final JavamailConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        JavamailConfiguration jmConfig = new JavamailConfiguration();
        jmConfig.setDefaultReadConfigName("localhost");
        jmConfig.setDefaultSendConfigName("localhost");
        SendmailConfig smConf = new SendmailConfig();
        smConf.setName("");
        smConf.setAttemptInterval(3000);
        smConf.setUseAuthentication(Boolean.FALSE);
        smConf.setUseJmta(Boolean.TRUE);
        smConf.setDebug(Boolean.TRUE);
        SendmailHost smHost = new SendmailHost();
        smHost.setHost("127.0.0.1");
        smHost.setPort(25);
        smConf.setSendmailHost(smHost);
        SendmailProtocol smProtocol = new SendmailProtocol();
        smProtocol.setCharSet("us-ascii");
        smProtocol.setMailer("smtpsend");
        smProtocol.setMessageContentType("text/plain");
        smProtocol.setMessageEncoding("7-bit");
        smProtocol.setQuitWait(Boolean.TRUE);
        smProtocol.setSslEnable(Boolean.FALSE);
        smProtocol.setStartTls(Boolean.FALSE);
        smProtocol.setTransport("smtp");
        smConf.setSendmailProtocol(smProtocol);
        SendmailMessage smMessage = new SendmailMessage();
        smMessage.setTo("root@localhost");
        smMessage.setFrom("root@[127.0.0.1]");
        smMessage.setSubject("OpenNMS Test Message");
        smMessage.setBody("This is an OpenNMS test message.");
        smConf.setSendmailMessage(smMessage);
        UserAuth ua1 = new UserAuth();
        ua1.setUserName("opennms");
        ua1.setPassword("opennms");
        smConf.setUserAuth(ua1);

        ReadmailConfig rmConf = new ReadmailConfig();
        rmConf.setName("localhost");
        rmConf.setAttemptInterval(1000L);
        rmConf.setDeleteAllMail(Boolean.FALSE);
        rmConf.setMailFolder("INBOX");
        rmConf.setDebug(Boolean.TRUE);
        JavamailProperty jp1 = new JavamailProperty();
        jp1.setName("mail.pop3.apop.enable");
        jp1.setValue("false");
        rmConf.addJavamailProperty(jp1);
        JavamailProperty jp2 = new JavamailProperty();
        jp2.setName("mail.pop3.rsetbeforequit");
        jp2.setValue("false");
        rmConf.addJavamailProperty(jp2);
        ReadmailHost rmHost = new ReadmailHost();
        rmHost.setHost("127.0.0.1");
        rmHost.setPort(110);
        ReadmailProtocol rmProto = new ReadmailProtocol();
        rmProto.setSslEnable(Boolean.FALSE);
        rmProto.setStartTls(Boolean.FALSE);
        rmProto.setTransport("pop3");
        rmHost.setReadmailProtocol(rmProto);
        rmConf.setReadmailHost(rmHost);
        UserAuth ua2 = new UserAuth();
        ua2.setUserName("opennms");
        ua2.setPassword("opennms");
        rmConf.setUserAuth(ua2);
        End2endMailConfig endConf = new End2endMailConfig();
        endConf.setName("default");
        endConf.setSendmailConfigName("localhost");
        endConf.setReadmailConfigName("localhost");
        jmConfig.addReadmailConfig(rmConf);
        jmConfig.addSendmailConfig(smConf);
        jmConfig.addEnd2endMailConfig(endConf);

        return Arrays.asList(new Object[][]{{
            jmConfig,
            "<javamail-configuration default-send-config-name=\"localhost\" default-read-config-name=\"localhost\">\n"
            + "   <sendmail-config debug=\"true\" use-authentication=\"false\" use-jmta=\"true\" attempt-interval=\"3000\" name=\"\">\n"
            + "      <sendmail-host host=\"127.0.0.1\" port=\"25\"/>\n"
            + "      <sendmail-protocol char-set=\"us-ascii\" mailer=\"smtpsend\" message-content-type=\"text/plain\" message-encoding=\"7-bit\" quit-wait=\"true\" transport=\"smtp\" ssl-enable=\"false\" start-tls=\"false\"/>\n"
            + "      <sendmail-message to=\"root@localhost\" from=\"root@[127.0.0.1]\" subject=\"OpenNMS Test Message\" body=\"This is an OpenNMS test message.\"/>\n"
            + "      <user-auth user-name=\"opennms\" password=\"opennms\"/>\n"
            + "   </sendmail-config>\n"
            + "   <readmail-config debug=\"true\" mail-folder=\"INBOX\" attempt-interval=\"1000\" delete-all-mail=\"false\" name=\"localhost\">\n"
            + "      <javamail-property name=\"mail.pop3.apop.enable\" value=\"false\"/>\n"
            + "      <javamail-property name=\"mail.pop3.rsetbeforequit\" value=\"false\"/>\n"
            + "      <readmail-host host=\"127.0.0.1\" port=\"110\">\n"
            + "         <readmail-protocol transport=\"pop3\" ssl-enable=\"false\" start-tls=\"false\"/>\n"
            + "      </readmail-host>\n"
            + "      <user-auth user-name=\"opennms\" password=\"opennms\"/>\n"
            + "   </readmail-config>\n"
            + "   <end2end-mail-config name=\"default\" sendmail-config-name=\"localhost\" readmail-config-name=\"localhost\"/>\n"
            + "</javamail-configuration>",
            "target/classes/xsds/javamail-configuration.xsd",},});
    }
}
