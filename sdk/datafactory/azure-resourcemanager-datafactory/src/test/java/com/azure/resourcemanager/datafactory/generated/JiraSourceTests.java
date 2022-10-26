// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JiraSource;
import org.junit.jupiter.api.Test;

public final class JiraSourceTests {
    @Test
    public void testDeserialize() {
        JiraSource model = BinaryData.fromString("{\"type\":\"JiraSource\",\"\":{}}").toObject(JiraSource.class);
    }

    @Test
    public void testSerialize() {
        JiraSource model = new JiraSource();
        model = BinaryData.fromObject(model).toObject(JiraSource.class);
    }
}
