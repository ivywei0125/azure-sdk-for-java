// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.AttachedDatabaseConfiguration;
import com.azure.resourcemanager.kusto.models.DefaultPrincipalsModificationKind;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AttachedDatabaseConfigurationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"zmkw\",\"properties\":{\"provisioningState\":\"Canceled\",\"databaseName\":\"oxaxm\",\"clusterResourceId\":\"e\",\"attachedDatabaseNames\":[\"h\",\"jnhgwydyyn\"],\"defaultPrincipalsModificationKind\":\"None\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"gbv\",\"ta\"],\"tablesToExclude\":[\"fdlpukhpyr\"],\"externalTablesToInclude\":[\"zjcpeogk\",\"nmg\"],\"externalTablesToExclude\":[\"uxddbhfh\",\"fpazjzoywjxhpd\",\"lontacnpq\",\"tehtuevrhrljyoog\"],\"materializedViewsToInclude\":[\"nsduugwbsre\",\"rfqkfuar\",\"nlvhhtklnvnafvv\",\"yfedevjbo\"],\"materializedViewsToExclude\":[\"qxypokkhminq\",\"ymc\",\"ngnbdxxew\",\"ninvudbchaqdt\"],\"functionsToInclude\":[\"crqctmxxdtddmflh\"],\"functionsToExclude\":[\"xzvtzna\"]},\"databaseNameOverride\":\"bannovvoxczytp\",\"databaseNamePrefix\":\"nwvroevytlyokrr\"},\"id\":\"o\",\"name\":\"uxvnsasbcrymodi\",\"type\":\"rxklobdxnazpmk\"}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AttachedDatabaseConfiguration response =
            manager
                .attachedDatabaseConfigurations()
                .getWithResponse("nlgmtrwahzjmu", "ftbyrplro", "kpigqfusu", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("zmkw", response.location());
        Assertions.assertEquals("oxaxm", response.databaseName());
        Assertions.assertEquals("e", response.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.NONE, response.defaultPrincipalsModificationKind());
        Assertions.assertEquals("gbv", response.tableLevelSharingProperties().tablesToInclude().get(0));
        Assertions.assertEquals("fdlpukhpyr", response.tableLevelSharingProperties().tablesToExclude().get(0));
        Assertions.assertEquals("zjcpeogk", response.tableLevelSharingProperties().externalTablesToInclude().get(0));
        Assertions.assertEquals("uxddbhfh", response.tableLevelSharingProperties().externalTablesToExclude().get(0));
        Assertions
            .assertEquals("nsduugwbsre", response.tableLevelSharingProperties().materializedViewsToInclude().get(0));
        Assertions
            .assertEquals("qxypokkhminq", response.tableLevelSharingProperties().materializedViewsToExclude().get(0));
        Assertions.assertEquals("crqctmxxdtddmflh", response.tableLevelSharingProperties().functionsToInclude().get(0));
        Assertions.assertEquals("xzvtzna", response.tableLevelSharingProperties().functionsToExclude().get(0));
        Assertions.assertEquals("bannovvoxczytp", response.databaseNameOverride());
        Assertions.assertEquals("nwvroevytlyokrr", response.databaseNamePrefix());
    }
}
