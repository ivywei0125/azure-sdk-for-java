// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnGateways Reset.
 */
public final class VpnGatewaysResetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VpnGatewayReset.json
     */
    /**
     * Sample code: ResetVpnGateway.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetVpnGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnGateways()
            .reset("rg1", "vpngw", null, com.azure.core.util.Context.NONE);
    }
}
