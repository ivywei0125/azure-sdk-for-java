// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites DetachUserProvidedFunctionAppFromStaticSite.
 */
public final class StaticSitesDetachUserProvidedFunctionAppFromStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DetachUserProvidedFunctionAppFromStaticSite.json
     */
    /**
     * Sample code: Detach the user provided function app from the static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        detachTheUserProvidedFunctionAppFromTheStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .detachUserProvidedFunctionAppFromStaticSiteWithResponse("rg", "testStaticSite0", "testFunctionApp",
                com.azure.core.util.Context.NONE);
    }
}
