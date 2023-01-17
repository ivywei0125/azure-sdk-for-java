// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.StreamingEntityScaleUnit;
import org.junit.jupiter.api.Assertions;

public final class StreamingEntityScaleUnitTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StreamingEntityScaleUnit model =
            BinaryData.fromString("{\"scaleUnit\":939691982}").toObject(StreamingEntityScaleUnit.class);
        Assertions.assertEquals(939691982, model.scaleUnit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StreamingEntityScaleUnit model = new StreamingEntityScaleUnit().withScaleUnit(939691982);
        model = BinaryData.fromObject(model).toObject(StreamingEntityScaleUnit.class);
        Assertions.assertEquals(939691982, model.scaleUnit());
    }
}