// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRuleAction;
import com.azure.resourcemanager.managednetworkfabric.models.TapRuleActionType;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapRuleActionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapRuleAction model =
            BinaryData
                .fromString(
                    "{\"type\":\"Count\",\"truncate\":\"hvwt\",\"isTimestampEnabled\":\"False\",\"destinationId\":\"chcgsfz\",\"matchConfigurationName\":\"jkiysqbjsdj\"}")
                .toObject(NetworkTapRuleAction.class);
        Assertions.assertEquals(TapRuleActionType.COUNT, model.type());
        Assertions.assertEquals("hvwt", model.truncate());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.isTimestampEnabled());
        Assertions.assertEquals("chcgsfz", model.destinationId());
        Assertions.assertEquals("jkiysqbjsdj", model.matchConfigurationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapRuleAction model =
            new NetworkTapRuleAction()
                .withType(TapRuleActionType.COUNT)
                .withTruncate("hvwt")
                .withIsTimestampEnabled(BooleanEnumProperty.FALSE)
                .withDestinationId("chcgsfz")
                .withMatchConfigurationName("jkiysqbjsdj");
        model = BinaryData.fromObject(model).toObject(NetworkTapRuleAction.class);
        Assertions.assertEquals(TapRuleActionType.COUNT, model.type());
        Assertions.assertEquals("hvwt", model.truncate());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.isTimestampEnabled());
        Assertions.assertEquals("chcgsfz", model.destinationId());
        Assertions.assertEquals("jkiysqbjsdj", model.matchConfigurationName());
    }
}
