// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DbIormConfig;
import org.junit.jupiter.api.Assertions;

public final class DbIormConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbIormConfig model
            = BinaryData.fromString("{\"dbName\":\"cmnyyazttb\",\"flashCacheLimit\":\"wrqpue\",\"share\":2070417133}")
                .toObject(DbIormConfig.class);
        Assertions.assertEquals("cmnyyazttb", model.dbName());
        Assertions.assertEquals("wrqpue", model.flashCacheLimit());
        Assertions.assertEquals(2070417133, model.share());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbIormConfig model
            = new DbIormConfig().withDbName("cmnyyazttb").withFlashCacheLimit("wrqpue").withShare(2070417133);
        model = BinaryData.fromObject(model).toObject(DbIormConfig.class);
        Assertions.assertEquals("cmnyyazttb", model.dbName());
        Assertions.assertEquals("wrqpue", model.flashCacheLimit());
        Assertions.assertEquals(2070417133, model.share());
    }
}
