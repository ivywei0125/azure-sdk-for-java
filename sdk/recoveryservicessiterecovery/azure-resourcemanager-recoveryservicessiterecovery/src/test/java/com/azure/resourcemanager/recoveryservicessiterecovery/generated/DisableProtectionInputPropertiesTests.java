// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DisableProtectionInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DisableProtectionProviderSpecificInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DisableProtectionReason;
import org.junit.jupiter.api.Assertions;

public final class DisableProtectionInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DisableProtectionInputProperties model =
            BinaryData
                .fromString(
                    "{\"disableProtectionReason\":\"NotSpecified\",\"replicationProviderInput\":{\"instanceType\":\"DisableProtectionProviderSpecificInput\"}}")
                .toObject(DisableProtectionInputProperties.class);
        Assertions.assertEquals(DisableProtectionReason.NOT_SPECIFIED, model.disableProtectionReason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DisableProtectionInputProperties model =
            new DisableProtectionInputProperties()
                .withDisableProtectionReason(DisableProtectionReason.NOT_SPECIFIED)
                .withReplicationProviderInput(new DisableProtectionProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(DisableProtectionInputProperties.class);
        Assertions.assertEquals(DisableProtectionReason.NOT_SPECIFIED, model.disableProtectionReason());
    }
}
