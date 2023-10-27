// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.models.CreateResourceSupportedProperties;

public final class CreateResourceSupportedPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateResourceSupportedProperties model =
            BinaryData
                .fromString("{\"name\":\"wyahuxinpmqnja\",\"creationSupported\":true}")
                .toObject(CreateResourceSupportedProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateResourceSupportedProperties model = new CreateResourceSupportedProperties();
        model = BinaryData.fromObject(model).toObject(CreateResourceSupportedProperties.class);
    }
}
