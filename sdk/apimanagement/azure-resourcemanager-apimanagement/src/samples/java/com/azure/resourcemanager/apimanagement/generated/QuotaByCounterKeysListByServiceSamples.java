// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for QuotaByCounterKeys ListByService. */
public final class QuotaByCounterKeysListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementGetQuotaCounterKeys.json
     */
    /**
     * Sample code: ApiManagementGetQuotaCounterKeys.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetQuotaCounterKeys(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .quotaByCounterKeys()
            .listByServiceWithResponse("rg1", "apimService1", "ba", com.azure.core.util.Context.NONE);
    }
}
