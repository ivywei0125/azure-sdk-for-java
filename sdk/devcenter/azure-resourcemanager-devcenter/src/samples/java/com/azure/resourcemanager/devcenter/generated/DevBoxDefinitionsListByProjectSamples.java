// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for DevBoxDefinitions ListByProject. */
public final class DevBoxDefinitionsListByProjectSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2023-10-01-preview/examples/DevBoxDefinitions_ListByProject.json
     */
    /**
     * Sample code: DevBoxDefinitions_ListByProject.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void devBoxDefinitionsListByProject(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.devBoxDefinitions().listByProject("rg1", "ContosoProject", null, com.azure.core.util.Context.NONE);
    }
}
