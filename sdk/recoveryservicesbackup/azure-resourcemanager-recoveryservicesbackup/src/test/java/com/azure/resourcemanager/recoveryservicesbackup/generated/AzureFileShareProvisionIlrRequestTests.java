// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProvisionIlrRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureFileShareProvisionIlrRequestTests {
    @Test
    public void testDeserialize() {
        AzureFileShareProvisionIlrRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureFileShareProvisionILRRequest\",\"recoveryPointId\":\"fcsserxhtvsox\",\"sourceResourceId\":\"wntsjgqrsxy\"}")
                .toObject(AzureFileShareProvisionIlrRequest.class);
        Assertions.assertEquals("fcsserxhtvsox", model.recoveryPointId());
        Assertions.assertEquals("wntsjgqrsxy", model.sourceResourceId());
    }

    @Test
    public void testSerialize() {
        AzureFileShareProvisionIlrRequest model =
            new AzureFileShareProvisionIlrRequest()
                .withRecoveryPointId("fcsserxhtvsox")
                .withSourceResourceId("wntsjgqrsxy");
        model = BinaryData.fromObject(model).toObject(AzureFileShareProvisionIlrRequest.class);
        Assertions.assertEquals("fcsserxhtvsox", model.recoveryPointId());
        Assertions.assertEquals("wntsjgqrsxy", model.sourceResourceId());
    }
}
