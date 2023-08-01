// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.AzureCapacity;
import com.azure.resourcemanager.kusto.models.AzureScaleType;
import org.junit.jupiter.api.Assertions;

public final class AzureCapacityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureCapacity model =
            BinaryData
                .fromString(
                    "{\"scaleType\":\"none\",\"minimum\":1561651714,\"maximum\":17080551,\"default\":663876246}")
                .toObject(AzureCapacity.class);
        Assertions.assertEquals(AzureScaleType.NONE, model.scaleType());
        Assertions.assertEquals(1561651714, model.minimum());
        Assertions.assertEquals(17080551, model.maximum());
        Assertions.assertEquals(663876246, model.defaultProperty());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureCapacity model =
            new AzureCapacity()
                .withScaleType(AzureScaleType.NONE)
                .withMinimum(1561651714)
                .withMaximum(17080551)
                .withDefaultProperty(663876246);
        model = BinaryData.fromObject(model).toObject(AzureCapacity.class);
        Assertions.assertEquals(AzureScaleType.NONE, model.scaleType());
        Assertions.assertEquals(1561651714, model.minimum());
        Assertions.assertEquals(17080551, model.maximum());
        Assertions.assertEquals(663876246, model.defaultProperty());
    }
}
