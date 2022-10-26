// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RerunTumblingWindowTrigger;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RerunTumblingWindowTriggerTests {
    @Test
    public void testDeserialize() {
        RerunTumblingWindowTrigger model =
            BinaryData
                .fromString(
                    "{\"type\":\"RerunTumblingWindowTrigger\",\"typeProperties\":{\"requestedStartTime\":\"2021-07-18T13:30:49Z\",\"requestedEndTime\":\"2021-02-20T06:51:16Z\",\"rerunConcurrency\":167852071},\"description\":\"rzaqmnbx\",\"runtimeState\":\"Started\",\"annotations\":[],\"\":{}}")
                .toObject(RerunTumblingWindowTrigger.class);
        Assertions.assertEquals("rzaqmnbx", model.description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-18T13:30:49Z"), model.requestedStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-20T06:51:16Z"), model.requestedEndTime());
        Assertions.assertEquals(167852071, model.rerunConcurrency());
    }

    @Test
    public void testSerialize() {
        RerunTumblingWindowTrigger model =
            new RerunTumblingWindowTrigger()
                .withDescription("rzaqmnbx")
                .withAnnotations(Arrays.asList())
                .withRequestedStartTime(OffsetDateTime.parse("2021-07-18T13:30:49Z"))
                .withRequestedEndTime(OffsetDateTime.parse("2021-02-20T06:51:16Z"))
                .withRerunConcurrency(167852071);
        model = BinaryData.fromObject(model).toObject(RerunTumblingWindowTrigger.class);
        Assertions.assertEquals("rzaqmnbx", model.description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-18T13:30:49Z"), model.requestedStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-20T06:51:16Z"), model.requestedEndTime());
        Assertions.assertEquals(167852071, model.rerunConcurrency());
    }
}
