// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AzureVMResourceFeatureSupportResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.SupportStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureVMResourceFeatureSupportResponseInnerTests {
    @Test
    public void testDeserialize() {
        AzureVMResourceFeatureSupportResponseInner model =
            BinaryData
                .fromString("{\"supportStatus\":\"DefaultOFF\"}")
                .toObject(AzureVMResourceFeatureSupportResponseInner.class);
        Assertions.assertEquals(SupportStatus.DEFAULT_OFF, model.supportStatus());
    }

    @Test
    public void testSerialize() {
        AzureVMResourceFeatureSupportResponseInner model =
            new AzureVMResourceFeatureSupportResponseInner().withSupportStatus(SupportStatus.DEFAULT_OFF);
        model = BinaryData.fromObject(model).toObject(AzureVMResourceFeatureSupportResponseInner.class);
        Assertions.assertEquals(SupportStatus.DEFAULT_OFF, model.supportStatus());
    }
}
