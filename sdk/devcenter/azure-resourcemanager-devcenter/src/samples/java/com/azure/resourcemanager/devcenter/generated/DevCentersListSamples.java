// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for DevCenters List. */
public final class DevCentersListSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/DevCenters_ListBySubscription.json
     */
    /**
     * Sample code: DevCenters_ListBySubscription.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void devCentersListBySubscription(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.devCenters().list(null, Context.NONE);
    }
}
