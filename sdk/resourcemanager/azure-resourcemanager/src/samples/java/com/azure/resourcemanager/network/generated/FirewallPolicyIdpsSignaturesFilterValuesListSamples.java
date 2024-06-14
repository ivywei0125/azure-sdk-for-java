// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.SignatureOverridesFilterValuesQuery;

/**
 * Samples for FirewallPolicyIdpsSignaturesFilterValues List.
 */
public final class FirewallPolicyIdpsSignaturesFilterValuesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/FirewallPolicyQuerySignatureOverridesFilterValues.json
     */
    /**
     * Sample code: query signature overrides.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void querySignatureOverrides(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyIdpsSignaturesFilterValues()
            .listWithResponse("rg1", "firewallPolicy",
                new SignatureOverridesFilterValuesQuery().withFilterName("severity"), com.azure.core.util.Context.NONE);
    }
}
