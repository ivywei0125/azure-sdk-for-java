// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Volumes ResetCifsPassword.
 */
public final class VolumesResetCifsPasswordSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Volumes_ResetCifsPassword.json
     */
    /**
     * Sample code: Volumes_ResetCifsPassword.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesResetCifsPassword(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().resetCifsPassword("myRG", "account1", "pool1", "volume1", com.azure.core.util.Context.NONE);
    }
}
