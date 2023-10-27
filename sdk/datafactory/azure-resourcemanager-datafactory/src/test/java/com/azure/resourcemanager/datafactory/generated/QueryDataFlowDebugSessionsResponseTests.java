// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner;
import com.azure.resourcemanager.datafactory.models.QueryDataFlowDebugSessionsResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class QueryDataFlowDebugSessionsResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryDataFlowDebugSessionsResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"dataFlowName\":\"noda\",\"computeType\":\"pqhe\",\"coreCount\":1635095275,\"nodeCount\":1244000330,\"integrationRuntimeName\":\"gsbos\",\"sessionId\":\"eln\",\"startTime\":\"atutmzlbiojlvfhr\",\"timeToLiveInMinutes\":438246123,\"lastActivityTime\":\"eqvcwwyyurmoch\",\"\":{\"lbkpb\":\"dataprsnmokayzejn\",\"hahzvechndbnwi\":\"datapcpil\"}}],\"nextLink\":\"olewjwi\"}")
                .toObject(QueryDataFlowDebugSessionsResponse.class);
        Assertions.assertEquals("noda", model.value().get(0).dataFlowName());
        Assertions.assertEquals("pqhe", model.value().get(0).computeType());
        Assertions.assertEquals(1635095275, model.value().get(0).coreCount());
        Assertions.assertEquals(1244000330, model.value().get(0).nodeCount());
        Assertions.assertEquals("gsbos", model.value().get(0).integrationRuntimeName());
        Assertions.assertEquals("eln", model.value().get(0).sessionId());
        Assertions.assertEquals("atutmzlbiojlvfhr", model.value().get(0).startTime());
        Assertions.assertEquals(438246123, model.value().get(0).timeToLiveInMinutes());
        Assertions.assertEquals("eqvcwwyyurmoch", model.value().get(0).lastActivityTime());
        Assertions.assertEquals("olewjwi", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryDataFlowDebugSessionsResponse model =
            new QueryDataFlowDebugSessionsResponse()
                .withValue(
                    Arrays
                        .asList(
                            new DataFlowDebugSessionInfoInner()
                                .withDataFlowName("noda")
                                .withComputeType("pqhe")
                                .withCoreCount(1635095275)
                                .withNodeCount(1244000330)
                                .withIntegrationRuntimeName("gsbos")
                                .withSessionId("eln")
                                .withStartTime("atutmzlbiojlvfhr")
                                .withTimeToLiveInMinutes(438246123)
                                .withLastActivityTime("eqvcwwyyurmoch")
                                .withAdditionalProperties(mapOf())))
                .withNextLink("olewjwi");
        model = BinaryData.fromObject(model).toObject(QueryDataFlowDebugSessionsResponse.class);
        Assertions.assertEquals("noda", model.value().get(0).dataFlowName());
        Assertions.assertEquals("pqhe", model.value().get(0).computeType());
        Assertions.assertEquals(1635095275, model.value().get(0).coreCount());
        Assertions.assertEquals(1244000330, model.value().get(0).nodeCount());
        Assertions.assertEquals("gsbos", model.value().get(0).integrationRuntimeName());
        Assertions.assertEquals("eln", model.value().get(0).sessionId());
        Assertions.assertEquals("atutmzlbiojlvfhr", model.value().get(0).startTime());
        Assertions.assertEquals(438246123, model.value().get(0).timeToLiveInMinutes());
        Assertions.assertEquals("eqvcwwyyurmoch", model.value().get(0).lastActivityTime());
        Assertions.assertEquals("olewjwi", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
