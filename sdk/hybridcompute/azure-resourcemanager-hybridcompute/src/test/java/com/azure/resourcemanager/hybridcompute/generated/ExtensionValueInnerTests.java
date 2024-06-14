// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.ExtensionValueInner;

public final class ExtensionValueInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtensionValueInner model = BinaryData.fromString(
            "{\"properties\":{\"version\":\"srfbjfdtwss\",\"extensionType\":\"ftpvjzbexil\",\"publisher\":\"nfqqnvwp\"},\"id\":\"taruoujmkcj\",\"name\":\"wqytjrybnwjewgdr\",\"type\":\"ervnaenqpehi\"}")
            .toObject(ExtensionValueInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtensionValueInner model = new ExtensionValueInner();
        model = BinaryData.fromObject(model).toObject(ExtensionValueInner.class);
    }
}
