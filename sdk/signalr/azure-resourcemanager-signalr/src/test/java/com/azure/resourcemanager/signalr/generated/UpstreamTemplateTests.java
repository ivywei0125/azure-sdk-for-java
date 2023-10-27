// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ManagedIdentitySettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthSettings;
import com.azure.resourcemanager.signalr.models.UpstreamAuthType;
import com.azure.resourcemanager.signalr.models.UpstreamTemplate;
import org.junit.jupiter.api.Assertions;

public final class UpstreamTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpstreamTemplate model =
            BinaryData
                .fromString(
                    "{\"hubPattern\":\"vwxnbkfe\",\"eventPattern\":\"xscyhwzdgirujbz\",\"categoryPattern\":\"mvzzbtdcqvp\",\"urlTemplate\":\"iyujviylwdshfs\",\"auth\":{\"type\":\"None\",\"managedIdentity\":{\"resource\":\"efr\"}}}")
                .toObject(UpstreamTemplate.class);
        Assertions.assertEquals("vwxnbkfe", model.hubPattern());
        Assertions.assertEquals("xscyhwzdgirujbz", model.eventPattern());
        Assertions.assertEquals("mvzzbtdcqvp", model.categoryPattern());
        Assertions.assertEquals("iyujviylwdshfs", model.urlTemplate());
        Assertions.assertEquals(UpstreamAuthType.NONE, model.auth().type());
        Assertions.assertEquals("efr", model.auth().managedIdentity().resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpstreamTemplate model =
            new UpstreamTemplate()
                .withHubPattern("vwxnbkfe")
                .withEventPattern("xscyhwzdgirujbz")
                .withCategoryPattern("mvzzbtdcqvp")
                .withUrlTemplate("iyujviylwdshfs")
                .withAuth(
                    new UpstreamAuthSettings()
                        .withType(UpstreamAuthType.NONE)
                        .withManagedIdentity(new ManagedIdentitySettings().withResource("efr")));
        model = BinaryData.fromObject(model).toObject(UpstreamTemplate.class);
        Assertions.assertEquals("vwxnbkfe", model.hubPattern());
        Assertions.assertEquals("xscyhwzdgirujbz", model.eventPattern());
        Assertions.assertEquals("mvzzbtdcqvp", model.categoryPattern());
        Assertions.assertEquals("iyujviylwdshfs", model.urlTemplate());
        Assertions.assertEquals(UpstreamAuthType.NONE, model.auth().type());
        Assertions.assertEquals("efr", model.auth().managedIdentity().resource());
    }
}
