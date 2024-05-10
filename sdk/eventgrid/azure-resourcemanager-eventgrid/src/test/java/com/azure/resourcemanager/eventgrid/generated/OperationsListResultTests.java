// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.OperationInner;
import com.azure.resourcemanager.eventgrid.models.OperationInfo;
import com.azure.resourcemanager.eventgrid.models.OperationsListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"kqo\",\"display\":{\"provider\":\"kvgtrdcn\",\"resource\":\"mzzs\",\"operation\":\"m\",\"description\":\"nysuxmprafwgckh\"},\"origin\":\"xvd\",\"isDataAction\":true,\"properties\":\"dataafqr\"},{\"name\":\"daspavehhrvk\",\"display\":{\"provider\":\"zoz\",\"resource\":\"hcxgkmoyx\",\"operation\":\"yuibhm\",\"description\":\"nbzydvfvfcj\"},\"origin\":\"eoisrvhmgor\",\"isDataAction\":true,\"properties\":\"datais\"}]}")
            .toObject(OperationsListResult.class);
        Assertions.assertEquals("kqo", model.value().get(0).name());
        Assertions.assertEquals("kvgtrdcn", model.value().get(0).display().provider());
        Assertions.assertEquals("mzzs", model.value().get(0).display().resource());
        Assertions.assertEquals("m", model.value().get(0).display().operation());
        Assertions.assertEquals("nysuxmprafwgckh", model.value().get(0).display().description());
        Assertions.assertEquals("xvd", model.value().get(0).origin());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsListResult model = new OperationsListResult().withValue(Arrays.asList(
            new OperationInner().withName("kqo")
                .withDisplay(new OperationInfo().withProvider("kvgtrdcn")
                    .withResource("mzzs")
                    .withOperation("m")
                    .withDescription("nysuxmprafwgckh"))
                .withOrigin("xvd")
                .withIsDataAction(true)
                .withProperties("dataafqr"),
            new OperationInner().withName("daspavehhrvk")
                .withDisplay(new OperationInfo().withProvider("zoz")
                    .withResource("hcxgkmoyx")
                    .withOperation("yuibhm")
                    .withDescription("nbzydvfvfcj"))
                .withOrigin("eoisrvhmgor")
                .withIsDataAction(true)
                .withProperties("datais")));
        model = BinaryData.fromObject(model).toObject(OperationsListResult.class);
        Assertions.assertEquals("kqo", model.value().get(0).name());
        Assertions.assertEquals("kvgtrdcn", model.value().get(0).display().provider());
        Assertions.assertEquals("mzzs", model.value().get(0).display().resource());
        Assertions.assertEquals("m", model.value().get(0).display().operation());
        Assertions.assertEquals("nysuxmprafwgckh", model.value().get(0).display().description());
        Assertions.assertEquals("xvd", model.value().get(0).origin());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
    }
}
