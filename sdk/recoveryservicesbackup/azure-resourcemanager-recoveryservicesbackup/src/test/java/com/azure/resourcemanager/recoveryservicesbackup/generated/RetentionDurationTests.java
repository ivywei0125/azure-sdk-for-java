// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import org.junit.jupiter.api.Assertions;

public final class RetentionDurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RetentionDuration model =
            BinaryData.fromString("{\"count\":245176805,\"durationType\":\"Days\"}").toObject(RetentionDuration.class);
        Assertions.assertEquals(245176805, model.count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RetentionDuration model =
            new RetentionDuration().withCount(245176805).withDurationType(RetentionDurationType.DAYS);
        model = BinaryData.fromObject(model).toObject(RetentionDuration.class);
        Assertions.assertEquals(245176805, model.count());
        Assertions.assertEquals(RetentionDurationType.DAYS, model.durationType());
    }
}
