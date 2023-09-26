// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmUpdateContainerMappingInput;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmUpdateContainerMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmUpdateContainerMappingInput model =
            BinaryData
                .fromString("{\"instanceType\":\"InMageRcm\",\"enableAgentAutoUpgrade\":\"ulbl\"}")
                .toObject(InMageRcmUpdateContainerMappingInput.class);
        Assertions.assertEquals("ulbl", model.enableAgentAutoUpgrade());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmUpdateContainerMappingInput model =
            new InMageRcmUpdateContainerMappingInput().withEnableAgentAutoUpgrade("ulbl");
        model = BinaryData.fromObject(model).toObject(InMageRcmUpdateContainerMappingInput.class);
        Assertions.assertEquals("ulbl", model.enableAgentAutoUpgrade());
    }
}
