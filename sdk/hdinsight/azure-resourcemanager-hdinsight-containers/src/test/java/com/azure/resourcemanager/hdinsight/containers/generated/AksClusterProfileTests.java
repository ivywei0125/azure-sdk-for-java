// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.AksClusterProfile;
import com.azure.resourcemanager.hdinsight.containers.models.AksClusterProfileAksClusterAgentPoolIdentityProfile;
import org.junit.jupiter.api.Assertions;

public final class AksClusterProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AksClusterProfile model =
            BinaryData
                .fromString(
                    "{\"aksClusterResourceId\":\"udccsnhsjc\",\"aksClusterAgentPoolIdentityProfile\":{\"msiResourceId\":\"ejhkry\",\"msiClientId\":\"tnapczwlokjyemkk\",\"msiObjectId\":\"ni\"},\"aksVersion\":\"oxzjnchgejspod\"}")
                .toObject(AksClusterProfile.class);
        Assertions.assertEquals("udccsnhsjc", model.aksClusterResourceId());
        Assertions.assertEquals("ejhkry", model.aksClusterAgentPoolIdentityProfile().msiResourceId());
        Assertions.assertEquals("tnapczwlokjyemkk", model.aksClusterAgentPoolIdentityProfile().msiClientId());
        Assertions.assertEquals("ni", model.aksClusterAgentPoolIdentityProfile().msiObjectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AksClusterProfile model =
            new AksClusterProfile()
                .withAksClusterResourceId("udccsnhsjc")
                .withAksClusterAgentPoolIdentityProfile(
                    new AksClusterProfileAksClusterAgentPoolIdentityProfile()
                        .withMsiResourceId("ejhkry")
                        .withMsiClientId("tnapczwlokjyemkk")
                        .withMsiObjectId("ni"));
        model = BinaryData.fromObject(model).toObject(AksClusterProfile.class);
        Assertions.assertEquals("udccsnhsjc", model.aksClusterResourceId());
        Assertions.assertEquals("ejhkry", model.aksClusterAgentPoolIdentityProfile().msiResourceId());
        Assertions.assertEquals("tnapczwlokjyemkk", model.aksClusterAgentPoolIdentityProfile().msiClientId());
        Assertions.assertEquals("ni", model.aksClusterAgentPoolIdentityProfile().msiObjectId());
    }
}
