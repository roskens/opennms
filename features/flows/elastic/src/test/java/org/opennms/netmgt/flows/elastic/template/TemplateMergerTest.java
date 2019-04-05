/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2017-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.flows.elastic.template;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.opennms.core.test.logging.TestCasePrinterRule;
import org.junit.Rule;
import org.opennms.plugins.elasticsearch.rest.template.IndexSettings;
import org.opennms.plugins.elasticsearch.rest.template.TemplateMerger;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TemplateMergerTest {
    @Rule
    public TestCasePrinterRule m_printerRule = new TestCasePrinterRule(System.out);
    @Test
    public void verifyEmptyTemplateMergeWithEmptySettings() {
        assertEquals("{}", new TemplateMerger().merge("{}", new IndexSettings()));
        assertEquals(new JsonObject(), new TemplateMerger().merge(new JsonObject(), new IndexSettings()));
    }

    @Test
    public void verifyEmptyTemplateMergeWithNullSettings() {
        assertEquals("{}", new TemplateMerger().merge("{}", null));
        assertEquals(new JsonObject(), new TemplateMerger().merge(new JsonObject(), null));
    }

    @Test
    public void verifyEmptyTemplateMergeWithFullyDefinedSettings() {
        final String expectedJson = "{" +
            "  settings: {" +
            "    index: {" +
            "      number_of_shards: 5," +
            "      number_of_replicas: 10," +
            "      refresh_interval: 10s," +
            "      routing_partition_size: 20" +
            "    }" +
            "  }" +
            "}";

        // Configure settings
        final IndexSettings settings = new IndexSettings();
        settings.setNumberOfShards(5);
        settings.setNumberOfReplicas(10);
        settings.setRefreshInterval("10s");
        settings.setRoutingPartitionSize(20);

        // Verify
        final JsonElement expectedJsonObject = new JsonParser().parse(expectedJson);
        assertEquals(new Gson().toJson(expectedJsonObject), new TemplateMerger().merge("{}", settings));
        assertEquals(new JsonParser().parse(expectedJson), new TemplateMerger().merge(new JsonObject(), settings));
    }
}