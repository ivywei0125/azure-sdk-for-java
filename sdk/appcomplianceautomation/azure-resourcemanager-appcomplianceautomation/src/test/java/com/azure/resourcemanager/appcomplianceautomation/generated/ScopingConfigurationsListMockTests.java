// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager;
import com.azure.resourcemanager.appcomplianceautomation.models.ScopingConfigurationResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScopingConfigurationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"answers\":[{\"questionId\":\"suxswqrntvlwijp\",\"answers\":[\"texoqqpwc\",\"yufmhruncuwmq\",\"pkcdqzhlct\",\"dunqnd\"]}],\"provisioningState\":\"Creating\"},\"id\":\"hrqbnjjrcg\",\"name\":\"gydcw\",\"type\":\"oxjumvqqo\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AppComplianceAutomationManager manager = AppComplianceAutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ScopingConfigurationResource> response
            = manager.scopingConfigurations().list("bn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("suxswqrntvlwijp",
            response.iterator().next().properties().answers().get(0).questionId());
        Assertions.assertEquals("texoqqpwc", response.iterator().next().properties().answers().get(0).answers().get(0));
    }
}
