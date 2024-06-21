// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager;
import com.azure.resourcemanager.devopsinfrastructure.models.AgentProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.FabricProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devopsinfrastructure.models.OrganizationProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.Pool;
import com.azure.resourcemanager.devopsinfrastructure.models.PoolProperties;
import com.azure.resourcemanager.devopsinfrastructure.models.ProvisioningState;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourcePredictionsProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PoolsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"maximumConcurrency\":729293630,\"organizationProfile\":{\"kind\":\"OrganizationProfile\"},\"agentProfile\":{\"kind\":\"AgentProfile\",\"resourcePredictions\":\"dataytdw\",\"resourcePredictionsProfile\":{\"kind\":\"ResourcePredictionsProfile\"}},\"fabricProfile\":{\"kind\":\"FabricProfile\"},\"devCenterProjectResourceId\":\"brqubp\"},\"identity\":{\"principalId\":\"exiili\",\"tenantId\":\"dtiirqt\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"zwl\":{\"principalId\":\"oruzfgsquyfxrxx\",\"clientId\":\"ptramxj\"},\"ebwnujhe\":{\"principalId\":\"wxuqlcvydypatdoo\",\"clientId\":\"jkniodko\"},\"f\":{\"principalId\":\"sbvdkcrodtjinfw\",\"clientId\":\"fltkacjv\"}}},\"location\":\"lfoakg\",\"tags\":{\"pulpqblylsyxk\":\"pagao\",\"zuempsbzkf\":\"jnsjervtiagxsd\",\"dxrbuukzcle\":\"beyvpnqicvinvkjj\"},\"id\":\"yhmlwpaztzp\",\"name\":\"fn\",\"type\":\"ckw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevOpsInfrastructureManager manager = DevOpsInfrastructureManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Pool response = manager.pools()
            .define("qfatpxllrxcyjm")
            .withRegion("yxbaaabjyvayf")
            .withExistingResourceGroup("bdunygaeqid")
            .withTags(mapOf("evfdnwnwm", "rzrtuzqogsex"))
            .withProperties(new PoolProperties().withProvisioningState(ProvisioningState.PROVISIONING)
                .withMaximumConcurrency(1120671201)
                .withOrganizationProfile(new OrganizationProfile())
                .withAgentProfile(new AgentProfile().withResourcePredictions("dataarm")
                    .withResourcePredictionsProfile(new ResourcePredictionsProfile()))
                .withFabricProfile(new FabricProfile())
                .withDevCenterProjectResourceId("dmjsjqb"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("cqqudf", new UserAssignedIdentity())))
            .create();

        Assertions.assertEquals("lfoakg", response.location());
        Assertions.assertEquals("pagao", response.tags().get("pulpqblylsyxk"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, response.properties().provisioningState());
        Assertions.assertEquals(729293630, response.properties().maximumConcurrency());
        Assertions.assertEquals("brqubp", response.properties().devCenterProjectResourceId());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
