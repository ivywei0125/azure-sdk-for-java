// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareProtectionPolicy model = BinaryData.fromString(
            "{\"backupManagementType\":\"AzureStorage\",\"workLoadType\":\"Client\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"vaultRetentionPolicy\":{\"vaultRetention\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"snapshotRetentionInDays\":211422779},\"timeZone\":\"tiewdj\",\"protectedItemsCount\":231543850,\"resourceGuardOperationRequests\":[\"wr\",\"ehwagoh\",\"uffkmrqemvvh\"]}")
            .toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(231543850, model.protectedItemsCount());
        Assertions.assertEquals("wr", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.CLIENT, model.workLoadType());
        Assertions.assertEquals(211422779, model.vaultRetentionPolicy().snapshotRetentionInDays());
        Assertions.assertEquals("tiewdj", model.timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareProtectionPolicy model = new AzureFileShareProtectionPolicy().withProtectedItemsCount(231543850)
            .withResourceGuardOperationRequests(Arrays.asList("wr", "ehwagoh", "uffkmrqemvvh"))
            .withWorkLoadType(WorkloadType.CLIENT)
            .withSchedulePolicy(new SchedulePolicy())
            .withRetentionPolicy(new RetentionPolicy())
            .withVaultRetentionPolicy(new VaultRetentionPolicy().withVaultRetention(new RetentionPolicy())
                .withSnapshotRetentionInDays(211422779))
            .withTimeZone("tiewdj");
        model = BinaryData.fromObject(model).toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(231543850, model.protectedItemsCount());
        Assertions.assertEquals("wr", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.CLIENT, model.workLoadType());
        Assertions.assertEquals(211422779, model.vaultRetentionPolicy().snapshotRetentionInDays());
        Assertions.assertEquals("tiewdj", model.timeZone());
    }
}
