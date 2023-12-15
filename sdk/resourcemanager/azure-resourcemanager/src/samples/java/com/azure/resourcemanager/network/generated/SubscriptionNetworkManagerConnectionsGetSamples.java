// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for SubscriptionNetworkManagerConnections Get.
 */
public final class SubscriptionNetworkManagerConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkManagerConnectionSubscriptionGet.json
     */
    /**
     * Sample code: Get Subscription Network Manager Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSubscriptionNetworkManagerConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getSubscriptionNetworkManagerConnections()
            .getWithResponse("TestNMConnection", com.azure.core.util.Context.NONE);
    }
}
