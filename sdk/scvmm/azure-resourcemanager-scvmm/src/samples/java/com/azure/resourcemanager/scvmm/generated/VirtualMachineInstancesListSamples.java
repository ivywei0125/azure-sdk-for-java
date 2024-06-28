// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

/**
 * Samples for VirtualMachineInstances List.
 */
public final class VirtualMachineInstancesListSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_List_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesListMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances().list("gtgclehcbsyave", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * VirtualMachineInstances_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineInstances_List_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void virtualMachineInstancesListMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachineInstances().list("gtgclehcbsyave", com.azure.core.util.Context.NONE);
    }
}
