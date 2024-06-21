// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekUpdate;
import com.azure.resourcemanager.oracledatabase.models.ScheduledOperationsTypeUpdate;
import org.junit.jupiter.api.Assertions;

public final class ScheduledOperationsTypeUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduledOperationsTypeUpdate model = BinaryData.fromString(
            "{\"dayOfWeek\":{\"name\":\"Monday\"},\"scheduledStartTime\":\"saknynfsyn\",\"scheduledStopTime\":\"ph\"}")
            .toObject(ScheduledOperationsTypeUpdate.class);
        Assertions.assertEquals(DayOfWeekName.MONDAY, model.dayOfWeek().name());
        Assertions.assertEquals("saknynfsyn", model.scheduledStartTime());
        Assertions.assertEquals("ph", model.scheduledStopTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduledOperationsTypeUpdate model
            = new ScheduledOperationsTypeUpdate().withDayOfWeek(new DayOfWeekUpdate().withName(DayOfWeekName.MONDAY))
                .withScheduledStartTime("saknynfsyn")
                .withScheduledStopTime("ph");
        model = BinaryData.fromObject(model).toObject(ScheduledOperationsTypeUpdate.class);
        Assertions.assertEquals(DayOfWeekName.MONDAY, model.dayOfWeek().name());
        Assertions.assertEquals("saknynfsyn", model.scheduledStartTime());
        Assertions.assertEquals("ph", model.scheduledStopTime());
    }
}
