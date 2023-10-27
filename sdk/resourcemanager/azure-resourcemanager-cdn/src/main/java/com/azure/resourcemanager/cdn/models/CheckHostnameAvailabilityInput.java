// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of CheckHostNameAvailability API. */
@Fluent
public final class CheckHostnameAvailabilityInput {
    /*
     * The host name to validate.
     */
    @JsonProperty(value = "hostName", required = true)
    private String hostname;

    /** Creates an instance of CheckHostnameAvailabilityInput class. */
    public CheckHostnameAvailabilityInput() {
    }

    /**
     * Get the hostname property: The host name to validate.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name to validate.
     *
     * @param hostname the hostname value to set.
     * @return the CheckHostnameAvailabilityInput object itself.
     */
    public CheckHostnameAvailabilityInput withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostname in model CheckHostnameAvailabilityInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckHostnameAvailabilityInput.class);
}
