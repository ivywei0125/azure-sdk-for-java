// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DataStore;
import org.junit.jupiter.api.Assertions;

public final class DataStoreTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataStore model =
            BinaryData
                .fromString(
                    "{\"symbolicName\":\"ogfuyzwvbhlim\",\"uuid\":\"qecroodl\",\"capacity\":\"cdrdaasaxxo\",\"freeSpace\":\"mfkwiyjvzuk\",\"type\":\"r\"}")
                .toObject(DataStore.class);
        Assertions.assertEquals("ogfuyzwvbhlim", model.symbolicName());
        Assertions.assertEquals("qecroodl", model.uuid());
        Assertions.assertEquals("cdrdaasaxxo", model.capacity());
        Assertions.assertEquals("mfkwiyjvzuk", model.freeSpace());
        Assertions.assertEquals("r", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataStore model =
            new DataStore()
                .withSymbolicName("ogfuyzwvbhlim")
                .withUuid("qecroodl")
                .withCapacity("cdrdaasaxxo")
                .withFreeSpace("mfkwiyjvzuk")
                .withType("r");
        model = BinaryData.fromObject(model).toObject(DataStore.class);
        Assertions.assertEquals("ogfuyzwvbhlim", model.symbolicName());
        Assertions.assertEquals("qecroodl", model.uuid());
        Assertions.assertEquals("cdrdaasaxxo", model.capacity());
        Assertions.assertEquals("mfkwiyjvzuk", model.freeSpace());
        Assertions.assertEquals("r", model.type());
    }
}
