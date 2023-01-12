// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.fluent.models.RoleAssignmentEntityProperties;
import org.junit.jupiter.api.Assertions;

public final class RoleAssignmentEntityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoleAssignmentEntityProperties model =
            BinaryData
                .fromString("{\"principalId\":\"rokft\",\"roleDefinitionId\":\"olniwpwcukjf\",\"scope\":\"iawxklry\"}")
                .toObject(RoleAssignmentEntityProperties.class);
        Assertions.assertEquals("rokft", model.principalId());
        Assertions.assertEquals("olniwpwcukjf", model.roleDefinitionId());
        Assertions.assertEquals("iawxklry", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoleAssignmentEntityProperties model =
            new RoleAssignmentEntityProperties()
                .withPrincipalId("rokft")
                .withRoleDefinitionId("olniwpwcukjf")
                .withScope("iawxklry");
        model = BinaryData.fromObject(model).toObject(RoleAssignmentEntityProperties.class);
        Assertions.assertEquals("rokft", model.principalId());
        Assertions.assertEquals("olniwpwcukjf", model.roleDefinitionId());
        Assertions.assertEquals("iawxklry", model.scope());
    }
}