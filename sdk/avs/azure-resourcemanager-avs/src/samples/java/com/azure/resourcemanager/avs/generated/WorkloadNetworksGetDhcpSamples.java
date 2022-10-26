// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks GetDhcp. */
public final class WorkloadNetworksGetDhcpSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/WorkloadNetworks_GetDhcpConfigurations.json
     */
    /**
     * Sample code: WorkloadNetworks_GetDhcp.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksGetDhcp(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().getDhcpWithResponse("group1", "dhcp1", "cloud1", Context.NONE);
    }
}
