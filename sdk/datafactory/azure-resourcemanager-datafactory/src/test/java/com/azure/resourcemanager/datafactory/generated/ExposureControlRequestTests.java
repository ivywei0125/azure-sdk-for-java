// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;
import org.junit.jupiter.api.Assertions;

public final class ExposureControlRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExposureControlRequest model =
            BinaryData
                .fromString("{\"featureName\":\"mvxi\",\"featureType\":\"uugidyjrrfby\"}")
                .toObject(ExposureControlRequest.class);
        Assertions.assertEquals("mvxi", model.featureName());
        Assertions.assertEquals("uugidyjrrfby", model.featureType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExposureControlRequest model =
            new ExposureControlRequest().withFeatureName("mvxi").withFeatureType("uugidyjrrfby");
        model = BinaryData.fromObject(model).toObject(ExposureControlRequest.class);
        Assertions.assertEquals("mvxi", model.featureName());
        Assertions.assertEquals("uugidyjrrfby", model.featureType());
    }
}
