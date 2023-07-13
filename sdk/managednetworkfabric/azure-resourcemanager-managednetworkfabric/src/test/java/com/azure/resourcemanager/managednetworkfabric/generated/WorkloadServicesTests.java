// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.WorkloadServices;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadServicesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadServices model =
            BinaryData
                .fromString(
                    "{\"ipv4AddressSpaces\":[\"zwiivwzjbhyzs\",\"jrkambtrnegvmnv\",\"q\",\"qvldspastjbkkd\"],\"ipv6AddressSpaces\":[\"vestmjl\"]}")
                .toObject(WorkloadServices.class);
        Assertions.assertEquals("zwiivwzjbhyzs", model.ipv4AddressSpaces().get(0));
        Assertions.assertEquals("vestmjl", model.ipv6AddressSpaces().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadServices model =
            new WorkloadServices()
                .withIpv4AddressSpaces(Arrays.asList("zwiivwzjbhyzs", "jrkambtrnegvmnv", "q", "qvldspastjbkkd"))
                .withIpv6AddressSpaces(Arrays.asList("vestmjl"));
        model = BinaryData.fromObject(model).toObject(WorkloadServices.class);
        Assertions.assertEquals("zwiivwzjbhyzs", model.ipv4AddressSpaces().get(0));
        Assertions.assertEquals("vestmjl", model.ipv6AddressSpaces().get(0));
    }
}
