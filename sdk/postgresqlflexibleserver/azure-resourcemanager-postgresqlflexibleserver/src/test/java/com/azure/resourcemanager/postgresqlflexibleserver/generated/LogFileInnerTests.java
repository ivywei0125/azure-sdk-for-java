// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LogFileInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LogFileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"createdTime\":\"2021-07-14T12:06:58Z\",\"lastModifiedTime\":\"2021-07-19T23:45:18Z\",\"sizeInKb\":4972928354083349711,\"type\":\"ss\",\"url\":\"bzmnvdfznud\"},\"id\":\"dvxzbncblylpst\",\"name\":\"bhhxsrzdzuc\",\"type\":\"rsc\"}")
                .toObject(LogFileInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T12:06:58Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T23:45:18Z"), model.lastModifiedTime());
        Assertions.assertEquals(4972928354083349711L, model.sizeInKb());
        Assertions.assertEquals("ss", model.typePropertiesType());
        Assertions.assertEquals("bzmnvdfznud", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileInner model =
            new LogFileInner()
                .withCreatedTime(OffsetDateTime.parse("2021-07-14T12:06:58Z"))
                .withLastModifiedTime(OffsetDateTime.parse("2021-07-19T23:45:18Z"))
                .withSizeInKb(4972928354083349711L)
                .withTypePropertiesType("ss")
                .withUrl("bzmnvdfznud");
        model = BinaryData.fromObject(model).toObject(LogFileInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-14T12:06:58Z"), model.createdTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-19T23:45:18Z"), model.lastModifiedTime());
        Assertions.assertEquals(4972928354083349711L, model.sizeInKb());
        Assertions.assertEquals("ss", model.typePropertiesType());
        Assertions.assertEquals("bzmnvdfznud", model.url());
    }
}
