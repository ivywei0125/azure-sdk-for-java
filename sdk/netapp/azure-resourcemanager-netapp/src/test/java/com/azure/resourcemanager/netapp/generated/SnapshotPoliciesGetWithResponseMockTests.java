// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SnapshotPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SnapshotPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"qihebw\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":730785712,\"minute\":1832502698,\"usedBytes\":3351326267748259519},\"dailySchedule\":{\"snapshotsToKeep\":1527664829,\"hour\":770460161,\"minute\":307322349,\"usedBytes\":8212495412619748670},\"weeklySchedule\":{\"snapshotsToKeep\":87980458,\"day\":\"lisdjubggbq\",\"hour\":1820494144,\"minute\":2003917859,\"usedBytes\":5918202422727737393},\"monthlySchedule\":{\"snapshotsToKeep\":1063611109,\"daysOfMonth\":\"gacyrcmjdmspo\",\"hour\":361382788,\"minute\":283706298,\"usedBytes\":2234682115333576707},\"enabled\":false,\"provisioningState\":\"ofrzgb\"},\"location\":\"edm\",\"tags\":{\"nsnvpd\":\"vnlvxbcuiiznktwf\",\"z\":\"bmikost\",\"fy\":\"kiwbuqnyoph\",\"elfwy\":\"sgcrpfbcunezzce\"},\"id\":\"wl\",\"name\":\"xjwet\",\"type\":\"psihcla\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SnapshotPolicy response = manager.snapshotPolicies()
            .getWithResponse("wwinhehf", "pofvwb", "blembnkbwvqvxkd", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("edm", response.location());
        Assertions.assertEquals("vnlvxbcuiiznktwf", response.tags().get("nsnvpd"));
        Assertions.assertEquals(730785712, response.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(1832502698, response.hourlySchedule().minute());
        Assertions.assertEquals(3351326267748259519L, response.hourlySchedule().usedBytes());
        Assertions.assertEquals(1527664829, response.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(770460161, response.dailySchedule().hour());
        Assertions.assertEquals(307322349, response.dailySchedule().minute());
        Assertions.assertEquals(8212495412619748670L, response.dailySchedule().usedBytes());
        Assertions.assertEquals(87980458, response.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("lisdjubggbq", response.weeklySchedule().day());
        Assertions.assertEquals(1820494144, response.weeklySchedule().hour());
        Assertions.assertEquals(2003917859, response.weeklySchedule().minute());
        Assertions.assertEquals(5918202422727737393L, response.weeklySchedule().usedBytes());
        Assertions.assertEquals(1063611109, response.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("gacyrcmjdmspo", response.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(361382788, response.monthlySchedule().hour());
        Assertions.assertEquals(283706298, response.monthlySchedule().minute());
        Assertions.assertEquals(2234682115333576707L, response.monthlySchedule().usedBytes());
        Assertions.assertEquals(false, response.enabled());
    }
}
