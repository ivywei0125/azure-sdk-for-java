// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainer;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ProtectionContainerResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionContainerResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"containerType\":\"ProtectionContainer\",\"friendlyName\":\"kl\",\"backupManagementType\":\"AzureWorkload\",\"registrationStatus\":\"jhwuaanozjos\",\"healthStatus\":\"youlp\",\"protectableObjectType\":\"v\"},\"eTag\":\"glrvimjwosytxi\",\"location\":\"cskfcktqumiekk\",\"tags\":{\"yf\":\"ikh\",\"unygaeqid\":\"hdgqggeb\"},\"id\":\"qfatpxllrxcyjm\",\"name\":\"a\",\"type\":\"su\"}")
            .toObject(ProtectionContainerResourceInner.class);
        Assertions.assertEquals("cskfcktqumiekk", model.location());
        Assertions.assertEquals("ikh", model.tags().get("yf"));
        Assertions.assertEquals("kl", model.properties().friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_WORKLOAD, model.properties().backupManagementType());
        Assertions.assertEquals("jhwuaanozjos", model.properties().registrationStatus());
        Assertions.assertEquals("youlp", model.properties().healthStatus());
        Assertions.assertEquals("v", model.properties().protectableObjectType());
        Assertions.assertEquals("glrvimjwosytxi", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionContainerResourceInner model = new ProtectionContainerResourceInner().withLocation("cskfcktqumiekk")
            .withTags(mapOf("yf", "ikh", "unygaeqid", "hdgqggeb"))
            .withProperties(new ProtectionContainer().withFriendlyName("kl")
                .withBackupManagementType(BackupManagementType.AZURE_WORKLOAD)
                .withRegistrationStatus("jhwuaanozjos")
                .withHealthStatus("youlp")
                .withProtectableObjectType("v"))
            .withEtag("glrvimjwosytxi");
        model = BinaryData.fromObject(model).toObject(ProtectionContainerResourceInner.class);
        Assertions.assertEquals("cskfcktqumiekk", model.location());
        Assertions.assertEquals("ikh", model.tags().get("yf"));
        Assertions.assertEquals("kl", model.properties().friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_WORKLOAD, model.properties().backupManagementType());
        Assertions.assertEquals("jhwuaanozjos", model.properties().registrationStatus());
        Assertions.assertEquals("youlp", model.properties().healthStatus());
        Assertions.assertEquals("v", model.properties().protectableObjectType());
        Assertions.assertEquals("glrvimjwosytxi", model.etag());
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
