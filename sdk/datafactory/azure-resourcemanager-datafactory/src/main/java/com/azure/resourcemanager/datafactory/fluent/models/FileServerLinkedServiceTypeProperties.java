// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** File system linked service properties. */
@Fluent
public final class FileServerLinkedServiceTypeProperties {
    /*
     * Host name of the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * User ID to logon the server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userId")
    private Object userId;

    /*
     * Password to logon the server.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of FileServerLinkedServiceTypeProperties class. */
    public FileServerLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the FileServerLinkedServiceTypeProperties object itself.
     */
    public FileServerLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value.
     */
    public Object userId() {
        return this.userId;
    }

    /**
     * Set the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set.
     * @return the FileServerLinkedServiceTypeProperties object itself.
     */
    public FileServerLinkedServiceTypeProperties withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the password property: Password to logon the server.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the server.
     *
     * @param password the password value to set.
     * @return the FileServerLinkedServiceTypeProperties object itself.
     */
    public FileServerLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the FileServerLinkedServiceTypeProperties object itself.
     */
    public FileServerLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model FileServerLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileServerLinkedServiceTypeProperties.class);
}
