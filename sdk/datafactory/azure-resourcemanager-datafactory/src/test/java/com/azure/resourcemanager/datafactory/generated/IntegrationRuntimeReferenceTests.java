// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeReference model =
            BinaryData
                .fromString(
                    "{\"referenceName\":\"dggkzzlvmbmpa\",\"parameters\":{\"yw\":\"datadfvue\",\"yhrfouyftaakcpw\":\"databpfvm\",\"nubexk\":\"datayzvqt\"}}")
                .toObject(IntegrationRuntimeReference.class);
        Assertions.assertEquals("dggkzzlvmbmpa", model.referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeReference model =
            new IntegrationRuntimeReference()
                .withReferenceName("dggkzzlvmbmpa")
                .withParameters(mapOf("yw", "datadfvue", "yhrfouyftaakcpw", "databpfvm", "nubexk", "datayzvqt"));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeReference.class);
        Assertions.assertEquals("dggkzzlvmbmpa", model.referenceName());
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
