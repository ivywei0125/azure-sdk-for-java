// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuits GetStats.
 */
public final class ExpressRouteCircuitsGetStatsSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/ExpressRouteCircuitStats.json
     */
    /**
     * Sample code: Get ExpressRoute Circuit Traffic Stats.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getExpressRouteCircuitTrafficStats(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuits()
            .getStatsWithResponse("rg1", "circuitName", com.azure.core.util.Context.NONE);
    }
}
