// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.fluent.models.SnapshotInner;
import com.azure.resourcemanager.compute.models.CreationData;
import com.azure.resourcemanager.compute.models.DiskCreateOption;
import com.azure.resourcemanager.compute.models.ProvisionedBandwidthCopyOption;

/**
 * Samples for Snapshots CreateOrUpdate.
 */
public final class SnapshotsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_FromAnExistingSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot2", new SnapshotInner().withLocation("West US")
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                    .withSourceResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_FromAnElasticSanVolumeSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an elastic san volume snapshot.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createASnapshotFromAnElasticSanVolumeSnapshot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot", new SnapshotInner().withLocation("West US")
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_FROM_SAN_SNAPSHOT)
                    .withElasticSanResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.ElasticSan/elasticSans/myElasticSan/volumegroups/myElasticSanVolumeGroup/snapshots/myElasticSanVolumeSnapshot")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_EnhancedProvisionedBandwidthCopySpeed.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region with quicker copy speed.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegionWithQuickerCopySpeed(
            com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot2", new SnapshotInner().withLocation("West US")
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                    .withSourceResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1")
                    .withProvisionedBandwidthCopySpeed(ProvisionedBandwidthCopyOption.ENHANCED)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_FromAnExistingSnapshotInDifferentRegion.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegion(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot2", new SnapshotInner().withLocation("West US")
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                    .withSourceResourceId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_ByImportingAnUnmanagedBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from the same subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot1",
                new SnapshotInner().withLocation("West US")
                    .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                        .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-10-02/examples/snapshotExamples/
     * Snapshot_Create_ByImportingAnUnmanagedBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from a different subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSnapshots()
            .createOrUpdate("myResourceGroup", "mySnapshot1", new SnapshotInner().withLocation("West US")
                .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                    .withStorageAccountId(
                        "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                    .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")),
                com.azure.core.util.Context.NONE);
    }
}
