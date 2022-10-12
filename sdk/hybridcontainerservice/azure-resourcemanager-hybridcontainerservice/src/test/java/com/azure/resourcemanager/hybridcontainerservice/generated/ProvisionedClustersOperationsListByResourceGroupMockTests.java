// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerSku;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponse;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProvisionedClustersOperationsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"principalId\":\"dvypgikdgsz\",\"tenantId\":\"kbir\",\"type\":\"SystemAssigned\"},\"properties\":{\"enableRbac\":true,\"linuxProfile\":{\"adminUsername\":\"kj\"},\"features\":{},\"addonProfiles\":{},\"controlPlane\":{\"name\":\"inrvgoupmfi\",\"count\":327362442,\"availabilityZones\":[],\"maxCount\":366208637,\"maxPods\":615385800,\"minCount\":364570184,\"mode\":\"User\",\"nodeLabels\":{},\"nodeTaints\":[],\"osType\":\"Linux\",\"nodeImageVersion\":\"kkgll\",\"vmSize\":\"jygvjayvbl\"},\"kubernetesVersion\":\"k\",\"networkProfile\":{\"loadBalancerSku\":\"unstacked-haproxy\",\"dnsServiceIP\":\"vyhgs\",\"networkPolicy\":\"calico\",\"podCidr\":\"rqufegxuvwz\",\"podCidrs\":[],\"serviceCidr\":\"hlmctlpdngitvgb\",\"serviceCidrs\":[]},\"nodeResourceGroup\":\"ixkwmyijejveg\",\"agentPoolProfiles\":[],\"cloudProviderProfile\":{},\"provisioningState\":\"Created\",\"status\":{\"addonStatus\":{},\"errorMessage\":\"b\"},\"aadProfile\":{\"adminGroupObjectIDs\":[],\"clientAppID\":\"hcexdrrvqa\",\"enableAzureRbac\":true,\"managed\":false,\"serverAppID\":\"pwijnhy\",\"tenantID\":\"vfycxzb\"},\"windowsProfile\":{\"adminUsername\":\"owvrvmtgjqppyos\",\"enableCsiProxy\":false,\"licenseType\":\"Windows_Server\"},\"httpProxyConfig\":{\"httpProxy\":\"hgfipnsxkmcw\",\"httpsProxy\":\"krrjrea\",\"noProxy\":[],\"trustedCa\":\"sgumhjglikkxwsl\",\"username\":\"bq\"}},\"extendedLocation\":{\"type\":\"lmv\",\"name\":\"lfktgplcrpwjxe\"},\"location\":\"noigbrnjwmwk\",\"tags\":{\"jjoqkagf\":\"saz\",\"gzxnfaazpxdtnk\":\"sxtta\",\"wuenvr\":\"mkqjj\"},\"id\":\"pyouaibrebqaays\",\"name\":\"kixqtnqtt\",\"type\":\"zlwfffiakp\"}]}";

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

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ProvisionedClustersResponse> response =
            manager.provisionedClustersOperations().listByResourceGroup("wfqatmtd", Context.NONE);

        Assertions.assertEquals("noigbrnjwmwk", response.iterator().next().location());
        Assertions.assertEquals("saz", response.iterator().next().tags().get("jjoqkagf"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("hcexdrrvqa", response.iterator().next().properties().aadProfile().clientAppId());
        Assertions.assertEquals(true, response.iterator().next().properties().aadProfile().enableAzureRbac());
        Assertions.assertEquals(false, response.iterator().next().properties().aadProfile().managed());
        Assertions.assertEquals("pwijnhy", response.iterator().next().properties().aadProfile().serverAppId());
        Assertions.assertEquals("vfycxzb", response.iterator().next().properties().aadProfile().tenantId());
        Assertions
            .assertEquals("owvrvmtgjqppyos", response.iterator().next().properties().windowsProfile().adminUsername());
        Assertions.assertEquals(false, response.iterator().next().properties().windowsProfile().enableCsiProxy());
        Assertions
            .assertEquals(
                LicenseType.WINDOWS_SERVER, response.iterator().next().properties().windowsProfile().licenseType());
        Assertions.assertEquals("hgfipnsxkmcw", response.iterator().next().properties().httpProxyConfig().httpProxy());
        Assertions.assertEquals("krrjrea", response.iterator().next().properties().httpProxyConfig().httpsProxy());
        Assertions
            .assertEquals("sgumhjglikkxwsl", response.iterator().next().properties().httpProxyConfig().trustedCa());
        Assertions.assertEquals("bq", response.iterator().next().properties().httpProxyConfig().username());
        Assertions.assertEquals(true, response.iterator().next().properties().enableRbac());
        Assertions.assertEquals("kj", response.iterator().next().properties().linuxProfile().adminUsername());
        Assertions.assertEquals(327362442, response.iterator().next().properties().controlPlane().count());
        Assertions.assertEquals(366208637, response.iterator().next().properties().controlPlane().maxCount());
        Assertions.assertEquals(615385800, response.iterator().next().properties().controlPlane().maxPods());
        Assertions.assertEquals(364570184, response.iterator().next().properties().controlPlane().minCount());
        Assertions.assertEquals(Mode.USER, response.iterator().next().properties().controlPlane().mode());
        Assertions.assertEquals(OsType.LINUX, response.iterator().next().properties().controlPlane().osType());
        Assertions.assertEquals("kkgll", response.iterator().next().properties().controlPlane().nodeImageVersion());
        Assertions.assertEquals("jygvjayvbl", response.iterator().next().properties().controlPlane().vmSize());
        Assertions.assertEquals("inrvgoupmfi", response.iterator().next().properties().controlPlane().name());
        Assertions.assertEquals("k", response.iterator().next().properties().kubernetesVersion());
        Assertions
            .assertEquals(
                LoadBalancerSku.UNSTACKED_HAPROXY,
                response.iterator().next().properties().networkProfile().loadBalancerSku());
        Assertions.assertEquals("vyhgs", response.iterator().next().properties().networkProfile().dnsServiceIp());
        Assertions
            .assertEquals(
                NetworkPolicy.CALICO, response.iterator().next().properties().networkProfile().networkPolicy());
        Assertions.assertEquals("rqufegxuvwz", response.iterator().next().properties().networkProfile().podCidr());
        Assertions
            .assertEquals("hlmctlpdngitvgb", response.iterator().next().properties().networkProfile().serviceCidr());
        Assertions.assertEquals("ixkwmyijejveg", response.iterator().next().properties().nodeResourceGroup());
        Assertions.assertEquals("lmv", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("lfktgplcrpwjxe", response.iterator().next().extendedLocation().name());
    }
}
