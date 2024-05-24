// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.QuotaInner;
import org.junit.jupiter.api.Assertions;

public final class QuotaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaInner model = BinaryData.fromString(
            "{\"properties\":{\"unit\":\"ndlkzgxhurip\",\"currentValue\":4682291687998834787,\"limit\":5090164062241027652,\"name\":{\"value\":\"unkbebx\",\"localizedValue\":\"byyntwlrbqt\"}},\"id\":\"ievseotgqrllt\",\"name\":\"u\",\"type\":\"lauwzizxbmpgcjef\"}")
            .toObject(QuotaInner.class);
        Assertions.assertEquals("ndlkzgxhurip", model.properties().unit());
        Assertions.assertEquals(4682291687998834787L, model.properties().currentValue());
        Assertions.assertEquals(5090164062241027652L, model.properties().limit());
        Assertions.assertEquals("unkbebx", model.properties().name().value());
        Assertions.assertEquals("byyntwlrbqt", model.properties().name().localizedValue());
    }
}
