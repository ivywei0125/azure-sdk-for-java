// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NatGateways Delete. */
public final class NatGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/NatGatewayDelete.json
     */
    /**
     * Sample code: Delete nat gateway.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteNatGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNatGateways()
            .delete("rg1", "test-natGateway", com.azure.core.util.Context.NONE);
    }
}
