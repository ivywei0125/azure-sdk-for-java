// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataSourceType;
import com.azure.resourcemanager.recoveryservicesbackup.models.PreValidateEnableBackupRequest;
import org.junit.jupiter.api.Assertions;

public final class PreValidateEnableBackupRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PreValidateEnableBackupRequest model = BinaryData.fromString(
            "{\"resourceType\":\"Sharepoint\",\"resourceId\":\"gdf\",\"vaultId\":\"lzl\",\"properties\":\"xrifkwmrvkts\"}")
            .toObject(PreValidateEnableBackupRequest.class);
        Assertions.assertEquals(DataSourceType.SHAREPOINT, model.resourceType());
        Assertions.assertEquals("gdf", model.resourceId());
        Assertions.assertEquals("lzl", model.vaultId());
        Assertions.assertEquals("xrifkwmrvkts", model.properties());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PreValidateEnableBackupRequest model
            = new PreValidateEnableBackupRequest().withResourceType(DataSourceType.SHAREPOINT)
                .withResourceId("gdf")
                .withVaultId("lzl")
                .withProperties("xrifkwmrvkts");
        model = BinaryData.fromObject(model).toObject(PreValidateEnableBackupRequest.class);
        Assertions.assertEquals(DataSourceType.SHAREPOINT, model.resourceType());
        Assertions.assertEquals("gdf", model.resourceId());
        Assertions.assertEquals("lzl", model.vaultId());
        Assertions.assertEquals("xrifkwmrvkts", model.properties());
    }
}
