// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredential;
import com.azure.resourcemanager.datafactory.models.ManagedIdentityCredentialResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CredentialOperationsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"type\":\"ManagedIdentity\",\"typeProperties\":{\"resourceId\":\"cpwrgry\"},\"description\":\"lrqeqcdikc\",\"annotations\":[\"datazdtfthnjxid\"],\"\":{\"rrzuegindln\":\"datampyixgxtccmqzku\"}},\"name\":\"oapsz\",\"type\":\"n\",\"etag\":\"vyracqmfjihm\",\"id\":\"zwoijtlhxlsxxra\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DataFactoryManager manager =
            DataFactoryManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagedIdentityCredentialResource response =
            manager
                .credentialOperations()
                .define("kiupgmdsz")
                .withExistingFactory("lbqdxvxdfkdwk", "mnoecfjw")
                .withProperties(
                    new ManagedIdentityCredential()
                        .withDescription("ecr")
                        .withAnnotations(Arrays.asList("datamzqfisggoap", "datadmxwe"))
                        .withResourceId("djxltjsm"))
                .withIfMatch("dxvl")
                .create();

        Assertions.assertEquals("zwoijtlhxlsxxra", response.id());
        Assertions.assertEquals("lrqeqcdikc", response.properties().description());
        Assertions.assertEquals("cpwrgry", response.properties().resourceId());
    }
}
