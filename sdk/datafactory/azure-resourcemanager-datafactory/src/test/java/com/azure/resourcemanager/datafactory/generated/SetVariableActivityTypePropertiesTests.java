// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SetVariableActivityTypeProperties;
import org.junit.jupiter.api.Assertions;

public final class SetVariableActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SetVariableActivityTypeProperties model =
            BinaryData
                .fromString("{\"variableName\":\"oa\",\"value\":\"dataaqfqgmwdo\",\"setSystemVariable\":true}")
                .toObject(SetVariableActivityTypeProperties.class);
        Assertions.assertEquals("oa", model.variableName());
        Assertions.assertEquals(true, model.setSystemVariable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SetVariableActivityTypeProperties model =
            new SetVariableActivityTypeProperties()
                .withVariableName("oa")
                .withValue("dataaqfqgmwdo")
                .withSetSystemVariable(true);
        model = BinaryData.fromObject(model).toObject(SetVariableActivityTypeProperties.class);
        Assertions.assertEquals("oa", model.variableName());
        Assertions.assertEquals(true, model.setSystemVariable());
    }
}
