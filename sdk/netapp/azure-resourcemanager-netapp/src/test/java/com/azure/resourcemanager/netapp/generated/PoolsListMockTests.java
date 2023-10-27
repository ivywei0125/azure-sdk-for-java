// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.CapacityPool;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoolsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"etag\":\"uisavokq\",\"properties\":{\"poolId\":\"fvazivjlfrqttba\",\"size\":8474916357734436058,\"serviceLevel\":\"Ultra\",\"provisioningState\":\"nwxyiop\",\"totalThroughputMibps\":28.38924,\"utilizedThroughputMibps\":76.790695,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Double\"},\"location\":\"kdmligovi\",\"tags\":{\"uruocbgo\":\"kpmloa\"},\"id\":\"rb\",\"name\":\"eoybfhjxakvvjgs\",\"type\":\"ordilmywwtkgkxny\"}]}";

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

        PagedIterable<CapacityPool> response =
            manager.pools().list("mmqtgqqqxhr", "xrxc", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kdmligovi", response.iterator().next().location());
        Assertions.assertEquals("kpmloa", response.iterator().next().tags().get("uruocbgo"));
        Assertions.assertEquals(8474916357734436058L, response.iterator().next().size());
        Assertions.assertEquals(ServiceLevel.ULTRA, response.iterator().next().serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, response.iterator().next().qosType());
        Assertions.assertEquals(false, response.iterator().next().coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, response.iterator().next().encryptionType());
    }
}
