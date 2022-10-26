// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DistcpSettings;
import com.azure.resourcemanager.datafactory.models.HdfsSource;
import org.junit.jupiter.api.Test;

public final class HdfsSourceTests {
    @Test
    public void testDeserialize() {
        HdfsSource model =
            BinaryData.fromString("{\"type\":\"HdfsSource\",\"distcpSettings\":{},\"\":{}}").toObject(HdfsSource.class);
    }

    @Test
    public void testSerialize() {
        HdfsSource model = new HdfsSource().withDistcpSettings(new DistcpSettings());
        model = BinaryData.fromObject(model).toObject(HdfsSource.class);
    }
}
