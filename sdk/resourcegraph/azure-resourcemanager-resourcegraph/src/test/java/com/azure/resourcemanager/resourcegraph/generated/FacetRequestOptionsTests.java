// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcegraph.models.FacetRequestOptions;
import com.azure.resourcemanager.resourcegraph.models.FacetSortOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FacetRequestOptionsTests {
    @Test
    public void testDeserialize() {
        FacetRequestOptions model =
            BinaryData
                .fromString("{\"sortBy\":\"ufo\",\"sortOrder\":\"asc\",\"filter\":\"wifsq\",\"$top\":1701108276}")
                .toObject(FacetRequestOptions.class);
        Assertions.assertEquals("ufo", model.sortBy());
        Assertions.assertEquals(FacetSortOrder.ASC, model.sortOrder());
        Assertions.assertEquals("wifsq", model.filter());
        Assertions.assertEquals(1701108276, model.top());
    }

    @Test
    public void testSerialize() {
        FacetRequestOptions model =
            new FacetRequestOptions()
                .withSortBy("ufo")
                .withSortOrder(FacetSortOrder.ASC)
                .withFilter("wifsq")
                .withTop(1701108276);
        model = BinaryData.fromObject(model).toObject(FacetRequestOptions.class);
        Assertions.assertEquals("ufo", model.sortBy());
        Assertions.assertEquals(FacetSortOrder.ASC, model.sortOrder());
        Assertions.assertEquals("wifsq", model.filter());
        Assertions.assertEquals(1701108276, model.top());
    }
}
