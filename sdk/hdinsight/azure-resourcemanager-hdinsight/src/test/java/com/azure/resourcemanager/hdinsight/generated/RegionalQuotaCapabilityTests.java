// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.RegionalQuotaCapability;
import org.junit.jupiter.api.Assertions;

public final class RegionalQuotaCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionalQuotaCapability model =
            BinaryData
                .fromString(
                    "{\"regionName\":\"zlxwabmqoefkifr\",\"coresUsed\":6868317644582891875,\"coresAvailable\":6882751528428278733}")
                .toObject(RegionalQuotaCapability.class);
        Assertions.assertEquals("zlxwabmqoefkifr", model.regionName());
        Assertions.assertEquals(6868317644582891875L, model.coresUsed());
        Assertions.assertEquals(6882751528428278733L, model.coresAvailable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionalQuotaCapability model =
            new RegionalQuotaCapability()
                .withRegionName("zlxwabmqoefkifr")
                .withCoresUsed(6868317644582891875L)
                .withCoresAvailable(6882751528428278733L);
        model = BinaryData.fromObject(model).toObject(RegionalQuotaCapability.class);
        Assertions.assertEquals("zlxwabmqoefkifr", model.regionName());
        Assertions.assertEquals(6868317644582891875L, model.coresUsed());
        Assertions.assertEquals(6882751528428278733L, model.coresAvailable());
    }
}
