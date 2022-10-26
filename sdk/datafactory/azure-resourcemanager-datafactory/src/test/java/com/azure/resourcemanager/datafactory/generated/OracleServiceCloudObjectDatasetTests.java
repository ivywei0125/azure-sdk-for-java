// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OracleServiceCloudObjectDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OracleServiceCloudObjectDatasetTests {
    @Test
    public void testDeserialize() {
        OracleServiceCloudObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"OracleServiceCloudObject\",\"typeProperties\":{},\"description\":\"nxwcdommpv\",\"linkedServiceName\":{\"referenceName\":\"wzfgbrttuiaclkie\",\"parameters\":{}},\"parameters\":{\"t\":{\"type\":\"SecureString\"},\"fyut\":{\"type\":\"Bool\"},\"ygbpvnwswmt\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"wwgzwxjlmecvog\"},\"\":{}}")
                .toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("nxwcdommpv", model.description());
        Assertions.assertEquals("wzfgbrttuiaclkie", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("t").type());
        Assertions.assertEquals("wwgzwxjlmecvog", model.folder().name());
    }

    @Test
    public void testSerialize() {
        OracleServiceCloudObjectDataset model =
            new OracleServiceCloudObjectDataset()
                .withDescription("nxwcdommpv")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("wzfgbrttuiaclkie").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "t",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "fyut",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "ygbpvnwswmt",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("wwgzwxjlmecvog"));
        model = BinaryData.fromObject(model).toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("nxwcdommpv", model.description());
        Assertions.assertEquals("wzfgbrttuiaclkie", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("t").type());
        Assertions.assertEquals("wwgzwxjlmecvog", model.folder().name());
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
