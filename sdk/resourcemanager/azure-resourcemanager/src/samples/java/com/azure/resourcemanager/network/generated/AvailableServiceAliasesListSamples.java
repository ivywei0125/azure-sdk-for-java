// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for AvailableServiceAliases List.
 */
public final class AvailableServiceAliasesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/AvailableServiceAliasesList.json
     */
    /**
     * Sample code: Get available service aliases.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableServiceAliases(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getAvailableServiceAliases()
            .list("westcentralus", com.azure.core.util.Context.NONE);
    }
}
