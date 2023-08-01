// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PacketCaptureInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCaptureInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Accepted\",\"status\":\"Running\",\"reason\":\"exfwhy\",\"captureStartTime\":\"2021-05-17T05:51:50Z\",\"networkInterfaces\":[\"yvdcsitynnaa\",\"dectehfiqsc\"],\"bytesToCapturePerPacket\":991412043845588361,\"totalBytesPerSession\":7720678337601187559,\"timeLimitInSeconds\":732207919},\"id\":\"kgqhcjrefovg\",\"name\":\"kqsleyyvxy\",\"type\":\"jpkcattpng\"}")
                .toObject(PacketCaptureInner.class);
        Assertions.assertEquals("yvdcsitynnaa", model.networkInterfaces().get(0));
        Assertions.assertEquals(991412043845588361L, model.bytesToCapturePerPacket());
        Assertions.assertEquals(7720678337601187559L, model.totalBytesPerSession());
        Assertions.assertEquals(732207919, model.timeLimitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCaptureInner model =
            new PacketCaptureInner()
                .withNetworkInterfaces(Arrays.asList("yvdcsitynnaa", "dectehfiqsc"))
                .withBytesToCapturePerPacket(991412043845588361L)
                .withTotalBytesPerSession(7720678337601187559L)
                .withTimeLimitInSeconds(732207919);
        model = BinaryData.fromObject(model).toObject(PacketCaptureInner.class);
        Assertions.assertEquals("yvdcsitynnaa", model.networkInterfaces().get(0));
        Assertions.assertEquals(991412043845588361L, model.bytesToCapturePerPacket());
        Assertions.assertEquals(7720678337601187559L, model.totalBytesPerSession());
        Assertions.assertEquals(732207919, model.timeLimitInSeconds());
    }
}
