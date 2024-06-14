// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information of Access Rule in Network Security Perimeter profile.
 */
@Fluent
public final class NspAccessRule {
    /*
     * Name of the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties of Access Rule
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private NspAccessRuleProperties properties;

    /**
     * Creates an instance of NspAccessRule class.
     */
    public NspAccessRule() {
    }

    /**
     * Get the name property: Name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource.
     * 
     * @param name the name value to set.
     * @return the NspAccessRule object itself.
     */
    public NspAccessRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of Access Rule.
     * 
     * @return the properties value.
     */
    public NspAccessRuleProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
