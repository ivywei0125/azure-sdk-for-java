// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for Vaults Delete. */
public final class VaultsDeleteSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/DeleteVault.json
     */
    /**
     * Sample code: Delete Recovery Services Vault.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void deleteRecoveryServicesVault(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .vaults()
            .deleteByResourceGroupWithResponse(
                "Default-RecoveryServices-ResourceGroup", "swaggerExample", Context.NONE);
    }
}
