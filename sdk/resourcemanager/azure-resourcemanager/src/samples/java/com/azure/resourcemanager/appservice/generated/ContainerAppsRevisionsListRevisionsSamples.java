// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for ContainerAppsRevisions ListRevisions.
 */
public final class ContainerAppsRevisionsListRevisionsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListRevisions.json
     */
    /**
     * Sample code: List Container App's revisions.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listContainerAppSRevisions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getContainerAppsRevisions()
            .listRevisions("rg", "testcontainerApp0", com.azure.core.util.Context.NONE);
    }
}
