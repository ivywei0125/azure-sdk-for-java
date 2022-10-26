// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkManagers GetByResourceGroup. */
public final class NetworkManagersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkManagerGet.json
     */
    /**
     * Sample code: NetworkManagersGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkManagersGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkManagers()
            .getByResourceGroupWithResponse("rg1", "testNetworkManager", Context.NONE);
    }
}
