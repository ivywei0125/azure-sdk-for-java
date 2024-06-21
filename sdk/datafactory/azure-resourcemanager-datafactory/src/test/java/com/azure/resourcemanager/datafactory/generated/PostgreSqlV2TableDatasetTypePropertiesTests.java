// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PostgreSqlV2TableDatasetTypeProperties;

public final class PostgreSqlV2TableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PostgreSqlV2TableDatasetTypeProperties model
            = BinaryData.fromString("{\"table\":\"dataswxmfurqm\",\"schema\":\"datawwp\"}")
                .toObject(PostgreSqlV2TableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PostgreSqlV2TableDatasetTypeProperties model
            = new PostgreSqlV2TableDatasetTypeProperties().withTable("dataswxmfurqm").withSchema("datawwp");
        model = BinaryData.fromObject(model).toObject(PostgreSqlV2TableDatasetTypeProperties.class);
    }
}
