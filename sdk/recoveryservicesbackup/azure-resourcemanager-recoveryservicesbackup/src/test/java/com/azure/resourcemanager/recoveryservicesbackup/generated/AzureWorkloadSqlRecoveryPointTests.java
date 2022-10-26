// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSqlRecoveryPointTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSqlRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLRecoveryPoint\",\"extendedInfo\":{\"dataDirectoryTimeInUTC\":\"2021-01-15T12:49:43Z\",\"dataDirectoryPaths\":[{\"type\":\"Data\",\"path\":\"dxmeb\",\"logicalName\":\"scjpahlxv\"},{\"type\":\"Invalid\",\"path\":\"qxnmwmqt\",\"logicalName\":\"xyi\"},{\"type\":\"Log\",\"path\":\"vqcttadija\",\"logicalName\":\"kmr\"}]},\"recoveryPointTimeInUTC\":\"2021-09-17T14:17:20Z\",\"type\":\"Log\",\"recoveryPointTierDetails\":[{\"type\":\"ArchivedRP\",\"status\":\"Invalid\",\"extendedInfo\":{\"yxeb\":\"udqmeqwigpibudq\",\"tmhheioqa\":\"ybpmzznrtffyaq\"}},{\"type\":\"Invalid\",\"status\":\"Disabled\",\"extendedInfo\":{\"gql\":\"uqyrxpdl\",\"iosrsjuivfcdis\":\"ismjqfrddgamqu\",\"czexrxzbujrtrhqv\":\"irnxz\",\"zlrpiqywncvj\":\"revkhgnlnzo\"}},{\"type\":\"Invalid\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"k\":\"zehtdhgb\",\"zmlovuanash\":\"reljeamur\",\"erbdk\":\"xlpm\"}}],\"recoveryPointMoveReadinessInfo\":{\"w\":{\"isReadyForMove\":false,\"additionalInfo\":\"zozsdbccxjmonfdg\"},\"qjctzenkeif\":{\"isReadyForMove\":true,\"additionalInfo\":\"uuwwltv\"},\"gsrboldforobw\":{\"isReadyForMove\":true,\"additionalInfo\":\"kdasvflyhbxcudch\"}}}")
                .toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-17T14:17:20Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.LOG, model.type());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.INVALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("udqmeqwigpibudq", model.recoveryPointTierDetails().get(0).extendedInfo().get("yxeb"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("w").isReadyForMove());
        Assertions.assertEquals("zozsdbccxjmonfdg", model.recoveryPointMoveReadinessInfo().get("w").additionalInfo());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-15T12:49:43Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("dxmeb", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("scjpahlxv", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSqlRecoveryPoint model =
            new AzureWorkloadSqlRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-09-17T14:17:20Z"))
                .withType(RestorePointType.LOG)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.INVALID)
                                .withExtendedInfo(mapOf("yxeb", "udqmeqwigpibudq", "tmhheioqa", "ybpmzznrtffyaq")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.DISABLED)
                                .withExtendedInfo(
                                    mapOf(
                                        "gql",
                                        "uqyrxpdl",
                                        "iosrsjuivfcdis",
                                        "ismjqfrddgamqu",
                                        "czexrxzbujrtrhqv",
                                        "irnxz",
                                        "zlrpiqywncvj",
                                        "revkhgnlnzo")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                                .withExtendedInfo(mapOf("k", "zehtdhgb", "zmlovuanash", "reljeamur", "erbdk", "xlpm"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "w",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(false)
                            .withAdditionalInfo("zozsdbccxjmonfdg"),
                        "qjctzenkeif",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("uuwwltv"),
                        "gsrboldforobw",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(true)
                            .withAdditionalInfo("kdasvflyhbxcudch")))
                .withExtendedInfo(
                    new AzureWorkloadSqlRecoveryPointExtendedInfo()
                        .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-01-15T12:49:43Z"))
                        .withDataDirectoryPaths(
                            Arrays
                                .asList(
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.DATA)
                                        .withPath("dxmeb")
                                        .withLogicalName("scjpahlxv"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.INVALID)
                                        .withPath("qxnmwmqt")
                                        .withLogicalName("xyi"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.LOG)
                                        .withPath("vqcttadija")
                                        .withLogicalName("kmr"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-17T14:17:20Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.LOG, model.type());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.INVALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("udqmeqwigpibudq", model.recoveryPointTierDetails().get(0).extendedInfo().get("yxeb"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("w").isReadyForMove());
        Assertions.assertEquals("zozsdbccxjmonfdg", model.recoveryPointMoveReadinessInfo().get("w").additionalInfo());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-15T12:49:43Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("dxmeb", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("scjpahlxv", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
