// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PipelineReferenceTests {
    @Test
    public void testDeserialize() {
        PipelineReference model =
            BinaryData
                .fromString("{\"referenceName\":\"gxxlxsffgcvizq\",\"name\":\"wlvwlyoupf\"}")
                .toObject(PipelineReference.class);
        Assertions.assertEquals("gxxlxsffgcvizq", model.referenceName());
        Assertions.assertEquals("wlvwlyoupf", model.name());
    }

    @Test
    public void testSerialize() {
        PipelineReference model = new PipelineReference().withReferenceName("gxxlxsffgcvizq").withName("wlvwlyoupf");
        model = BinaryData.fromObject(model).toObject(PipelineReference.class);
        Assertions.assertEquals("gxxlxsffgcvizq", model.referenceName());
        Assertions.assertEquals("wlvwlyoupf", model.name());
    }
}
