// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzPowerShellSetup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzPowerShellSetupTests {
    @Test
    public void testDeserialize() {
        AzPowerShellSetup model =
            BinaryData
                .fromString("{\"type\":\"AzPowerShellSetup\",\"typeProperties\":{\"version\":\"vbxiwkgfbqlj\"}}")
                .toObject(AzPowerShellSetup.class);
        Assertions.assertEquals("vbxiwkgfbqlj", model.version());
    }

    @Test
    public void testSerialize() {
        AzPowerShellSetup model = new AzPowerShellSetup().withVersion("vbxiwkgfbqlj");
        model = BinaryData.fromObject(model).toObject(AzPowerShellSetup.class);
        Assertions.assertEquals("vbxiwkgfbqlj", model.version());
    }
}
