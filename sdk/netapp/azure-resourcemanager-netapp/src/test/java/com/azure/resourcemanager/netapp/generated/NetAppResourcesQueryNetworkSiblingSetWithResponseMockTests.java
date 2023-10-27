// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.QueryNetworkSiblingSetRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetAppResourcesQueryNetworkSiblingSetWithResponseMockTests {
    @Test
    public void testQueryNetworkSiblingSetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"networkSiblingSetId\":\"odpvruudlgzib\",\"subnetId\":\"ostgkts\",\"networkSiblingSetStateId\":\"dxeclzedqbcvh\",\"networkFeatures\":\"Basic\",\"provisioningState\":\"Updating\",\"nicInfoList\":[{\"ipAddress\":\"kdl\",\"volumeResourceIds\":[\"fbumlkx\",\"rqjfsmlm\",\"txhwgfws\",\"tawc\"]},{\"ipAddress\":\"zbrhubskhudyg\",\"volumeResourceIds\":[\"kkqfqjbvle\",\"rfmluiqtq\",\"fa\"]},{\"ipAddress\":\"vnqqybaryeua\",\"volumeResourceIds\":[\"qabqgzslesjcb\"]}]}";

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

        NetAppFilesManager manager =
            NetAppFilesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkSiblingSet response =
            manager
                .netAppResources()
                .queryNetworkSiblingSetWithResponse(
                    "htba",
                    new QueryNetworkSiblingSetRequest().withNetworkSiblingSetId("kgxywr").withSubnetId("kpyklyhp"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("odpvruudlgzib", response.networkSiblingSetId());
        Assertions.assertEquals("ostgkts", response.subnetId());
        Assertions.assertEquals("dxeclzedqbcvh", response.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC, response.networkFeatures());
        Assertions.assertEquals("fbumlkx", response.nicInfoList().get(0).volumeResourceIds().get(0));
    }
}
