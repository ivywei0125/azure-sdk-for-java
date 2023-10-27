// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SybaseSource;

public final class SybaseSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"SybaseSource\",\"query\":\"datapccfwq\",\"queryTimeout\":\"dataouqyzxzjehdklvqt\",\"additionalColumns\":\"dataoc\",\"sourceRetryCount\":\"dataetctjh\",\"sourceRetryWait\":\"datamoazsjsuevfvnn\",\"maxConcurrentConnections\":\"dataccvxqbxgq\",\"disableMetricsCollection\":\"datawnriwxe\",\"\":{\"xsvzwbktalobxl\":\"datavwqldil\"}}")
                .toObject(SybaseSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseSource model =
            new SybaseSource()
                .withSourceRetryCount("dataetctjh")
                .withSourceRetryWait("datamoazsjsuevfvnn")
                .withMaxConcurrentConnections("dataccvxqbxgq")
                .withDisableMetricsCollection("datawnriwxe")
                .withQueryTimeout("dataouqyzxzjehdklvqt")
                .withAdditionalColumns("dataoc")
                .withQuery("datapccfwq");
        model = BinaryData.fromObject(model).toObject(SybaseSource.class);
    }
}
