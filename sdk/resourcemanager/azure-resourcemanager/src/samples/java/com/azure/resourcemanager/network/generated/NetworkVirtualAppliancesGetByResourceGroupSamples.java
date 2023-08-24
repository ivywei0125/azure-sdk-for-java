// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NetworkVirtualAppliances GetByResourceGroup. */
public final class NetworkVirtualAppliancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NetworkVirtualApplianceGet.json
     */
    /**
     * Sample code: Get NetworkVirtualAppliance.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkVirtualAppliance(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkVirtualAppliances()
            .getByResourceGroupWithResponse("rg1", "nva", null, com.azure.core.util.Context.NONE);
    }
}
