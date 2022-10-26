// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.DedupState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import com.azure.resourcemanager.recoveryservicesbackup.models.XcoolState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BackupResourceConfigTests {
    @Test
    public void testDeserialize() {
        BackupResourceConfig model =
            BinaryData
                .fromString(
                    "{\"storageModelType\":\"Invalid\",\"storageType\":\"GeoRedundant\",\"storageTypeState\":\"Unlocked\",\"crossRegionRestoreFlag\":true,\"dedupState\":\"Enabled\",\"xcoolState\":\"Invalid\"}")
                .toObject(BackupResourceConfig.class);
        Assertions.assertEquals(StorageType.INVALID, model.storageModelType());
        Assertions.assertEquals(StorageType.GEO_REDUNDANT, model.storageType());
        Assertions.assertEquals(StorageTypeState.UNLOCKED, model.storageTypeState());
        Assertions.assertEquals(true, model.crossRegionRestoreFlag());
        Assertions.assertEquals(DedupState.ENABLED, model.dedupState());
        Assertions.assertEquals(XcoolState.INVALID, model.xcoolState());
    }

    @Test
    public void testSerialize() {
        BackupResourceConfig model =
            new BackupResourceConfig()
                .withStorageModelType(StorageType.INVALID)
                .withStorageType(StorageType.GEO_REDUNDANT)
                .withStorageTypeState(StorageTypeState.UNLOCKED)
                .withCrossRegionRestoreFlag(true)
                .withDedupState(DedupState.ENABLED)
                .withXcoolState(XcoolState.INVALID);
        model = BinaryData.fromObject(model).toObject(BackupResourceConfig.class);
        Assertions.assertEquals(StorageType.INVALID, model.storageModelType());
        Assertions.assertEquals(StorageType.GEO_REDUNDANT, model.storageType());
        Assertions.assertEquals(StorageTypeState.UNLOCKED, model.storageTypeState());
        Assertions.assertEquals(true, model.crossRegionRestoreFlag());
        Assertions.assertEquals(DedupState.ENABLED, model.dedupState());
        Assertions.assertEquals(XcoolState.INVALID, model.xcoolState());
    }
}
