// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservicefleet.models.FleetHubProfile;
import com.azure.resourcemanager.containerservicefleet.models.FleetProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Fleet properties. */
@Fluent
public final class FleetProperties {
    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FleetProvisioningState provisioningState;

    /*
     * The FleetHubProfile configures the Fleet's hub.
     */
    @JsonProperty(value = "hubProfile")
    private FleetHubProfile hubProfile;

    /** Creates an instance of FleetProperties class. */
    public FleetProperties() {
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public FleetProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hubProfile property: The FleetHubProfile configures the Fleet's hub.
     *
     * @return the hubProfile value.
     */
    public FleetHubProfile hubProfile() {
        return this.hubProfile;
    }

    /**
     * Set the hubProfile property: The FleetHubProfile configures the Fleet's hub.
     *
     * @param hubProfile the hubProfile value to set.
     * @return the FleetProperties object itself.
     */
    public FleetProperties withHubProfile(FleetHubProfile hubProfile) {
        this.hubProfile = hubProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hubProfile() != null) {
            hubProfile().validate();
        }
    }
}
