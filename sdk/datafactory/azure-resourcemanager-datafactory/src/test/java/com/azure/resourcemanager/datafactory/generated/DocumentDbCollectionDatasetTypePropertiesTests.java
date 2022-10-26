// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DocumentDbCollectionDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class DocumentDbCollectionDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        DocumentDbCollectionDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(DocumentDbCollectionDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        DocumentDbCollectionDatasetTypeProperties model = new DocumentDbCollectionDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(DocumentDbCollectionDatasetTypeProperties.class);
    }
}
