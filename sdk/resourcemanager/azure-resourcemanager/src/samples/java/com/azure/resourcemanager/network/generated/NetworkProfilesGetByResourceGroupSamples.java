// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkProfiles GetByResourceGroup.
 */
public final class NetworkProfilesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * NetworkProfileGetWithContainerNic.json
     */
    /**
     * Sample code: Get network profile with container network interfaces.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getNetworkProfileWithContainerNetworkInterfaces(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkProfiles()
            .getByResourceGroupWithResponse("rg1", "networkProfile1", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/NetworkProfileGetConfigOnly.
     * json
     */
    /**
     * Sample code: Get network profile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkProfiles()
            .getByResourceGroupWithResponse("rg1", "networkProfile1", null, com.azure.core.util.Context.NONE);
    }
}
