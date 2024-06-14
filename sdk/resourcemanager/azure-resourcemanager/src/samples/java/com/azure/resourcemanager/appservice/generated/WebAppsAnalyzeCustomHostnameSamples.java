// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps AnalyzeCustomHostname.
 */
public final class WebAppsAnalyzeCustomHostnameSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AnalyzeCustomHostName.json
     */
    /**
     * Sample code: Analyze custom hostname for webapp.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void analyzeCustomHostnameForWebapp(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .analyzeCustomHostnameWithResponse("testrg123", "sitef6141", null, com.azure.core.util.Context.NONE);
    }
}
