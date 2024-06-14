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
            "{\"id\":\"ahhxvrh\",\"name\":\"kwpjgwwspughftqs\",\"type\":\"qxujxukndxd\",\"properties\":{\"privateEndpoint\":{\"id\":\"guufzd\"},\"privateLinkServiceConnectionState\":{\"status\":\"yqtfihwh\",\"description\":\"otzi\",\"actionsRequired\":\"amvpphoszqzudph\"},\"provisioningState\":\"mvdk\",\"groupIds\":[\"nwcvtbvkayhmtnv\",\"qiatkzwpcnp\"]}}")
            .toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("guufzd", model.properties().privateEndpoint().id());
        Assertions.assertEquals("yqtfihwh", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("otzi", model.properties().privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionDataModel model
            = new PrivateEndpointConnectionDataModel().withProperties(new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpointProperty().withId("guufzd"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionStateProperty().withStatus("yqtfihwh").withDescription("otzi")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionDataModel.class);
        Assertions.assertEquals("guufzd", model.properties().privateEndpoint().id());
        Assertions.assertEquals("yqtfihwh", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("otzi", model.properties().privateLinkServiceConnectionState().description());
    }
}
