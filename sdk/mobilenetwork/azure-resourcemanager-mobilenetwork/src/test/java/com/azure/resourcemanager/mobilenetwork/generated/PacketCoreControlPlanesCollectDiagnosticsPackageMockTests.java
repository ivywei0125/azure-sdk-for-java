// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneCollectDiagnosticsPackage;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PacketCoreControlPlanesCollectDiagnosticsPackageMockTests {
    @Test
    public void testCollectDiagnosticsPackage() throws Exception {
        String responseStr
            = "{\"id\":\"d\",\"name\":\"qvwzkjopwbeonrl\",\"status\":\"wzdqybxceakxcpts\",\"resourceId\":\"fyiaseqch\",\"startTime\":\"2021-11-05T11:59:35Z\",\"endTime\":\"2021-08-04T17:40:23Z\",\"percentComplete\":38.799577761276595,\"properties\":\"datasg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AsyncOperationStatus response = manager.packetCoreControlPlanes()
            .collectDiagnosticsPackage("xubmdnafcbqw", "e",
                new PacketCoreControlPlaneCollectDiagnosticsPackage().withStorageAccountBlobUrl("jelaqacigele"),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("d", response.id());
        Assertions.assertEquals("qvwzkjopwbeonrl", response.name());
        Assertions.assertEquals("wzdqybxceakxcpts", response.status());
        Assertions.assertEquals("fyiaseqch", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-05T11:59:35Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-04T17:40:23Z"), response.endTime());
        Assertions.assertEquals(38.799577761276595D, response.percentComplete());
    }
}
