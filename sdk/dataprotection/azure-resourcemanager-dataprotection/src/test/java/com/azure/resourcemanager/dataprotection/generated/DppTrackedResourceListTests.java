// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppTrackedResourceList;
import org.junit.jupiter.api.Assertions;

public final class DppTrackedResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppTrackedResourceList model =
            BinaryData.fromString("{\"nextLink\":\"azxkhnzbonlwnto\"}").toObject(DppTrackedResourceList.class);
        Assertions.assertEquals("azxkhnzbonlwnto", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppTrackedResourceList model = new DppTrackedResourceList().withNextLink("azxkhnzbonlwnto");
        model = BinaryData.fromObject(model).toObject(DppTrackedResourceList.class);
        Assertions.assertEquals("azxkhnzbonlwnto", model.nextLink());
    }
}
