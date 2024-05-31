// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeInfoInner;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeInfoInner model = BinaryData.fromString(
            "{\"properties\":{\"path\":\"ftul\",\"size\":9148960841724922095,\"parentPath\":\"ceamtm\",\"provisioningState\":\"u\"},\"id\":\"ejwcwwqiok\",\"name\":\"ssxmojms\",\"type\":\"p\"}")
            .toObject(SubvolumeInfoInner.class);
        Assertions.assertEquals("ftul", model.path());
        Assertions.assertEquals(9148960841724922095L, model.size());
        Assertions.assertEquals("ceamtm", model.parentPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeInfoInner model
            = new SubvolumeInfoInner().withPath("ftul").withSize(9148960841724922095L).withParentPath("ceamtm");
        model = BinaryData.fromObject(model).toObject(SubvolumeInfoInner.class);
        Assertions.assertEquals("ftul", model.path());
        Assertions.assertEquals(9148960841724922095L, model.size());
        Assertions.assertEquals("ceamtm", model.parentPath());
    }
}
