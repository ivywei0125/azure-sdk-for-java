// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabFileFolderProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabFileFolderProtectedItemExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabFileFolderProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabFileFolderProtectedItem model = BinaryData.fromString(
            "{\"protectedItemType\":\"MabFileFolderProtectedItem\",\"friendlyName\":\"ddbhf\",\"computerName\":\"fpazjzoywjxhpd\",\"lastBackupStatus\":\"ontacnpq\",\"lastBackupTime\":\"2020-12-27T20:17:23Z\",\"protectionState\":\"tuevrh\",\"deferredDeleteSyncTimeInUTC\":9121446683075241927,\"extendedInfo\":{\"lastRefreshedAt\":\"2021-05-25T18:18:08Z\",\"oldestRecoveryPoint\":\"2021-07-14T10:16:46Z\",\"recoveryPointCount\":705670671},\"backupManagementType\":\"AzureWorkload\",\"workloadType\":\"AzureFileShare\",\"containerName\":\"wbsreur\",\"sourceResourceId\":\"kfuarenlv\",\"policyId\":\"tklnvnafvvkyfed\",\"lastRecoveryPoint\":\"2021-11-11T21:24:27Z\",\"backupSetName\":\"oslc\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-11-15T04:33:59Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"minqcym\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":true,\"resourceGuardOperationRequests\":[\"xxewu\",\"invudbch\",\"qdtvqecrqctmxx\"],\"isArchiveEnabled\":false,\"policyName\":\"mflhuytxzvtznapx\",\"softDeleteRetentionPeriodInDays\":1405354444,\"vaultId\":\"o\"}")
            .toObject(MabFileFolderProtectedItem.class);
        Assertions.assertEquals("wbsreur", model.containerName());
        Assertions.assertEquals("kfuarenlv", model.sourceResourceId());
        Assertions.assertEquals("tklnvnafvvkyfed", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T21:24:27Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("oslc", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-15T04:33:59Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("minqcym", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(true, model.isRehydrate());
        Assertions.assertEquals("xxewu", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("mflhuytxzvtznapx", model.policyName());
        Assertions.assertEquals(1405354444, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("ddbhf", model.friendlyName());
        Assertions.assertEquals("fpazjzoywjxhpd", model.computerName());
        Assertions.assertEquals("ontacnpq", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T20:17:23Z"), model.lastBackupTime());
        Assertions.assertEquals("tuevrh", model.protectionState());
        Assertions.assertEquals(9121446683075241927L, model.deferredDeleteSyncTimeInUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-25T18:18:08Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T10:16:46Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(705670671, model.extendedInfo().recoveryPointCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabFileFolderProtectedItem model = new MabFileFolderProtectedItem().withContainerName("wbsreur")
            .withSourceResourceId("kfuarenlv")
            .withPolicyId("tklnvnafvvkyfed")
            .withLastRecoveryPoint(OffsetDateTime.parse("2021-11-11T21:24:27Z"))
            .withBackupSetName("oslc")
            .withCreateMode(CreateMode.DEFAULT)
            .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-11-15T04:33:59Z"))
            .withIsScheduledForDeferredDelete(true)
            .withDeferredDeleteTimeRemaining("minqcym")
            .withIsDeferredDeleteScheduleUpcoming(true)
            .withIsRehydrate(true)
            .withResourceGuardOperationRequests(Arrays.asList("xxewu", "invudbch", "qdtvqecrqctmxx"))
            .withIsArchiveEnabled(false)
            .withPolicyName("mflhuytxzvtznapx")
            .withSoftDeleteRetentionPeriod(1405354444)
            .withFriendlyName("ddbhf")
            .withComputerName("fpazjzoywjxhpd")
            .withLastBackupStatus("ontacnpq")
            .withLastBackupTime(OffsetDateTime.parse("2020-12-27T20:17:23Z"))
            .withProtectionState("tuevrh")
            .withDeferredDeleteSyncTimeInUtc(9121446683075241927L)
            .withExtendedInfo(new MabFileFolderProtectedItemExtendedInfo()
                .withLastRefreshedAt(OffsetDateTime.parse("2021-05-25T18:18:08Z"))
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-07-14T10:16:46Z"))
                .withRecoveryPointCount(705670671));
        model = BinaryData.fromObject(model).toObject(MabFileFolderProtectedItem.class);
        Assertions.assertEquals("wbsreur", model.containerName());
        Assertions.assertEquals("kfuarenlv", model.sourceResourceId());
        Assertions.assertEquals("tklnvnafvvkyfed", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T21:24:27Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("oslc", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-15T04:33:59Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("minqcym", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(true, model.isRehydrate());
        Assertions.assertEquals("xxewu", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("mflhuytxzvtznapx", model.policyName());
        Assertions.assertEquals(1405354444, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("ddbhf", model.friendlyName());
        Assertions.assertEquals("fpazjzoywjxhpd", model.computerName());
        Assertions.assertEquals("ontacnpq", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T20:17:23Z"), model.lastBackupTime());
        Assertions.assertEquals("tuevrh", model.protectionState());
        Assertions.assertEquals(9121446683075241927L, model.deferredDeleteSyncTimeInUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-25T18:18:08Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T10:16:46Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(705670671, model.extendedInfo().recoveryPointCount());
    }
}
