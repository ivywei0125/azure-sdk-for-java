// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * AzureWorkload SQL -specific restore. Specifically for full/diff restore.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = AzureWorkloadSqlRestoreRequest.class,
    visible = true)
@JsonTypeName("AzureWorkloadSQLRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadSQLPointInTimeRestoreRequest",
        value = AzureWorkloadSqlPointInTimeRestoreRequest.class),
    @JsonSubTypes.Type(
        name = "AzureWorkloadSQLRestoreWithRehydrateRequest",
        value = AzureWorkloadSqlRestoreWithRehydrateRequest.class) })
@Fluent
public class AzureWorkloadSqlRestoreRequest extends AzureWorkloadRestoreRequest {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType = "AzureWorkloadSQLRestoreRequest";

    /*
     * Default option set to true. If this is set to false, alternate data directory must be provided
     */
    @JsonProperty(value = "shouldUseAlternateTargetLocation")
    private Boolean shouldUseAlternateTargetLocation;

    /*
     * SQL specific property where user can chose to set no-recovery when restore operation is tried
     */
    @JsonProperty(value = "isNonRecoverable")
    private Boolean isNonRecoverable;

    /*
     * Data directory details
     */
    @JsonProperty(value = "alternateDirectoryPaths")
    private List<SqlDataDirectoryMapping> alternateDirectoryPaths;

    /**
     * Creates an instance of AzureWorkloadSqlRestoreRequest class.
     */
    public AzureWorkloadSqlRestoreRequest() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the shouldUseAlternateTargetLocation property: Default option set to true. If this is set to false, alternate
     * data directory must be provided.
     * 
     * @return the shouldUseAlternateTargetLocation value.
     */
    public Boolean shouldUseAlternateTargetLocation() {
        return this.shouldUseAlternateTargetLocation;
    }

    /**
     * Set the shouldUseAlternateTargetLocation property: Default option set to true. If this is set to false, alternate
     * data directory must be provided.
     * 
     * @param shouldUseAlternateTargetLocation the shouldUseAlternateTargetLocation value to set.
     * @return the AzureWorkloadSqlRestoreRequest object itself.
     */
    public AzureWorkloadSqlRestoreRequest
        withShouldUseAlternateTargetLocation(Boolean shouldUseAlternateTargetLocation) {
        this.shouldUseAlternateTargetLocation = shouldUseAlternateTargetLocation;
        return this;
    }

    /**
     * Get the isNonRecoverable property: SQL specific property where user can chose to set no-recovery when restore
     * operation is tried.
     * 
     * @return the isNonRecoverable value.
     */
    public Boolean isNonRecoverable() {
        return this.isNonRecoverable;
    }

    /**
     * Set the isNonRecoverable property: SQL specific property where user can chose to set no-recovery when restore
     * operation is tried.
     * 
     * @param isNonRecoverable the isNonRecoverable value to set.
     * @return the AzureWorkloadSqlRestoreRequest object itself.
     */
    public AzureWorkloadSqlRestoreRequest withIsNonRecoverable(Boolean isNonRecoverable) {
        this.isNonRecoverable = isNonRecoverable;
        return this;
    }

    /**
     * Get the alternateDirectoryPaths property: Data directory details.
     * 
     * @return the alternateDirectoryPaths value.
     */
    public List<SqlDataDirectoryMapping> alternateDirectoryPaths() {
        return this.alternateDirectoryPaths;
    }

    /**
     * Set the alternateDirectoryPaths property: Data directory details.
     * 
     * @param alternateDirectoryPaths the alternateDirectoryPaths value to set.
     * @return the AzureWorkloadSqlRestoreRequest object itself.
     */
    public AzureWorkloadSqlRestoreRequest
        withAlternateDirectoryPaths(List<SqlDataDirectoryMapping> alternateDirectoryPaths) {
        this.alternateDirectoryPaths = alternateDirectoryPaths;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withTargetResourceGroupName(String targetResourceGroupName) {
        super.withTargetResourceGroupName(targetResourceGroupName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest
        withUserAssignedManagedIdentityDetails(UserAssignedManagedIdentityDetails userAssignedManagedIdentityDetails) {
        super.withUserAssignedManagedIdentityDetails(userAssignedManagedIdentityDetails);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest
        withSnapshotRestoreParameters(SnapshotRestoreParameters snapshotRestoreParameters) {
        super.withSnapshotRestoreParameters(snapshotRestoreParameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest withTargetVirtualMachineId(String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureWorkloadSqlRestoreRequest
        withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
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
        if (alternateDirectoryPaths() != null) {
            alternateDirectoryPaths().forEach(e -> e.validate());
        }
    }
}
