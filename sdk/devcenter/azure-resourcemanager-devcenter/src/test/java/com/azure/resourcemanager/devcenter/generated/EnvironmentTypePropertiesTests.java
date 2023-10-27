// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentTypeProperties;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentTypeProperties model =
            BinaryData
                .fromString("{\"provisioningState\":\"Running\",\"displayName\":\"ucgygevqz\"}")
                .toObject(EnvironmentTypeProperties.class);
        Assertions.assertEquals("ucgygevqz", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentTypeProperties model = new EnvironmentTypeProperties().withDisplayName("ucgygevqz");
        model = BinaryData.fromObject(model).toObject(EnvironmentTypeProperties.class);
        Assertions.assertEquals("ucgygevqz", model.displayName());
    }
}
