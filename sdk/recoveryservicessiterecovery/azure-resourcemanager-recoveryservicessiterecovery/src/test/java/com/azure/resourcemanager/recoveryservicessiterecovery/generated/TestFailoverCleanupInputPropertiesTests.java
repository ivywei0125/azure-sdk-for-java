// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverCleanupInputProperties;
import org.junit.jupiter.api.Assertions;

public final class TestFailoverCleanupInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TestFailoverCleanupInputProperties model =
            BinaryData.fromString("{\"comments\":\"wfscjfn\"}").toObject(TestFailoverCleanupInputProperties.class);
        Assertions.assertEquals("wfscjfn", model.comments());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TestFailoverCleanupInputProperties model = new TestFailoverCleanupInputProperties().withComments("wfscjfn");
        model = BinaryData.fromObject(model).toObject(TestFailoverCleanupInputProperties.class);
        Assertions.assertEquals("wfscjfn", model.comments());
    }
}
