// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for SecurityRules List.
 */
public final class SecurityRulesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkSecurityGroupRuleList.json
     */
    /**
     * Sample code: List network security rules in network security group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listNetworkSecurityRulesInNetworkSecurityGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getSecurityRules()
            .list("rg1", "testnsg", com.azure.core.util.Context.NONE);
    }
}
