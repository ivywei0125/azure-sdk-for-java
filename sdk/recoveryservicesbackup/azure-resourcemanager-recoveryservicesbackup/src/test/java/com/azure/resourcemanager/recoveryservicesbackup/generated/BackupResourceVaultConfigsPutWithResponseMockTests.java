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
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceVaultConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.EnhancedSecurityState;
import com.azure.resourcemanager.recoveryservicesbackup.models.SoftDeleteFeatureState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupResourceVaultConfigsPutWithResponseMockTests {
    @Test
    public void testPutWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"storageModelType\":\"GeoRedundant\",\"storageType\":\"LocallyRedundant\",\"storageTypeState\":\"Invalid\",\"enhancedSecurityState\":\"Enabled\",\"softDeleteFeatureState\":\"Disabled\",\"softDeleteRetentionPeriodInDays\":1101568024,\"resourceGuardOperationRequests\":[\"rhcekxgnly\"],\"isSoftDeleteFeatureStateEditable\":true},\"eTag\":\"pwzvmdoksqdti\",\"location\":\"lwxlboncqbazq\",\"tags\":{\"ubdpkxyqvgxi\":\"chygtvxbyjane\",\"tvo\":\"od\"},\"id\":\"kxdxuwsaifmcwn\",\"name\":\"s\",\"type\":\"zlehgcvkbcknjolg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupResourceVaultConfigResource response = manager.backupResourceVaultConfigs()
            .putWithResponse("rxtd", "sn", new BackupResourceVaultConfigResourceInner().withLocation("e")
                .withTags(
                    mapOf("chjhgemuowak", "ukaobrlbpgsnbag", "hjym", "wa", "rclsso", "cgqtag", "gjco", "jomevtfycnlb"))
                .withProperties(
                    new BackupResourceVaultConfig().withStorageModelType(StorageType.READ_ACCESS_GEO_ZONE_REDUNDANT)
                        .withStorageType(StorageType.GEO_REDUNDANT)
                        .withStorageTypeState(StorageTypeState.UNLOCKED)
                        .withEnhancedSecurityState(EnhancedSecurityState.DISABLED)
                        .withSoftDeleteFeatureState(SoftDeleteFeatureState.ENABLED)
                        .withSoftDeleteRetentionPeriodInDays(1455894662)
                        .withResourceGuardOperationRequests(Arrays.asList("wwtjfdoesxxhmwc", "bckyoikxk", "hnegknj"))
                        .withIsSoftDeleteFeatureStateEditable(true))
                .withEtag("t"), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lwxlboncqbazq", response.location());
        Assertions.assertEquals("chygtvxbyjane", response.tags().get("ubdpkxyqvgxi"));
        Assertions.assertEquals(StorageType.GEO_REDUNDANT, response.properties().storageModelType());
        Assertions.assertEquals(StorageType.LOCALLY_REDUNDANT, response.properties().storageType());
        Assertions.assertEquals(StorageTypeState.INVALID, response.properties().storageTypeState());
        Assertions.assertEquals(EnhancedSecurityState.ENABLED, response.properties().enhancedSecurityState());
        Assertions.assertEquals(SoftDeleteFeatureState.DISABLED, response.properties().softDeleteFeatureState());
        Assertions.assertEquals(1101568024, response.properties().softDeleteRetentionPeriodInDays());
        Assertions.assertEquals("rhcekxgnly", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, response.properties().isSoftDeleteFeatureStateEditable());
        Assertions.assertEquals("pwzvmdoksqdti", response.etag());
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
