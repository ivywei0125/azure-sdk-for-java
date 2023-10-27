// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for Applications Delete. */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2023-09-05/examples/Application_Delete.json
     */
    /**
     * Sample code: Application_Delete.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .applications()
            .deleteWithResponse(
                "resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE);
    }
}
