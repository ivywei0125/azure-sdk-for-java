// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for SecurityAdminConfigurations Get. */
public final class SecurityAdminConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/NetworkManagerSecurityAdminConfigurationGet.json
     */
    /**
     * Sample code: Get security admin configurations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSecurityAdminConfigurations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSecurityAdminConfigurations()
            .getWithResponse("rg1", "testNetworkManager", "myTestSecurityConfig", com.azure.core.util.Context.NONE);
    }
}
