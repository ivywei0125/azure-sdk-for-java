// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of a single parameter for an entity. */
@Fluent
public final class GlobalParameterSpecification {
    /*
     * Global Parameter type.
     */
    @JsonProperty(value = "type", required = true)
    private GlobalParameterType type;

    /*
     * Value of parameter.
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /** Creates an instance of GlobalParameterSpecification class. */
    public GlobalParameterSpecification() {
    }

    /**
     * Get the type property: Global Parameter type.
     *
     * @return the type value.
     */
    public GlobalParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: Global Parameter type.
     *
     * @param type the type value to set.
     * @return the GlobalParameterSpecification object itself.
     */
    public GlobalParameterSpecification withType(GlobalParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Value of parameter.
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Value of parameter.
     *
     * @param value the value value to set.
     * @return the GlobalParameterSpecification object itself.
     */
    public GlobalParameterSpecification withValue(Object value) {
        this.value = value;
        return this;
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
                    new IllegalArgumentException(
                        "Missing required property type in model GlobalParameterSpecification"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model GlobalParameterSpecification"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GlobalParameterSpecification.class);
}
