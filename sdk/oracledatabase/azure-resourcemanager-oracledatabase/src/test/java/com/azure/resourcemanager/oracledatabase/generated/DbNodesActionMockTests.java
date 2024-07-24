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
import com.azure.resourcemanager.oracledatabase.models.DbNode;
import com.azure.resourcemanager.oracledatabase.models.DbNodeAction;
import com.azure.resourcemanager.oracledatabase.models.DbNodeActionEnum;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DbNodesActionMockTests {
    @Test
    public void testAction() throws Exception {
        String responseStr
            = "{\"properties\":{\"ocid\":\"hgwydyynfsv\",\"additionalDetails\":\"gbv\",\"backupIpId\":\"anarfdlpukhpyrne\",\"backupVnic2Id\":\"jcpeogkhnmg\",\"backupVnicId\":\"ouxddbhfhpfpazj\",\"cpuCoreCount\":1207242533,\"dbNodeStorageSizeInGbs\":1156977348,\"dbServerId\":\"hpdulon\",\"dbSystemId\":\"cnpqwteht\",\"faultDomain\":\"vrh\",\"hostIpId\":\"jyoogwxh\",\"hostname\":\"duugwbsre\",\"lifecycleState\":\"Failed\",\"lifecycleDetails\":\"kfuarenlv\",\"maintenanceType\":\"VmdbRebootMigration\",\"memorySizeInGbs\":1867886432,\"softwareStorageSizeInGb\":1998431294,\"timeCreated\":\"2021-02-05T00:41:51Z\",\"timeMaintenanceWindowEnd\":\"2021-09-08T16:13:33Z\",\"timeMaintenanceWindowStart\":\"2021-07-03T20:59:21Z\",\"vnic2Id\":\"f\",\"vnicId\":\"ev\",\"provisioningState\":\"Succeeded\"},\"id\":\"lcqxypokk\",\"name\":\"minqcym\",\"type\":\"zng\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OracleDatabaseManager manager = OracleDatabaseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DbNode response = manager.dbNodes()
            .action("byrplrohkpig", "fusuckzmkwklsno", "axmqeqal",
                new DbNodeAction().withAction(DbNodeActionEnum.RESET), com.azure.core.util.Context.NONE);

    }
}
