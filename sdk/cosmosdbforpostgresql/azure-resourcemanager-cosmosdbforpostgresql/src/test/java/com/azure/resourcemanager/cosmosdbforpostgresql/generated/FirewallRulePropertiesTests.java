// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.FirewallRuleProperties;
import org.junit.jupiter.api.Assertions;

public final class FirewallRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallRuleProperties model =
            BinaryData
                .fromString(
                    "{\"startIpAddress\":\"hd\",\"endIpAddress\":\"xibqeojnx\",\"provisioningState\":\"Failed\"}")
                .toObject(FirewallRuleProperties.class);
        Assertions.assertEquals("hd", model.startIpAddress());
        Assertions.assertEquals("xibqeojnx", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirewallRuleProperties model =
            new FirewallRuleProperties().withStartIpAddress("hd").withEndIpAddress("xibqeojnx");
        model = BinaryData.fromObject(model).toObject(FirewallRuleProperties.class);
        Assertions.assertEquals("hd", model.startIpAddress());
        Assertions.assertEquals("xibqeojnx", model.endIpAddress());
    }
}
