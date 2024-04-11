// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateStageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateStage model = BinaryData.fromString(
            "{\"name\":\"cfsf\",\"groups\":[{\"name\":\"mddystkiiux\"},{\"name\":\"qyud\"}],\"afterStageWaitInSeconds\":2120884016}")
            .toObject(UpdateStage.class);
        Assertions.assertEquals("cfsf", model.name());
        Assertions.assertEquals("mddystkiiux", model.groups().get(0).name());
        Assertions.assertEquals(2120884016, model.afterStageWaitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateStage model = new UpdateStage().withName("cfsf")
            .withGroups(Arrays.asList(new UpdateGroup().withName("mddystkiiux"), new UpdateGroup().withName("qyud")))
            .withAfterStageWaitInSeconds(2120884016);
        model = BinaryData.fromObject(model).toObject(UpdateStage.class);
        Assertions.assertEquals("cfsf", model.name());
        Assertions.assertEquals("mddystkiiux", model.groups().get(0).name());
        Assertions.assertEquals(2120884016, model.afterStageWaitInSeconds());
    }
}
