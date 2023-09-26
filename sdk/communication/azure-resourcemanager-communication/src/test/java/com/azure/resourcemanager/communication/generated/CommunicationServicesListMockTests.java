// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.communication.CommunicationManager;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommunicationServicesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Running\",\"hostName\":\"brjcxe\",\"dataLocation\":\"fuwutttxf\",\"notificationHubId\":\"rbirphxe\",\"version\":\"yva\",\"immutableResourceId\":\"nljky\",\"linkedDomains\":[\"vuujq\"]},\"identity\":{\"principalId\":\"f342c64e-0a89-4d85-ae46-c2b6f9566603\",\"tenantId\":\"f72eed73-33ac-4821-8e7c-e043e2202e5c\",\"type\":\"None\",\"userAssignedIdentities\":{\"yoxgvcltbgsnc\":{\"principalId\":\"552f9120-4c6f-4d22-9b5b-a5fe73ec964c\",\"clientId\":\"17c275e7-1df4-4c0a-a8ca-1af0e5f05e75\"},\"jeszzhbijhtxfv\":{\"principalId\":\"4d732273-6af7-4d26-bee8-79ee41592dd6\",\"clientId\":\"28e13d66-6422-4a2f-b42d-510f0d2b4e31\"}}},\"location\":\"bfs\",\"tags\":{\"pvecxgodeb\":\"eh\",\"pukgriwflzlfb\":\"qkkrb\",\"qzahmgkbrp\":\"zpuzycisp\"},\"id\":\"y\",\"name\":\"hibnuqqkpika\",\"type\":\"rgvtqag\"}]}";

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

        CommunicationManager manager =
            CommunicationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommunicationServiceResource> response =
            manager.communicationServices().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bfs", response.iterator().next().location());
        Assertions.assertEquals("eh", response.iterator().next().tags().get("pvecxgodeb"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("fuwutttxf", response.iterator().next().dataLocation());
        Assertions.assertEquals("vuujq", response.iterator().next().linkedDomains().get(0));
    }
}
