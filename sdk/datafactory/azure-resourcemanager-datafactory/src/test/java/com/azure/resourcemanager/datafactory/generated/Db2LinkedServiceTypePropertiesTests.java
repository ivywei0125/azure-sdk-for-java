// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.Db2LinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.Db2AuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class Db2LinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        Db2LinkedServiceTypeProperties model =
            BinaryData
                .fromString("{\"authenticationType\":\"Basic\",\"password\":{\"type\":\"SecretBase\"}}")
                .toObject(Db2LinkedServiceTypeProperties.class);
        Assertions.assertEquals(Db2AuthenticationType.BASIC, model.authenticationType());
    }

    @Test
    public void testSerialize() {
        Db2LinkedServiceTypeProperties model =
            new Db2LinkedServiceTypeProperties()
                .withAuthenticationType(Db2AuthenticationType.BASIC)
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(Db2LinkedServiceTypeProperties.class);
        Assertions.assertEquals(Db2AuthenticationType.BASIC, model.authenticationType());
    }
}
