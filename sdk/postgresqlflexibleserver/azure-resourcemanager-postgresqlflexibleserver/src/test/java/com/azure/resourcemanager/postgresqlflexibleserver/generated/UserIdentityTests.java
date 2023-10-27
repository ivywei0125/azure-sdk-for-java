// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.UserIdentity;
import org.junit.jupiter.api.Assertions;

public final class UserIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserIdentity model =
            BinaryData
                .fromString("{\"principalId\":\"ciuqgbdb\",\"clientId\":\"auvfbtkuwhhmhyk\"}")
                .toObject(UserIdentity.class);
        Assertions.assertEquals("ciuqgbdb", model.principalId());
        Assertions.assertEquals("auvfbtkuwhhmhyk", model.clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserIdentity model = new UserIdentity().withPrincipalId("ciuqgbdb").withClientId("auvfbtkuwhhmhyk");
        model = BinaryData.fromObject(model).toObject(UserIdentity.class);
        Assertions.assertEquals("ciuqgbdb", model.principalId());
        Assertions.assertEquals("auvfbtkuwhhmhyk", model.clientId());
    }
}
