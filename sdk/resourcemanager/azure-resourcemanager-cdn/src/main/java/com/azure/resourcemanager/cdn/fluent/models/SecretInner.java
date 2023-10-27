// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.SecretParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Friendly Secret name mapping to the any Secret or secret related information. */
@Fluent
public final class SecretInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the Secret to create.
     */
    @JsonProperty(value = "properties")
    private SecretProperties innerProperties;

    /** Creates an instance of SecretInner class. */
    public SecretInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the Secret to create.
     *
     * @return the innerProperties value.
     */
    private SecretProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the profileName property: The name of the profile which holds the secret.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the parameters property: object which contains secret parameters.
     *
     * @return the parameters value.
     */
    public SecretParameters parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: object which contains secret parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SecretInner object itself.
     */
    public SecretInner withParameters(SecretParameters parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecretProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
