// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubRouteTableV2S List. */
public final class VirtualHubRouteTableV2SListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualHubRouteTableV2List.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2List(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubRouteTableV2S()
            .list("rg1", "virtualHub1", Context.NONE);
    }
}
