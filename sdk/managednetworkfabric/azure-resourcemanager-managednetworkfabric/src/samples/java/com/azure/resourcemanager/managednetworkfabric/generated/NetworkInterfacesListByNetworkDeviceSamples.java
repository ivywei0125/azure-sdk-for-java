// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkInterfaces ListByNetworkDevice. */
public final class NetworkInterfacesListByNetworkDeviceSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/NetworkInterfaces_ListByNetworkDevice_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkInterfaces_ListByNetworkDevice_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkInterfacesListByNetworkDeviceMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .networkInterfaces()
            .listByNetworkDevice("example-rg", "example-device", com.azure.core.util.Context.NONE);
    }
}
