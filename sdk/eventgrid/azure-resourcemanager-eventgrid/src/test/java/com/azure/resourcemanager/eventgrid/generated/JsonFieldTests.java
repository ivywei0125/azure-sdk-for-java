// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.JsonField;
import org.junit.jupiter.api.Assertions;

public final class JsonFieldTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonField model = BinaryData.fromString("{\"sourceField\":\"rsqftib\"}").toObject(JsonField.class);
        Assertions.assertEquals("rsqftib", model.sourceField());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonField model = new JsonField().withSourceField("rsqftib");
        model = BinaryData.fromObject(model).toObject(JsonField.class);
        Assertions.assertEquals("rsqftib", model.sourceField());
    }
}
