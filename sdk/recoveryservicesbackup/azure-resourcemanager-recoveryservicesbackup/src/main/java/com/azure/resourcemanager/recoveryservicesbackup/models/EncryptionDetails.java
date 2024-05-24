// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details needed if the VM was encrypted at the time of backup.
 */
@Fluent
public final class EncryptionDetails {
    /*
     * Identifies whether this backup copy represents an encrypted VM at the time of backup.
     */
    @JsonProperty(value = "encryptionEnabled")
    private Boolean encryptionEnabled;

    /*
     * Key Url.
     */
    @JsonProperty(value = "kekUrl")
    private String kekUrl;

    /*
     * Secret Url.
     */
    @JsonProperty(value = "secretKeyUrl")
    private String secretKeyUrl;

    /*
     * ID of Key Vault where KEK is stored.
     */
    @JsonProperty(value = "kekVaultId")
    private String kekVaultId;

    /*
     * ID of Key Vault where Secret is stored.
     */
    @JsonProperty(value = "secretKeyVaultId")
    private String secretKeyVaultId;

    /**
     * Creates an instance of EncryptionDetails class.
     */
    public EncryptionDetails() {
    }

    /**
     * Get the encryptionEnabled property: Identifies whether this backup copy represents an encrypted VM at the time of
     * backup.
     * 
     * @return the encryptionEnabled value.
     */
    public Boolean encryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * Set the encryptionEnabled property: Identifies whether this backup copy represents an encrypted VM at the time of
     * backup.
     * 
     * @param encryptionEnabled the encryptionEnabled value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withEncryptionEnabled(Boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
        return this;
    }

    /**
     * Get the kekUrl property: Key Url.
     * 
     * @return the kekUrl value.
     */
    public String kekUrl() {
        return this.kekUrl;
    }

    /**
     * Set the kekUrl property: Key Url.
     * 
     * @param kekUrl the kekUrl value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekUrl(String kekUrl) {
        this.kekUrl = kekUrl;
        return this;
    }

    /**
     * Get the secretKeyUrl property: Secret Url.
     * 
     * @return the secretKeyUrl value.
     */
    public String secretKeyUrl() {
        return this.secretKeyUrl;
    }

    /**
     * Set the secretKeyUrl property: Secret Url.
     * 
     * @param secretKeyUrl the secretKeyUrl value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withSecretKeyUrl(String secretKeyUrl) {
        this.secretKeyUrl = secretKeyUrl;
        return this;
    }

    /**
     * Get the kekVaultId property: ID of Key Vault where KEK is stored.
     * 
     * @return the kekVaultId value.
     */
    public String kekVaultId() {
        return this.kekVaultId;
    }

    /**
     * Set the kekVaultId property: ID of Key Vault where KEK is stored.
     * 
     * @param kekVaultId the kekVaultId value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekVaultId(String kekVaultId) {
        this.kekVaultId = kekVaultId;
        return this;
    }

    /**
     * Get the secretKeyVaultId property: ID of Key Vault where Secret is stored.
     * 
     * @return the secretKeyVaultId value.
     */
    public String secretKeyVaultId() {
        return this.secretKeyVaultId;
    }

    /**
     * Set the secretKeyVaultId property: ID of Key Vault where Secret is stored.
     * 
     * @param secretKeyVaultId the secretKeyVaultId value to set.
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withSecretKeyVaultId(String secretKeyVaultId) {
        this.secretKeyVaultId = secretKeyVaultId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
