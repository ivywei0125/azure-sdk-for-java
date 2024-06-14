// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments ListWebWorkerUsages.
 */
public final class AppServiceEnvironmentsListWebWorkerUsagesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_ListWebWorkerUsages.json
     */
    /**
     * Sample code: Get usage metrics for a worker pool of an App Service Environment.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getUsageMetricsForAWorkerPoolOfAnAppServiceEnvironment(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .listWebWorkerUsages("test-rg", "test-ase", "0", com.azure.core.util.Context.NONE);
    }
}
