// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapTableLinkedService;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SapTableLinkedServiceTests {
    @Test
    public void testDeserialize() {
        SapTableLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapTable\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"uvrzmzqmzjqrb\",\"parameters\":{}},\"description\":\"mdyfoebojtj\",\"parameters\":{\"ohoqkpjtnqjilayw\":{\"type\":\"Array\"}},\"annotations\":[],\"\":{}}")
                .toObject(SapTableLinkedService.class);
        Assertions.assertEquals("uvrzmzqmzjqrb", model.connectVia().referenceName());
        Assertions.assertEquals("mdyfoebojtj", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("ohoqkpjtnqjilayw").type());
    }

    @Test
    public void testSerialize() {
        SapTableLinkedService model =
            new SapTableLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("uvrzmzqmzjqrb").withParameters(mapOf()))
                .withDescription("mdyfoebojtj")
                .withParameters(mapOf("ohoqkpjtnqjilayw", new ParameterSpecification().withType(ParameterType.ARRAY)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SapTableLinkedService.class);
        Assertions.assertEquals("uvrzmzqmzjqrb", model.connectVia().referenceName());
        Assertions.assertEquals("mdyfoebojtj", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("ohoqkpjtnqjilayw").type());
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
