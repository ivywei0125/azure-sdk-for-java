// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachines Restart.
 */
public final class VirtualMachinesRestartSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineExamples/VirtualMachine_Restart_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_Restart_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineRestartMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .restart("rgcompute", "aaa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineExamples/VirtualMachine_Restart_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachine_Restart_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachineRestartMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .restart("rgcompute", "aaaaaaaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }
}
