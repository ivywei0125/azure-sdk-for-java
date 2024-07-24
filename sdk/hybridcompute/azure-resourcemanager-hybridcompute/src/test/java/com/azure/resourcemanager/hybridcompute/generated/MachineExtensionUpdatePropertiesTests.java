// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineExtensionUpdateProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionUpdateProperties model = BinaryData.fromString(
            "{\"forceUpdateTag\":\"nxipeil\",\"publisher\":\"zuaejxd\",\"type\":\"tskzbbtdzumveek\",\"typeHandlerVersion\":\"wozuhkf\",\"enableAutomaticUpgrade\":false,\"autoUpgradeMinorVersion\":false,\"settings\":{\"dttouwaboekqvkel\":\"datadxluu\"},\"protectedSettings\":{\"aalnjixi\":\"datavbxwyjsflhh\"}}")
            .toObject(MachineExtensionUpdateProperties.class);
        Assertions.assertEquals("nxipeil", model.forceUpdateTag());
        Assertions.assertEquals("zuaejxd", model.publisher());
        Assertions.assertEquals("tskzbbtdzumveek", model.type());
        Assertions.assertEquals("wozuhkf", model.typeHandlerVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionUpdateProperties model = new MachineExtensionUpdateProperties().withForceUpdateTag("nxipeil")
            .withPublisher("zuaejxd")
            .withType("tskzbbtdzumveek")
            .withTypeHandlerVersion("wozuhkf")
            .withEnableAutomaticUpgrade(false)
            .withAutoUpgradeMinorVersion(false)
            .withSettings(mapOf("dttouwaboekqvkel", "datadxluu"))
            .withProtectedSettings(mapOf("aalnjixi", "datavbxwyjsflhh"));
        model = BinaryData.fromObject(model).toObject(MachineExtensionUpdateProperties.class);
        Assertions.assertEquals("nxipeil", model.forceUpdateTag());
        Assertions.assertEquals("zuaejxd", model.publisher());
        Assertions.assertEquals("tskzbbtdzumveek", model.type());
        Assertions.assertEquals("wozuhkf", model.typeHandlerVersion());
        Assertions.assertEquals(false, model.enableAutomaticUpgrade());
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
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
