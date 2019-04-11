/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2012-2019 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.poller.monitors;

import static org.junit.Assert.assertTrue;
import static org.easymock.EasyMock.expect;
import static org.powermock.api.easymock.PowerMock.*;

import java.io.InputStream;
import java.io.FileInputStream;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.Properties;
import java.net.InetAddress;

import org.easymock.EasyMock;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.opennms.core.test.logging.TestCasePrinterRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.opennms.core.test.logging.MockLogger;
import org.opennms.core.test.logging.MockLogAppender;
import org.opennms.core.test.OpenNMSJUnit4ClassRunner;
import org.opennms.core.test.http.annotations.JUnitHttpServer;
import org.opennms.netmgt.poller.MonitoredService;
import org.opennms.netmgt.poller.PollStatus;
import org.opennms.netmgt.poller.mock.MonitorTestUtils;
import org.opennms.netmgt.utils.DnsUtils;
import org.opennms.test.JUnitConfigurationEnvironment;
import org.springframework.test.context.ContextConfiguration;


@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(OpenNMSJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/opennms/emptyContext.xml"})
@JUnitConfigurationEnvironment
@PrepareForTest({DnsUtils.class})
@PowerMockIgnore({"javax.*","org.xml.*","com.sun.*","org.w3c.*"})
public class SSLCertMonitorIT {
    @Rule
    public TestCasePrinterRule m_printerRule = new TestCasePrinterRule(System.out);

    private static long m_expireDate = System.currentTimeMillis();

    @BeforeClass
    public static void setUpKeystore() {
        try {
            final char[] keyStorePassword = "opennms".toCharArray();
            KeyStore.ProtectionParameter protParam = new KeyStore.PasswordProtection(keyStorePassword);
            final KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
            try (InputStream keyStoreData = new FileInputStream("target/test-classes/JUnitHttpServer.keystore")) {
                keystore.load(keyStoreData, keyStorePassword);
                X509Certificate cert = (X509Certificate) keystore.getCertificate("OpenNMS-Test");
                m_expireDate = cert.getNotAfter().getTime();
            }
        } catch (Exception e) {
        }
    }

    @Before
    public void setUp() throws Exception {
        final Properties props = new Properties();
        props.setProperty(MockLogger.LOG_KEY_PREFIX + "org.eclipse.jetty.io", "WARN");
        props.setProperty(MockLogger.LOG_KEY_PREFIX + "org.eclipse.jetty.server", "WARN");
        MockLogAppender.setupLogging(props);
        mockStatic(DnsUtils.class);
        expect(DnsUtils.resolveHostname("localhost",false)).andReturn(InetAddress.getByName("127.0.0.1"));
        expect(DnsUtils.resolveHostname("www.google.com", false)).andThrow(new UnknownHostException("Could not perform A record lookup for host: www.google.com"));
        replay(DnsUtils.class);
    }

    @Test
    @JUnitHttpServer(port=10342, https=true)
    public void testValidDateForCertificate() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor() {
            @Override
            protected Calendar getCalendarInstance() {
                final Calendar cal = GregorianCalendar.getInstance();
                cal.setTimeInMillis(m_expireDate - 86400000 * 5 - 45000);
                return cal;
            }
        };

        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "10342");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "localhost", DnsUtils.resolveHostname("localhost", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);
        assertTrue(status.isAvailable());
    }

    @Test
    @JUnitHttpServer(port=10342, https=true)
    public void testExpiringDateForCertificate() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor() {
            @Override
            protected Calendar getCalendarInstance() {
                final Calendar cal = GregorianCalendar.getInstance();
                cal.setTimeInMillis(m_expireDate - 86400000 * 4);
                return cal;
            }
        };

        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "10342");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "localhost", DnsUtils.resolveHostname("localhost", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);
        assertTrue(status.isUnavailable());
    }

    @Test
    @JUnitHttpServer(port=10342, https=true)
    public void testExpiredDateForCertificate() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor() {
            @Override
            protected Calendar getCalendarInstance() {
                final Calendar cal = GregorianCalendar.getInstance();
                cal.setTimeInMillis(m_expireDate - 86400000 * -1);
                return cal;
            }
        };

        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "10342");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "localhost", DnsUtils.resolveHostname("localhost", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);
        assertTrue(status.isUnavailable());
    }

    @Test
    @JUnitHttpServer(port=10342, https=true, vhosts = "test.example.com")
    public void testHostNameVerificationSucceeds() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor() {
            @Override
            protected Calendar getCalendarInstance() {
                final Calendar cal = GregorianCalendar.getInstance();
                cal.setTimeInMillis(m_expireDate - 86400000 * 5 - 45000);
                return cal;
            }
        };

        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "10342");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");
        parameters.put("server-name", "${nodelabel}.example.com");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "test", DnsUtils.resolveHostname("localhost", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);
        assertTrue(status.isAvailable());
    }

    @Test
    @JUnitHttpServer(port=10342, https=true)
    public void testHostNameVerificationFails() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor() {
            @Override
            protected Calendar getCalendarInstance() {
                final Calendar cal = GregorianCalendar.getInstance();
                cal.setTimeInMillis(m_expireDate - 86400000 * 5);
                return cal;
            }
        };

        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "10342");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");
        parameters.put("server-name", "klatschmohnwiese");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "localhost", DnsUtils.resolveHostname("localhost", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);

        assertTrue(status.isUnavailable());
    }

    @Test(expected = UnknownHostException.class)
    public void testInternetWebsite() throws UnknownHostException {
        SSLCertMonitor monitor = new SSLCertMonitor();
        Map<String, Object> parameters = new ConcurrentSkipListMap<String, Object>();
        parameters.put("port", "443");
        parameters.put("retry", "0");
        parameters.put("timeout", "500");
        parameters.put("verbose", "true");
        parameters.put("days", "5");

        MonitoredService svc = MonitorTestUtils.getMonitoredService(3, "www.google.com", DnsUtils.resolveHostname("www.google.com", false), "SSLCert");
        PollStatus status = monitor.poll(svc, parameters);
        assertTrue(status.isAvailable());
    }
}
