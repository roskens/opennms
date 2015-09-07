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

package org.opennms.netmgt.config.snmpAsset.adapter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class SnmpAssetAdapterConfigurationTest extends XmlTestNoCastor<SnmpAssetAdapterConfiguration> {

    private static void addMibObj(MibObjs mibObjs, String oid, String alias) {
        MibObj mibObj = new MibObj();
        mibObj.setOid(oid);
        mibObj.setAlias(alias);
        mibObjs.addMibObj(mibObj);
    }

    public SnmpAssetAdapterConfigurationTest(final SnmpAssetAdapterConfiguration sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }

    @Parameters
    public static Collection<Object[]> data() throws ParseException {

        SnmpAssetAdapterConfiguration config = new SnmpAssetAdapterConfiguration();
        Package pkg = new Package();
        config.addPackage(pkg);
        pkg.setName("PJs");
        PackageChoice choice = new PackageChoice();
        pkg.setPackageChoice(choice);
        choice.setSysoid(".1.3");
        AssetField assetField = new AssetField();
        pkg.addAssetField(assetField);
        assetField.setName("comment");
        assetField.setFormatString("OS Type: ${osType}\nOS Version: ${osVersion}\nSystem Type: ${systemType}\nProcessor Type: ${processorType}\nProcessor Speed: ${processorSpeed}\nPhysical Memory: ${physicalMemory}\nHard Drive Type: ${hardDriveType}\nTape Drive Type: ${tapeDriveType}\nOptical Drive Type: ${opticalDriveType}\nEquinox Type: ${equinoxType}\nModem 1 Type: ${modemType1}\nModem 2 Type: ${modemType2}\nModem Error Count: ${modemErrorCount}\nDatabase Dump Log: ${databaseDumpLog}\nMonetra Version: ${monetraVersion}\nMonetra Store ID: ${monetraStoreId}\nOven Status: ${ovenStatus}\nRAID Status: ${raidStatus}\nMonetra Unsettled Batch Timestamp: ${monetraUnsettledBatchTimestamp}\nMonetra Key Timestamp: ${monetraKeyTimestamp}\nUnsettled Batch: ${unsettledBatch}\nSecondary Password Algorithm Version: ${secondaryPasswordAlgorithmVersion}\nProfit Database Version: ${profitDatabaseVersion}\nJava Version: ${javaVersion}\nProfit API Version: ${profitApiVersion}");
        MibObjs mibObjs = new MibObjs();
        assetField.setMibObjs(mibObjs);
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.1", "osType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.2", "osVersion");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.3", "systemType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.4", "processorType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.5", "processorSpeed");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.6", "physicalMemory");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.7", "hardDriveType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.8", "tapeDriveType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.9", "opticalDriveType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.10", "equinoxType");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.11", "modemType1");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.12", "modemType2");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.13", "modemErrorCount");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.14", "databaseDumpLog");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.15", "monetraVersion");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.16", "monetraStoreId");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.17", "ovenStatus");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.18", "raidStatus");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.19", "monetraUnsettledBatchTimestamp");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.20", "monetraKeyTimestamp");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.21", "unsettledBatch");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.22", "secondaryPasswordAlgorithmVersion");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.23", "profitDatabaseVersion");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.24", "javaVersion");
        addMibObj(mibObjs, ".1.3.6.1.4.1.33347.255.25", "profitApiVersion");

        return Arrays.asList(new Object[][]{{
            config,
            "<snmp-asset-adapter-configuration>\n"
            + "  <package name=\"PJs\">\n"
            + "    <sysoid>.1.3</sysoid>\n"
            + "    <assetField name=\"comment\" formatString=\"OS Type: ${osType}&#x0A;OS Version: ${osVersion}&#x0A;System Type: ${systemType}&#x0A;Processor Type: ${processorType}&#x0A;Processor Speed: ${processorSpeed}&#x0A;Physical Memory: ${physicalMemory}&#x0A;Hard Drive Type: ${hardDriveType}&#x0A;Tape Drive Type: ${tapeDriveType}&#x0A;Optical Drive Type: ${opticalDriveType}&#x0A;Equinox Type: ${equinoxType}&#x0A;Modem 1 Type: ${modemType1}&#x0A;Modem 2 Type: ${modemType2}&#x0A;Modem Error Count: ${modemErrorCount}&#x0A;Database Dump Log: ${databaseDumpLog}&#x0A;Monetra Version: ${monetraVersion}&#x0A;Monetra Store ID: ${monetraStoreId}&#x0A;Oven Status: ${ovenStatus}&#x0A;RAID Status: ${raidStatus}&#x0A;Monetra Unsettled Batch Timestamp: ${monetraUnsettledBatchTimestamp}&#x0A;Monetra Key Timestamp: ${monetraKeyTimestamp}&#x0A;Unsettled Batch: ${unsettledBatch}&#x0A;Secondary Password Algorithm Version: ${secondaryPasswordAlgorithmVersion}&#x0A;Profit Database Version: ${profitDatabaseVersion}&#x0A;Java Version: ${javaVersion}&#x0A;Profit API Version: ${profitApiVersion}\">\n"
            + "      <mibObjs>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.1\" alias=\"osType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.2\" alias=\"osVersion\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.3\" alias=\"systemType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.4\" alias=\"processorType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.5\" alias=\"processorSpeed\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.6\" alias=\"physicalMemory\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.7\" alias=\"hardDriveType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.8\" alias=\"tapeDriveType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.9\" alias=\"opticalDriveType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.10\" alias=\"equinoxType\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.11\" alias=\"modemType1\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.12\" alias=\"modemType2\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.13\" alias=\"modemErrorCount\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.14\" alias=\"databaseDumpLog\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.15\" alias=\"monetraVersion\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.16\" alias=\"monetraStoreId\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.17\" alias=\"ovenStatus\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.18\" alias=\"raidStatus\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.19\" alias=\"monetraUnsettledBatchTimestamp\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.20\" alias=\"monetraKeyTimestamp\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.21\" alias=\"unsettledBatch\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.22\" alias=\"secondaryPasswordAlgorithmVersion\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.23\" alias=\"profitDatabaseVersion\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.24\" alias=\"javaVersion\"/>\n"
            + "        <mibObj oid=\".1.3.6.1.4.1.33347.255.25\" alias=\"profitApiVersion\"/>\n"
            + "      </mibObjs>\n"
            + "    </assetField>\n"
            + "  </package>\n"
            + "</snmp-asset-adapter-configuration>",
            "target/classes/xsds/snmp-asset-adapter-configuration.xsd",},});
    }
}
