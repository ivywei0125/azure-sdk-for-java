// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.FleetPatch;
import com.azure.resourcemanager.containerservicefleet.models.ManagedServiceIdentity;
import com.azure.resourcemanager.containerservicefleet.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.containerservicefleet.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FleetPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetPatch model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"lmmnkzsmodmglo\":\"ciqfou\",\"uqktap\":\"gpbkwtmut\",\"kdosvqw\":\"pwgcuertu\"},\"identity\":{\"principalId\":\"fd4f9965-38a7-411f-886f-6834eeb598c3\",\"tenantId\":\"e28757b4-d211-476c-848b-cf0c94a61807\",\"type\":\"SystemAssigned,"
                        + " UserAssigned\",\"userAssignedIdentities\":{\"ddgmb\":{\"principalId\":\"01ecdb70-c186-4a57-b2fd-f138f515a144\",\"clientId\":\"e412eba8-c58c-4e81-9f5a-35b2ef533a0e\"}}}}")
                .toObject(FleetPatch.class);
        Assertions.assertEquals("ciqfou", model.tags().get("lmmnkzsmodmglo"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetPatch model =
            new FleetPatch()
                .withTags(mapOf("lmmnkzsmodmglo", "ciqfou", "uqktap", "gpbkwtmut", "kdosvqw", "pwgcuertu"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("ddgmb", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(FleetPatch.class);
        Assertions.assertEquals("ciqfou", model.tags().get("lmmnkzsmodmglo"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
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
