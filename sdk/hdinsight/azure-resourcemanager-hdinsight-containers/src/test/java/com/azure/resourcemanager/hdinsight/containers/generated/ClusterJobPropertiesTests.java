// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterJobProperties;

public final class ClusterJobPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterJobProperties model =
            BinaryData.fromString("{\"jobType\":\"ClusterJobProperties\"}").toObject(ClusterJobProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterJobProperties model = new ClusterJobProperties();
        model = BinaryData.fromObject(model).toObject(ClusterJobProperties.class);
    }
}
