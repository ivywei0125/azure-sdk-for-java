// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.DatabaseInner;
import org.junit.jupiter.api.Assertions;

public final class DatabaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseInner model = BinaryData.fromString(
            "{\"properties\":{\"charset\":\"mzidnsezcxtb\",\"collation\":\"gfycc\"},\"id\":\"ewmdw\",\"name\":\"jeiachboosfl\",\"type\":\"ro\"}")
            .toObject(DatabaseInner.class);
        Assertions.assertEquals("mzidnsezcxtb", model.charset());
        Assertions.assertEquals("gfycc", model.collation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseInner model = new DatabaseInner().withCharset("mzidnsezcxtb").withCollation("gfycc");
        model = BinaryData.fromObject(model).toObject(DatabaseInner.class);
        Assertions.assertEquals("mzidnsezcxtb", model.charset());
        Assertions.assertEquals("gfycc", model.collation());
    }
}
