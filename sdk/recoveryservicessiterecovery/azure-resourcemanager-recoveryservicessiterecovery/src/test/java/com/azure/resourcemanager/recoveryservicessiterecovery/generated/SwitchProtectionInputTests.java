// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionProviderSpecificInput;
import org.junit.jupiter.api.Assertions;

public final class SwitchProtectionInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SwitchProtectionInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"replicationProtectedItemName\":\"eivsiykzkdnc\",\"providerSpecificDetails\":{\"instanceType\":\"SwitchProtectionProviderSpecificInput\"}}}")
                .toObject(SwitchProtectionInput.class);
        Assertions.assertEquals("eivsiykzkdnc", model.properties().replicationProtectedItemName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SwitchProtectionInput model =
            new SwitchProtectionInput()
                .withProperties(
                    new SwitchProtectionInputProperties()
                        .withReplicationProtectedItemName("eivsiykzkdnc")
                        .withProviderSpecificDetails(new SwitchProtectionProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(SwitchProtectionInput.class);
        Assertions.assertEquals("eivsiykzkdnc", model.properties().replicationProtectedItemName());
    }
}
