// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.InformixTableDatasetTypeProperties;

public final class InformixTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformixTableDatasetTypeProperties model =
            BinaryData
                .fromString("{\"tableName\":\"datacsqosecxlngo\"}")
                .toObject(InformixTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformixTableDatasetTypeProperties model =
            new InformixTableDatasetTypeProperties().withTableName("datacsqosecxlngo");
        model = BinaryData.fromObject(model).toObject(InformixTableDatasetTypeProperties.class);
    }
}
