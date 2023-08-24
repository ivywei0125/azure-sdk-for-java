// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for Snapshots GetByResourceGroup. */
public final class SnapshotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/snapshotExamples/Snapshot_GetIncrementalSnapshot.json
     */
    /**
     * Sample code: Get information about an incremental snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getInformationAboutAnIncrementalSnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myIncrementalSnapshot", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/snapshotExamples/Snapshot_Get.json
     */
    /**
     * Sample code: Get information about a snapshot.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getInformationAboutASnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE);
    }
}
