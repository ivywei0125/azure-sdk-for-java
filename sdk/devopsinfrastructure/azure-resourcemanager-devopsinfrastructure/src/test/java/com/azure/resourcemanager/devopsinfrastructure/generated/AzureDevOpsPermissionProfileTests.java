// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.AzureDevOpsPermissionProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.AzureDevOpsPermissionType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureDevOpsPermissionProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDevOpsPermissionProfile model = BinaryData.fromString(
            "{\"kind\":\"Inherit\",\"users\":[\"ulngsntn\",\"ybkzgcwr\",\"clxxwrljdo\",\"skcqvkocrcjd\"],\"groups\":[\"nh\",\"bnjbiksqrglssain\"]}")
            .toObject(AzureDevOpsPermissionProfile.class);
        Assertions.assertEquals(AzureDevOpsPermissionType.INHERIT, model.kind());
        Assertions.assertEquals("ulngsntn", model.users().get(0));
        Assertions.assertEquals("nh", model.groups().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDevOpsPermissionProfile model
            = new AzureDevOpsPermissionProfile().withKind(AzureDevOpsPermissionType.INHERIT)
                .withUsers(Arrays.asList("ulngsntn", "ybkzgcwr", "clxxwrljdo", "skcqvkocrcjd"))
                .withGroups(Arrays.asList("nh", "bnjbiksqrglssain"));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsPermissionProfile.class);
        Assertions.assertEquals(AzureDevOpsPermissionType.INHERIT, model.kind());
        Assertions.assertEquals("ulngsntn", model.users().get(0));
        Assertions.assertEquals("nh", model.groups().get(0));
    }
}
