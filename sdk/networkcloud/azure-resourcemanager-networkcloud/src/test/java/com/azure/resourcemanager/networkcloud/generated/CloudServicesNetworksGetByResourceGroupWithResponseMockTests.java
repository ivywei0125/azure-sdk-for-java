// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetwork;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CloudServicesNetworksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"fynn\",\"type\":\"muii\"},\"properties\":{\"additionalEgressEndpoints\":[{\"category\":\"fohyk\",\"endpoints\":[{\"domainName\":\"xbbcbrw\"},{\"domainName\":\"iutgnjizbeewoiy\"},{\"domainName\":\"rvzb\"},{\"domainName\":\"uyrsrziuctix\"}]}],\"associatedResourceIds\":[\"suif\"],\"clusterId\":\"vka\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"kisw\",\"enableDefaultEgressEndpoints\":\"False\",\"enabledEgressEndpoints\":[{\"category\":\"hsyparybjuf\",\"endpoints\":[{\"domainName\":\"bjczjnciuiyqvlda\"},{\"domainName\":\"wvppi\"},{\"domainName\":\"qqzlgcndhz\"}]}],\"hybridAksClustersAssociatedIds\":[\"fcfsrhkhgsnx\"],\"interfaceName\":\"wkpphefsb\",\"provisioningState\":\"Provisioning\",\"virtualMachinesAssociatedIds\":[\"xomeikjclwzacn\",\"wpfsuqtaaz\",\"qbxyxoyfpuqqi\"]},\"location\":\"zxlhdjzqdcadwv\",\"tags\":{\"ybmrzoepnxwd\":\"zjiihjr\",\"xaurs\":\"wnjkgvfn\"},\"id\":\"ftibtyibuyvpirfq\",\"name\":\"pnqn\",\"type\":\"owsbedenrexkxbh\"}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        CloudServicesNetwork response =
            manager
                .cloudServicesNetworks()
                .getByResourceGroupWithResponse("bdmvrscmqerndbr", "yeofltfnnxrkad", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("zxlhdjzqdcadwv", response.location());
        Assertions.assertEquals("zjiihjr", response.tags().get("ybmrzoepnxwd"));
        Assertions.assertEquals("fynn", response.extendedLocation().name());
        Assertions.assertEquals("muii", response.extendedLocation().type());
        Assertions.assertEquals("fohyk", response.additionalEgressEndpoints().get(0).category());
        Assertions.assertEquals("xbbcbrw", response.additionalEgressEndpoints().get(0).endpoints().get(0).domainName());
        Assertions
            .assertEquals(
                CloudServicesNetworkEnableDefaultEgressEndpoints.FALSE, response.enableDefaultEgressEndpoints());
    }
}
