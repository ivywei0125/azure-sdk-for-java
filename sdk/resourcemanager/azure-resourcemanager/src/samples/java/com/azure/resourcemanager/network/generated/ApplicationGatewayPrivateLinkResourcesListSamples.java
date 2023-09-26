// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ApplicationGatewayPrivateLinkResources List. */
public final class ApplicationGatewayPrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/ApplicationGatewayPrivateLinkResourceList.json
     */
    /**
     * Sample code: Lists all private link resources on application gateway.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllPrivateLinkResourcesOnApplicationGateway(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationGatewayPrivateLinkResources()
            .list("rg1", "appgw", com.azure.core.util.Context.NONE);
    }
}
