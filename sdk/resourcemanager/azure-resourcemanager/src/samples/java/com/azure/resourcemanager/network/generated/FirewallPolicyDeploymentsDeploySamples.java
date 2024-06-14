// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for FirewallPolicyDeployments Deploy.
 */
public final class FirewallPolicyDeploymentsDeploySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/FirewallPolicyDraftDeploy.json
     */
    /**
     * Sample code: deploy firewall policy draft.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deployFirewallPolicyDraft(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyDeployments()
            .deploy("rg1", "firewallPolicy", com.azure.core.util.Context.NONE);
    }
}
