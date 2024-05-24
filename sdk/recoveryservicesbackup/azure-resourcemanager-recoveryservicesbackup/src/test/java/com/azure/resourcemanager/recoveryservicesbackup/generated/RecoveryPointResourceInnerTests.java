// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPoint;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"xjvuujqgidokg\",\"location\":\"ljyoxgvcltb\",\"tags\":{\"hkjeszzhbi\":\"c\",\"vecxgodebfqkk\":\"htxfvgxbfsmxnehm\"},\"id\":\"bmpukgriwflz\",\"name\":\"fbxzpuzycisp\",\"type\":\"qzahmgkbrp\"}")
            .toObject(RecoveryPointResourceInner.class);
        Assertions.assertEquals("ljyoxgvcltb", model.location());
        Assertions.assertEquals("c", model.tags().get("hkjeszzhbi"));
        Assertions.assertEquals("xjvuujqgidokg", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointResourceInner model = new RecoveryPointResourceInner().withLocation("ljyoxgvcltb")
            .withTags(mapOf("hkjeszzhbi", "c", "vecxgodebfqkk", "htxfvgxbfsmxnehm"))
            .withProperties(new RecoveryPoint())
            .withEtag("xjvuujqgidokg");
        model = BinaryData.fromObject(model).toObject(RecoveryPointResourceInner.class);
        Assertions.assertEquals("ljyoxgvcltb", model.location());
        Assertions.assertEquals("c", model.tags().get("hkjeszzhbi"));
        Assertions.assertEquals("xjvuujqgidokg", model.etag());
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
