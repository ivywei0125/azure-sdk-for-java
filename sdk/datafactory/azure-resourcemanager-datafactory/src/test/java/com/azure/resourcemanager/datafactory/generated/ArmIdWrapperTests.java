// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ArmIdWrapper;

public final class ArmIdWrapperTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmIdWrapper model = BinaryData.fromString("{\"id\":\"z\"}").toObject(ArmIdWrapper.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmIdWrapper model = new ArmIdWrapper();
        model = BinaryData.fromObject(model).toObject(ArmIdWrapper.class);
    }
}
