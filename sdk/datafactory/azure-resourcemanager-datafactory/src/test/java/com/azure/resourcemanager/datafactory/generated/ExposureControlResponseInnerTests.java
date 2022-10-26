// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlResponseInner;
import org.junit.jupiter.api.Test;

public final class ExposureControlResponseInnerTests {
    @Test
    public void testDeserialize() {
        ExposureControlResponseInner model =
            BinaryData
                .fromString("{\"featureName\":\"npwlbjnpg\",\"value\":\"ftadehxnltyfs\"}")
                .toObject(ExposureControlResponseInner.class);
    }

    @Test
    public void testSerialize() {
        ExposureControlResponseInner model = new ExposureControlResponseInner();
        model = BinaryData.fromObject(model).toObject(ExposureControlResponseInner.class);
    }
}
