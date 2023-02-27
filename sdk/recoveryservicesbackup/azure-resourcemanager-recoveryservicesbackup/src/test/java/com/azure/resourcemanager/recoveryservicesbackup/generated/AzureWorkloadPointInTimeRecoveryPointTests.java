// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadPointInTimeRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.PointInTimeRange;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadPointInTimeRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadPointInTimeRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadPointInTimeRecoveryPoint\",\"timeRanges\":[{\"startTime\":\"2021-04-06T16:13:31Z\",\"endTime\":\"2021-07-04T04:35:49Z\"},{\"startTime\":\"2021-03-05T05:54Z\",\"endTime\":\"2021-08-10T14:37:01Z\"},{\"startTime\":\"2021-07-18T11:29:19Z\",\"endTime\":\"2021-04-12T08:03:04Z\"},{\"startTime\":\"2021-01-22T06:46:52Z\",\"endTime\":\"2021-10-13T14:11:45Z\"}],\"recoveryPointTimeInUTC\":\"2021-11-03T20:02:22Z\",\"type\":\"Full\",\"recoveryPointTierDetails\":[{\"type\":\"InstantRP\",\"status\":\"Valid\",\"extendedInfo\":{\"fzqlqhycavod\":\"ilcbtgnhnzeyqxtj\",\"nlrariaawiuagy\":\"gxdbeesmie\",\"ojocqwogf\":\"wqfbylyrfgiagt\",\"uxylfsbtkadpy\":\"zjvusfzldmo\"}},{\"type\":\"Invalid\",\"status\":\"Deleted\",\"extendedInfo\":{\"grjqctojcmi\":\"kb\",\"eypefojyqd\":\"of\",\"hlhzdsqtzbsrgno\":\"cuplcplcwkhih\"}},{\"type\":\"Invalid\",\"status\":\"Invalid\",\"extendedInfo\":{\"wotey\":\"vecactx\"}},{\"type\":\"ArchivedRP\",\"status\":\"Invalid\",\"extendedInfo\":{\"wifzmp\":\"vekqvgqo\",\"cvhrfsp\":\"wyivqikf\",\"kvyklxubyjaffmm\":\"uagrttikteusqc\"}}],\"recoveryPointMoveReadinessInfo\":{\"bgq\":{\"isReadyForMove\":true,\"additionalInfo\":\"u\"},\"metttwgd\":{\"isReadyForMove\":false,\"additionalInfo\":\"a\"},\"i\":{\"isReadyForMove\":true,\"additionalInfo\":\"ihhrmo\"},\"hyrpetogebjoxs\":{\"isReadyForMove\":true,\"additionalInfo\":\"ypxiutcxap\"}},\"recoveryPointProperties\":{\"expiryTime\":\"nhl\",\"ruleName\":\"rqnkkzjcjbtr\"}}")
                .toObject(AzureWorkloadPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-03T20:02:22Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions
            .assertEquals(
                "ilcbtgnhnzeyqxtj", model.recoveryPointTierDetails().get(0).extendedInfo().get("fzqlqhycavod"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("bgq").isReadyForMove());
        Assertions.assertEquals("u", model.recoveryPointMoveReadinessInfo().get("bgq").additionalInfo());
        Assertions.assertEquals("nhl", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("rqnkkzjcjbtr", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-06T16:13:31Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T04:35:49Z"), model.timeRanges().get(0).endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadPointInTimeRecoveryPoint model =
            new AzureWorkloadPointInTimeRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-11-03T20:02:22Z"))
                .withType(RestorePointType.FULL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INSTANT_RP)
                                .withStatus(RecoveryPointTierStatus.VALID)
                                .withExtendedInfo(
                                    mapOf(
                                        "fzqlqhycavod",
                                        "ilcbtgnhnzeyqxtj",
                                        "nlrariaawiuagy",
                                        "gxdbeesmie",
                                        "ojocqwogf",
                                        "wqfbylyrfgiagt",
                                        "uxylfsbtkadpy",
                                        "zjvusfzldmo")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(
                                    mapOf("grjqctojcmi", "kb", "eypefojyqd", "of", "hlhzdsqtzbsrgno", "cuplcplcwkhih")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.INVALID)
                                .withExtendedInfo(mapOf("wotey", "vecactx")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.INVALID)
                                .withExtendedInfo(
                                    mapOf(
                                        "wifzmp",
                                        "vekqvgqo",
                                        "cvhrfsp",
                                        "wyivqikf",
                                        "kvyklxubyjaffmm",
                                        "uagrttikteusqc"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "bgq",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("u"),
                        "metttwgd",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(false).withAdditionalInfo("a"),
                        "i",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("ihhrmo"),
                        "hyrpetogebjoxs",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("ypxiutcxap")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("nhl").withRuleName("rqnkkzjcjbtr"))
                .withTimeRanges(
                    Arrays
                        .asList(
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-04-06T16:13:31Z"))
                                .withEndTime(OffsetDateTime.parse("2021-07-04T04:35:49Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-03-05T05:54Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-10T14:37:01Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-07-18T11:29:19Z"))
                                .withEndTime(OffsetDateTime.parse("2021-04-12T08:03:04Z")),
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-01-22T06:46:52Z"))
                                .withEndTime(OffsetDateTime.parse("2021-10-13T14:11:45Z"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-03T20:02:22Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions
            .assertEquals(
                "ilcbtgnhnzeyqxtj", model.recoveryPointTierDetails().get(0).extendedInfo().get("fzqlqhycavod"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("bgq").isReadyForMove());
        Assertions.assertEquals("u", model.recoveryPointMoveReadinessInfo().get("bgq").additionalInfo());
        Assertions.assertEquals("nhl", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("rqnkkzjcjbtr", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-06T16:13:31Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T04:35:49Z"), model.timeRanges().get(0).endTime());
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
