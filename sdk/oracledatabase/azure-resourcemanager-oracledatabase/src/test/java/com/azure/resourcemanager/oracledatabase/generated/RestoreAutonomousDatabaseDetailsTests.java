// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.RestoreAutonomousDatabaseDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RestoreAutonomousDatabaseDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreAutonomousDatabaseDetails model = BinaryData.fromString("{\"timestamp\":\"2021-08-19T13:48:58Z\"}")
            .toObject(RestoreAutonomousDatabaseDetails.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T13:48:58Z"), model.timestamp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreAutonomousDatabaseDetails model
            = new RestoreAutonomousDatabaseDetails().withTimestamp(OffsetDateTime.parse("2021-08-19T13:48:58Z"));
        model = BinaryData.fromObject(model).toObject(RestoreAutonomousDatabaseDetails.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T13:48:58Z"), model.timestamp());
    }
}
