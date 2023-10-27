// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureTableDatasetTypeProperties;

public final class AzureTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureTableDatasetTypeProperties model =
            BinaryData
                .fromString("{\"tableName\":\"datauholaemwcgimmri\"}")
                .toObject(AzureTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureTableDatasetTypeProperties model =
            new AzureTableDatasetTypeProperties().withTableName("datauholaemwcgimmri");
        model = BinaryData.fromObject(model).toObject(AzureTableDatasetTypeProperties.class);
    }
}
