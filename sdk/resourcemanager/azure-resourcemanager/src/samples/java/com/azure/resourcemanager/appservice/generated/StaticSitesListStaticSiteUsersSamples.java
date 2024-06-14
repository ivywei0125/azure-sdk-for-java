// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites ListStaticSiteUsers.
 */
public final class StaticSitesListStaticSiteUsersSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListStaticSiteUsers.json
     */
    /**
     * Sample code: List users for a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listUsersForAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteUsers("rg", "testStaticSite0", "all", com.azure.core.util.Context.NONE);
    }
}
