// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.KeyVaultResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class KeyVaultResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KeyVaultResourceSettings model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"Microsoft.KeyVault/vaults\",\"targetResourceName\":\"yvxqtayriwwroy\"}")
                .toObject(KeyVaultResourceSettings.class);
        Assertions.assertEquals("yvxqtayriwwroy", model.targetResourceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KeyVaultResourceSettings model = new KeyVaultResourceSettings().withTargetResourceName("yvxqtayriwwroy");
        model = BinaryData.fromObject(model).toObject(KeyVaultResourceSettings.class);
        Assertions.assertEquals("yvxqtayriwwroy", model.targetResourceName());
    }
}