// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugResource;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"DataFlow\",\"description\":\"ltzkatbhjmznnb\",\"annotations\":[\"dataeq\",\"datalarvlagunbtg\"],\"folder\":{\"name\":\"wlnbm\"}},\"name\":\"reeudzqavb\"}")
                .toObject(DataFlowDebugResource.class);
        Assertions.assertEquals("reeudzqavb", model.name());
        Assertions.assertEquals("ltzkatbhjmznnb", model.properties().description());
        Assertions.assertEquals("wlnbm", model.properties().folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugResource model =
            new DataFlowDebugResource()
                .withName("reeudzqavb")
                .withProperties(
                    new DataFlow()
                        .withDescription("ltzkatbhjmznnb")
                        .withAnnotations(Arrays.asList("dataeq", "datalarvlagunbtg"))
                        .withFolder(new DataFlowFolder().withName("wlnbm")));
        model = BinaryData.fromObject(model).toObject(DataFlowDebugResource.class);
        Assertions.assertEquals("reeudzqavb", model.name());
        Assertions.assertEquals("ltzkatbhjmznnb", model.properties().description());
        Assertions.assertEquals("wlnbm", model.properties().folder().name());
    }
}
