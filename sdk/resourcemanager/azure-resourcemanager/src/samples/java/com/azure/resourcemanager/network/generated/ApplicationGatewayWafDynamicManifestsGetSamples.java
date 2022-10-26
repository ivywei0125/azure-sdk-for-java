// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayWafDynamicManifests Get. */
public final class ApplicationGatewayWafDynamicManifestsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/GetApplicationGatewayWafDynamicManifests.json
     */
    /**
     * Sample code: Gets WAF manifests.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsWAFManifests(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationGatewayWafDynamicManifests()
            .get("westus", Context.NONE);
    }
}
