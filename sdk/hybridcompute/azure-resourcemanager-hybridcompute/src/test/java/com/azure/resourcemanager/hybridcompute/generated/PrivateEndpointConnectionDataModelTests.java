// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionDataModel;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionDataModelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionDataModel model = BinaryData.fromString(
            "{\"id\":\"ftnkhtj\",\"name\":\"i\",\"type\":\"wfqatmtd\",\"properties\":{\"privateEndpoint\":{\"id\":\"vypgikdg\"},\"privateLinkServiceConnectionState\":{\"status\":\"ywkbirryuzhlhkjo\",\"description\":\"rvqqaatj\",\"actionsRequired\":\"rv\"},\"provisioningState\":\"upmfiibfg\",\"groupIds\":[\"ool\",\"rwxkvtkkgl\",\"qwjygvja\",\"vblm\"]}}")
            .toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("vypgikdg", model.properties().privateEndpoint().id());
        Assertions.assertEquals("ywkbirryuzhlhkjo", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("rvqqaatj", model.properties().privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionDataModel model
            = new PrivateEndpointConnectionDataModel().withProperties(new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpointProperty().withId("vypgikdg"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionStateProperty().withStatus("ywkbirryuzhlhkjo")
                        .withDescription("rvqqaatj")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("vypgikdg", model.properties().privateEndpoint().id());
        Assertions.assertEquals("ywkbirryuzhlhkjo", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("rvqqaatj", model.properties().privateLinkServiceConnectionState().description());
    }
}
