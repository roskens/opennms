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

package org.opennms.jicmp.jna;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.InetAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.opennms.core.test.logging.TestCasePrinterRule;

import com.sun.jna.LastErrorException;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.ptr.IntByReference;


/**
 * BSDByteBufferTest
 *
 * @author brozow
 * @author roskens
 */
public class BSDByteBufferTest {
    @Rule
    public TestCasePrinterRule m_printerRule = new TestCasePrinterRule(System.out);

    static {
        Native.register((String)null);
    }

    public native int socket(int domain, int type, int protocol) throws LastErrorException;
    public native int sendto(int socket, Buffer buffer, int buflen, int flags, bsd_sockaddr_in dest_addr, int dest_addr_len) throws LastErrorException;
    public native int recvfrom(int socket, Buffer buffer, int buflen, int flags, bsd_sockaddr_in in_addr, IntByReference in_addr_len) throws LastErrorException;
    //public native int close(int socket) throws LastErrorException;


    public void printf(String fmt, Object... args) {
        System.err.print(String.format(fmt, args));
    }

    @Test(timeout=30000)
    public void testPassing() throws Exception {
        if (!(Platform.isMac() || Platform.isFreeBSD() || Platform.isOpenBSD())) {
            printf("sockaddr_in is incompatible with bsd_sockaddr_in\n");
            return;
        }

        Server server = new Server(0);
        server.start();
        server.waitForStart();
        int port = server.getPort();

        String msg = "OpenNMS!";


        int socket = -1;
        try {
            InetAddress svrAddr = server.getInetAddress();
            byte[] data = msg.getBytes(StandardCharsets.US_ASCII);
            String sent = msg.substring(4,7);
            ByteBuffer buf = ByteBuffer.wrap(data, 4, 3).slice();

            printf("socket(%d, %d, %d);\n", NativeDatagramSocket.PF_INET, NativeDatagramSocket.SOCK_DGRAM, NativeDatagramSocket.IPPROTO_UDP);
            socket = socket(NativeDatagramSocket.PF_INET, NativeDatagramSocket.SOCK_DGRAM, NativeDatagramSocket.IPPROTO_UDP);

            printf("sockaddr_in destAddr = new sockaddr_in('%s', %d);\n", svrAddr, port);
            bsd_sockaddr_in destAddr = new bsd_sockaddr_in(svrAddr, port);
            printf("sendto(socket, '%s', %d, 0, destAddr, %d);\n", buf, buf.remaining(), destAddr.size());
            int i = sendto(socket, buf, buf.remaining(), 0, destAddr, destAddr.size());
            if (i < 0) {
                printf("sendto: failed\n");
            }

            bsd_sockaddr_in in_addr = new bsd_sockaddr_in();
            IntByReference szRef = new IntByReference(in_addr.size());

            ByteBuffer rBuf = ByteBuffer.allocate(128);
            int n = recvfrom(socket, rBuf, rBuf.remaining(), 0, in_addr, szRef);
            printf("recvfrom: got %d bytes\n", n);
            rBuf.limit(rBuf.position()+n);

            assertThat(szRef.getValue(), is(equalTo(in_addr.size())));
            assertThat(rBuf.isDirect(), is(false));
            assertThat(rBuf.position(), is(equalTo(0)));
            assertThat(rBuf.limit(), is(equalTo(n)));
            assertThat(rBuf.capacity(), is(equalTo(128)));

            byte[] b = new byte[rBuf.remaining()];
            rBuf.get(b);

            String results = new String(b, StandardCharsets.US_ASCII);

            printf("Received: %s\n", results);

            assertEquals(sent, results);

        } finally {
            // we leak this socket since close doesn't work on windows
            // it will go away when the test exits
            //if (socket != -1) close(socket);

            server.stop();

        }
    }

}
