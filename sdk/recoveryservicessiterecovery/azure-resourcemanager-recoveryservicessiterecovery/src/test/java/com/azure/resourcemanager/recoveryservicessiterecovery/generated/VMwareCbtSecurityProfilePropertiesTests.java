// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SecurityType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtSecurityProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class VMwareCbtSecurityProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMwareCbtSecurityProfileProperties model =
            BinaryData
                .fromString(
                    "{\"targetVmSecurityType\":\"None\",\"isTargetVmSecureBootEnabled\":\"ennqfabqca\",\"isTargetVmTpmEnabled\":\"lectcxsfmb\",\"isTargetVmIntegrityMonitoringEnabled\":\"xmsynbkd\",\"isTargetVmConfidentialEncryptionEnabled\":\"yufxuzmsvzyq\"}")
                .toObject(VMwareCbtSecurityProfileProperties.class);
        Assertions.assertEquals(SecurityType.NONE, model.targetVmSecurityType());
        Assertions.assertEquals("ennqfabqca", model.isTargetVmSecureBootEnabled());
        Assertions.assertEquals("lectcxsfmb", model.isTargetVmTpmEnabled());
        Assertions.assertEquals("xmsynbkd", model.isTargetVmIntegrityMonitoringEnabled());
        Assertions.assertEquals("yufxuzmsvzyq", model.isTargetVmConfidentialEncryptionEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMwareCbtSecurityProfileProperties model =
            new VMwareCbtSecurityProfileProperties()
                .withTargetVmSecurityType(SecurityType.NONE)
                .withIsTargetVmSecureBootEnabled("ennqfabqca")
                .withIsTargetVmTpmEnabled("lectcxsfmb")
                .withIsTargetVmIntegrityMonitoringEnabled("xmsynbkd")
                .withIsTargetVmConfidentialEncryptionEnabled("yufxuzmsvzyq");
        model = BinaryData.fromObject(model).toObject(VMwareCbtSecurityProfileProperties.class);
        Assertions.assertEquals(SecurityType.NONE, model.targetVmSecurityType());
        Assertions.assertEquals("ennqfabqca", model.isTargetVmSecureBootEnabled());
        Assertions.assertEquals("lectcxsfmb", model.isTargetVmTpmEnabled());
        Assertions.assertEquals("xmsynbkd", model.isTargetVmIntegrityMonitoringEnabled());
        Assertions.assertEquals("yufxuzmsvzyq", model.isTargetVmConfidentialEncryptionEnabled());
    }
}
