// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationUsages List. */
public final class ReplicationUsagesListSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ListReplicationUsages.json
     */
    /**
     * Sample code: Gets Replication usages of vault.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void getsReplicationUsagesOfVault(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.replicationUsages().list("avrai7517RG1", "avrai7517Vault1", Context.NONE);
    }
}
