// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ReestablishReplicationRequest;
import org.junit.jupiter.api.Assertions;

public final class ReestablishReplicationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReestablishReplicationRequest model =
            BinaryData.fromString("{\"sourceVolumeId\":\"emwabnet\"}").toObject(ReestablishReplicationRequest.class);
        Assertions.assertEquals("emwabnet", model.sourceVolumeId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReestablishReplicationRequest model = new ReestablishReplicationRequest().withSourceVolumeId("emwabnet");
        model = BinaryData.fromObject(model).toObject(ReestablishReplicationRequest.class);
        Assertions.assertEquals("emwabnet", model.sourceVolumeId());
    }
}
