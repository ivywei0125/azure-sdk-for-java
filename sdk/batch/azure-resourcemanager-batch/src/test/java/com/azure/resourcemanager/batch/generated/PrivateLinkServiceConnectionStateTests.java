// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Disconnected\",\"description\":\"podepoo\",\"actionsRequired\":\"nuvamiheogna\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("podepoo", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                .withDescription("podepoo");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("podepoo", model.description());
    }
}
