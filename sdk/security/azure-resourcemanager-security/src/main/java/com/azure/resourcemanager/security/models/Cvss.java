// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CVSS details.
 */
@Immutable
public final class Cvss {
    /*
     * CVSS base
     */
    @JsonProperty(value = "base", access = JsonProperty.Access.WRITE_ONLY)
    private Float base;

    /**
     * Creates an instance of Cvss class.
     */
    public Cvss() {
    }

    /**
     * Get the base property: CVSS base.
     * 
     * @return the base value.
     */
    public Float base() {
        return this.base;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
