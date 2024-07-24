// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppProxyResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppProxyResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppProxyResource model = BinaryData.fromString(
            "{\"tags\":{\"kix\":\"kgshwa\",\"eputtmrywnuzoqf\":\"bin\"},\"id\":\"yqzrnkcqvyxlw\",\"name\":\"zlsico\",\"type\":\"oqqnwvlryav\"}")
            .toObject(DppProxyResource.class);
        Assertions.assertEquals("kgshwa", model.tags().get("kix"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppProxyResource model = new DppProxyResource().withTags(mapOf("kix", "kgshwa", "eputtmrywnuzoqf", "bin"));
        model = BinaryData.fromObject(model).toObject(DppProxyResource.class);
        Assertions.assertEquals("kgshwa", model.tags().get("kix"));
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
