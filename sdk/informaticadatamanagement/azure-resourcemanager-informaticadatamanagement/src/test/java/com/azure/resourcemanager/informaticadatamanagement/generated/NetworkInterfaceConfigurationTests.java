// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.NetworkInterfaceConfiguration;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfaceConfiguration model = BinaryData
            .fromString(
                "{\"vnetId\":\"kghimdblxgwimfnj\",\"subnetId\":\"fjxwmsz\",\"vnetResourceGuid\":\"foqreyfkzik\"}")
            .toObject(NetworkInterfaceConfiguration.class);
        Assertions.assertEquals("kghimdblxgwimfnj", model.vnetId());
        Assertions.assertEquals("fjxwmsz", model.subnetId());
        Assertions.assertEquals("foqreyfkzik", model.vnetResourceGuid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfaceConfiguration model = new NetworkInterfaceConfiguration().withVnetId("kghimdblxgwimfnj")
            .withSubnetId("fjxwmsz")
            .withVnetResourceGuid("foqreyfkzik");
        model = BinaryData.fromObject(model).toObject(NetworkInterfaceConfiguration.class);
        Assertions.assertEquals("kghimdblxgwimfnj", model.vnetId());
        Assertions.assertEquals("fjxwmsz", model.subnetId());
        Assertions.assertEquals("foqreyfkzik", model.vnetResourceGuid());
    }
}
