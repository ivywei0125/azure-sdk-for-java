// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.NsgReference;
import com.azure.resourcemanager.resourcemover.models.SubnetResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class SubnetResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubnetResourceSettings model =
            BinaryData
                .fromString(
                    "{\"name\":\"rzpwvlqdqgbiq\",\"addressPrefix\":\"ihkaetcktvfc\",\"networkSecurityGroup\":{\"sourceArmResourceId\":\"fsnkymuctq\"}}")
                .toObject(SubnetResourceSettings.class);
        Assertions.assertEquals("rzpwvlqdqgbiq", model.name());
        Assertions.assertEquals("ihkaetcktvfc", model.addressPrefix());
        Assertions.assertEquals("fsnkymuctq", model.networkSecurityGroup().sourceArmResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubnetResourceSettings model =
            new SubnetResourceSettings()
                .withName("rzpwvlqdqgbiq")
                .withAddressPrefix("ihkaetcktvfc")
                .withNetworkSecurityGroup(new NsgReference().withSourceArmResourceId("fsnkymuctq"));
        model = BinaryData.fromObject(model).toObject(SubnetResourceSettings.class);
        Assertions.assertEquals("rzpwvlqdqgbiq", model.name());
        Assertions.assertEquals("ihkaetcktvfc", model.addressPrefix());
        Assertions.assertEquals("fsnkymuctq", model.networkSecurityGroup().sourceArmResourceId());
    }
}
