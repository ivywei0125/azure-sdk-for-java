// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for SecurityAdminConfigurations List. */
public final class SecurityAdminConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NetworkManagerSecurityAdminConfigurationList.json
     */
    /**
     * Sample code: List security admin configurations in a network manager.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSecurityAdminConfigurationsInANetworkManager(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSecurityAdminConfigurations()
            .list("rg1", "testNetworkManager", null, null, com.azure.core.util.Context.NONE);
    }
}
