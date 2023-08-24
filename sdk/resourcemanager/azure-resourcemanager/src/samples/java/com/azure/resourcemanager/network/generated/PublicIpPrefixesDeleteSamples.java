// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for PublicIpPrefixes Delete. */
public final class PublicIpPrefixesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/PublicIpPrefixDelete.json
     */
    /**
     * Sample code: Delete public IP prefix.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletePublicIPPrefix(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpPrefixes()
            .delete("rg1", "test-ipprefix", com.azure.core.util.Context.NONE);
    }
}
