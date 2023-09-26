// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for Gateway GetEntityTag. */
public final class GatewayGetEntityTagSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementHeadGateway.json
     */
    /**
     * Sample code: ApiManagementHeadGateway.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadGateway(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .gateways()
            .getEntityTagWithResponse("rg1", "apimService1", "mygateway", com.azure.core.util.Context.NONE);
    }
}
