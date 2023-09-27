// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Informix linked service properties. */
@Fluent
public final class InformixLinkedServiceTypeProperties {
    /*
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type:
     * string, or SecureString, or AzureKeyVaultSecretReference, or Expression with resultType string.
     */
    @JsonProperty(value = "connectionString", required = true)
    private Object connectionString;

    /*
     * Type of authentication used to connect to the Informix as ODBC data store. Possible values are: Anonymous and
     * Basic. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "authenticationType")
    private Object authenticationType;

    /*
     * The access credential portion of the connection string specified in driver-specific property-value format.
     */
    @JsonProperty(value = "credential")
    private SecretBase credential;

    /*
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password for Basic authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of InformixLinkedServiceTypeProperties class. */
    public InformixLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, or SecureString, or AzureKeyVaultSecretReference, or Expression with
     * resultType string.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, or SecureString, or AzureKeyVaultSecretReference, or Expression with
     * resultType string.
     *
     * @param connectionString the connectionString value to set.
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the Informix as ODBC data store.
     * Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the Informix as ODBC data store.
     * Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     *
     * @return the credential value.
     */
    public SecretBase credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The access credential portion of the connection string specified in driver-specific
     * property-value format.
     *
     * @param credential the credential value to set.
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withCredential(SecretBase credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for Basic authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for Basic authentication.
     *
     * @param password the password value to set.
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withPassword(SecretBase password) {
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
     * @return the InformixLinkedServiceTypeProperties object itself.
     */
    public InformixLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionString() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model InformixLinkedServiceTypeProperties"));
        }
        if (credential() != null) {
            credential().validate();
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InformixLinkedServiceTypeProperties.class);
}
