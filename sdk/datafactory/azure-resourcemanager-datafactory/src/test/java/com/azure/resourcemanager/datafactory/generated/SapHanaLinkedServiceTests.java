// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapHanaAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SapHanaLinkedService;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SapHanaLinkedServiceTests {
    @Test
    public void testDeserialize() {
        SapHanaLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapHana\",\"typeProperties\":{\"authenticationType\":\"Windows\",\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"mjpjscdfpdqwty\",\"parameters\":{}},\"description\":\"wmseharxifvqn\",\"parameters\":{\"pjptn\":{\"type\":\"Int\"},\"hrsidq\":{\"type\":\"SecureString\"}},\"annotations\":[],\"\":{}}")
                .toObject(SapHanaLinkedService.class);
        Assertions.assertEquals("mjpjscdfpdqwty", model.connectVia().referenceName());
        Assertions.assertEquals("wmseharxifvqn", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("pjptn").type());
        Assertions.assertEquals(SapHanaAuthenticationType.WINDOWS, model.authenticationType());
    }

    @Test
    public void testSerialize() {
        SapHanaLinkedService model =
            new SapHanaLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("mjpjscdfpdqwty").withParameters(mapOf()))
                .withDescription("wmseharxifvqn")
                .withParameters(
                    mapOf(
                        "pjptn",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "hrsidq",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withAuthenticationType(SapHanaAuthenticationType.WINDOWS)
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SapHanaLinkedService.class);
        Assertions.assertEquals("mjpjscdfpdqwty", model.connectVia().referenceName());
        Assertions.assertEquals("wmseharxifvqn", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("pjptn").type());
        Assertions.assertEquals(SapHanaAuthenticationType.WINDOWS, model.authenticationType());
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
