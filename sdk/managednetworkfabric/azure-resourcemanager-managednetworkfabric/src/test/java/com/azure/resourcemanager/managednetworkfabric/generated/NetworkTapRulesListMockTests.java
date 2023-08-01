// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationType;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapRule;
import com.azure.resourcemanager.managednetworkfabric.models.PollingIntervalInSeconds;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkTapRulesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"networkTapId\":\"oygowdzizz\",\"pollingIntervalInSeconds\":30,\"lastSyncedTime\":\"2021-03-19T02:50:44Z\",\"configurationState\":\"ErrorDeprovisioning\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"Disabled\",\"configurationType\":\"File\",\"tapRulesUrl\":\"rtasepiplpexh\",\"matchConfigurations\":[{\"matchConfigurationName\":\"tl\",\"sequenceNumber\":1853565870713824775,\"ipAddressType\":\"IPv6\",\"matchConditions\":[{},{},{},{}],\"actions\":[{}]}],\"dynamicMatchConfigurations\":[{\"ipGroups\":[{}],\"vlanGroups\":[{}],\"portGroups\":[{},{}]},{\"ipGroups\":[{},{},{}],\"vlanGroups\":[{},{},{},{}],\"portGroups\":[{},{},{}]},{\"ipGroups\":[{}],\"vlanGroups\":[{}],\"portGroups\":[{},{},{},{}]}],\"annotation\":\"ybt\"},\"location\":\"mxdmppibvwqjc\",\"tags\":{\"l\":\"fyoqfvmvw\",\"tyxlsycckj\":\"muzltnneolghgte\",\"c\":\"qdtykcaocjuuxqnk\"},\"id\":\"mrwc\",\"name\":\"ynjcvewl\",\"type\":\"jrnaktj\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkTapRule> response = manager.networkTapRules().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mxdmppibvwqjc", response.iterator().next().location());
        Assertions.assertEquals("fyoqfvmvw", response.iterator().next().tags().get("l"));
        Assertions
            .assertEquals(PollingIntervalInSeconds.THREE_ZERO, response.iterator().next().pollingIntervalInSeconds());
        Assertions.assertEquals(ConfigurationType.FILE, response.iterator().next().configurationType());
        Assertions.assertEquals("rtasepiplpexh", response.iterator().next().tapRulesUrl());
        Assertions.assertEquals("tl", response.iterator().next().matchConfigurations().get(0).matchConfigurationName());
        Assertions
            .assertEquals(
                1853565870713824775L, response.iterator().next().matchConfigurations().get(0).sequenceNumber());
        Assertions
            .assertEquals(IpAddressType.IPV6, response.iterator().next().matchConfigurations().get(0).ipAddressType());
        Assertions.assertEquals("ybt", response.iterator().next().annotation());
    }
}
