// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugCommandResponseInner;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugCommandResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugCommandResponseInner model =
            BinaryData
                .fromString("{\"status\":\"snewmozqvbub\",\"data\":\"amhsycxhxzgazt\"}")
                .toObject(DataFlowDebugCommandResponseInner.class);
        Assertions.assertEquals("snewmozqvbub", model.status());
        Assertions.assertEquals("amhsycxhxzgazt", model.data());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugCommandResponseInner model =
            new DataFlowDebugCommandResponseInner().withStatus("snewmozqvbub").withData("amhsycxhxzgazt");
        model = BinaryData.fromObject(model).toObject(DataFlowDebugCommandResponseInner.class);
        Assertions.assertEquals("snewmozqvbub", model.status());
        Assertions.assertEquals("amhsycxhxzgazt", model.data());
    }
}
