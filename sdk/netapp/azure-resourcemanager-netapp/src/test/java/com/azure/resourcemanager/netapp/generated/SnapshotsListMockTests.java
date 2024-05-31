// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.Snapshot;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SnapshotsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"tmzlbiojlv\",\"properties\":{\"snapshotId\":\"bbpneqvcwwy\",\"created\":\"2021-08-18T23:17:52Z\",\"provisioningState\":\"ochpprpr\"},\"id\":\"mo\",\"name\":\"ayzejnhlbkpbz\",\"type\":\"cpilj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Snapshot> response = manager.snapshots()
            .list("fbzdixzmqpnoda", "opqhewjptmc", "sbostzel", "dlat", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tmzlbiojlv", response.iterator().next().location());
    }
}
