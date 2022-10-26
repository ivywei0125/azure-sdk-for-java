// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OracleServiceCloudSource;
import org.junit.jupiter.api.Test;

public final class OracleServiceCloudSourceTests {
    @Test
    public void testDeserialize() {
        OracleServiceCloudSource model =
            BinaryData
                .fromString("{\"type\":\"OracleServiceCloudSource\",\"\":{}}")
                .toObject(OracleServiceCloudSource.class);
    }

    @Test
    public void testSerialize() {
        OracleServiceCloudSource model = new OracleServiceCloudSource();
        model = BinaryData.fromObject(model).toObject(OracleServiceCloudSource.class);
    }
}
