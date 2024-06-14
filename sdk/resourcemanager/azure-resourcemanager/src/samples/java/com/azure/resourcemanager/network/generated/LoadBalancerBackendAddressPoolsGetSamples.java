// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for LoadBalancerBackendAddressPools Get.
 */
public final class LoadBalancerBackendAddressPoolsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/LoadBalancerBackendAddressPoolGet.json
     */
    /**
     * Sample code: LoadBalancerBackendAddressPoolGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerBackendAddressPoolGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getLoadBalancerBackendAddressPools()
            .getWithResponse("testrg", "lb", "backend", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/LBBackendAddressPoolWithBackendAddressesGet.json
     */
    /**
     * Sample code: LoadBalancer with BackendAddressPool with BackendAddresses.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        loadBalancerWithBackendAddressPoolWithBackendAddresses(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getLoadBalancerBackendAddressPools()
            .getWithResponse("testrg", "lb", "backend", com.azure.core.util.Context.NONE);
    }
}
