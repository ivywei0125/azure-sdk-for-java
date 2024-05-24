// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.DedupState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import com.azure.resourcemanager.recoveryservicesbackup.models.XcoolState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupResourceStorageConfigsNonCrrsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"storageModelType\":\"ReadAccessGeoZoneRedundant\",\"storageType\":\"LocallyRedundant\",\"storageTypeState\":\"Locked\",\"crossRegionRestoreFlag\":true,\"dedupState\":\"Enabled\",\"xcoolState\":\"Invalid\"},\"eTag\":\"wlpjfelqerppt\",\"location\":\"bgqnz\",\"tags\":{\"gckbb\":\"iilialwc\"},\"id\":\"ccgzpraoxnyu\",\"name\":\"fa\",\"type\":\"sgftipwc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupResourceConfigResource response = manager.backupResourceStorageConfigsNonCrrs()
            .getWithResponse("ycsjmlbem", "ej", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("bgqnz", response.location());
        Assertions.assertEquals("iilialwc", response.tags().get("gckbb"));
        Assertions.assertEquals(StorageType.READ_ACCESS_GEO_ZONE_REDUNDANT, response.properties().storageModelType());
        Assertions.assertEquals(StorageType.LOCALLY_REDUNDANT, response.properties().storageType());
        Assertions.assertEquals(StorageTypeState.LOCKED, response.properties().storageTypeState());
        Assertions.assertEquals(true, response.properties().crossRegionRestoreFlag());
        Assertions.assertEquals(DedupState.ENABLED, response.properties().dedupState());
        Assertions.assertEquals(XcoolState.INVALID, response.properties().xcoolState());
        Assertions.assertEquals("wlpjfelqerppt", response.etag());
    }
}
