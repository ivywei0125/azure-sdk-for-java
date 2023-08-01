// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.Operation;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"mdy\",\"isDataAction\":false,\"display\":{\"provider\":\"igu\",\"resource\":\"nraauzz\",\"operation\":\"jazysdzhezwwvaiq\",\"description\":\"vv\"},\"origin\":\"nk\",\"properties\":{\"serviceSpecification\":{\"metricSpecifications\":[{\"name\":\"kvylauyavl\",\"displayName\":\"mncsttijfybvp\",\"displayDescription\":\"krsgsgb\",\"unit\":\"uzqgnjdgkynsc\",\"aggregationType\":\"qhzvhxnkomt\",\"fillGapWithZero\":\"bo\",\"category\":\"pnvdxz\",\"dimensions\":[{},{},{}]}],\"logSpecifications\":[{\"name\":\"bbc\",\"displayName\":\"qagt\"},{\"name\":\"dhlfkqojpykvgt\",\"displayName\":\"cnifm\"}]}}}]}";

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

        WebPubSubManager manager =
            WebPubSubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mdy", response.iterator().next().name());
        Assertions.assertEquals(false, response.iterator().next().isDataAction());
        Assertions.assertEquals("igu", response.iterator().next().display().provider());
        Assertions.assertEquals("nraauzz", response.iterator().next().display().resource());
        Assertions.assertEquals("jazysdzhezwwvaiq", response.iterator().next().display().operation());
        Assertions.assertEquals("vv", response.iterator().next().display().description());
        Assertions.assertEquals("nk", response.iterator().next().origin());
        Assertions
            .assertEquals(
                "kvylauyavl",
                response.iterator().next().properties().serviceSpecification().metricSpecifications().get(0).name());
        Assertions
            .assertEquals(
                "mncsttijfybvp",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .metricSpecifications()
                    .get(0)
                    .displayName());
        Assertions
            .assertEquals(
                "krsgsgb",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .metricSpecifications()
                    .get(0)
                    .displayDescription());
        Assertions
            .assertEquals(
                "uzqgnjdgkynsc",
                response.iterator().next().properties().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions
            .assertEquals(
                "qhzvhxnkomt",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .metricSpecifications()
                    .get(0)
                    .aggregationType());
        Assertions
            .assertEquals(
                "bo",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .metricSpecifications()
                    .get(0)
                    .fillGapWithZero());
        Assertions
            .assertEquals(
                "pnvdxz",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .metricSpecifications()
                    .get(0)
                    .category());
        Assertions
            .assertEquals(
                "bbc",
                response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).name());
        Assertions
            .assertEquals(
                "qagt",
                response
                    .iterator()
                    .next()
                    .properties()
                    .serviceSpecification()
                    .logSpecifications()
                    .get(0)
                    .displayName());
    }
}
