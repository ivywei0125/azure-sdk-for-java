// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.models.UtilizationAggregates;

public final class UtilizationAggregatesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UtilizationAggregates model =
            BinaryData
                .fromString(
                    "{\"grain\":22.663057,\"grainUnit\":\"alhbx\",\"value\":0.35515428,\"valueUnit\":\"jzzvdud\"}")
                .toObject(UtilizationAggregates.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UtilizationAggregates model = new UtilizationAggregates();
        model = BinaryData.fromObject(model).toObject(UtilizationAggregates.class);
    }
}