// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSDiskDetails;
import org.junit.jupiter.api.Assertions;

public final class OSDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OSDiskDetails model =
            BinaryData
                .fromString("{\"osVhdId\":\"hrjqfyaytvslyek\",\"osType\":\"niuarlcjiwgsxfai\",\"vhdName\":\"wd\"}")
                .toObject(OSDiskDetails.class);
        Assertions.assertEquals("hrjqfyaytvslyek", model.osVhdId());
        Assertions.assertEquals("niuarlcjiwgsxfai", model.osType());
        Assertions.assertEquals("wd", model.vhdName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OSDiskDetails model =
            new OSDiskDetails().withOsVhdId("hrjqfyaytvslyek").withOsType("niuarlcjiwgsxfai").withVhdName("wd");
        model = BinaryData.fromObject(model).toObject(OSDiskDetails.class);
        Assertions.assertEquals("hrjqfyaytvslyek", model.osVhdId());
        Assertions.assertEquals("niuarlcjiwgsxfai", model.osType());
        Assertions.assertEquals("wd", model.vhdName());
    }
}
