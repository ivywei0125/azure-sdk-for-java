// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;
import com.azure.resourcemanager.datafactory.models.SqlServerSource;

public final class SqlServerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlServerSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"SqlServerSource\",\"sqlReaderQuery\":\"dataajsrdecbowkhmaff\",\"sqlReaderStoredProcedureName\":\"datapdnnsujx\",\"storedProcedureParameters\":\"dataeqljzkhncaeyk\",\"isolationLevel\":\"dataatztnprnsh\",\"produceAdditionalTypes\":\"dataiahvlzgsqwiubgbl\",\"partitionOption\":\"datayisjscuw\",\"partitionSettings\":{\"partitionColumnName\":\"dataktzcuxuxaihhegu\",\"partitionUpperBound\":\"dataziryxrpj\",\"partitionLowerBound\":\"datatmxq\"},\"queryTimeout\":\"dataepoftsapfwusf\",\"additionalColumns\":\"datanjvzlynvje\",\"sourceRetryCount\":\"datavu\",\"sourceRetryWait\":\"datalwzn\",\"maxConcurrentConnections\":\"dataie\",\"disableMetricsCollection\":\"datafg\",\"\":{\"kpswwutduchcfn\":\"dataftgbupu\"}}")
                .toObject(SqlServerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlServerSource model =
            new SqlServerSource()
                .withSourceRetryCount("datavu")
                .withSourceRetryWait("datalwzn")
                .withMaxConcurrentConnections("dataie")
                .withDisableMetricsCollection("datafg")
                .withQueryTimeout("dataepoftsapfwusf")
                .withAdditionalColumns("datanjvzlynvje")
                .withSqlReaderQuery("dataajsrdecbowkhmaff")
                .withSqlReaderStoredProcedureName("datapdnnsujx")
                .withStoredProcedureParameters("dataeqljzkhncaeyk")
                .withIsolationLevel("dataatztnprnsh")
                .withProduceAdditionalTypes("dataiahvlzgsqwiubgbl")
                .withPartitionOption("datayisjscuw")
                .withPartitionSettings(
                    new SqlPartitionSettings()
                        .withPartitionColumnName("dataktzcuxuxaihhegu")
                        .withPartitionUpperBound("dataziryxrpj")
                        .withPartitionLowerBound("datatmxq"));
        model = BinaryData.fromObject(model).toObject(SqlServerSource.class);
    }
}
