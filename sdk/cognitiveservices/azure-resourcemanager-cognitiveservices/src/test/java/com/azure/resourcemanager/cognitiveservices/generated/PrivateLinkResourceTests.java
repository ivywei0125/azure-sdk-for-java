// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResource;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"mfmtdaaygdvw\",\"requiredMembers\":[\"iohgwxrtfud\",\"epxgyqagvr\",\"mnpkukghimdblxg\"],\"requiredZoneNames\":[\"fnjhfjxwmszkkfo\",\"rey\"],\"displayName\":\"zi\"},\"id\":\"fjawneaivxwczel\",\"name\":\"c\",\"type\":\"r\"}")
                .toObject(PrivateLinkResource.class);
        Assertions.assertEquals("fnjhfjxwmszkkfo", model.properties().requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResource model =
            new PrivateLinkResource()
                .withProperties(
                    new PrivateLinkResourceProperties().withRequiredZoneNames(Arrays.asList("fnjhfjxwmszkkfo", "rey")));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResource.class);
        Assertions.assertEquals("fnjhfjxwmszkkfo", model.properties().requiredZoneNames().get(0));
    }
}
