// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for ManagementLocks ListByScope.
 */
public final class ManagementLocksListByScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2017-04-01/examples/ManagementLocks_ListAtScope.json
     */
    /**
     * Sample code: List management locks at scope.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagementLocksAtScope(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .listByScope("subscriptions/subscriptionId", null, com.azure.core.util.Context.NONE);
    }
}
