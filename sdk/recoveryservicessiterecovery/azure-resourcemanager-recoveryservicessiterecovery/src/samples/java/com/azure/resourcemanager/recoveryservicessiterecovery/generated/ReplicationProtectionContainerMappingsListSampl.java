// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationProtectionContainerMappings List. */
public final class ReplicationProtectionContainerMappingsListSampl {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationProtectionContainerMappings_List.json
     */
    /**
     * Sample code: Gets the list of all protection container mappings in a vault.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfAllProtectionContainerMappingsInAVault(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainerMappings()
            .list("vault1", "resourceGroupPS1", com.azure.core.util.Context.NONE);
    }
}
