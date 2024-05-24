// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservices.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryValueForSingleApi;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"oadsuvar\",\"display\":{\"provider\":\"dmjsjqb\",\"resource\":\"hyxxrwlycoduhpk\",\"operation\":\"gymare\",\"description\":\"ajxq\"},\"origin\":\"jhkycub\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"ofwq\",\"displayName\":\"qal\",\"blobDuration\":\"mnjijpxacqqudf\"},{\"name\":\"yxbaaabjyvayf\",\"displayName\":\"m\",\"blobDuration\":\"rtuzqogs\"},{\"name\":\"nevfdnw\",\"displayName\":\"mewzsyyc\",\"blobDuration\":\"zsoibjudpfrxtr\"}]}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesManager manager = RecoveryServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClientDiscoveryValueForSingleApi> response
            = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("oadsuvar", response.iterator().next().name());
        Assertions.assertEquals("dmjsjqb", response.iterator().next().display().provider());
        Assertions.assertEquals("hyxxrwlycoduhpk", response.iterator().next().display().resource());
        Assertions.assertEquals("gymare", response.iterator().next().display().operation());
        Assertions.assertEquals("ajxq", response.iterator().next().display().description());
        Assertions.assertEquals("jhkycub", response.iterator().next().origin());
        Assertions.assertEquals("ofwq",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qal",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("mnjijpxacqqudf",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).blobDuration());
    }
}
