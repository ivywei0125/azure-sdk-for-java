// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SapHanaAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to this linked service type. */
@Fluent
public final class SapHanaLinkedServiceProperties {
    /*
     * SAP HANA ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString")
    private Object connectionString;

    /*
     * Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "server")
    private Object server;

    /*
     * The authentication type to be used to connect to the SAP HANA server.
     */
    @JsonProperty(value = "authenticationType")
    private SapHanaAuthenticationType authenticationType;

    /*
     * Username to access the SAP HANA server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password to access the SAP HANA server.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of SapHanaLinkedServiceProperties class. */
    public SapHanaLinkedServiceProperties() {
    }

    /**
     * Get the connectionString property: SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the server property: Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the SAP HANA server.
     *
     * @return the authenticationType value.
     */
    public SapHanaAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the SAP HANA server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withAuthenticationType(SapHanaAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: Username to access the SAP HANA server. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username to access the SAP HANA server. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP HANA server.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP HANA server.
     *
     * @param password the password value to set.
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withPassword(SecretBase password) {
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
     * @return the SapHanaLinkedServiceProperties object itself.
     */
    public SapHanaLinkedServiceProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }
}
