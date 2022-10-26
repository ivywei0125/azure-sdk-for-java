// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Secret definition. */
@Fluent
public final class Secret {
    /*
     * Secret Name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Secret Value.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of Secret class. */
    public Secret() {
    }

    /**
     * Get the name property: Secret Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Secret Name.
     *
     * @param name the name value to set.
     * @return the Secret object itself.
     */
    public Secret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Secret Value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Secret Value.
     *
     * @param value the value value to set.
     * @return the Secret object itself.
     */
    public Secret withValue(String value) {
        this.value = value;
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
