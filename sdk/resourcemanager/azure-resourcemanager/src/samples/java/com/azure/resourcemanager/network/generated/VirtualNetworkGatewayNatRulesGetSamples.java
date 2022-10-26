// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayNatRules Get. */
public final class VirtualNetworkGatewayNatRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkGatewayNatRuleGet.json
     */
    /**
     * Sample code: VirtualNetworkGatewayNatRuleGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualNetworkGatewayNatRuleGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayNatRules()
            .getWithResponse("rg1", "gateway1", "natRule1", Context.NONE);
    }
}
