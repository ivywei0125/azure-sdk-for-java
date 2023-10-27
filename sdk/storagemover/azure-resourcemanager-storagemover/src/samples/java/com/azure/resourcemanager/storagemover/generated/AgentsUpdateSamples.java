// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.resourcemanager.storagemover.models.Agent;

/** Samples for Agents Update. */
public final class AgentsUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-10-01/examples/Agents_Update.json
     */
    /**
     * Sample code: Agents_Update.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void agentsUpdate(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        Agent resource =
            manager
                .agents()
                .getWithResponse(
                    "examples-rg", "examples-storageMoverName", "examples-agentName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withDescription("Updated Agent Description").apply();
    }
}
