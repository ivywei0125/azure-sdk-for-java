// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesParameters;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.hybridcompute.models.WindowsParameters;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for Machines InstallPatches.
 */
public final class MachinesInstallPatchesSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/machine/
     * Machine_InstallPatches.json
     */
    /**
     * Sample code: Install patch state of a machine.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        installPatchStateOfAMachine(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machines()
            .installPatches("myResourceGroupName", "myMachineName",
                new MachineInstallPatchesParameters().withMaximumDuration(Duration.parse("PT4H"))
                    .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                    .withWindowsParameters(new WindowsParameters()
                        .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationWindows.CRITICAL,
                            VMGuestPatchClassificationWindows.SECURITY))
                        .withMaxPatchPublishDate(OffsetDateTime.parse("2021-08-19T02:36:43.0539904+00:00"))),
                com.azure.core.util.Context.NONE);
    }
}
