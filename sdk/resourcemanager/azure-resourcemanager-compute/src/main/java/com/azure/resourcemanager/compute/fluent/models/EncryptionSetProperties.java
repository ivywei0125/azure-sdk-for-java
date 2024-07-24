// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.ApiError;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.models.KeyForDiskEncryptionSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The EncryptionSetProperties model.
 */
@Fluent
public final class EncryptionSetProperties {
    /*
     * The type of key used to encrypt the data of the disk.
     */
    @JsonProperty(value = "encryptionType")
    private DiskEncryptionSetType encryptionType;

    /*
     * The key vault key which is currently used by this disk encryption set.
     */
    @JsonProperty(value = "activeKey")
    private KeyForDiskEncryptionSet activeKey;

    /*
     * A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in
     * progress. It will be empty if there is no ongoing key rotation.
     */
    @JsonProperty(value = "previousKeys", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeyForDiskEncryptionSet> previousKeys;

    /*
     * The disk encryption set provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     */
    @JsonProperty(value = "rotationToLatestKeyVersionEnabled")
    private Boolean rotationToLatestKeyVersionEnabled;

    /*
     * The time when the active key of this disk encryption set was updated.
     */
    @JsonProperty(value = "lastKeyRotationTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastKeyRotationTimestamp;

    /*
     * The error that was encountered during auto-key rotation. If an error is present, then auto-key rotation will not
     * be attempted until the error on this disk encryption set is fixed.
     */
    @JsonProperty(value = "autoKeyRotationError", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError autoKeyRotationError;

    /*
     * Multi-tenant application client id to access key vault in a different tenant. Setting the value to 'None' will
     * clear the property.
     */
    @JsonProperty(value = "federatedClientId")
    private String federatedClientId;

    /**
     * Creates an instance of EncryptionSetProperties class.
     */
    public EncryptionSetProperties() {
    }

    /**
     * Get the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @return the encryptionType value.
     */
    public DiskEncryptionSetType encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @param encryptionType the encryptionType value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withEncryptionType(DiskEncryptionSetType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Get the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @return the activeKey value.
     */
    public KeyForDiskEncryptionSet activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @param activeKey the activeKey value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withActiveKey(KeyForDiskEncryptionSet activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Get the previousKeys property: A readonly collection of key vault keys previously used by this disk encryption
     * set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     * @return the previousKeys value.
     */
    public List<KeyForDiskEncryptionSet> previousKeys() {
        return this.previousKeys;
    }

    /**
     * Get the provisioningState property: The disk encryption set provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @return the rotationToLatestKeyVersionEnabled value.
     */
    public Boolean rotationToLatestKeyVersionEnabled() {
        return this.rotationToLatestKeyVersionEnabled;
    }

    /**
     * Set the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @param rotationToLatestKeyVersionEnabled the rotationToLatestKeyVersionEnabled value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withRotationToLatestKeyVersionEnabled(Boolean rotationToLatestKeyVersionEnabled) {
        this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
        return this;
    }

    /**
     * Get the lastKeyRotationTimestamp property: The time when the active key of this disk encryption set was updated.
     * 
     * @return the lastKeyRotationTimestamp value.
     */
    public OffsetDateTime lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    /**
     * Get the autoKeyRotationError property: The error that was encountered during auto-key rotation. If an error is
     * present, then auto-key rotation will not be attempted until the error on this disk encryption set is fixed.
     * 
     * @return the autoKeyRotationError value.
     */
    public ApiError autoKeyRotationError() {
        return this.autoKeyRotationError;
    }

    /**
     * Get the federatedClientId property: Multi-tenant application client id to access key vault in a different tenant.
     * Setting the value to 'None' will clear the property.
     * 
     * @return the federatedClientId value.
     */
    public String federatedClientId() {
        return this.federatedClientId;
    }

    /**
     * Set the federatedClientId property: Multi-tenant application client id to access key vault in a different tenant.
     * Setting the value to 'None' will clear the property.
     * 
     * @param federatedClientId the federatedClientId value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withFederatedClientId(String federatedClientId) {
        this.federatedClientId = federatedClientId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeKey() != null) {
            activeKey().validate();
        }
        if (previousKeys() != null) {
            previousKeys().forEach(e -> e.validate());
        }
        if (autoKeyRotationError() != null) {
            autoKeyRotationError().validate();
        }
    }
}
