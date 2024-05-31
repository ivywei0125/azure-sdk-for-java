// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.QueryNetworkSiblingSetRequest;
import org.junit.jupiter.api.Assertions;

public final class QueryNetworkSiblingSetRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryNetworkSiblingSetRequest model
            = BinaryData.fromString("{\"networkSiblingSetId\":\"uujqgidokgjljyo\",\"subnetId\":\"gvcl\"}")
                .toObject(QueryNetworkSiblingSetRequest.class);
        Assertions.assertEquals("uujqgidokgjljyo", model.networkSiblingSetId());
        Assertions.assertEquals("gvcl", model.subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryNetworkSiblingSetRequest model
            = new QueryNetworkSiblingSetRequest().withNetworkSiblingSetId("uujqgidokgjljyo").withSubnetId("gvcl");
        model = BinaryData.fromObject(model).toObject(QueryNetworkSiblingSetRequest.class);
        Assertions.assertEquals("uujqgidokgjljyo", model.networkSiblingSetId());
        Assertions.assertEquals("gvcl", model.subnetId());
    }
}
