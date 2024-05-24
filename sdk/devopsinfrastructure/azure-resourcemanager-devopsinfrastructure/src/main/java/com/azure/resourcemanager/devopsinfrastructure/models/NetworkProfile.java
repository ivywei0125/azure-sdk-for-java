// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network profile of the machines in the pool.
 */
@Fluent
public final class NetworkProfile {
    /*
     * The subnet id on which to put all machines created in the pool.
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /**
     * Creates an instance of NetworkProfile class.
     */
    public NetworkProfile() {
    }

    /**
     * Get the subnetId property: The subnet id on which to put all machines created in the pool.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnet id on which to put all machines created in the pool.
     * 
     * @param subnetId the subnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnetId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property subnetId in model NetworkProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkProfile.class);
}
