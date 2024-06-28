// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.Cluster;
import com.azure.resourcemanager.avs.models.Sku;
import com.azure.resourcemanager.avs.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClustersCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"clusterSize\":312575916,\"provisioningState\":\"Succeeded\",\"clusterId\":1231243109,\"hosts\":[\"nbixxrti\"],\"vsanDatastoreName\":\"cpwpg\"},\"sku\":{\"name\":\"lrcivtsoxfrke\",\"tier\":\"Premium\",\"size\":\"yyefrpmpdnqqs\",\"family\":\"waoqvmmb\",\"capacity\":538705263},\"id\":\"rtql\",\"name\":\"zmegnitgvk\",\"type\":\"lzyqd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response = manager.clusters()
            .define("vetnwsdtutn")
            .withExistingPrivateCloud("a", "cqusr")
            .withSku(new Sku().withName("udypohyuems")
                .withTier(SkuTier.PREMIUM)
                .withSize("qyrp")
                .withFamily("obrltt")
                .withCapacity(2105592893))
            .withClusterSize(1517277198)
            .withHosts(Arrays.asList("yrmewipmvekdx", "kuqgsjjxundxgket", "zhhzjhfjmhvvmu", "gpmuneqsxvmhfbuz"))
            .withVsanDatastoreName("ihsasb")
            .create();

        Assertions.assertEquals("lrcivtsoxfrke", response.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals("yyefrpmpdnqqs", response.sku().size());
        Assertions.assertEquals("waoqvmmb", response.sku().family());
        Assertions.assertEquals(538705263, response.sku().capacity());
        Assertions.assertEquals(312575916, response.clusterSize());
        Assertions.assertEquals("nbixxrti", response.hosts().get(0));
        Assertions.assertEquals("cpwpg", response.vsanDatastoreName());
    }
}
