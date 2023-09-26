// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateProviderSpecificInput;

public final class MigrateInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificDetails\":{\"instanceType\":\"MigrateProviderSpecificInput\"}}}")
                .toObject(MigrateInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateInput model =
            new MigrateInput()
                .withProperties(
                    new MigrateInputProperties().withProviderSpecificDetails(new MigrateProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(MigrateInput.class);
    }
}
