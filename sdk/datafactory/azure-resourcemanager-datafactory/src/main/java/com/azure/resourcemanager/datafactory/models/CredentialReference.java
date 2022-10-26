// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Credential reference type. */
@Fluent
public final class CredentialReference {
    /*
     * Credential reference type.
     */
    @JsonProperty(value = "type", required = true)
    private CredentialReferenceType type;

    /*
     * Reference credential name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Credential reference type.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of CredentialReference class. */
    public CredentialReference() {
    }

    /**
     * Get the type property: Credential reference type.
     *
     * @return the type value.
     */
    public CredentialReferenceType type() {
        return this.type;
    }

    /**
     * Set the type property: Credential reference type.
     *
     * @param type the type value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference withType(CredentialReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference credential name.
     *
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference credential name.
     *
     * @param referenceName the referenceName value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the additionalProperties property: Credential reference type.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Credential reference type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CredentialReference object itself.
     */
    public CredentialReference withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model CredentialReference"));
        }
        if (referenceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property referenceName in model CredentialReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CredentialReference.class);
}
