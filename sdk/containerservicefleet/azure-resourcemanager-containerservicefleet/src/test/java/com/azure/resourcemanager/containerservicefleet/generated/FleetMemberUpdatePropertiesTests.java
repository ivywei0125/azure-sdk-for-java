// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.FleetMemberUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class FleetMemberUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetMemberUpdateProperties model =
            BinaryData.fromString("{\"group\":\"rujqg\"}").toObject(FleetMemberUpdateProperties.class);
        Assertions.assertEquals("rujqg", model.group());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetMemberUpdateProperties model = new FleetMemberUpdateProperties().withGroup("rujqg");
        model = BinaryData.fromObject(model).toObject(FleetMemberUpdateProperties.class);
        Assertions.assertEquals("rujqg", model.group());
    }
}
