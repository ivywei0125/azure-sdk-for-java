// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ExposureControlRequestTests {
    @Test
    public void testDeserialize() {
        ExposureControlRequest model =
            BinaryData
                .fromString("{\"featureName\":\"xxhejjzzvd\",\"featureType\":\"gwdslfhotwm\"}")
                .toObject(ExposureControlRequest.class);
        Assertions.assertEquals("xxhejjzzvd", model.featureName());
        Assertions.assertEquals("gwdslfhotwm", model.featureType());
    }

    @Test
    public void testSerialize() {
        ExposureControlRequest model =
            new ExposureControlRequest().withFeatureName("xxhejjzzvd").withFeatureType("gwdslfhotwm");
        model = BinaryData.fromObject(model).toObject(ExposureControlRequest.class);
        Assertions.assertEquals("xxhejjzzvd", model.featureName());
        Assertions.assertEquals("gwdslfhotwm", model.featureType());
    }
}
