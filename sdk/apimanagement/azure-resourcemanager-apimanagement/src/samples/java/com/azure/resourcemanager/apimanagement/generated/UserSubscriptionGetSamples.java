// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for UserSubscription Get. */
public final class UserSubscriptionGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementGetUserSubscription.json
     */
    /**
     * Sample code: ApiManagementGetUserSubscription.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetUserSubscription(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .userSubscriptions()
            .getWithResponse("rg1", "apimService1", "1", "5fa9b096f3df14003c070001", com.azure.core.util.Context.NONE);
    }
}
