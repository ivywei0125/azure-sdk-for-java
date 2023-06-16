// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

/** Samples for VNetPeering Delete. */
public final class VNetPeeringDeleteSamples {
    /*
     * x-ms-original-file: specification/databricks/resource-manager/Microsoft.Databricks/stable/2023-02-01/examples/WorkspaceVirtualNetworkPeeringDelete.json
     */
    /**
     * Sample code: Delete a workspace vNet Peering.
     *
     * @param manager Entry point to AzureDatabricksManager.
     */
    public static void deleteAWorkspaceVNetPeering(
        com.azure.resourcemanager.databricks.AzureDatabricksManager manager) {
        manager.vNetPeerings().delete("rg", "myWorkspace", "vNetPeering", com.azure.core.util.Context.NONE);
    }
}
