// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.scvmm.ScvmmManager;
import com.azure.resourcemanager.scvmm.models.InventoryItem;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class InventoryItemsListByVmmServerMockTests {
    @Test
    public void testListByVmmServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"inventoryType\":\"InventoryItemProperties\",\"managedResourceId\":\"ziven\",\"uuid\":\"pmeyyvpkpatlbijp\",\"inventoryItemName\":\"sksrfhfvolmknbn\",\"provisioningState\":\"Deleting\"},\"kind\":\"ommpvfqaw\",\"id\":\"gbrt\",\"name\":\"uiaclkiexhajlfn\",\"type\":\"hiqfyuttdiy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ScvmmManager manager = ScvmmManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<InventoryItem> response
            = manager.inventoryItems().listByVmmServer("mzvlazipbh", "wvqsgny", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ommpvfqaw", response.iterator().next().kind());
    }
}
