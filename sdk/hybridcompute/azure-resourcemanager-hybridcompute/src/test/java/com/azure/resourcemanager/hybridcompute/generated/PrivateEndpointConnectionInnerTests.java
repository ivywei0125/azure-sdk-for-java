// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"pbuxwgipwhon\"},\"privateLinkServiceConnectionState\":{\"status\":\"kgshwa\",\"description\":\"kix\",\"actionsRequired\":\"injep\"},\"provisioningState\":\"tmryw\"},\"id\":\"zoqftiyqzrnkcqvy\",\"name\":\"lwh\",\"type\":\"lsicohoqqnwv\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("pbuxwgipwhon", model.properties().privateEndpoint().id());
        Assertions.assertEquals("kgshwa", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("kix", model.properties().privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withProperties(
                    new PrivateEndpointConnectionProperties()
                        .withPrivateEndpoint(new PrivateEndpointProperty().withId("pbuxwgipwhon"))
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionStateProperty()
                                .withStatus("kgshwa")
                                .withDescription("kix")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("pbuxwgipwhon", model.properties().privateEndpoint().id());
        Assertions.assertEquals("kgshwa", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("kix", model.properties().privateLinkServiceConnectionState().description());
    }
}