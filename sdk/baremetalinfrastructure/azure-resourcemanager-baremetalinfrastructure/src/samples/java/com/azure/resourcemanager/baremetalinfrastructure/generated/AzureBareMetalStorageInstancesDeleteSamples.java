// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

/** Samples for AzureBareMetalStorageInstances Delete. */
public final class AzureBareMetalStorageInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/baremetalinfrastructure/resource-manager/Microsoft.BareMetalInfrastructure/preview/2023-08-04-preview/examples/AzureBareMetalStorageInstances_Delete.json
     */
    /**
     * Sample code: Delete an AzureBareMetalStorageInstance.
     *
     * @param manager Entry point to BareMetalInfrastructureManager.
     */
    public static void deleteAnAzureBareMetalStorageInstance(
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager) {
        manager
            .azureBareMetalStorageInstances()
            .deleteByResourceGroupWithResponse(
                "myResourceGroup", "myAzureBareMetalStorageInstance", com.azure.core.util.Context.NONE);
    }
}
