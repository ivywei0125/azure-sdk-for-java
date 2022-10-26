// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.Operation;
import com.azure.resourcemanager.policyinsights.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationTests {
    @Test
    public void testDeserialize() {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"afcnih\",\"display\":{\"provider\":\"apnedgfbcvkc\",\"resource\":\"vpk\",\"operation\":\"dcvd\",\"description\":\"vo\"}}")
                .toObject(Operation.class);
        Assertions.assertEquals("afcnih", model.name());
        Assertions.assertEquals("apnedgfbcvkc", model.display().provider());
        Assertions.assertEquals("vpk", model.display().resource());
        Assertions.assertEquals("dcvd", model.display().operation());
        Assertions.assertEquals("vo", model.display().description());
    }

    @Test
    public void testSerialize() {
        Operation model =
            new Operation()
                .withName("afcnih")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("apnedgfbcvkc")
                        .withResource("vpk")
                        .withOperation("dcvd")
                        .withDescription("vo"));
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals("afcnih", model.name());
        Assertions.assertEquals("apnedgfbcvkc", model.display().provider());
        Assertions.assertEquals("vpk", model.display().resource());
        Assertions.assertEquals("dcvd", model.display().operation());
        Assertions.assertEquals("vo", model.display().description());
    }
}
