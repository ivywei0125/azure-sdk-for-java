// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListenerFilter;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHub;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
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

public final class WebPubSubHubsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"eventHandlers\":[{\"urlTemplate\":\"j\",\"userEventPattern\":\"rsxypruuu\",\"systemEvents\":[\"chrszi\",\"oyuelyetn\",\"nb\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{}}},{\"urlTemplate\":\"agfl\",\"userEventPattern\":\"gm\",\"systemEvents\":[\"ahzjmucftb\",\"r\",\"lrohkpig\",\"fusuckzmkwklsno\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{}}},{\"urlTemplate\":\"e\",\"userEventPattern\":\"lhhjnh\",\"systemEvents\":[\"dyynfsvkhgb\",\"qtanarfdlpuk\",\"py\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{}}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"eogkhnmgbro\"},\"id\":\"xddbhfhpfpaz\",\"name\":\"zoyw\",\"type\":\"xhpdulontacnpqwt\"}";

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

        WebPubSubHub response =
            manager
                .webPubSubHubs()
                .define("ijtk")
                .withExistingWebPubSub("usqogsfikayia", "sharujtj")
                .withProperties(
                    new WebPubSubHubProperties()
                        .withEventHandlers(
                            Arrays
                                .asList(
                                    new EventHandler()
                                        .withUrlTemplate("fzyjqt")
                                        .withUserEventPattern("wkpqhjpenuygbq")
                                        .withSystemEvents(Arrays.asList("ekewvnqvcdlguauc", "f", "jwnlax"))
                                        .withAuth(
                                            new UpstreamAuthSettings()
                                                .withType(UpstreamAuthType.NONE)
                                                .withManagedIdentity(new ManagedIdentitySettings()))))
                        .withEventListeners(
                            Arrays
                                .asList(
                                    new EventListener()
                                        .withFilter(new EventListenerFilter())
                                        .withEndpoint(new EventListenerEndpoint()),
                                    new EventListener()
                                        .withFilter(new EventListenerFilter())
                                        .withEndpoint(new EventListenerEndpoint())))
                        .withAnonymousConnectPolicy("zvvitacgxmfcs"))
                .create();

        Assertions.assertEquals("j", response.properties().eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("rsxypruuu", response.properties().eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("chrszi", response.properties().eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, response.properties().eventHandlers().get(0).auth().type());
        Assertions.assertEquals("eogkhnmgbro", response.properties().anonymousConnectPolicy());
    }
}
