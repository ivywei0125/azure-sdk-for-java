// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Smartsheet linked service type properties. */
@Fluent
public final class SmartsheetLinkedServiceTypeProperties {
    /*
     * The api token for the Smartsheet source.
     */
    @JsonProperty(value = "apiToken", required = true)
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of SmartsheetLinkedServiceTypeProperties class. */
    public SmartsheetLinkedServiceTypeProperties() {
    }

    /**
     * Get the apiToken property: The api token for the Smartsheet source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the Smartsheet source.
     *
     * @param apiToken the apiToken value to set.
     * @return the SmartsheetLinkedServiceTypeProperties object itself.
     */
    public SmartsheetLinkedServiceTypeProperties withApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
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
     * @return the SmartsheetLinkedServiceTypeProperties object itself.
     */
    public SmartsheetLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (apiToken() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property apiToken in model SmartsheetLinkedServiceTypeProperties"));
        } else {
            apiToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SmartsheetLinkedServiceTypeProperties.class);
}
