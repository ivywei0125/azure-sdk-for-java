// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import org.junit.jupiter.api.Assertions;

public final class DatabaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseInner model =
            BinaryData
                .fromString(
                    "{\"kind\":\"Database\",\"location\":\"nkww\",\"id\":\"pp\",\"name\":\"flcxoga\",\"type\":\"konzmnsik\"}")
                .toObject(DatabaseInner.class);
        Assertions.assertEquals("nkww", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseInner model = new DatabaseInner().withLocation("nkww");
        model = BinaryData.fromObject(model).toObject(DatabaseInner.class);
        Assertions.assertEquals("nkww", model.location());
    }
}
