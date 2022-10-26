// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlAutoProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadItemType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSqlAutoProtectionIntentTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSqlAutoProtectionIntent model =
            BinaryData
                .fromString(
                    "{\"protectionIntentItemType\":\"AzureWorkloadSQLAutoProtectionIntent\",\"workloadItemType\":\"SQLInstance\",\"backupManagementType\":\"DefaultBackup\",\"sourceResourceId\":\"wmkoisq\",\"itemId\":\"sffxui\",\"policyId\":\"csypobkdqzrdzsyl\",\"protectionState\":\"Protecting\"}")
                .toObject(AzureWorkloadSqlAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP, model.backupManagementType());
        Assertions.assertEquals("wmkoisq", model.sourceResourceId());
        Assertions.assertEquals("sffxui", model.itemId());
        Assertions.assertEquals("csypobkdqzrdzsyl", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
        Assertions.assertEquals(WorkloadItemType.SQLINSTANCE, model.workloadItemType());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSqlAutoProtectionIntent model =
            new AzureWorkloadSqlAutoProtectionIntent()
                .withBackupManagementType(BackupManagementType.DEFAULT_BACKUP)
                .withSourceResourceId("wmkoisq")
                .withItemId("sffxui")
                .withPolicyId("csypobkdqzrdzsyl")
                .withProtectionState(ProtectionStatus.PROTECTING)
                .withWorkloadItemType(WorkloadItemType.SQLINSTANCE);
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlAutoProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP, model.backupManagementType());
        Assertions.assertEquals("wmkoisq", model.sourceResourceId());
        Assertions.assertEquals("sffxui", model.itemId());
        Assertions.assertEquals("csypobkdqzrdzsyl", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
        Assertions.assertEquals(WorkloadItemType.SQLINSTANCE, model.workloadItemType());
    }
}
