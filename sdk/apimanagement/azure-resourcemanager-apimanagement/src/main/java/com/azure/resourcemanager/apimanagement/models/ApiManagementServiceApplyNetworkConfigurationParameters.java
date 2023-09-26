// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameter supplied to the Apply Network configuration operation. */
@Fluent
public final class ApiManagementServiceApplyNetworkConfigurationParameters {
    /*
     * Location of the Api Management service to update for a multi-region service. For a service deployed in a single
     * region, this parameter is not required.
     */
    @JsonProperty(value = "location")
    private String location;

    /** Creates an instance of ApiManagementServiceApplyNetworkConfigurationParameters class. */
    public ApiManagementServiceApplyNetworkConfigurationParameters() {
    }

    /**
     * Get the location property: Location of the Api Management service to update for a multi-region service. For a
     * service deployed in a single region, this parameter is not required.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the Api Management service to update for a multi-region service. For a
     * service deployed in a single region, this parameter is not required.
     *
     * @param location the location value to set.
     * @return the ApiManagementServiceApplyNetworkConfigurationParameters object itself.
     */
    public ApiManagementServiceApplyNetworkConfigurationParameters withLocation(String location) {
        this.location = location;
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
