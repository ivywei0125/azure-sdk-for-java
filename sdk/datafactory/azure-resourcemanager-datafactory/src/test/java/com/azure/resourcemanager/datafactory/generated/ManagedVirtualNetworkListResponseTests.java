// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetwork;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedVirtualNetworkListResponseTests {
    @Test
    public void testDeserialize() {
        ManagedVirtualNetworkListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"vNetId\":\"ronzmyhgfip\",\"alias\":\"xkmcwaekrrjre\",\"\":{}},\"name\":\"tsgumhj\",\"type\":\"ikkx\",\"etag\":\"lo\",\"id\":\"qpvuzlmvfelf\"}],\"nextLink\":\"gplcrpwjxeznoigb\"}")
                .toObject(ManagedVirtualNetworkListResponse.class);
        Assertions.assertEquals("qpvuzlmvfelf", model.value().get(0).id());
        Assertions.assertEquals("gplcrpwjxeznoigb", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ManagedVirtualNetworkListResponse model =
            new ManagedVirtualNetworkListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedVirtualNetworkResourceInner()
                                .withId("qpvuzlmvfelf")
                                .withProperties(
                                    new ManagedVirtualNetwork()
                                        .withAdditionalProperties(
                                            mapOf("vNetId", "ronzmyhgfip", "alias", "xkmcwaekrrjre")))))
                .withNextLink("gplcrpwjxeznoigb");
        model = BinaryData.fromObject(model).toObject(ManagedVirtualNetworkListResponse.class);
        Assertions.assertEquals("qpvuzlmvfelf", model.value().get(0).id());
        Assertions.assertEquals("gplcrpwjxeznoigb", model.nextLink());
    }

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
