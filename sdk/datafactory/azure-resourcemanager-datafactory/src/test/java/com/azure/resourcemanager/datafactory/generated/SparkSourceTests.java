// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SparkSource;
import org.junit.jupiter.api.Test;

public final class SparkSourceTests {
    @Test
    public void testDeserialize() {
        SparkSource model = BinaryData.fromString("{\"type\":\"SparkSource\",\"\":{}}").toObject(SparkSource.class);
    }

    @Test
    public void testSerialize() {
        SparkSource model = new SparkSource();
        model = BinaryData.fromObject(model).toObject(SparkSource.class);
    }
}
