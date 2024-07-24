// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.AccessRuleProperties;

public final class AccessRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessRuleProperties model
            = BinaryData.fromString("{\"direction\":\"Inbound\",\"addressPrefixes\":[\"fukuvsjcswsmystu\"]}")
                .toObject(AccessRuleProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessRuleProperties model = new AccessRuleProperties();
        model = BinaryData.fromObject(model).toObject(AccessRuleProperties.class);
    }
}
