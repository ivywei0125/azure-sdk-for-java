// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.SparkAuthenticationType;
import com.azure.resourcemanager.datafactory.models.SparkServerType;
import com.azure.resourcemanager.datafactory.models.SparkThriftTransportProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spark Server linked service properties.
 */
@Fluent
public final class SparkLinkedServiceTypeProperties {
    /*
     * IP address or host name of the Spark server
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The TCP port that the Spark server uses to listen for client connections.
     */
    @JsonProperty(value = "port", required = true)
    private Object port;

    /*
     * The type of Spark server.
     */
    @JsonProperty(value = "serverType")
    private SparkServerType serverType;

    /*
     * The transport protocol to use in the Thrift layer.
     */
    @JsonProperty(value = "thriftTransportProtocol")
    private SparkThriftTransportProtocol thriftTransportProtocol;

    /*
     * The authentication method used to access the Spark server.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private SparkAuthenticationType authenticationType;

    /*
     * The user name that you use to access Spark Server.
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password corresponding to the user name that you provided in the Username field
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The partial URL corresponding to the Spark server.
     */
    @JsonProperty(value = "httpPath")
    private Object httpPath;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     */
    @JsonProperty(value = "enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over
     * SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file
     * installed with the IR.
     */
    @JsonProperty(value = "trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default
     * value is false.
     */
    @JsonProperty(value = "useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false.
     */
    @JsonProperty(value = "allowHostNameCNMismatch")
    private Object allowHostnameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     */
    @JsonProperty(value = "allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SparkLinkedServiceTypeProperties class.
     */
    public SparkLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: IP address or host name of the Spark server.
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: IP address or host name of the Spark server.
     * 
     * @param host the host value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Spark server uses to listen for client connections.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Spark server uses to listen for client connections.
     * 
     * @param port the port value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serverType property: The type of Spark server.
     * 
     * @return the serverType value.
     */
    public SparkServerType serverType() {
        return this.serverType;
    }

    /**
     * Set the serverType property: The type of Spark server.
     * 
     * @param serverType the serverType value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withServerType(SparkServerType serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * Get the thriftTransportProtocol property: The transport protocol to use in the Thrift layer.
     * 
     * @return the thriftTransportProtocol value.
     */
    public SparkThriftTransportProtocol thriftTransportProtocol() {
        return this.thriftTransportProtocol;
    }

    /**
     * Set the thriftTransportProtocol property: The transport protocol to use in the Thrift layer.
     * 
     * @param thriftTransportProtocol the thriftTransportProtocol value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties
        withThriftTransportProtocol(SparkThriftTransportProtocol thriftTransportProtocol) {
        this.thriftTransportProtocol = thriftTransportProtocol;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication method used to access the Spark server.
     * 
     * @return the authenticationType value.
     */
    public SparkAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication method used to access the Spark server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withAuthenticationType(SparkAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Spark Server.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name that you use to access Spark Server.
     * 
     * @param username the username value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name that you provided in the Username field.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name that you provided in the Username field.
     * 
     * @param password the password value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the Spark server.
     * 
     * @return the httpPath value.
     */
    public Object httpPath() {
        return this.httpPath;
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the Spark server.
     * 
     * @param httpPath the httpPath value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withHttpPath(Object httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     * 
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.allowHostnameCNMismatch;
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        this.allowHostnameCNMismatch = allowHostnameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
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
     * @return the SparkLinkedServiceTypeProperties object itself.
     */
    public SparkLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property host in model SparkLinkedServiceTypeProperties"));
        }
        if (port() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property port in model SparkLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property authenticationType in model SparkLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SparkLinkedServiceTypeProperties.class);
}
