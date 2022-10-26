// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SecureString;
import com.azure.resourcemanager.datafactory.models.SsisExecutionCredential;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SsisExecutionCredentialTests {
    @Test
    public void testDeserialize() {
        SsisExecutionCredential model =
            BinaryData
                .fromString("{\"password\":{\"type\":\"SecureString\",\"value\":\"pepiaeapfs\"}}")
                .toObject(SsisExecutionCredential.class);
        Assertions.assertEquals("pepiaeapfs", model.password().value());
    }

    @Test
    public void testSerialize() {
        SsisExecutionCredential model =
            new SsisExecutionCredential().withPassword(new SecureString().withValue("pepiaeapfs"));
        model = BinaryData.fromObject(model).toObject(SsisExecutionCredential.class);
        Assertions.assertEquals("pepiaeapfs", model.password().value());
    }
}
