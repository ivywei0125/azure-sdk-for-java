// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to a service resource.
 */
@Fluent
public final class ServiceResourceId {
    /*
     * Service resource ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of ServiceResourceId class.
     */
    public ServiceResourceId() {
    }

    /**
     * Get the id property: Service resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Service resource ID.
     * 
     * @param id the id value to set.
     * @return the ServiceResourceId object itself.
     */
    public ServiceResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model ServiceResourceId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceResourceId.class);
}
