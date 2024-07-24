// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

/**
 * Samples for DisasterRecoveryConfigs Get.
 */
public final class DisasterRecoveryConfigsGetSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/disasterRecoveryConfigs/
     * EHAliasGet.json
     */
    /**
     * Sample code: EHAliasGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void eHAliasGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getDisasterRecoveryConfigs()
            .getWithResponse("exampleResourceGroup", "sdk-Namespace-8859", "sdk-DisasterRecovery-3814",
                com.azure.core.util.Context.NONE);
    }
}
