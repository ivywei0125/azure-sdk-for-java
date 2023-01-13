// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridkubernetes.models.OperationList;
import org.junit.jupiter.api.Assertions;

public final class OperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"jzyflu\",\"display\":{\"provider\":\"hmofc\",\"resource\":\"smy\",\"operation\":\"kdtmlxhekuk\",\"description\":\"txukcdmp\"}}],\"nextLink\":\"cryuan\"}")
                .toObject(OperationList.class);
        Assertions.assertEquals("cryuan", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationList model = new OperationList().withNextLink("cryuan");
        model = BinaryData.fromObject(model).toObject(OperationList.class);
        Assertions.assertEquals("cryuan", model.nextLink());
    }
}