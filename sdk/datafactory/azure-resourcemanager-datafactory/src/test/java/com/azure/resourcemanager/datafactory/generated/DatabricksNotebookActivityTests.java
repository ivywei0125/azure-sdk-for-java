// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.DatabricksNotebookActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabricksNotebookActivityTests {
    @Test
    public void testDeserialize() {
        DatabricksNotebookActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"DatabricksNotebook\",\"typeProperties\":{\"baseParameters\":{},\"libraries\":[{}]},\"linkedServiceName\":{\"referenceName\":\"bwgmjgrul\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":1455846424,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"dzxcouzfwo\",\"description\":\"akuk\",\"dependsOn\":[{\"activity\":\"tzxsoednlwglihe\",\"dependencyConditions\":[\"Failed\"],\"\":{}},{\"activity\":\"mqgisnion\",\"dependencyConditions\":[\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"puenx\"},{\"name\":\"gtlzlmtrlxcznn\"},{\"name\":\"zkbnbmxl\"},{\"name\":\"mwt\"}],\"\":{}}")
                .toObject(DatabricksNotebookActivity.class);
        Assertions.assertEquals("dzxcouzfwo", model.name());
        Assertions.assertEquals("akuk", model.description());
        Assertions.assertEquals("tzxsoednlwglihe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("puenx", model.userProperties().get(0).name());
        Assertions.assertEquals("bwgmjgrul", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1455846424, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @Test
    public void testSerialize() {
        DatabricksNotebookActivity model =
            new DatabricksNotebookActivity()
                .withName("dzxcouzfwo")
                .withDescription("akuk")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("tzxsoednlwglihe")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("mqgisnion")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("puenx"),
                            new UserProperty().withName("gtlzlmtrlxcznn"),
                            new UserProperty().withName("zkbnbmxl"),
                            new UserProperty().withName("mwt")))
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("bwgmjgrul").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(1455846424)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withBaseParameters(mapOf())
                .withLibraries(Arrays.asList(mapOf()));
        model = BinaryData.fromObject(model).toObject(DatabricksNotebookActivity.class);
        Assertions.assertEquals("dzxcouzfwo", model.name());
        Assertions.assertEquals("akuk", model.description());
        Assertions.assertEquals("tzxsoednlwglihe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("puenx", model.userProperties().get(0).name());
        Assertions.assertEquals("bwgmjgrul", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1455846424, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
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
