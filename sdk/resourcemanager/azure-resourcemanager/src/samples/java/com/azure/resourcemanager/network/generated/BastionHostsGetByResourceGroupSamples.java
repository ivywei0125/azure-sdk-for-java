// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for BastionHosts GetByResourceGroup. */
public final class BastionHostsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/BastionHostGet.json
     */
    /**
     * Sample code: Get Bastion Host.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getBastionHost(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getBastionHosts()
            .getByResourceGroupWithResponse("rg1", "bastionhosttenant'", com.azure.core.util.Context.NONE);
    }
}
