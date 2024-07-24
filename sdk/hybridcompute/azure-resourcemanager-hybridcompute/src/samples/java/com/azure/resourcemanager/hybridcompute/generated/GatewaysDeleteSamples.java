// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Gateways Delete.
 */
public final class GatewaysDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/gateway/
     * Gateway_Delete.json
     */
    /**
     * Sample code: Delete a Gateway.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void deleteAGateway(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.gateways().delete("myResourceGroup", "{gatewayName}", com.azure.core.util.Context.NONE);
    }
}
