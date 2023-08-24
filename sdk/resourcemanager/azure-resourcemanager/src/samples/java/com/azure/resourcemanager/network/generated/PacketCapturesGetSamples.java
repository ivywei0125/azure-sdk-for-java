// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for PacketCaptures Get. */
public final class PacketCapturesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NetworkWatcherPacketCaptureGet.json
     */
    /**
     * Sample code: Get packet capture.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPacketCapture(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPacketCaptures()
            .getWithResponse("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
