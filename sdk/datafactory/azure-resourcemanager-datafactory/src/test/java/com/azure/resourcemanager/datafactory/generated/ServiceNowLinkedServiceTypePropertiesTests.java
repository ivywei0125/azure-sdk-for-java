// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ServiceNowLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.ServiceNowAuthenticationType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ServiceNowLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ServiceNowLinkedServiceTypeProperties model =
            BinaryData
                .fromString(
                    "{\"authenticationType\":\"Basic\",\"password\":{\"type\":\"SecretBase\"},\"clientSecret\":{\"type\":\"SecretBase\"}}")
                .toObject(ServiceNowLinkedServiceTypeProperties.class);
        Assertions.assertEquals(ServiceNowAuthenticationType.BASIC, model.authenticationType());
    }

    @Test
    public void testSerialize() {
        ServiceNowLinkedServiceTypeProperties model =
            new ServiceNowLinkedServiceTypeProperties()
                .withAuthenticationType(ServiceNowAuthenticationType.BASIC)
                .withPassword(new SecretBase())
                .withClientSecret(new SecretBase());
        model = BinaryData.fromObject(model).toObject(ServiceNowLinkedServiceTypeProperties.class);
        Assertions.assertEquals(ServiceNowAuthenticationType.BASIC, model.authenticationType());
    }
}
