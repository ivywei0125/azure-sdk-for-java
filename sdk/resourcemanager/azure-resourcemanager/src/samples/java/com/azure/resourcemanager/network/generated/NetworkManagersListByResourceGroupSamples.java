// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NetworkManagers ListByResourceGroup. */
public final class NetworkManagersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/NetworkManagerList.json
     */
    /**
     * Sample code: List Network Manager.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNetworkManager(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkManagers()
            .listByResourceGroup("rg1", null, null, com.azure.core.util.Context.NONE);
    }
}
