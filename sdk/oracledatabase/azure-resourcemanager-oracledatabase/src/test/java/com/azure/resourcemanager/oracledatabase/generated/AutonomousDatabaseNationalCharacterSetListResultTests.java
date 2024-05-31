// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseNationalCharacterSetInner;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseNationalCharacterSetListResult;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseNationalCharacterSetProperties;
import java.util.Arrays;

public final class AutonomousDatabaseNationalCharacterSetListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutonomousDatabaseNationalCharacterSetListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"characterSet\":\"jzkdeslpvlopwi\"},\"id\":\"ghxpkdw\",\"name\":\"baiuebbaumny\",\"type\":\"upedeojnabckhs\"},{\"properties\":{\"characterSet\":\"xpsiebtfhvpes\"},\"id\":\"skrdqmhjj\",\"name\":\"htldwk\",\"type\":\"zxuutkncwscwsvl\"},{\"properties\":{\"characterSet\":\"togt\"},\"id\":\"upqsx\",\"name\":\"nmic\",\"type\":\"kvceoveilovnotyf\"},{\"properties\":{\"characterSet\":\"cnjbkcnxdhbt\"},\"id\":\"phywpnvj\",\"name\":\"oqnermclfpl\",\"type\":\"hoxus\"}],\"nextLink\":\"pabgyeps\"}")
            .toObject(AutonomousDatabaseNationalCharacterSetListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutonomousDatabaseNationalCharacterSetListResult model
            = new AutonomousDatabaseNationalCharacterSetListResult().withValue(Arrays.asList(
                new AutonomousDatabaseNationalCharacterSetInner()
                    .withProperties(new AutonomousDatabaseNationalCharacterSetProperties()),
                new AutonomousDatabaseNationalCharacterSetInner()
                    .withProperties(new AutonomousDatabaseNationalCharacterSetProperties()),
                new AutonomousDatabaseNationalCharacterSetInner()
                    .withProperties(new AutonomousDatabaseNationalCharacterSetProperties()),
                new AutonomousDatabaseNationalCharacterSetInner()
                    .withProperties(new AutonomousDatabaseNationalCharacterSetProperties())));
        model = BinaryData.fromObject(model).toObject(AutonomousDatabaseNationalCharacterSetListResult.class);
    }
}
