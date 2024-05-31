// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for BackupVaults CreateOrUpdate.
 */
public final class BackupVaultsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/BackupVaults_Create.json
     */
    /**
     * Sample code: BackupVault_CreateOrUpdate.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupVaultCreateOrUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backupVaults()
            .define("backupVault1")
            .withRegion("eastus")
            .withExistingNetAppAccount("myRG", "account1")
            .create();
    }
}
