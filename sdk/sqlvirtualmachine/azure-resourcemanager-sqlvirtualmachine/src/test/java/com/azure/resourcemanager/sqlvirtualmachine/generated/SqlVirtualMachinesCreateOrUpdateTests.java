// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoPatchingSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.BackupScheduleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.DayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.DiskConfigurationType;
import com.azure.resourcemanager.sqlvirtualmachine.models.FullBackupFrequencyType;
import com.azure.resourcemanager.sqlvirtualmachine.models.IdentityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.KeyVaultCredentialSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.ResourceIdentity;
import com.azure.resourcemanager.sqlvirtualmachine.models.ServerConfigurationsManagementSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachine;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageConfigurationSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageWorkloadType;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainCredentials;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlVirtualMachinesCreateOrUpdateTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"type\":\"None\"},\"properties\":{\"virtualMachineResourceId\":\"y\",\"provisioningState\":\"Succeeded\",\"sqlImageOffer\":\"dvstkw\",\"sqlServerLicenseType\":\"PAYG\",\"sqlManagement\":\"LightWeight\",\"leastPrivilegeMode\":\"Enabled\",\"sqlImageSku\":\"Web\",\"sqlVirtualMachineGroupResourceId\":\"mtdaa\",\"wsfcDomainCredentials\":{\"clusterBootstrapAccountPassword\":\"fakeClusterBootstrapAccountPasswordPlaceholder\",\"clusterOperatorAccountPassword\":\"fakeOperatorAccountPasswordPlaceholder\",\"sqlServiceAccountPassword\":\"fakeSqlServiceAccountPasswordPlaceholder\"},\"wsfcStaticIp\":\"i\",\"autoPatchingSettings\":{\"enable\":true,\"dayOfWeek\":\"Tuesday\",\"maintenanceWindowStartingHour\":261614569,\"maintenanceWindowDuration\":1772217773},\"autoBackupSettings\":{\"enable\":false,\"enableEncryption\":false,\"retentionPeriod\":1453079674,\"storageAccountUrl\":\"szkkfoqre\",\"storageContainerName\":\"kzikfjawneaivxwc\",\"storageAccessKey\":\"fakeAutoBackupStorageAccessKeyPlaceholder\",\"password\":\"fakeAutoBackupPasswordPlaceholder\",\"backupSystemDbs\":true,\"backupScheduleType\":\"Manual\",\"fullBackupFrequency\":\"Weekly\",\"daysOfWeek\":[],\"fullBackupStartTime\":1879278925,\"fullBackupWindowHours\":883019177,\"logBackupFrequency\":1246118617},\"keyVaultCredentialSettings\":{\"enable\":true,\"credentialName\":\"hyoulpjr\",\"azureKeyVaultUrl\":\"ag\",\"servicePrincipalName\":\"vimjwos\",\"servicePrincipalSecret\":\"fakeSecretPlaceholder\"},\"serverConfigurationsManagementSettings\":{},\"storageConfigurationSettings\":{\"sqlSystemDbOnDataDisk\":false,\"diskConfigurationType\":\"EXTEND\",\"storageWorkloadType\":\"GENERAL\"},\"assessmentSettings\":{\"enable\":false,\"runImmediately\":false},\"enableAutomaticUpgrade\":true},\"location\":\"qgge\",\"tags\":{\"qidbqfatpxllrxcy\":\"nyga\",\"dmjsjqb\":\"moadsuvarmy\",\"yc\":\"hhyxxrw\"},\"id\":\"duhpk\",\"name\":\"kgymareqnajxqug\",\"type\":\"hky\"}";

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

        SqlVirtualMachineManager manager =
            SqlVirtualMachineManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SqlVirtualMachine response =
            manager
                .sqlVirtualMachines()
                .define("reqnovvqfov")
                .withRegion("oocrkvcikhnv")
                .withExistingResourceGroup("pkkpw")
                .withTags(mapOf("gxk", "qgxqquezikyw"))
                .withIdentity(new ResourceIdentity().withType(IdentityType.NONE))
                .withVirtualMachineResourceId("syrsndsytgadgvra")
                .withSqlImageOffer("nzar")
                .withSqlServerLicenseType(SqlServerLicenseType.PAYG)
                .withSqlManagement(SqlManagementMode.NO_AGENT)
                .withLeastPrivilegeMode(LeastPrivilegeMode.ENABLED)
                .withSqlImageSku(SqlImageSku.ENTERPRISE)
                .withWsfcDomainCredentials(
                    new WsfcDomainCredentials()
                        .withClusterBootstrapAccountPassword("fakeClusterBootstrapAccountPasswordPlaceholder")
                        .withClusterOperatorAccountPassword("fakeClusterOperatorAccountPasswordPlaceholder")
                        .withSqlServiceAccountPassword("fakeSqlServiceAccountPasswordPlaceholder"))
                .withWsfcStaticIp("torzih")
                .withAutoPatchingSettings(
                    new AutoPatchingSettings()
                        .withEnable(false)
                        .withDayOfWeek(DayOfWeek.TUESDAY)
                        .withMaintenanceWindowStartingHour(2033015184)
                        .withMaintenanceWindowDuration(1899163147))
                .withAutoBackupSettings(
                    new AutoBackupSettings()
                        .withEnable(true)
                        .withEnableEncryption(true)
                        .withRetentionPeriod(1849555195)
                        .withStorageAccountUrl("c")
                        .withStorageContainerName("kqqzqioxiysu")
                        .withStorageAccessKey("fakeStorageCredentialPlaceholder")
                        .withPassword("fakePasswordPlaceholder")
                        .withBackupSystemDbs(false)
                        .withBackupScheduleType(BackupScheduleType.AUTOMATED)
                        .withFullBackupFrequency(FullBackupFrequencyType.DAILY)
                        .withDaysOfWeek(Arrays.asList())
                        .withFullBackupStartTime(1150716691)
                        .withFullBackupWindowHours(846796617)
                        .withLogBackupFrequency(1107344942))
                .withKeyVaultCredentialSettings(
                    new KeyVaultCredentialSettings()
                        .withEnable(false)
                        .withCredentialName("nmabik")
                        .withAzureKeyVaultUrl("orgjhxbldt")
                        .withServicePrincipalName("wrlkdmtn")
                        .withServicePrincipalSecret("ok"))
                .withServerConfigurationsManagementSettings(new ServerConfigurationsManagementSettings())
                .withStorageConfigurationSettings(
                    new StorageConfigurationSettings()
                        .withSqlSystemDbOnDataDisk(true)
                        .withDiskConfigurationType(DiskConfigurationType.EXTEND)
                        .withStorageWorkloadType(StorageWorkloadType.GENERAL))
                .withAssessmentSettings(new AssessmentSettings().withEnable(false).withRunImmediately(false))
                .withEnableAutomaticUpgrade(true)
                .create();

        Assertions.assertEquals("qgge", response.location());
        Assertions.assertEquals("nyga", response.tags().get("qidbqfatpxllrxcy"));
        Assertions.assertEquals(IdentityType.NONE, response.identity().type());
        Assertions.assertEquals("y", response.virtualMachineResourceId());
        Assertions.assertEquals("dvstkw", response.sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.PAYG, response.sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.LIGHT_WEIGHT, response.sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, response.leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.WEB, response.sqlImageSku());
        Assertions.assertEquals("mtdaa", response.sqlVirtualMachineGroupResourceId());
        Assertions.assertEquals("fakeClusterBootstrapAccountPasswordPlaceholder",
            response.wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions.assertEquals("fakeOperatorAccountPasswordPlaceholder",
            response.wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions.assertEquals("fakeSqlServiceAccountPasswordPlaceholder",
            response.wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("i", response.wsfcStaticIp());
        Assertions.assertEquals(true, response.autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.TUESDAY, response.autoPatchingSettings().dayOfWeek());
        Assertions.assertEquals(261614569, response.autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions.assertEquals(1772217773, response.autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(false, response.autoBackupSettings().enable());
        Assertions.assertEquals(false, response.autoBackupSettings().enableEncryption());
        Assertions.assertEquals(1453079674, response.autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("szkkfoqre", response.autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("kzikfjawneaivxwc", response.autoBackupSettings().storageContainerName());
        Assertions.assertEquals("fakeAutoBackupStorageAccessKeyPlaceholder",
            response.autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("fakeAutoBackupPasswordPlaceholder", response.autoBackupSettings().password());
        Assertions.assertEquals(true, response.autoBackupSettings().backupSystemDbs());
        Assertions.assertEquals(BackupScheduleType.MANUAL, response.autoBackupSettings().backupScheduleType());
        Assertions.assertEquals(FullBackupFrequencyType.WEEKLY, response.autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(1879278925, response.autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(883019177, response.autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(1246118617, response.autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(true, response.keyVaultCredentialSettings().enable());
        Assertions.assertEquals("hyoulpjr", response.keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("ag", response.keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions.assertEquals("vimjwos", response.keyVaultCredentialSettings().servicePrincipalName());
        Assertions.assertEquals("fakeSecretPlaceholder", response.keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions.assertEquals(false, response.storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(
                DiskConfigurationType.EXTEND, response.storageConfigurationSettings().diskConfigurationType());
        Assertions
            .assertEquals(StorageWorkloadType.GENERAL, response.storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(false, response.assessmentSettings().enable());
        Assertions.assertEquals(false, response.assessmentSettings().runImmediately());
        Assertions.assertEquals(true, response.enableAutomaticUpgrade());
    }

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
