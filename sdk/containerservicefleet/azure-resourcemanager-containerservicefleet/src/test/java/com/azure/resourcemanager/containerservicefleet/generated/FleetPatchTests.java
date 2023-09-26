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
                    "{\"tags\":{\"zevndhkrwpdappds\":\"sabkyqduujitcjcz\",\"snhu\":\"dkvwrwjfe\",\"tmrldhugjzzdatq\":\"je\"},\"identity\":{\"principalId\":\"6e2b927a-720e-424c-8e89-4e012ec3a802\",\"tenantId\":\"d906c806-8d0a-41a7-af5d-3d59b4b8b0d9\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"lgphu\":{\"principalId\":\"d46ae37b-b0cf-4afa-9413-59109bcb98ff\",\"clientId\":\"9af4399c-4a57-457f-bc30-07616cfa8057\"},\"ndv\":{\"principalId\":\"067e7edd-cc1c-4dd4-bd74-0ab3bfd1eaf5\",\"clientId\":\"ad9ed536-0a75-4789-800a-92a5d8796a92\"}}}}")
                .toObject(FleetPatch.class);
        Assertions.assertEquals("sabkyqduujitcjcz", model.tags().get("zevndhkrwpdappds"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetPatch model =
            new FleetPatch()
                .withTags(mapOf("zevndhkrwpdappds", "sabkyqduujitcjcz", "snhu", "dkvwrwjfe", "tmrldhugjzzdatq", "je"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf("lgphu", new UserAssignedIdentity(), "ndv", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(FleetPatch.class);
        Assertions.assertEquals("sabkyqduujitcjcz", model.tags().get("zevndhkrwpdappds"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
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
