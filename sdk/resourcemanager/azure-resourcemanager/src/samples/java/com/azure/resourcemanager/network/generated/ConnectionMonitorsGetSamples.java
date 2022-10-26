// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ConnectionMonitors Get. */
public final class ConnectionMonitorsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkWatcherConnectionMonitorGet.json
     */
    /**
     * Sample code: Get connection monitor.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getConnectionMonitor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getConnectionMonitors()
            .getWithResponse("rg1", "nw1", "cm1", Context.NONE);
    }
}
