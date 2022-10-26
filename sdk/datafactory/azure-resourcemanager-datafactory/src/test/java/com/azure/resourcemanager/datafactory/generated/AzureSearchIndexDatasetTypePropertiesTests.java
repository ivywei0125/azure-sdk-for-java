// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSearchIndexDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AzureSearchIndexDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzureSearchIndexDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AzureSearchIndexDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AzureSearchIndexDatasetTypeProperties model = new AzureSearchIndexDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AzureSearchIndexDatasetTypeProperties.class);
    }
}
