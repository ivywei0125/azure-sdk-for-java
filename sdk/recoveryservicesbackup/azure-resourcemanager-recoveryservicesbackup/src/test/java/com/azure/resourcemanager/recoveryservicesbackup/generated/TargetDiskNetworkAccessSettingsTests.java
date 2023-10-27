// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetDiskNetworkAccessOption;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetDiskNetworkAccessSettings;
import org.junit.jupiter.api.Assertions;

public final class TargetDiskNetworkAccessSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetDiskNetworkAccessSettings model =
            BinaryData
                .fromString(
                    "{\"targetDiskNetworkAccessOption\":\"SameAsOnSourceDisks\",\"targetDiskAccessId\":\"bgqjxgpnrhgo\"}")
                .toObject(TargetDiskNetworkAccessSettings.class);
        Assertions
            .assertEquals(TargetDiskNetworkAccessOption.SAME_AS_ON_SOURCE_DISKS, model.targetDiskNetworkAccessOption());
        Assertions.assertEquals("bgqjxgpnrhgo", model.targetDiskAccessId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetDiskNetworkAccessSettings model =
            new TargetDiskNetworkAccessSettings()
                .withTargetDiskNetworkAccessOption(TargetDiskNetworkAccessOption.SAME_AS_ON_SOURCE_DISKS)
                .withTargetDiskAccessId("bgqjxgpnrhgo");
        model = BinaryData.fromObject(model).toObject(TargetDiskNetworkAccessSettings.class);
        Assertions
            .assertEquals(TargetDiskNetworkAccessOption.SAME_AS_ON_SOURCE_DISKS, model.targetDiskNetworkAccessOption());
        Assertions.assertEquals("bgqjxgpnrhgo", model.targetDiskAccessId());
    }
}
