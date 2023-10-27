// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/** Samples for ProtectionPolicyOperationStatuses Get. */
public final class ProtectionPolicyOperationStatusesGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/AzureIaasVm/ProtectionPolicyOperationStatuses_Get.json
     */
    /**
     * Sample code: Get Protection Policy Operation Status.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectionPolicyOperationStatus(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionPolicyOperationStatuses()
            .getWithResponse(
                "NetSDKTestRsVault",
                "SwaggerTestRg",
                "testPolicy1",
                "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
