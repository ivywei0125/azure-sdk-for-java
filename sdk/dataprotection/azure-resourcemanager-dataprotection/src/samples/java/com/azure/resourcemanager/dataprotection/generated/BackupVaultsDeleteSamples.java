// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/**
 * Samples for BackupVaults Delete.
 */
public final class BackupVaultsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/VaultCRUD/
     * DeleteBackupVault.json
     */
    /**
     * Sample code: Delete BackupVault.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void deleteBackupVault(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupVaults().delete("SampleResourceGroup", "swaggerExample", com.azure.core.util.Context.NONE);
    }
}
