// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.DomainOwnershipIdentifierInner;

/**
 * Samples for Domains CreateOrUpdateOwnershipIdentifier.
 */
public final class DomainsCreateOrUpdateOwnershipIdentifierSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2023-12-01/examples/CreateAppServiceDomainOwnershipIdentifier.json
     */
    /**
     * Sample code: Create App Service Domain OwnershipIdentifier.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAppServiceDomainOwnershipIdentifier(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getDomains()
            .createOrUpdateOwnershipIdentifierWithResponse("testrg123", "example.com", "SampleOwnershipId",
                new DomainOwnershipIdentifierInner().withOwnershipId("SampleOwnershipId"),
                com.azure.core.util.Context.NONE);
    }
}
