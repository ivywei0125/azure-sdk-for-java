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
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.ServiceKind;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WebPubSubsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"bunzozudh\",\"tier\":\"Premium\",\"size\":\"moy\",\"family\":\"dyuib\",\"capacity\":595382657},\"properties\":{\"provisioningState\":\"Creating\",\"externalIP\":\"ydvfvfcjnae\",\"hostName\":\"srvhmgorffuki\",\"publicPort\":1917370345,\"serverPort\":1204565564,\"version\":\"hwplefaxvx\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{},\"groupIds\":[\"zeyqxtjjfzqlqhyc\",\"vodggxdbee\",\"mieknlraria\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"uagydwqfbylyrf\",\"name\":\"iagtc\",\"type\":\"jocqwogfnzjvusf\"},{\"properties\":{\"provisioningState\":\"Running\",\"privateEndpoint\":{},\"groupIds\":[\"xylfsb\",\"kadpysown\",\"tgkbugrjqctojc\",\"isofieypefojyqd\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"plcplcwkhi\",\"name\":\"ihlhzdsqtzb\",\"type\":\"rgnowcjhfgm\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"ctxmwoteyowcluq\",\"privateLinkResourceId\":\"vekqvgqo\",\"provisioningState\":\"Running\",\"requestMessage\":\"zmpjwyiv\",\"status\":\"Approved\"},\"id\":\"f\",\"name\":\"cvhrfsp\",\"type\":\"uagrttikteusqc\"}],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"lxubyj\",\"liveTraceConfiguration\":{\"enabled\":\"mmfblcqcuubgqib\",\"categories\":[{\"name\":\"metttwgd\",\"enabled\":\"qxihhrmooi\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"pxiutc\",\"enabled\":\"pzhyr\"},{\"name\":\"togebjoxsl\",\"enabled\":\"nhl\"},{\"name\":\"rqnkkzjcjbtr\",\"enabled\":\"ehvvib\"},{\"name\":\"jj\",\"enabled\":\"oqbeitpkxzt\"}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ServerConnection\"],\"deny\":[\"Trace\",\"ClientConnection\"]},\"privateEndpoints\":[{\"name\":\"qmpimaqxzhem\",\"allow\":[\"ClientConnection\"],\"deny\":[\"RESTAPI\"]},{\"name\":\"swtwkozzwc\",\"allow\":[\"Trace\"],\"deny\":[\"Trace\",\"Trace\"]},{\"name\":\"ajnjwltlwtjj\",\"allow\":[\"Trace\",\"ServerConnection\",\"RESTAPI\",\"RESTAPI\"],\"deny\":[\"ServerConnection\",\"Trace\",\"RESTAPI\"]},{\"name\":\"dmxzr\",\"allow\":[\"Trace\",\"Trace\",\"RESTAPI\"],\"deny\":[\"Trace\",\"RESTAPI\",\"ServerConnection\"]}]},\"publicNetworkAccess\":\"mylweazulc\",\"disableLocalAuth\":false,\"disableAadAuth\":false},\"kind\":\"SocketIO\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ncxykxhdjhlimm\":{\"principalId\":\"swpchwahfbousn\",\"clientId\":\"pgfewetwlyx\"}},\"principalId\":\"x\",\"tenantId\":\"bcporxvxcjzhqizx\"},\"location\":\"xtgqscjavftjuh\",\"tags\":{\"m\":\"zkmtgguwpijrajci\",\"nzqodfvpg\":\"ghfcfiwrxgkneuvy\",\"zdjtxvzflbqv\":\"hoxgsgbpf\"},\"id\":\"aqvlgafcqusr\",\"name\":\"vetnwsdtutn\",\"type\":\"lduycv\"}]}";

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

        PagedIterable<WebPubSubResource> response = manager.webPubSubs().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xtgqscjavftjuh", response.iterator().next().location());
        Assertions.assertEquals("zkmtgguwpijrajci", response.iterator().next().tags().get("m"));
        Assertions.assertEquals("bunzozudh", response.iterator().next().sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.PREMIUM, response.iterator().next().sku().tier());
        Assertions.assertEquals(595382657, response.iterator().next().sku().capacity());
        Assertions.assertEquals(ServiceKind.SOCKET_IO, response.iterator().next().kind());
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(true, response.iterator().next().tls().clientCertEnabled());
        Assertions.assertEquals("mmfblcqcuubgqib", response.iterator().next().liveTraceConfiguration().enabled());
        Assertions
            .assertEquals("metttwgd", response.iterator().next().liveTraceConfiguration().categories().get(0).name());
        Assertions
            .assertEquals(
                "qxihhrmooi", response.iterator().next().liveTraceConfiguration().categories().get(0).enabled());
        Assertions
            .assertEquals("pxiutc", response.iterator().next().resourceLogConfiguration().categories().get(0).name());
        Assertions
            .assertEquals("pzhyr", response.iterator().next().resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals(AclAction.DENY, response.iterator().next().networkACLs().defaultAction());
        Assertions
            .assertEquals(
                WebPubSubRequestType.SERVER_CONNECTION,
                response.iterator().next().networkACLs().publicNetwork().allow().get(0));
        Assertions
            .assertEquals(
                WebPubSubRequestType.TRACE, response.iterator().next().networkACLs().publicNetwork().deny().get(0));
        Assertions
            .assertEquals(
                WebPubSubRequestType.CLIENT_CONNECTION,
                response.iterator().next().networkACLs().privateEndpoints().get(0).allow().get(0));
        Assertions
            .assertEquals(
                WebPubSubRequestType.RESTAPI,
                response.iterator().next().networkACLs().privateEndpoints().get(0).deny().get(0));
        Assertions
            .assertEquals("qmpimaqxzhem", response.iterator().next().networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("mylweazulc", response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(false, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(false, response.iterator().next().disableAadAuth());
    }
}
