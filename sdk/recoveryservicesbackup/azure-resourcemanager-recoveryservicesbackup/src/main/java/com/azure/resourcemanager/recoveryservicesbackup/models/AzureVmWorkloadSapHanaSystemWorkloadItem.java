// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure VM workload-specific workload item representing SAP HANA System.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "workloadItemType",
    defaultImpl = AzureVmWorkloadSapHanaSystemWorkloadItem.class,
    visible = true)
@JsonTypeName("SAPHanaSystem")
@Fluent
public final class AzureVmWorkloadSapHanaSystemWorkloadItem extends AzureVmWorkloadItem {
    /*
     * Type of the backup item.
     */
    @JsonTypeId
    @JsonProperty(value = "workloadItemType", required = true)
    private String workloadItemType = "SAPHanaSystem";

    /**
     * Creates an instance of AzureVmWorkloadSapHanaSystemWorkloadItem class.
     */
    public AzureVmWorkloadSapHanaSystemWorkloadItem() {
    }

    /**
     * Get the workloadItemType property: Type of the backup item.
     * 
     * @return the workloadItemType value.
     */
    @Override
    public String workloadItemType() {
        return this.workloadItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withSubWorkloadItemCount(Integer subWorkloadItemCount) {
        super.withSubWorkloadItemCount(subWorkloadItemCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaSystemWorkloadItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
