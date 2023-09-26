// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PauseReplicationInputProperties;
import org.junit.jupiter.api.Assertions;

public final class PauseReplicationInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PauseReplicationInputProperties model =
            BinaryData.fromString("{\"instanceType\":\"qvkelnsm\"}").toObject(PauseReplicationInputProperties.class);
        Assertions.assertEquals("qvkelnsm", model.instanceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PauseReplicationInputProperties model = new PauseReplicationInputProperties().withInstanceType("qvkelnsm");
        model = BinaryData.fromObject(model).toObject(PauseReplicationInputProperties.class);
        Assertions.assertEquals("qvkelnsm", model.instanceType());
    }
}
