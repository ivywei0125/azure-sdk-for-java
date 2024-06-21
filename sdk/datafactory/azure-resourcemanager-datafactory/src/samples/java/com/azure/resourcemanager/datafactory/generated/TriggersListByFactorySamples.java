// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for Triggers ListByFactory.
 */
public final class TriggersListByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * Triggers_ListByFactory.json
     */
    /**
     * Sample code: Triggers_ListByFactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void triggersListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.triggers()
            .listByFactory("exampleResourceGroup", "exampleFactoryName", com.azure.core.util.Context.NONE);
    }
}
