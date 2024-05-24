// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageJobTaskDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureStorageJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStorageJobExtendedInfo model = BinaryData.fromString(
            "{\"tasksList\":[{\"taskId\":\"cjdx\",\"status\":\"bzo\"}],\"propertyBag\":{\"ogtqxepnylbf\":\"ulapzwyrp\",\"cib\":\"ajlyjtlvofqzhv\",\"uxrkjp\":\"fmo\",\"wiivwzjbhyzsx\":\"dwxf\"},\"dynamicErrorMessage\":\"kambtrnegvmnvuqe\"}")
            .toObject(AzureStorageJobExtendedInfo.class);
        Assertions.assertEquals("cjdx", model.tasksList().get(0).taskId());
        Assertions.assertEquals("bzo", model.tasksList().get(0).status());
        Assertions.assertEquals("ulapzwyrp", model.propertyBag().get("ogtqxepnylbf"));
        Assertions.assertEquals("kambtrnegvmnvuqe", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStorageJobExtendedInfo model = new AzureStorageJobExtendedInfo()
            .withTasksList(Arrays.asList(new AzureStorageJobTaskDetails().withTaskId("cjdx").withStatus("bzo")))
            .withPropertyBag(
                mapOf("ogtqxepnylbf", "ulapzwyrp", "cib", "ajlyjtlvofqzhv", "uxrkjp", "fmo", "wiivwzjbhyzsx", "dwxf"))
            .withDynamicErrorMessage("kambtrnegvmnvuqe");
        model = BinaryData.fromObject(model).toObject(AzureStorageJobExtendedInfo.class);
        Assertions.assertEquals("cjdx", model.tasksList().get(0).taskId());
        Assertions.assertEquals("bzo", model.tasksList().get(0).status());
        Assertions.assertEquals("ulapzwyrp", model.propertyBag().get("ogtqxepnylbf"));
        Assertions.assertEquals("kambtrnegvmnvuqe", model.dynamicErrorMessage());
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
