// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.ForEachActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForEachActivityTests {
    @Test
    public void testDeserialize() {
        ForEachActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"ForEach\",\"typeProperties\":{\"isSequential\":false,\"batchCount\":928036957,\"items\":{\"value\":\"movdxxurn\"},\"activities\":[{\"type\":\"Activity\",\"name\":\"jmoilunwe\",\"description\":\"deel\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"yozdsfzjuegrhrht\",\"description\":\"ejtvxjn\",\"dependsOn\":[],\"userProperties\":[],\"\":{}}]},\"name\":\"bfiobpnjodfc\",\"description\":\"qqw\",\"dependsOn\":[{\"activity\":\"smoxsazuxejgwe\",\"dependencyConditions\":[\"Succeeded\",\"Skipped\",\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"aczsinq\"}],\"\":{}}")
                .toObject(ForEachActivity.class);
        Assertions.assertEquals("bfiobpnjodfc", model.name());
        Assertions.assertEquals("qqw", model.description());
        Assertions.assertEquals("smoxsazuxejgwe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("aczsinq", model.userProperties().get(0).name());
        Assertions.assertEquals(false, model.isSequential());
        Assertions.assertEquals(928036957, model.batchCount());
        Assertions.assertEquals("movdxxurn", model.items().value());
        Assertions.assertEquals("jmoilunwe", model.activities().get(0).name());
        Assertions.assertEquals("deel", model.activities().get(0).description());
    }

    @Test
    public void testSerialize() {
        ForEachActivity model =
            new ForEachActivity()
                .withName("bfiobpnjodfc")
                .withDescription("qqw")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("smoxsazuxejgwe")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("aczsinq")))
                .withIsSequential(false)
                .withBatchCount(928036957)
                .withItems(new Expression().withValue("movdxxurn"))
                .withActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("jmoilunwe")
                                .withDescription("deel")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("yozdsfzjuegrhrht")
                                .withDescription("ejtvxjn")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(ForEachActivity.class);
        Assertions.assertEquals("bfiobpnjodfc", model.name());
        Assertions.assertEquals("qqw", model.description());
        Assertions.assertEquals("smoxsazuxejgwe", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("aczsinq", model.userProperties().get(0).name());
        Assertions.assertEquals(false, model.isSequential());
        Assertions.assertEquals(928036957, model.batchCount());
        Assertions.assertEquals("movdxxurn", model.items().value());
        Assertions.assertEquals("jmoilunwe", model.activities().get(0).name());
        Assertions.assertEquals("deel", model.activities().get(0).description());
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
