// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.oracledatabase.OracleDatabaseManager;
import com.azure.resourcemanager.oracledatabase.models.DbServer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbServersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"ocid\":\"slwkojpl\",\"displayName\":\"dnpdwrpqaf\",\"compartmentId\":\"ug\",\"exadataInfrastructureId\":\"n\",\"cpuCoreCount\":1704013235,\"dbServerPatchingDetails\":{\"estimatedPatchDuration\":726955046,\"patchingStatus\":\"Complete\",\"timePatchingEnded\":\"2021-06-28T06:22:35Z\",\"timePatchingStarted\":\"2021-08-10T19:55:02Z\"},\"maxMemoryInGbs\":1099892409,\"dbNodeStorageSizeInGbs\":1575776706,\"vmClusterIds\":[\"ixr\"],\"dbNodeIds\":[\"uyturml\"],\"lifecycleDetails\":\"owolbaui\",\"lifecycleState\":\"Creating\",\"maxCpuCount\":713536788,\"autonomousVmClusterIds\":[\"zonwpngajinnixj\",\"wrtmjfjmy\",\"cxlzhcoxovnekh\",\"nlusfnrd\"],\"autonomousVirtualMachineIds\":[\"txrdcqtjvi\",\"ttgepuslvyjtcv\",\"wkasiziesf\",\"ughtuqfecjxeygtu\"],\"maxDbNodeStorageInGbs\":643622638,\"memorySizeInGbs\":1670662701,\"shape\":\"uewmrswnjlxuzrhw\",\"timeCreated\":\"2021-07-10T15:20:26Z\",\"provisioningState\":\"Canceled\"},\"id\":\"aqehg\",\"name\":\"dohzjq\",\"type\":\"tu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DbServer response = manager.dbServers()
            .getWithResponse("uahokq", "obkauxofsh", "phwpnulaiywzej", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
