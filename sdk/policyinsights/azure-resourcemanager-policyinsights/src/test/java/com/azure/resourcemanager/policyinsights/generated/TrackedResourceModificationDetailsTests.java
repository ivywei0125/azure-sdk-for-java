// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.TrackedResourceModificationDetails;
import org.junit.jupiter.api.Test;

public final class TrackedResourceModificationDetailsTests {
    @Test
    public void testDeserialize() {
        TrackedResourceModificationDetails model =
            BinaryData
                .fromString(
                    "{\"policyDetails\":{\"policyDefinitionId\":\"zitonpeqfpjkjl\",\"policyAssignmentId\":\"fpdvhpfxxypi\",\"policyAssignmentDisplayName\":\"nmayhuybb\",\"policyAssignmentScope\":\"odepoogin\",\"policySetDefinitionId\":\"amiheognarxz\",\"policyDefinitionReferenceId\":\"heotusiv\"},\"deploymentId\":\"v\",\"deploymentTime\":\"2021-06-21T12:11:26Z\"}")
                .toObject(TrackedResourceModificationDetails.class);
    }

    @Test
    public void testSerialize() {
        TrackedResourceModificationDetails model = new TrackedResourceModificationDetails();
        model = BinaryData.fromObject(model).toObject(TrackedResourceModificationDetails.class);
    }
}
