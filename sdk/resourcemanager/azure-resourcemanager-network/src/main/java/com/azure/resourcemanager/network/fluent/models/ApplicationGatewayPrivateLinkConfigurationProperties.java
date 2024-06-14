// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ApplicationGatewayPrivateLinkIpConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Properties of private link configuration on an application gateway.
 */
@Fluent
public final class ApplicationGatewayPrivateLinkConfigurationProperties {
    /*
     * An array of application gateway private link ip configurations.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the application gateway private link configuration.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewayPrivateLinkConfigurationProperties class.
     */
    public ApplicationGatewayPrivateLinkConfigurationProperties() {
    }

    /**
     * Get the ipConfigurations property: An array of application gateway private link ip configurations.
     *
     * @return the ipConfigurations value.
     */
    public List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: An array of application gateway private link ip configurations.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the ApplicationGatewayPrivateLinkConfigurationProperties object itself.
     */
    public ApplicationGatewayPrivateLinkConfigurationProperties
        withIpConfigurations(List<ApplicationGatewayPrivateLinkIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway private link configuration.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
