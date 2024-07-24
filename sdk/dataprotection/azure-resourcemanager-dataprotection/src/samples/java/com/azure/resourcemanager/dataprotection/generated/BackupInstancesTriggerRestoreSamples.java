// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryPointBasedRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreWithRehydrationRequest;
import com.azure.resourcemanager.dataprotection.models.Datasource;
import com.azure.resourcemanager.dataprotection.models.DatasourceSet;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RehydrationPriority;
import com.azure.resourcemanager.dataprotection.models.RestoreFilesTargetInfo;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfo;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetLocationType;
import com.azure.resourcemanager.dataprotection.models.SecretStoreBasedAuthCredentials;
import com.azure.resourcemanager.dataprotection.models.SecretStoreResource;
import com.azure.resourcemanager.dataprotection.models.SecretStoreType;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import com.azure.resourcemanager.dataprotection.models.TargetDetails;

/**
 * Samples for BackupInstances TriggerRestore.
 */
public final class BackupInstancesTriggerRestoreSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/TriggerRestoreAsFiles.json
     */
    /**
     * Sample code: Trigger Restore As Files.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void triggerRestoreAsFiles(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances()
            .triggerRestore("000pikumar", "PrivatePreviewVault1", "testInstance1",
                new AzureBackupRecoveryPointBasedRestoreRequest()
                    .withRestoreTargetInfo(
                        new RestoreFilesTargetInfo().withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                            .withRestoreLocation("southeastasia")
                            .withTargetDetails(new TargetDetails().withFilePrefix("restoredblob")
                                .withRestoreTargetLocationType(RestoreTargetLocationType.AZURE_BLOBS)
                                .withUrl("https://teststorage.blob.core.windows.net/restoretest")))
                    .withSourceDataStoreType(SourceDataStoreType.VAULT_STORE)
                    .withSourceResourceId(
                        "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest/databases/testdb")
                    .withRecoveryPointId("hardcodedRP"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/TriggerRestoreWithRehydration.json
     */
    /**
     * Sample code: Trigger Restore With Rehydration.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void
        triggerRestoreWithRehydration(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances()
            .triggerRestore("000pikumar", "PratikPrivatePreviewVault1", "testInstance1",
                new AzureBackupRestoreWithRehydrationRequest().withRestoreTargetInfo(new RestoreTargetInfo()
                    .withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                    .withRestoreLocation("southeastasia")
                    .withDatasourceInfo(new Datasource().withDatasourceType("OssDB")
                        .withObjectType("Datasource")
                        .withResourceId(
                            "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest/databases/testdb")
                        .withResourceLocation("")
                        .withResourceName("testdb")
                        .withResourceType("Microsoft.DBforPostgreSQL/servers/databases")
                        .withResourceUri(""))
                    .withDatasourceSetInfo(new DatasourceSet().withDatasourceType("OssDB")
                        .withObjectType("DatasourceSet")
                        .withResourceId(
                            "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest")
                        .withResourceLocation("")
                        .withResourceName("viveksipgtest")
                        .withResourceType("Microsoft.DBforPostgreSQL/servers")
                        .withResourceUri("")))
                    .withSourceDataStoreType(SourceDataStoreType.VAULT_STORE)
                    .withSourceResourceId(
                        "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest/databases/testdb")
                    .withRecoveryPointId("hardcodedRP")
                    .withRehydrationPriority(RehydrationPriority.HIGH)
                    .withRehydrationRetentionDuration("7D"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/TriggerRestore.json
     */
    /**
     * Sample code: Trigger Restore.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void triggerRestore(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances()
            .triggerRestore("000pikumar", "PratikPrivatePreviewVault1", "testInstance1",
                new AzureBackupRecoveryPointBasedRestoreRequest().withRestoreTargetInfo(new RestoreTargetInfo()
                    .withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                    .withRestoreLocation("southeastasia")
                    .withDatasourceInfo(new Datasource()
                        .withDatasourceType("Microsoft.DBforPostgreSQL/servers/databases")
                        .withObjectType("Datasource")
                        .withResourceId(
                            "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest/databases/targetdb")
                        .withResourceLocation("")
                        .withResourceName("targetdb")
                        .withResourceType("Microsoft.DBforPostgreSQL/servers/databases")
                        .withResourceUri(""))
                    .withDatasourceSetInfo(new DatasourceSet()
                        .withDatasourceType("Microsoft.DBforPostgreSQL/servers/databases")
                        .withObjectType("DatasourceSet")
                        .withResourceId(
                            "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest")
                        .withResourceLocation("")
                        .withResourceName("viveksipgtest")
                        .withResourceType("Microsoft.DBforPostgreSQL/servers")
                        .withResourceUri(""))
                    .withDatasourceAuthCredentials(new SecretStoreBasedAuthCredentials().withSecretStoreResource(
                        new SecretStoreResource().withUri("https://samplevault.vault.azure.net/secrets/credentials")
                            .withSecretStoreType(SecretStoreType.AZURE_KEY_VAULT))))
                    .withSourceDataStoreType(SourceDataStoreType.VAULT_STORE)
                    .withSourceResourceId(
                        "/subscriptions/f75d8d8b-6735-4697-82e1-1a7a3ff0d5d4/resourceGroups/viveksipgtest/providers/Microsoft.DBforPostgreSQL/servers/viveksipgtest/databases/testdb")
                    .withRecoveryPointId("hardcodedRP"),
                com.azure.core.util.Context.NONE);
    }
}
