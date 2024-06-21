// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GoogleSheets linked service type properties.
 */
@Fluent
public final class GoogleSheetsLinkedServiceTypeProperties {
    /*
     * The api token for the GoogleSheets source.
     */
    @JsonProperty(value = "apiToken", required = true)
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of GoogleSheetsLinkedServiceTypeProperties class.
     */
    public GoogleSheetsLinkedServiceTypeProperties() {
    }

    /**
     * Get the apiToken property: The api token for the GoogleSheets source.
     * 
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the GoogleSheets source.
     * 
     * @param apiToken the apiToken value to set.
     * @return the GoogleSheetsLinkedServiceTypeProperties object itself.
     */
    public GoogleSheetsLinkedServiceTypeProperties withApiToken(SecretBase apiToken) {
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
     * @return the GoogleSheetsLinkedServiceTypeProperties object itself.
     */
    public GoogleSheetsLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property apiToken in model GoogleSheetsLinkedServiceTypeProperties"));
        } else {
            apiToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GoogleSheetsLinkedServiceTypeProperties.class);
}
