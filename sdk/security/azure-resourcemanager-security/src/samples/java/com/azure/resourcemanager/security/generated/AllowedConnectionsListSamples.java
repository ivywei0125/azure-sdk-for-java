// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for AllowedConnections List.
 */
public final class AllowedConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/AllowedConnections/
     * GetAllowedConnectionsSubscription_example.json
     */
    /**
     * Sample code: Get allowed connections on a subscription.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        getAllowedConnectionsOnASubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.allowedConnections().list(com.azure.core.util.Context.NONE);
    }
}
