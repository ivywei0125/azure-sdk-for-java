// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.models.StaticSiteCustomDomainRequestPropertiesArmResource;

/**
 * Samples for StaticSites ValidateCustomDomainCanBeAddedToStaticSite.
 */
public final class StaticSitesValidateCustomDomainCanBeAddedToStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ValidateStaticSiteCustomDomain.json
     */
    /**
     * Sample code: Validate a custom domain for a static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void validateACustomDomainForAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .validateCustomDomainCanBeAddedToStaticSite("rg", "testStaticSite0", "custom.domain.net",
                new StaticSiteCustomDomainRequestPropertiesArmResource(), com.azure.core.util.Context.NONE);
    }
}
