// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanRPOperationInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticSanRPOperationInnerTests {
    @Test
    public void testDeserialize() {
        ElasticSanRPOperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"aagdfmg\",\"isDataAction\":false,\"display\":{\"provider\":\"j\",\"resource\":\"rifkwm\",\"operation\":\"vktsizntocipao\",\"description\":\"ajpsquc\"}}")
                .toObject(ElasticSanRPOperationInner.class);
        Assertions.assertEquals("aagdfmg", model.name());
    }

    @Test
    public void testSerialize() {
        ElasticSanRPOperationInner model = new ElasticSanRPOperationInner().withName("aagdfmg");
        model = BinaryData.fromObject(model).toObject(ElasticSanRPOperationInner.class);
        Assertions.assertEquals("aagdfmg", model.name());
    }
}
