// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntentResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupProtectionIntentsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"protectionIntentItemType\":\"ProtectionIntent\",\"backupManagementType\":\"DefaultBackup\",\"sourceResourceId\":\"dsaeuzanhsfnh\",\"itemId\":\"nwph\",\"policyId\":\"fngq\",\"protectionState\":\"Protected\"},\"eTag\":\"dftujwjjufwbeqr\",\"location\":\"uorhtssruqnmdvh\",\"tags\":{\"rzw\":\"vjytiqswbq\"},\"id\":\"iytxt\",\"name\":\"gukvlbpkt\",\"type\":\"dstyouam\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ProtectionIntentResource> response = manager.backupProtectionIntents()
            .list("ktpv", "xqcsehch", "hufmpq", "mqyjgy", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("uorhtssruqnmdvh", response.iterator().next().location());
        Assertions.assertEquals("vjytiqswbq", response.iterator().next().tags().get("rzw"));
        Assertions.assertEquals(BackupManagementType.DEFAULT_BACKUP,
            response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("dsaeuzanhsfnh", response.iterator().next().properties().sourceResourceId());
        Assertions.assertEquals("nwph", response.iterator().next().properties().itemId());
        Assertions.assertEquals("fngq", response.iterator().next().properties().policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, response.iterator().next().properties().protectionState());
        Assertions.assertEquals("dftujwjjufwbeqr", response.iterator().next().etag());
    }
}
