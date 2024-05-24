// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupItemType;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabContainerExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabContainerExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabContainerExtendedInfo model = BinaryData.fromString(
            "{\"lastRefreshedAt\":\"2021-08-16T13:25:14Z\",\"backupItemType\":\"SAPHanaDatabase\",\"backupItems\":[\"hhhqxuwyv\",\"acoyvivbsizusjs\"],\"policyName\":\"bscm\",\"lastBackupStatus\":\"zijiufehgmv\"}")
            .toObject(MabContainerExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T13:25:14Z"), model.lastRefreshedAt());
        Assertions.assertEquals(BackupItemType.SAPHANA_DATABASE, model.backupItemType());
        Assertions.assertEquals("hhhqxuwyv", model.backupItems().get(0));
        Assertions.assertEquals("bscm", model.policyName());
        Assertions.assertEquals("zijiufehgmv", model.lastBackupStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabContainerExtendedInfo model
            = new MabContainerExtendedInfo().withLastRefreshedAt(OffsetDateTime.parse("2021-08-16T13:25:14Z"))
                .withBackupItemType(BackupItemType.SAPHANA_DATABASE)
                .withBackupItems(Arrays.asList("hhhqxuwyv", "acoyvivbsizusjs"))
                .withPolicyName("bscm")
                .withLastBackupStatus("zijiufehgmv");
        model = BinaryData.fromObject(model).toObject(MabContainerExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T13:25:14Z"), model.lastRefreshedAt());
        Assertions.assertEquals(BackupItemType.SAPHANA_DATABASE, model.backupItemType());
        Assertions.assertEquals("hhhqxuwyv", model.backupItems().get(0));
        Assertions.assertEquals("bscm", model.policyName());
        Assertions.assertEquals("zijiufehgmv", model.lastBackupStatus());
    }
}
