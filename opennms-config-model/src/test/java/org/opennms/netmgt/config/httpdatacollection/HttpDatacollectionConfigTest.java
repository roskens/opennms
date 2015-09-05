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

package org.opennms.netmgt.config.httpdatacollection;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class HttpDatacollectionConfigTest extends XmlTestNoCastor<HttpDatacollectionConfig> {

    public HttpDatacollectionConfigTest(final HttpDatacollectionConfig sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        HttpDatacollectionConfig httpDatacollectionConfig = new HttpDatacollectionConfig();
        httpDatacollectionConfig.setRrdRepository("${install.share.dir}/rrd/snmp");
        HttpCollection hc = new HttpCollection();
        httpDatacollectionConfig.addHttpCollection(hc);
        hc.setName("doc-count");
        Rrd rrd = new Rrd();
        rrd.setStep(300);
        rrd.addRra("RRA:AVERAGE:0.5:1:2016");
        rrd.addRra("RRA:AVERAGE:0.5:12:1488");
        rrd.addRra("RRA:AVERAGE:0.5:288:366");
        rrd.addRra("RRA:MAX:0.5:288:366");
        rrd.addRra("RRA:MIN:0.5:288:366");
        hc.setRrd(rrd);
        Uris uris = new Uris();
        hc.setUris(uris);
        Uri uri = new Uri();
        uris.addUri(uri);
        uri.setName("document-counts");
        Url url = new Url();
        uri.setUrl(url);
        url.setPath("/test/resources/httpcolltest.html");
        url.setUserAgent("Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en) AppleWebKit/412 (KHTML, like Gecko) Safari/412");
        url.setMatches(".*([0-9]+).*");
        url.setResponseRange("100-399");
        Attributes attrs = new Attributes();
        uri.setAttributes(attrs);
        Attrib attr = new Attrib();
        attr.setAlias("documentCount");
        attr.setMatchGroup(1);
        attr.setType("counter32");
        attrs.addAttrib(attr);

        return Arrays.asList(new Object[][] { {
                httpDatacollectionConfig,
                "<http-datacollection-config rrdRepository=\"${install.share.dir}/rrd/snmp\" >\n" +
"  <http-collection name=\"doc-count\">\n" +
"    <rrd step=\"300\">\n" +
"      <rra>RRA:AVERAGE:0.5:1:2016</rra>\n" +
"      <rra>RRA:AVERAGE:0.5:12:1488</rra>\n" +
"      <rra>RRA:AVERAGE:0.5:288:366</rra>\n" +
"      <rra>RRA:MAX:0.5:288:366</rra>\n" +
"      <rra>RRA:MIN:0.5:288:366</rra>\n" +
"    </rrd>\n" +
"    <uris>\n" +
"      <uri name=\"document-counts\">\n" +
"        <url path=\"/test/resources/httpcolltest.html\"\n" +
"             user-agent=\"Mozilla/5.0 (Macintosh; U; PPC Mac OS X; en) AppleWebKit/412 (KHTML, like Gecko) Safari/412\" \n" +
"             matches=\".*([0-9]+).*\" response-range=\"100-399\" >\n" +
"        </url>\n" +
"        <attributes>\n" +
"          <attrib alias=\"documentCount\" match-group=\"1\" type=\"counter32\"/>\n" +
"        </attributes>\n" +
"      </uri>\n" +
"    </uris>\n" +
"  </http-collection>\n" +
"</http-datacollection-config>",
                "target/classes/xsds/http-datacollection-config.xsd", }, });
    }
}
