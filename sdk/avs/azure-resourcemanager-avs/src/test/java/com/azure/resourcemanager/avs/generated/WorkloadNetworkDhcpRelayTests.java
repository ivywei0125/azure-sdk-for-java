// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDhcpRelay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkDhcpRelayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkDhcpRelay model = BinaryData.fromString(
            "{\"dhcpType\":\"RELAY\",\"serverAddresses\":[\"kwdlenrdsutujba\",\"pjuohminyfl\",\"orwmduvwpklv\"],\"displayName\":\"mygdxpgpqch\",\"segments\":[\"epn\"],\"provisioningState\":\"Updating\",\"revision\":7502230535508252511}")
            .toObject(WorkloadNetworkDhcpRelay.class);
        Assertions.assertEquals("mygdxpgpqch", model.displayName());
        Assertions.assertEquals(7502230535508252511L, model.revision());
        Assertions.assertEquals("kwdlenrdsutujba", model.serverAddresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkDhcpRelay model = new WorkloadNetworkDhcpRelay().withDisplayName("mygdxpgpqch")
            .withRevision(7502230535508252511L)
            .withServerAddresses(Arrays.asList("kwdlenrdsutujba", "pjuohminyfl", "orwmduvwpklv"));
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkDhcpRelay.class);
        Assertions.assertEquals("mygdxpgpqch", model.displayName());
        Assertions.assertEquals(7502230535508252511L, model.revision());
        Assertions.assertEquals("kwdlenrdsutujba", model.serverAddresses().get(0));
    }
}
