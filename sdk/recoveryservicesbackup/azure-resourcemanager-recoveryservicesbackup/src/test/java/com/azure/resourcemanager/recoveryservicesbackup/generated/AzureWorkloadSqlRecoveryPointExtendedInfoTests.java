// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSqlRecoveryPointExtendedInfoTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSqlRecoveryPointExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"dataDirectoryTimeInUTC\":\"2021-05-11T16:50:17Z\",\"dataDirectoryPaths\":[{\"type\":\"Data\",\"path\":\"fovvacqpbtuodxes\",\"logicalName\":\"bbelawumuaslzk\"},{\"type\":\"Log\",\"path\":\"oycqucwy\",\"logicalName\":\"hnomdrkywuh\"},{\"type\":\"Data\",\"path\":\"uurutlwexxwlalni\",\"logicalName\":\"zsrzpgepq\"}]}")
                .toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T16:50:17Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("fovvacqpbtuodxes", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("bbelawumuaslzk", model.dataDirectoryPaths().get(0).logicalName());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSqlRecoveryPointExtendedInfo model =
            new AzureWorkloadSqlRecoveryPointExtendedInfo()
                .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-05-11T16:50:17Z"))
                .withDataDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.DATA)
                                .withPath("fovvacqpbtuodxes")
                                .withLogicalName("bbelawumuaslzk"),
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.LOG)
                                .withPath("oycqucwy")
                                .withLogicalName("hnomdrkywuh"),
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.DATA)
                                .withPath("uurutlwexxwlalni")
                                .withLogicalName("zsrzpgepq")));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T16:50:17Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("fovvacqpbtuodxes", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("bbelawumuaslzk", model.dataDirectoryPaths().get(0).logicalName());
    }
}
