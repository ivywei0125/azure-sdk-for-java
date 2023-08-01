// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/** Samples for Application Get. */
public final class ApplicationGetSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/ApplicationGet.json
     */
    /**
     * Sample code: ApplicationGet.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void applicationGet(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .applications()
            .getWithResponse("default-azurebatch-japaneast", "sampleacct", "app1", com.azure.core.util.Context.NONE);
    }
}
