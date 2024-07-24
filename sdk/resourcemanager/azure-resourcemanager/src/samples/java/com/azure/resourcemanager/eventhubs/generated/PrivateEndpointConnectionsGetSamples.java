// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/NameSpaces/
     * PrivateEndPointConnectionGet.json
     */
    /**
     * Sample code: NameSpacePrivateEndPointConnectionGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpacePrivateEndPointConnectionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .getWithResponse("SDK-EventHub-4794", "sdk-Namespace-5828", "privateEndpointConnectionName",
                com.azure.core.util.Context.NONE);
    }
}
