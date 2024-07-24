// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.GatewayProperties;
import com.azure.resourcemanager.hybridcompute.models.GatewayType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GatewayPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Failed\",\"gatewayId\":\"fnjhfjxwmszkkfo\",\"gatewayType\":\"Public\",\"gatewayEndpoint\":\"fkzikfj\",\"allowedFeatures\":[\"eaivxwczel\"]}")
            .toObject(GatewayProperties.class);
        Assertions.assertEquals(GatewayType.PUBLIC, model.gatewayType());
        Assertions.assertEquals("eaivxwczel", model.allowedFeatures().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayProperties model = new GatewayProperties().withGatewayType(GatewayType.PUBLIC)
            .withAllowedFeatures(Arrays.asList("eaivxwczel"));
        model = BinaryData.fromObject(model).toObject(GatewayProperties.class);
        Assertions.assertEquals(GatewayType.PUBLIC, model.gatewayType());
        Assertions.assertEquals("eaivxwczel", model.allowedFeatures().get(0));
    }
}
