// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkSegmentProperties;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkSegmentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkSegmentProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"ynl\",\"connectedGateway\":\"huopxodlqiynto\",\"subnet\":{\"dhcpRanges\":[\"leosjswsrms\",\"yzrpzbchckqqzq\"],\"gatewayAddress\":\"xiy\"},\"portVif\":[{\"portName\":\"zynkedya\"},{\"portName\":\"wyhqmibzyhwits\"},{\"portName\":\"pyy\"},{\"portName\":\"cdpu\"}],\"status\":\"FAILURE\",\"provisioningState\":\"Succeeded\",\"revision\":359022541227333751}")
                .toObject(WorkloadNetworkSegmentProperties.class);
        Assertions.assertEquals("ynl", model.displayName());
        Assertions.assertEquals("huopxodlqiynto", model.connectedGateway());
        Assertions.assertEquals("leosjswsrms", model.subnet().dhcpRanges().get(0));
        Assertions.assertEquals("xiy", model.subnet().gatewayAddress());
        Assertions.assertEquals(359022541227333751L, model.revision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkSegmentProperties model =
            new WorkloadNetworkSegmentProperties()
                .withDisplayName("ynl")
                .withConnectedGateway("huopxodlqiynto")
                .withSubnet(
                    new WorkloadNetworkSegmentSubnet()
                        .withDhcpRanges(Arrays.asList("leosjswsrms", "yzrpzbchckqqzq"))
                        .withGatewayAddress("xiy"))
                .withRevision(359022541227333751L);
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkSegmentProperties.class);
        Assertions.assertEquals("ynl", model.displayName());
        Assertions.assertEquals("huopxodlqiynto", model.connectedGateway());
        Assertions.assertEquals("leosjswsrms", model.subnet().dhcpRanges().get(0));
        Assertions.assertEquals("xiy", model.subnet().gatewayAddress());
        Assertions.assertEquals(359022541227333751L, model.revision());
    }
}
