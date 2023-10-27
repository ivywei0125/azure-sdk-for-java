// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.Identity;
import com.azure.resourcemanager.kusto.models.IdentityType;
import com.azure.resourcemanager.kusto.models.IdentityUserAssignedIdentities;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Identity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"y\",\"tenantId\":\"nzwuxzd\",\"type\":\"None\",\"userAssignedIdentities\":{\"tijbpzvgnwzsymgl\":{\"principalId\":\"lhmwhfpmrqobm\",\"clientId\":\"kknryrtihf\"},\"s\":{\"principalId\":\"fcyzkohdbihanufh\",\"clientId\":\"bj\"},\"npqxuh\":{\"principalId\":\"ithxqhabifpi\",\"clientId\":\"wczbys\"},\"tfwvukxgaudc\":{\"principalId\":\"y\",\"clientId\":\"iwbybrkxvdumjg\"}}}")
                .toObject(Identity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Identity model =
            new Identity()
                .withType(IdentityType.NONE)
                .withUserAssignedIdentities(
                    mapOf(
                        "tijbpzvgnwzsymgl",
                        new IdentityUserAssignedIdentities(),
                        "s",
                        new IdentityUserAssignedIdentities(),
                        "npqxuh",
                        new IdentityUserAssignedIdentities(),
                        "tfwvukxgaudc",
                        new IdentityUserAssignedIdentities()));
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals(IdentityType.NONE, model.type());
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
