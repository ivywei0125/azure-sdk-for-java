// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.ActivationLinksInner;

public final class ActivationLinksInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActivationLinksInner model = BinaryData.fromString(
            "{\"newCloudAccountActivationLink\":\"ynkedyatrwyhqmib\",\"existingCloudAccountActivationLink\":\"hwit\"}")
            .toObject(ActivationLinksInner.class);
    }
}
