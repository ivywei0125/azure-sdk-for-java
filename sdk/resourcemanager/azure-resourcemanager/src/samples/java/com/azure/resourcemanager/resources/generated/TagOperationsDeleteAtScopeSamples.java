// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for TagOperations DeleteAtScope.
 */
public final class TagOperationsDeleteAtScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/DeleteTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .serviceClient()
            .getTagOperations()
            .deleteAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/DeleteTagsSubscription.json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateTagsOnASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .serviceClient()
            .getTagOperations()
            .deleteAtScope("subscriptions/00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
