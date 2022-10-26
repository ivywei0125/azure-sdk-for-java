// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ForEachActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.Expression;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForEachActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ForEachActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"isSequential\":false,\"batchCount\":1662678007,\"items\":{\"value\":\"ozsyvrm\"},\"activities\":[{\"type\":\"Activity\",\"name\":\"myitr\",\"description\":\"wudlxeeihtpmnoe\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"ibzoyrfgxky\",\"description\":\"mypgfqvmty\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"ejpewpyjlfxampqc\",\"description\":\"g\",\"dependsOn\":[],\"userProperties\":[],\"\":{}}]}")
                .toObject(ForEachActivityTypeProperties.class);
        Assertions.assertEquals(false, model.isSequential());
        Assertions.assertEquals(1662678007, model.batchCount());
        Assertions.assertEquals("ozsyvrm", model.items().value());
        Assertions.assertEquals("myitr", model.activities().get(0).name());
        Assertions.assertEquals("wudlxeeihtpmnoe", model.activities().get(0).description());
    }

    @Test
    public void testSerialize() {
        ForEachActivityTypeProperties model =
            new ForEachActivityTypeProperties()
                .withIsSequential(false)
                .withBatchCount(1662678007)
                .withItems(new Expression().withValue("ozsyvrm"))
                .withActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("myitr")
                                .withDescription("wudlxeeihtpmnoe")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("ibzoyrfgxky")
                                .withDescription("mypgfqvmty")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("ejpewpyjlfxampqc")
                                .withDescription("g")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(ForEachActivityTypeProperties.class);
        Assertions.assertEquals(false, model.isSequential());
        Assertions.assertEquals(1662678007, model.batchCount());
        Assertions.assertEquals("ozsyvrm", model.items().value());
        Assertions.assertEquals("myitr", model.activities().get(0).name());
        Assertions.assertEquals("wudlxeeihtpmnoe", model.activities().get(0).description());
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
