// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadProtectableItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadProtectableItem;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProtectableItemResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProtectableItemResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"protectableItemType\":\"WorkloadProtectableItem\",\"backupManagementType\":\"iby\",\"workloadType\":\"dl\",\"friendlyName\":\"shfwpracstwity\",\"protectionState\":\"Protecting\"},\"eTag\":\"xccedcpnmdyodn\",\"location\":\"zxltjcvn\",\"tags\":{\"byqunyow\":\"iugcxnavvwxq\",\"g\":\"wlmdjrkv\",\"j\":\"vfvpdbodaciz\"},\"id\":\"lhkrribdeibqipqk\",\"name\":\"hvxndzwmkrefajpj\",\"type\":\"rwkq\"}")
                .toObject(WorkloadProtectableItemResourceInner.class);
        Assertions.assertEquals("zxltjcvn", model.location());
        Assertions.assertEquals("iugcxnavvwxq", model.tags().get("byqunyow"));
        Assertions.assertEquals("iby", model.properties().backupManagementType());
        Assertions.assertEquals("dl", model.properties().workloadType());
        Assertions.assertEquals("shfwpracstwity", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.properties().protectionState());
        Assertions.assertEquals("xccedcpnmdyodn", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProtectableItemResourceInner model =
            new WorkloadProtectableItemResourceInner()
                .withLocation("zxltjcvn")
                .withTags(mapOf("byqunyow", "iugcxnavvwxq", "g", "wlmdjrkv", "j", "vfvpdbodaciz"))
                .withProperties(
                    new WorkloadProtectableItem()
                        .withBackupManagementType("iby")
                        .withWorkloadType("dl")
                        .withFriendlyName("shfwpracstwity")
                        .withProtectionState(ProtectionStatus.PROTECTING))
                .withEtag("xccedcpnmdyodn");
        model = BinaryData.fromObject(model).toObject(WorkloadProtectableItemResourceInner.class);
        Assertions.assertEquals("zxltjcvn", model.location());
        Assertions.assertEquals("iugcxnavvwxq", model.tags().get("byqunyow"));
        Assertions.assertEquals("iby", model.properties().backupManagementType());
        Assertions.assertEquals("dl", model.properties().workloadType());
        Assertions.assertEquals("shfwpracstwity", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.properties().protectionState());
        Assertions.assertEquals("xccedcpnmdyodn", model.etag());
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
