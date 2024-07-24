// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/**
 * Samples for BackupInstances ResumeProtection.
 */
public final class BackupInstancesResumeProtectionSamples {
    /*
     * x-ms-original-file:
     * specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2024-04-01/examples/
     * BackupInstanceOperations/ResumeProtection.json
     */
    /**
     * Sample code: ResumeProtection.
     * 
     * @param manager Entry point to DataProtectionManager.
     */
    public static void resumeProtection(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances().resumeProtection("testrg", "testvault", "testbi", com.azure.core.util.Context.NONE);
    }
}
