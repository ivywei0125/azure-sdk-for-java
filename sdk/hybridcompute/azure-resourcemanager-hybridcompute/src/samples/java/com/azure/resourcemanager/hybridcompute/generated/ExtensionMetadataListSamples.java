// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for ExtensionMetadata List.
 */
public final class ExtensionMetadataListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/
     * extension/ExtensionMetadata_List.json
     */
    /**
     * Sample code: GET a list of extensions.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void gETAListOfExtensions(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.extensionMetadatas()
            .list("EastUS", "microsoft.azure.monitor", "azuremonitorlinuxagent", com.azure.core.util.Context.NONE);
    }
}
