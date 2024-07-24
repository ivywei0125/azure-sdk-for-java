// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRehydrationRequest;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.BackupInstance;
import com.azure.resourcemanager.dataprotection.models.BackupInstanceResource;
import com.azure.resourcemanager.dataprotection.models.OperationJobExtendedInfo;
import com.azure.resourcemanager.dataprotection.models.StopProtectionRequest;
import com.azure.resourcemanager.dataprotection.models.SuspendBackupRequest;
import com.azure.resourcemanager.dataprotection.models.SyncBackupInstanceRequest;
import com.azure.resourcemanager.dataprotection.models.TriggerBackupRequest;
import com.azure.resourcemanager.dataprotection.models.ValidateRestoreRequestObject;
import java.util.Collections;
import java.util.Map;

public final class BackupInstanceResourceImpl
    implements BackupInstanceResource, BackupInstanceResource.Definition, BackupInstanceResource.Update {
    private BackupInstanceResourceInner innerObject;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public BackupInstance properties() {
        return this.innerModel().properties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public BackupInstanceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private String backupInstanceName;

    public BackupInstanceResourceImpl withExistingBackupVault(String resourceGroupName, String vaultName) {
        this.resourceGroupName = resourceGroupName;
        this.vaultName = vaultName;
        return this;
    }

    public BackupInstanceResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .createOrUpdate(resourceGroupName, vaultName, backupInstanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public BackupInstanceResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .createOrUpdate(resourceGroupName, vaultName, backupInstanceName, this.innerModel(), context);
        return this;
    }

    BackupInstanceResourceImpl(String name,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = new BackupInstanceResourceInner();
        this.serviceManager = serviceManager;
        this.backupInstanceName = name;
    }

    public BackupInstanceResourceImpl update() {
        return this;
    }

    public BackupInstanceResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .createOrUpdate(resourceGroupName, vaultName, backupInstanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public BackupInstanceResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .createOrUpdate(resourceGroupName, vaultName, backupInstanceName, this.innerModel(), context);
        return this;
    }

    BackupInstanceResourceImpl(BackupInstanceResourceInner innerObject,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vaultName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "backupVaults");
        this.backupInstanceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "backupInstances");
    }

    public BackupInstanceResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .getWithResponse(resourceGroupName, vaultName, backupInstanceName, Context.NONE)
            .getValue();
        return this;
    }

    public BackupInstanceResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getBackupInstances()
            .getWithResponse(resourceGroupName, vaultName, backupInstanceName, context)
            .getValue();
        return this;
    }

    public OperationJobExtendedInfo adhocBackup(TriggerBackupRequest parameters) {
        return serviceManager.backupInstances()
            .adhocBackup(resourceGroupName, vaultName, backupInstanceName, parameters);
    }

    public OperationJobExtendedInfo adhocBackup(TriggerBackupRequest parameters, Context context) {
        return serviceManager.backupInstances()
            .adhocBackup(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public void triggerRehydrate(AzureBackupRehydrationRequest parameters) {
        serviceManager.backupInstances().triggerRehydrate(resourceGroupName, vaultName, backupInstanceName, parameters);
    }

    public void triggerRehydrate(AzureBackupRehydrationRequest parameters, Context context) {
        serviceManager.backupInstances()
            .triggerRehydrate(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public OperationJobExtendedInfo triggerRestore(AzureBackupRestoreRequest parameters) {
        return serviceManager.backupInstances()
            .triggerRestore(resourceGroupName, vaultName, backupInstanceName, parameters);
    }

    public OperationJobExtendedInfo triggerRestore(AzureBackupRestoreRequest parameters, Context context) {
        return serviceManager.backupInstances()
            .triggerRestore(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public void resumeBackups() {
        serviceManager.backupInstances().resumeBackups(resourceGroupName, vaultName, backupInstanceName);
    }

    public void resumeBackups(Context context) {
        serviceManager.backupInstances().resumeBackups(resourceGroupName, vaultName, backupInstanceName, context);
    }

    public void resumeProtection() {
        serviceManager.backupInstances().resumeProtection(resourceGroupName, vaultName, backupInstanceName);
    }

    public void resumeProtection(Context context) {
        serviceManager.backupInstances().resumeProtection(resourceGroupName, vaultName, backupInstanceName, context);
    }

    public void stopProtection() {
        serviceManager.backupInstances().stopProtection(resourceGroupName, vaultName, backupInstanceName);
    }

    public void stopProtection(StopProtectionRequest parameters, Context context) {
        serviceManager.backupInstances()
            .stopProtection(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public void suspendBackups() {
        serviceManager.backupInstances().suspendBackups(resourceGroupName, vaultName, backupInstanceName);
    }

    public void suspendBackups(SuspendBackupRequest parameters, Context context) {
        serviceManager.backupInstances()
            .suspendBackups(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public void syncBackupInstance(SyncBackupInstanceRequest parameters) {
        serviceManager.backupInstances()
            .syncBackupInstance(resourceGroupName, vaultName, backupInstanceName, parameters);
    }

    public void syncBackupInstance(SyncBackupInstanceRequest parameters, Context context) {
        serviceManager.backupInstances()
            .syncBackupInstance(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public OperationJobExtendedInfo validateForRestore(ValidateRestoreRequestObject parameters) {
        return serviceManager.backupInstances()
            .validateForRestore(resourceGroupName, vaultName, backupInstanceName, parameters);
    }

    public OperationJobExtendedInfo validateForRestore(ValidateRestoreRequestObject parameters, Context context) {
        return serviceManager.backupInstances()
            .validateForRestore(resourceGroupName, vaultName, backupInstanceName, parameters, context);
    }

    public BackupInstanceResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public BackupInstanceResourceImpl withProperties(BackupInstance properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
