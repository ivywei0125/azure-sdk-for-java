// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * SAP ODP Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOdp")
@JsonFlatten
@Fluent
public class SapOdpLinkedService extends LinkedService {
    /*
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.server")
    private Object server;

    /*
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a
     * string.) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.systemNumber")
    private Object systemNumber;

    /*
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number
     * represented as a string) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /*
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.language")
    private Object language;

    /*
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.systemId")
    private Object systemId;

    /*
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password to access the SAP server where the table is located.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.messageServer")
    private Object messageServer;

    /*
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.messageServerService")
    private Object messageServerService;

    /*
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on).
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.sncMode")
    private Object sncMode;

    /*
     * Initiator's SNC name to access the SAP server where the table is located. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.sncMyName")
    private Object sncMyName;

    /*
     * Communication partner's SNC name to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.sncPartnerName")
    private Object sncPartnerName;

    /*
     * External security product's library to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.sncLibraryPath")
    private Object sncLibraryPath;

    /*
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.sncQop")
    private Object sncQop;

    /*
     * SNC X509 certificate file path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.x509CertificatePath")
    private Object x509CertificatePath;

    /*
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.logonGroup")
    private Object logonGroup;

    /*
     * The subscriber name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriberName")
    private Object subscriberName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Creates an instance of SapOdpLinkedService class.
     */
    public SapOdpLinkedService() {
    }

    /**
     * Get the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @param server the server value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @return the systemNumber value.
     */
    public Object getSystemNumber() {
        return this.systemNumber;
    }

    /**
     * Set the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @param systemNumber the systemNumber value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     * 
     * @return the language value.
     */
    public Object getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     * 
     * @param language the language value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @return the systemId value.
     */
    public Object getSystemId() {
        return this.systemId;
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @param systemId the systemId value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSystemId(Object systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * Get the userName property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     * 
     * @param userName the userName value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP server where the table is located.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP server where the table is located.
     * 
     * @param password the password value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the messageServer value.
     */
    public Object getMessageServer() {
        return this.messageServer;
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @param messageServer the messageServer value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setMessageServer(Object messageServer) {
        this.messageServer = messageServer;
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @return the messageServerService value.
     */
    public Object getMessageServerService() {
        return this.messageServerService;
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @param messageServerService the messageServerService value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setMessageServerService(Object messageServerService) {
        this.messageServerService = messageServerService;
        return this;
    }

    /**
     * Get the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     * @return the sncMode value.
     */
    public Object getSncMode() {
        return this.sncMode;
    }

    /**
     * Set the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     * @param sncMode the sncMode value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSncMode(Object sncMode) {
        this.sncMode = sncMode;
        return this;
    }

    /**
     * Get the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     * 
     * @return the sncMyName value.
     */
    public Object getSncMyName() {
        return this.sncMyName;
    }

    /**
     * Set the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     * 
     * @param sncMyName the sncMyName value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSncMyName(Object sncMyName) {
        this.sncMyName = sncMyName;
        return this;
    }

    /**
     * Get the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @return the sncPartnerName value.
     */
    public Object getSncPartnerName() {
        return this.sncPartnerName;
    }

    /**
     * Set the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @param sncPartnerName the sncPartnerName value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSncPartnerName(Object sncPartnerName) {
        this.sncPartnerName = sncPartnerName;
        return this;
    }

    /**
     * Get the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @return the sncLibraryPath value.
     */
    public Object getSncLibraryPath() {
        return this.sncLibraryPath;
    }

    /**
     * Set the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @param sncLibraryPath the sncLibraryPath value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSncLibraryPath(Object sncLibraryPath) {
        this.sncLibraryPath = sncLibraryPath;
        return this;
    }

    /**
     * Get the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     * 
     * @return the sncQop value.
     */
    public Object getSncQop() {
        return this.sncQop;
    }

    /**
     * Set the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     * 
     * @param sncQop the sncQop value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSncQop(Object sncQop) {
        this.sncQop = sncQop;
        return this;
    }

    /**
     * Get the x509CertificatePath property: SNC X509 certificate file path. Type: string (or Expression with
     * resultType string).
     * 
     * @return the x509CertificatePath value.
     */
    public Object getX509CertificatePath() {
        return this.x509CertificatePath;
    }

    /**
     * Set the x509CertificatePath property: SNC X509 certificate file path. Type: string (or Expression with
     * resultType string).
     * 
     * @param x509CertificatePath the x509CertificatePath value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setX509CertificatePath(Object x509CertificatePath) {
        this.x509CertificatePath = x509CertificatePath;
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @return the logonGroup value.
     */
    public Object getLogonGroup() {
        return this.logonGroup;
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @param logonGroup the logonGroup value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setLogonGroup(Object logonGroup) {
        this.logonGroup = logonGroup;
        return this;
    }

    /**
     * Get the subscriberName property: The subscriber name. Type: string (or Expression with resultType string).
     * 
     * @return the subscriberName value.
     */
    public Object getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * Set the subscriberName property: The subscriber name. Type: string (or Expression with resultType string).
     * 
     * @param subscriberName the subscriberName value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setSubscriberName(Object subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapOdpLinkedService object itself.
     */
    public SapOdpLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
