// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisFolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SsisFolderTests {
    @Test
    public void testDeserialize() {
        SsisFolder model =
            BinaryData
                .fromString("{\"type\":\"Folder\",\"id\":177631911041831068,\"name\":\"bnoit\",\"description\":\"pz\"}")
                .toObject(SsisFolder.class);
        Assertions.assertEquals(177631911041831068L, model.id());
        Assertions.assertEquals("bnoit", model.name());
        Assertions.assertEquals("pz", model.description());
    }

    @Test
    public void testSerialize() {
        SsisFolder model = new SsisFolder().withId(177631911041831068L).withName("bnoit").withDescription("pz");
        model = BinaryData.fromObject(model).toObject(SsisFolder.class);
        Assertions.assertEquals(177631911041831068L, model.id());
        Assertions.assertEquals("bnoit", model.name());
        Assertions.assertEquals("pz", model.description());
    }
}
