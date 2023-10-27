// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.NetworkAcl;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkAclTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkAcl model =
            BinaryData
                .fromString(
                    "{\"allow\":[\"ServerConnection\"],\"deny\":[\"ClientConnection\",\"Trace\",\"RESTAPI\",\"ServerConnection\"]}")
                .toObject(NetworkAcl.class);
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.allow().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION, model.deny().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkAcl model =
            new NetworkAcl()
                .withAllow(Arrays.asList(SignalRRequestType.SERVER_CONNECTION))
                .withDeny(
                    Arrays
                        .asList(
                            SignalRRequestType.CLIENT_CONNECTION,
                            SignalRRequestType.TRACE,
                            SignalRRequestType.RESTAPI,
                            SignalRRequestType.SERVER_CONNECTION));
        model = BinaryData.fromObject(model).toObject(NetworkAcl.class);
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.allow().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION, model.deny().get(0));
    }
}
