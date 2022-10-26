// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed identity type properties. */
@Fluent
public final class ManagedIdentityTypeProperties {
    /*
     * The resource id of user assigned managed identity
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /** Creates an instance of ManagedIdentityTypeProperties class. */
    public ManagedIdentityTypeProperties() {
    }

    /**
     * Get the resourceId property: The resource id of user assigned managed identity.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of user assigned managed identity.
     *
     * @param resourceId the resourceId value to set.
     * @return the ManagedIdentityTypeProperties object itself.
     */
    public ManagedIdentityTypeProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
