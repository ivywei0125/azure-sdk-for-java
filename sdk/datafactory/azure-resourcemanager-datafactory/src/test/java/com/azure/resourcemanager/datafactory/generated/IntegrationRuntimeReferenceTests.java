// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeReferenceTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeReference model =
            BinaryData
                .fromString("{\"referenceName\":\"pkdwzbai\",\"parameters\":{}}")
                .toObject(IntegrationRuntimeReference.class);
        Assertions.assertEquals("pkdwzbai", model.referenceName());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeReference model =
            new IntegrationRuntimeReference().withReferenceName("pkdwzbai").withParameters(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeReference.class);
        Assertions.assertEquals("pkdwzbai", model.referenceName());
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
