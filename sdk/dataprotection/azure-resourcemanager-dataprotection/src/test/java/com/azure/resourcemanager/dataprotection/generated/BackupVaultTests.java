// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVault model =
            BinaryData
                .fromString(
                    "{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Enabled\"}},\"provisioningState\":\"Updating\",\"resourceMoveState\":\"CommitTimedout\",\"resourceMoveDetails\":{\"operationId\":\"ojakhmsbzjhcrze\",\"startTimeUtc\":\"phlxa\",\"completionTimeUtc\":\"thqt\",\"sourceResourcePath\":\"qjbpfzfsin\",\"targetResourcePath\":\"v\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"On\",\"retentionDurationInDays\":72.89301806581457},\"immutabilitySettings\":{\"state\":\"Locked\"}},\"storageSettings\":[{\"datastoreType\":\"VaultStore\",\"type\":\"ZoneRedundant\"},{\"datastoreType\":\"OperationalStore\",\"type\":\"ZoneRedundant\"},{\"datastoreType\":\"VaultStore\",\"type\":\"GeoRedundant\"},{\"datastoreType\":\"ArchiveStore\",\"type\":\"LocallyRedundant\"}],\"isVaultProtectedByResourceGuard\":true,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"Disabled\"}}}")
                .toObject(BackupVault.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.ON, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(72.89301806581457D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.LOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions.assertEquals(StorageSettingStoreTypes.VAULT_STORE, model.storageSettings().get(0).datastoreType());
        Assertions.assertEquals(StorageSettingTypes.ZONE_REDUNDANT, model.storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.DISABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVault model =
            new BackupVault()
                .withMonitoringSettings(
                    new MonitoringSettings()
                        .withAzureMonitorAlertSettings(
                            new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED)))
                .withSecuritySettings(
                    new SecuritySettings()
                        .withSoftDeleteSettings(
                            new SoftDeleteSettings()
                                .withState(SoftDeleteState.ON)
                                .withRetentionDurationInDays(72.89301806581457D))
                        .withImmutabilitySettings(new ImmutabilitySettings().withState(ImmutabilityState.LOCKED)))
                .withStorageSettings(
                    Arrays
                        .asList(
                            new StorageSetting()
                                .withDatastoreType(StorageSettingStoreTypes.VAULT_STORE)
                                .withType(StorageSettingTypes.ZONE_REDUNDANT),
                            new StorageSetting()
                                .withDatastoreType(StorageSettingStoreTypes.OPERATIONAL_STORE)
                                .withType(StorageSettingTypes.ZONE_REDUNDANT),
                            new StorageSetting()
                                .withDatastoreType(StorageSettingStoreTypes.VAULT_STORE)
                                .withType(StorageSettingTypes.GEO_REDUNDANT),
                            new StorageSetting()
                                .withDatastoreType(StorageSettingStoreTypes.ARCHIVE_STORE)
                                .withType(StorageSettingTypes.LOCALLY_REDUNDANT)))
                .withFeatureSettings(
                    new FeatureSettings()
                        .withCrossSubscriptionRestoreSettings(
                            new CrossSubscriptionRestoreSettings().withState(CrossSubscriptionRestoreState.DISABLED)));
        model = BinaryData.fromObject(model).toObject(BackupVault.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.ON, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(72.89301806581457D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.LOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions.assertEquals(StorageSettingStoreTypes.VAULT_STORE, model.storageSettings().get(0).datastoreType());
        Assertions.assertEquals(StorageSettingTypes.ZONE_REDUNDANT, model.storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.DISABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
    }
}
