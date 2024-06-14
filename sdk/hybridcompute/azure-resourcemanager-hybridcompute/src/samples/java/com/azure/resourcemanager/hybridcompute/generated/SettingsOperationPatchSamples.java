// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.resourcemanager.hybridcompute.fluent.models.SettingsInner;

/**
 * Samples for SettingsOperation Patch.
 */
public final class SettingsOperationPatchSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/settings/SettingsPatch.json
     */
    /**
     * Sample code: NetworkConfigurationsPatch.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        networkConfigurationsPatch(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.settingsOperations()
            .patchWithResponse("hybridRG", "Microsoft.HybridCompute", "machines", "testMachine", "default",
                new SettingsInner().withGatewayResourceId(
                    "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/hybridRG/providers/Microsoft.HybridCompute/gateways/newGateway"),
                com.azure.core.util.Context.NONE);
    }
}
