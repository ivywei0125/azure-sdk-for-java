// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Azure SKU of the machines in the pool.
 */
@Fluent
public final class DevOpsAzureSku {
    /*
     * The Azure SKU name of the machines in the pool.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of DevOpsAzureSku class.
     */
    public DevOpsAzureSku() {
    }

    /**
     * Get the name property: The Azure SKU name of the machines in the pool.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Azure SKU name of the machines in the pool.
     * 
     * @param name the name value to set.
     * @return the DevOpsAzureSku object itself.
     */
    public DevOpsAzureSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model DevOpsAzureSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DevOpsAzureSku.class);
}
