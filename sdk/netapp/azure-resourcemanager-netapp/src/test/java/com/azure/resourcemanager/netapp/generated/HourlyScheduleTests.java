// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import org.junit.jupiter.api.Assertions;

public final class HourlyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HourlySchedule model =
            BinaryData
                .fromString("{\"snapshotsToKeep\":381030924,\"minute\":1017473450,\"usedBytes\":6968746441071799209}")
                .toObject(HourlySchedule.class);
        Assertions.assertEquals(381030924, model.snapshotsToKeep());
        Assertions.assertEquals(1017473450, model.minute());
        Assertions.assertEquals(6968746441071799209L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HourlySchedule model =
            new HourlySchedule()
                .withSnapshotsToKeep(381030924)
                .withMinute(1017473450)
                .withUsedBytes(6968746441071799209L);
        model = BinaryData.fromObject(model).toObject(HourlySchedule.class);
        Assertions.assertEquals(381030924, model.snapshotsToKeep());
        Assertions.assertEquals(1017473450, model.minute());
        Assertions.assertEquals(6968746441071799209L, model.usedBytes());
    }
}
