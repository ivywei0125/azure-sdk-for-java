// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerLinkedService;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SapCloudForCustomerLinkedServiceTests {
    @Test
    public void testDeserialize() {
        SapCloudForCustomerLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapCloudForCustomer\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"l\",\"parameters\":{}},\"description\":\"avn\",\"parameters\":{\"qbtnyjpylxdbfva\":{\"type\":\"Array\"},\"msxbaevwjcnkott\":{\"type\":\"Float\"},\"hvajmailfemjjzak\":{\"type\":\"Object\"},\"iqullqxbdmvr\":{\"type\":\"Float\"}},\"annotations\":[],\"\":{}}")
                .toObject(SapCloudForCustomerLinkedService.class);
        Assertions.assertEquals("l", model.connectVia().referenceName());
        Assertions.assertEquals("avn", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qbtnyjpylxdbfva").type());
    }

    @Test
    public void testSerialize() {
        SapCloudForCustomerLinkedService model =
            new SapCloudForCustomerLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("l").withParameters(mapOf()))
                .withDescription("avn")
                .withParameters(
                    mapOf(
                        "qbtnyjpylxdbfva",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "msxbaevwjcnkott",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "hvajmailfemjjzak",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "iqullqxbdmvr",
                        new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerLinkedService.class);
        Assertions.assertEquals("l", model.connectVia().referenceName());
        Assertions.assertEquals("avn", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qbtnyjpylxdbfva").type());
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
