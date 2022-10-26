// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ConnectedEnvironments GetByResourceGroup. */
public final class ConnectedEnvironmentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01-preview/examples/ConnectedEnvironments_Get.json
     */
    /**
     * Sample code: Get connected environment by connectedEnvironmentName.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getConnectedEnvironmentByConnectedEnvironmentName(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.connectedEnvironments().getByResourceGroupWithResponse("examplerg", "examplekenv", Context.NONE);
    }
}
