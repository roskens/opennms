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

package org.opennms.netmgt.config.microblog;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTest;

public class MicroblogConfigurationTest extends XmlTest<MicroblogConfiguration> {

    public MicroblogConfigurationTest(final MicroblogConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        MicroblogConfiguration mbconfig = new MicroblogConfiguration();
        mbconfig.setDefaultMicroblogProfileName("twitter");
        MicroblogProfile mbp1 = new MicroblogProfile();
        mbconfig.addMicroblogProfile(mbp1);
        mbp1.setName("identica");
        mbp1.setServiceUrl("https://identi.ca/api/");
        mbp1.setAuthenUsername("yourusername");
        mbp1.setAuthenPassword("yourpassword");
        MicroblogProfile mbp2 = new MicroblogProfile();
        mbconfig.addMicroblogProfile(mbp2);
        mbp2.setName("twitter");
        mbp2.setServiceUrl("https://twitter.com/");
        mbp2.setOauthConsumerKey("consumer-key");
        mbp2.setOauthConsumerSecret("consumer-secret");
        mbp2.setOauthAccessToken("access-token-1");
        mbp2.setOauthAccessTokenSecret("access-token-1-secret");

        return Arrays.asList(new Object[][] { {
                mbconfig,
                "<microblog-configuration default-microblog-profile-name=\"twitter\">\n" +
"        <microblog-profile\n" +
"                name=\"identica\"\n" +
"                service-url=\"https://identi.ca/api/\"\n" +
"                authen-username=\"yourusername\"\n" +
"                authen-password=\"yourpassword\"\n" +
"        />\n" +
"        <microblog-profile\n" +
"                name=\"twitter\"\n" +
"                service-url=\"https://twitter.com/\"\n" +
"                oauth-consumer-key=\"consumer-key\"\n" +
"                oauth-consumer-secret=\"consumer-secret\"\n" +
"                oauth-access-token=\"access-token-1\"\n" +
"                oauth-access-token-secret=\"access-token-1-secret\"\n" +
"        />\n" +
"</microblog-configuration>", /* configuration */
                "target/classes/xsds/microblog-configuration.xsd", }, });
    }
}
