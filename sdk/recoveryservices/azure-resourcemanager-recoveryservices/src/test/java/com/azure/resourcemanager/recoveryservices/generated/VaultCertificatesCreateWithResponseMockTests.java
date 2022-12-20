// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservices.RecoveryServicesManager;
import com.azure.resourcemanager.recoveryservices.models.AuthType;
import com.azure.resourcemanager.recoveryservices.models.RawCertificateData;
import com.azure.resourcemanager.recoveryservices.models.VaultCertificateResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VaultCertificatesCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"authType\":\"ResourceCertificateDetails\",\"friendlyName\":\"gjrwjueiotwmcdyt\",\"issuer\":\"wit\",\"resourceId\":4599897838164298418,\"subject\":\"wgqwgxhn\",\"thumbprint\":\"kxfbkpycgklwndn\",\"validFrom\":\"2021-06-18T07:43:59Z\",\"validTo\":\"2021-02-14T21:50:58Z\"},\"id\":\"whvylw\",\"name\":\"btdhxujznbm\",\"type\":\"ow\"}";

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

        RecoveryServicesManager manager =
            RecoveryServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        VaultCertificateResponse response =
            manager
                .vaultCertificates()
                .define("ovbvmeueciv")
                .withExistingVault("hsfwxosowzxcug", "cjooxdjebwpucwwf")
                .withProperties(new RawCertificateData().withAuthType(AuthType.ACCESS_CONTROL_SERVICE))
                .create();

        Assertions.assertEquals("gjrwjueiotwmcdyt", response.properties().friendlyName());
        Assertions.assertEquals("wit", response.properties().issuer());
        Assertions.assertEquals(4599897838164298418L, response.properties().resourceId());
        Assertions.assertEquals("wgqwgxhn", response.properties().subject());
        Assertions.assertEquals("kxfbkpycgklwndn", response.properties().thumbprint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-18T07:43:59Z"), response.properties().validFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-14T21:50:58Z"), response.properties().validTo());
    }
}
