// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for AttachedDataNetworks ListByPacketCoreDataPlane.
 */
public final class AttachedDataNetworksListByPacketCoreDataPlaneSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/AttachedDataNetworkListByPacketCoreDataPlane.json
     */
    /**
     * Sample code: List attached data networks in a data plane.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void
        listAttachedDataNetworksInADataPlane(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.attachedDataNetworks()
            .listByPacketCoreDataPlane("rg1", "TestPacketCoreCP", "TestPacketCoreDP", com.azure.core.util.Context.NONE);
    }
}
