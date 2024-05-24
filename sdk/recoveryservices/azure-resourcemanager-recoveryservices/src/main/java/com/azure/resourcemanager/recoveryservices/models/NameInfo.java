// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The name of usage.
 */
@Fluent
public final class NameInfo {
    /*
     * Value of usage.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Localized value of usage.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Creates an instance of NameInfo class.
     */
    public NameInfo() {
    }

    /**
     * Get the value property: Value of usage.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of usage.
     * 
     * @param value the value value to set.
     * @return the NameInfo object itself.
     */
    public NameInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized value of usage.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized value of usage.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the NameInfo object itself.
     */
    public NameInfo withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
