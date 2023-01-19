// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.ServerPrivateEndpointConnection;

public final class ServerPrivateEndpointConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerPrivateEndpointConnection model =
            BinaryData
                .fromString(
                    "{\"id\":\"jspodmailzyde\",\"properties\":{\"privateEndpoint\":{\"id\":\"yahux\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"mqnjaqw\",\"actionsRequired\":\"None\"},\"provisioningState\":\"Dropping\"}}")
                .toObject(ServerPrivateEndpointConnection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerPrivateEndpointConnection model = new ServerPrivateEndpointConnection();
        model = BinaryData.fromObject(model).toObject(ServerPrivateEndpointConnection.class);
    }
}