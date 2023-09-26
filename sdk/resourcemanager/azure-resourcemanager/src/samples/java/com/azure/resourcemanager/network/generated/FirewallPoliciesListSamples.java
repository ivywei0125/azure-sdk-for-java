// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for FirewallPolicies List. */
public final class FirewallPoliciesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/FirewallPolicyListBySubscription.json
     */
    /**
     * Sample code: List all Firewall Policies for a given subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllFirewallPoliciesForAGivenSubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getFirewallPolicies().list(com.azure.core.util.Context.NONE);
    }
}
