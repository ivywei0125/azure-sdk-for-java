// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for RestorePoints Get.
 */
public final class RestorePointsGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * restorePointExamples/RestorePoint_Get.json
     */
    /**
     * Sample code: Get a restore point.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getARestorePoint(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePoints()
            .getWithResponse("myResourceGroup", "rpcName", "rpName", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * restorePointExamples/RestorePoint_Get_WithInstanceView.json
     */
    /**
     * Sample code: Get restore point with instance view.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getRestorePointWithInstanceView(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePoints()
            .getWithResponse("myResourceGroup", "rpcName", "rpName", null, com.azure.core.util.Context.NONE);
    }
}
