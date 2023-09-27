// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.models.TriggerRun;
import java.util.HashMap;
import java.util.Map;

public final class TriggerRunTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerRun model =
            BinaryData
                .fromString(
                    "{\"triggerRunId\":\"hcz\",\"triggerName\":\"rxzbujr\",\"triggerType\":\"hqvwrevkhgnlnzon\",\"triggerRunTimestamp\":\"2021-07-02T07:36:09Z\",\"status\":\"Inprogress\",\"message\":\"yw\",\"properties\":{\"zehtdhgb\":\"jtszcof\",\"reljeamur\":\"k\",\"xlpm\":\"zmlovuanash\"},\"triggeredPipelines\":{\"sdbccxjmonfdgnwn\":\"bdkelvidizo\",\"keifzzhmkdasv\":\"ypuuwwltvuqjctze\",\"cu\":\"lyhb\"},\"runDimension\":{\"lvizb\":\"xgsrboldforobw\",\"dxe\":\"hfovvacqpbtu\",\"elawumu\":\"zab\"},\"dependencyStatus\":{\"ucwyhahno\":\"datazkwrrwoyc\",\"fuurutlwexx\":\"datadrkywuhps\",\"srzpgepqtybbww\":\"datalalniex\"},\"\":{\"xkjibnxmy\":\"dataakchzyvlixqnrk\",\"ijpstte\":\"datauxswqrntvl\",\"wcyyufmhruncu\":\"dataoqq\"}}")
                .toObject(TriggerRun.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerRun model =
            new TriggerRun()
                .withAdditionalProperties(
                    mapOf(
                        "triggerRunId",
                        "hcz",
                        "triggerName",
                        "rxzbujr",
                        "runDimension",
                        JacksonAdapter
                            .createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"lvizb\":\"xgsrboldforobw\",\"dxe\":\"hfovvacqpbtu\",\"elawumu\":\"zab\"}",
                                Object.class,
                                SerializerEncoding.JSON),
                        "dependencyStatus",
                        JacksonAdapter
                            .createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"ucwyhahno\":\"datazkwrrwoyc\",\"fuurutlwexx\":\"datadrkywuhps\",\"srzpgepqtybbww\":\"datalalniex\"}",
                                Object.class,
                                SerializerEncoding.JSON),
                        "triggeredPipelines",
                        JacksonAdapter
                            .createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"sdbccxjmonfdgnwn\":\"bdkelvidizo\",\"keifzzhmkdasv\":\"ypuuwwltvuqjctze\",\"cu\":\"lyhb\"}",
                                Object.class,
                                SerializerEncoding.JSON),
                        "triggerType",
                        "hqvwrevkhgnlnzon",
                        "triggerRunTimestamp",
                        "2021-07-02T07:36:09Z",
                        "message",
                        "yw",
                        "properties",
                        JacksonAdapter
                            .createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"zehtdhgb\":\"jtszcof\",\"reljeamur\":\"k\",\"xlpm\":\"zmlovuanash\"}",
                                Object.class,
                                SerializerEncoding.JSON),
                        "status",
                        "Inprogress"));
        model = BinaryData.fromObject(model).toObject(TriggerRun.class);
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
