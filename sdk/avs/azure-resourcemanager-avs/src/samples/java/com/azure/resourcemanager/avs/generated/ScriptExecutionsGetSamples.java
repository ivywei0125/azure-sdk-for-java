// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.Context;

/** Samples for ScriptExecutions Get. */
public final class ScriptExecutionsGetSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/ScriptExecutions_Get.json
     */
    /**
     * Sample code: ScriptExecutions_Get.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void scriptExecutionsGet(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.scriptExecutions().getWithResponse("group1", "cloud1", "addSsoServer", Context.NONE);
    }
}
