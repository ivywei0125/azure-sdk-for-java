// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.Office365LinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Office365 linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365")
@Fluent
public final class Office365LinkedService extends LinkedService {
    /*
     * Office365 linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private Office365LinkedServiceTypeProperties innerTypeProperties = new Office365LinkedServiceTypeProperties();

    /** Creates an instance of Office365LinkedService class. */
    public Office365LinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Office365 linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private Office365LinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public Office365LinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365LinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365LinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365LinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the office365TenantId value.
     */
    public Object office365TenantId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().office365TenantId();
    }

    /**
     * Set the office365TenantId property: Azure tenant ID to which the Office 365 account belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param office365TenantId the office365TenantId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService withOffice365TenantId(Object office365TenantId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Office365LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withOffice365TenantId(office365TenantId);
        return this;
    }

    /**
     * Get the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalTenantId value.
     */
    public Object servicePrincipalTenantId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalTenantId();
    }

    /**
     * Set the servicePrincipalTenantId property: Specify the tenant information under which your Azure AD web
     * application resides. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalTenantId the servicePrincipalTenantId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService withServicePrincipalTenantId(Object servicePrincipalTenantId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Office365LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalTenantId(servicePrincipalTenantId);
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Office365LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Office365LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the Office365LinkedService object itself.
     */
    public Office365LinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Office365LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model Office365LinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Office365LinkedService.class);
}
