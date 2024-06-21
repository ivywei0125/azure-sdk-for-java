// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredential;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityCredentialTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityCredential model = BinaryData.fromString(
            "{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"rxpxslc\"},\"description\":\"yscjefapouwsyns\",\"annotations\":[\"datad\",\"datardle\",\"datajzv\"],\"\":{\"titktke\":\"datayhggvhcoao\"}}")
            .toObject(ManagedIdentityCredential.class);
        Assertions.assertEquals("yscjefapouwsyns", model.description());
        Assertions.assertEquals("rxpxslc", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityCredential model = new ManagedIdentityCredential().withDescription("yscjefapouwsyns")
            .withAnnotations(Arrays.asList("datad", "datardle", "datajzv"))
            .withResourceId("rxpxslc");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityCredential.class);
        Assertions.assertEquals("yscjefapouwsyns", model.description());
        Assertions.assertEquals("rxpxslc", model.resourceId());
    }
}
