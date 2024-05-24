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
 * IaaS VM workload-specific backup item representing a classic virtual machine.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "containerType",
    defaultImpl = AzureIaaSClassicComputeVMContainer.class,
    visible = true)
@JsonTypeName("Microsoft.ClassicCompute/virtualMachines")
@Fluent
public final class AzureIaaSClassicComputeVMContainer extends IaaSvmContainer {
    /*
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     */
    @JsonTypeId
    @JsonProperty(value = "containerType", required = true)
    private ProtectableContainerType containerType
        = ProtectableContainerType.MICROSOFT_CLASSIC_COMPUTE_VIRTUAL_MACHINES;

    /**
     * Creates an instance of AzureIaaSClassicComputeVMContainer class.
     */
    public AzureIaaSClassicComputeVMContainer() {
    }

    /**
     * Get the containerType property: Type of the container. The value of this property for: 1. Compute Azure VM is
     * Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer.
     * 
     * @return the containerType value.
     */
    @Override
    public ProtectableContainerType containerType() {
        return this.containerType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withVirtualMachineVersion(String virtualMachineVersion) {
        super.withVirtualMachineVersion(virtualMachineVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withResourceGroup(String resourceGroup) {
        super.withResourceGroup(resourceGroup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSClassicComputeVMContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
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
