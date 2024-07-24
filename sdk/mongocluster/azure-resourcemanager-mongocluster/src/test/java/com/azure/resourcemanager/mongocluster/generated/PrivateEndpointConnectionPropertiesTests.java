// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpoint;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.mongocluster.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"groupIds\":[\"xj\",\"prozvcputegjvwmf\",\"atscmd\",\"pjhulsuuvmkj\"],\"privateEndpoint\":{\"id\":\"rwfndiod\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"w\",\"actionsRequired\":\"dpvwryoqpsoaccta\"},\"provisioningState\":\"Creating\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("w", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("w")
                        .withActionsRequired("dpvwryoqpsoaccta"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("w", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
