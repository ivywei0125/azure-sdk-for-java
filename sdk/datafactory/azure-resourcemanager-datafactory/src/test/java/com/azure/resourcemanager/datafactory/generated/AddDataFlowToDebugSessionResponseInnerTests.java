// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AddDataFlowToDebugSessionResponseInner;
import org.junit.jupiter.api.Assertions;

public final class AddDataFlowToDebugSessionResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AddDataFlowToDebugSessionResponseInner model =
            BinaryData
                .fromString("{\"jobVersion\":\"fbcgwgcloxoebqin\"}")
                .toObject(AddDataFlowToDebugSessionResponseInner.class);
        Assertions.assertEquals("fbcgwgcloxoebqin", model.jobVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AddDataFlowToDebugSessionResponseInner model =
            new AddDataFlowToDebugSessionResponseInner().withJobVersion("fbcgwgcloxoebqin");
        model = BinaryData.fromObject(model).toObject(AddDataFlowToDebugSessionResponseInner.class);
        Assertions.assertEquals("fbcgwgcloxoebqin", model.jobVersion());
    }
}
