// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ServiceEndpointPolicyDefinitions Delete. */
public final class ServiceEndpointPolicyDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/ServiceEndpointPolicyDefinitionDelete.json
     */
    /**
     * Sample code: Delete service endpoint policy definitions from service endpoint policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteServiceEndpointPolicyDefinitionsFromServiceEndpointPolicy(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceEndpointPolicyDefinitions()
            .delete("rg1", "testPolicy", "testDefinition", com.azure.core.util.Context.NONE);
    }
}
