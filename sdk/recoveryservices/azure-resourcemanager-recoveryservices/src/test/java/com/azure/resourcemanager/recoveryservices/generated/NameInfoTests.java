// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.NameInfo;
import org.junit.jupiter.api.Assertions;

public final class NameInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameInfo model = BinaryData.fromString("{\"value\":\"cjooxdjebwpucwwf\",\"localizedValue\":\"vbvmeu\"}")
            .toObject(NameInfo.class);
        Assertions.assertEquals("cjooxdjebwpucwwf", model.value());
        Assertions.assertEquals("vbvmeu", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameInfo model = new NameInfo().withValue("cjooxdjebwpucwwf").withLocalizedValue("vbvmeu");
        model = BinaryData.fromObject(model).toObject(NameInfo.class);
        Assertions.assertEquals("cjooxdjebwpucwwf", model.value());
        Assertions.assertEquals("vbvmeu", model.localizedValue());
    }
}
