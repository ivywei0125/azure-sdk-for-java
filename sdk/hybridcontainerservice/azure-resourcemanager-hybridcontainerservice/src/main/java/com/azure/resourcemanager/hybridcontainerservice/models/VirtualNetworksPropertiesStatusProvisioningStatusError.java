// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworksPropertiesStatusProvisioningStatusError model. */
@Fluent
public final class VirtualNetworksPropertiesStatusProvisioningStatusError {
    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of VirtualNetworksPropertiesStatusProvisioningStatusError class. */
    public VirtualNetworksPropertiesStatusProvisioningStatusError() {
    }

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the VirtualNetworksPropertiesStatusProvisioningStatusError object itself.
     */
    public VirtualNetworksPropertiesStatusProvisioningStatusError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the VirtualNetworksPropertiesStatusProvisioningStatusError object itself.
     */
    public VirtualNetworksPropertiesStatusProvisioningStatusError withMessage(String message) {
        this.message = message;
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
