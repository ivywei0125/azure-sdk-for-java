// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateLinkResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"agnb\",\"requiredMembers\":[\"hijggme\",\"fsiarbutr\",\"vpnazzm\"],\"requiredZoneNames\":[\"unmpxttd\",\"hrbnlankxmyskpbh\"]},\"id\":\"btkcxywnytnrsyn\",\"name\":\"qidybyx\",\"type\":\"zfcl\"}]}")
                .toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("unmpxttd", model.value().get(0).requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResult model =
            new PrivateLinkResourceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner()
                                .withRequiredZoneNames(Arrays.asList("unmpxttd", "hrbnlankxmyskpbh"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("unmpxttd", model.value().get(0).requiredZoneNames().get(0));
    }
}
