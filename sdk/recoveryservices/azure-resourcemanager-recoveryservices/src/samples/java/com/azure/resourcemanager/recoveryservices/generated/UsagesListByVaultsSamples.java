// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/**
 * Samples for Usages ListByVaults.
 */
public final class UsagesListByVaultsSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2024-04-01/examples/ListUsages.json
     */
    /**
     * Sample code: Gets vault usages.
     * 
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void getsVaultUsages(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.usages()
            .listByVaults("Default-RecoveryServices-ResourceGroup", "swaggerExample", com.azure.core.util.Context.NONE);
    }
}
