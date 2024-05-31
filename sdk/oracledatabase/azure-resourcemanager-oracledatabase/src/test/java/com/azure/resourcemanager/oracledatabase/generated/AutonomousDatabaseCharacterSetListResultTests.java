// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseCharacterSetInner;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseCharacterSetListResult;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseCharacterSetProperties;
import java.util.Arrays;

public final class AutonomousDatabaseCharacterSetListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutonomousDatabaseCharacterSetListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"characterSet\":\"wbiexzfey\"},\"id\":\"axibxujw\",\"name\":\"hqwa\",\"type\":\"muzyoxaepdk\"},{\"properties\":{\"characterSet\":\"ancuxrhd\"},\"id\":\"avxbniwdjswztsdb\",\"name\":\"gnxytxhpzxbz\",\"type\":\"fzab\"}],\"nextLink\":\"cuh\"}")
            .toObject(AutonomousDatabaseCharacterSetListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutonomousDatabaseCharacterSetListResult model
            = new AutonomousDatabaseCharacterSetListResult().withValue(Arrays.asList(
                new AutonomousDatabaseCharacterSetInner()
                    .withProperties(new AutonomousDatabaseCharacterSetProperties()),
                new AutonomousDatabaseCharacterSetInner()
                    .withProperties(new AutonomousDatabaseCharacterSetProperties())));
        model = BinaryData.fromObject(model).toObject(AutonomousDatabaseCharacterSetListResult.class);
    }
}
