// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShape;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbSystemShapesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"shapeFamily\":\"lvidizozs\",\"availableCoreCount\":1027236790,\"minimumCoreCount\":1862070997,\"runtimeMinimumCoreCount\":2054216522,\"coreCountIncrement\":325656680,\"minStorageCount\":1695386943,\"maxStorageCount\":1268563330,\"availableDataStoragePerServerInTbs\":3.818836897741773,\"availableMemoryPerNodeInGbs\":2083395580,\"availableDbNodePerNodeInGbs\":1666658010,\"minCoreCountPerNode\":19355637,\"availableMemoryInGbs\":575797032,\"minMemoryPerNodeInGbs\":36862007,\"availableDbNodeStorageInGbs\":740306752,\"minDbNodeStoragePerNodeInGbs\":1798680046,\"availableDataStorageInTbs\":1231214883,\"minDataStorageInTbs\":1577867001,\"minimumNodeCount\":2021110592,\"maximumNodeCount\":347039984,\"availableCoreCountPerNode\":904194330},\"id\":\"mkdasv\",\"name\":\"lyhb\",\"type\":\"cu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DbSystemShape response = manager.dbSystemShapes()
            .getWithResponse("urvzmlovuanashc", "lpmjerb", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
