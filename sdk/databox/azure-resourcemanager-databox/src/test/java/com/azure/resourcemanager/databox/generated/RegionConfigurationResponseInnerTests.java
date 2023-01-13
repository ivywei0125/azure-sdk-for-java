// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.fluent.models.RegionConfigurationResponseInner;

public final class RegionConfigurationResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionConfigurationResponseInner model =
            BinaryData
                .fromString(
                    "{\"scheduleAvailabilityResponse\":{\"availableDates\":[\"2021-06-11T21:37:26Z\",\"2021-05-01T01:26:28Z\"]},\"transportAvailabilityResponse\":{\"transportAvailabilityDetails\":[{\"shipmentType\":\"CustomerManaged\"},{\"shipmentType\":\"CustomerManaged\"},{\"shipmentType\":\"CustomerManaged\"},{\"shipmentType\":\"CustomerManaged\"}]}}")
                .toObject(RegionConfigurationResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionConfigurationResponseInner model = new RegionConfigurationResponseInner();
        model = BinaryData.fromObject(model).toObject(RegionConfigurationResponseInner.class);
    }
}