// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnection;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProvisioningState;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultSubResourceType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{\"id\":\"gehoqfbowskany\"},\"groupIds\":[\"AzureSiteRecovery\",\"AzureBackup\",\"AzureBackup_secondary\",\"AzureSiteRecovery\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"ywgndrv\",\"actionsRequired\":\"hzgpphrcgyncocpe\"}},\"eTag\":\"vmmcoofs\",\"location\":\"lzevgbmqjqab\",\"tags\":{\"wnfnbacf\":\"mivkwlzuvcc\",\"bqqwxrj\":\"onlebxetqgtzxdpn\",\"mpmngnzscxaqwoo\":\"eallnwsubisnj\"},\"id\":\"hcbonqvpkvlr\",\"name\":\"njeaseipheofloke\",\"type\":\"y\"}")
            .toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("lzevgbmqjqab", model.location());
        Assertions.assertEquals("mivkwlzuvcc", model.tags().get("wnfnbacf"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals("gehoqfbowskany", model.properties().privateEndpoint().id());
        Assertions.assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.properties().groupIds().get(0));
        Assertions.assertEquals(PrivateEndpointConnectionStatus.REJECTED,
            model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ywgndrv", model.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("hzgpphrcgyncocpe",
            model.properties().privateLinkServiceConnectionState().actionRequired());
        Assertions.assertEquals("vmmcoofs", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionResourceInner model = new PrivateEndpointConnectionResourceInner()
            .withLocation("lzevgbmqjqab")
            .withTags(
                mapOf("wnfnbacf", "mivkwlzuvcc", "bqqwxrj", "onlebxetqgtzxdpn", "mpmngnzscxaqwoo", "eallnwsubisnj"))
            .withProperties(new PrivateEndpointConnection().withProvisioningState(ProvisioningState.SUCCEEDED)
                .withPrivateEndpoint(new PrivateEndpoint().withId("gehoqfbowskany"))
                .withGroupIds(Arrays.asList(VaultSubResourceType.AZURE_SITE_RECOVERY, VaultSubResourceType.AZURE_BACKUP,
                    VaultSubResourceType.AZURE_BACKUP_SECONDARY, VaultSubResourceType.AZURE_SITE_RECOVERY))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointConnectionStatus.REJECTED)
                        .withDescription("ywgndrv")
                        .withActionRequired("hzgpphrcgyncocpe")))
            .withEtag("vmmcoofs");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("lzevgbmqjqab", model.location());
        Assertions.assertEquals("mivkwlzuvcc", model.tags().get("wnfnbacf"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals("gehoqfbowskany", model.properties().privateEndpoint().id());
        Assertions.assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.properties().groupIds().get(0));
        Assertions.assertEquals(PrivateEndpointConnectionStatus.REJECTED,
            model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ywgndrv", model.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("hzgpphrcgyncocpe",
            model.properties().privateLinkServiceConnectionState().actionRequired());
        Assertions.assertEquals("vmmcoofs", model.etag());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
