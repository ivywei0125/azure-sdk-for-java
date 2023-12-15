// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of ApplicationGatewaySslPredefinedPolicy.
 */
@Fluent
public final class ApplicationGatewaySslPredefinedPolicyPropertiesFormat {
    /*
     * Ssl cipher suites to be enabled in the specified order for application gateway.
     */
    @JsonProperty(value = "cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /*
     * Minimum version of Ssl protocol to be supported on application gateway.
     */
    @JsonProperty(value = "minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

    /**
     * Creates an instance of ApplicationGatewaySslPredefinedPolicyPropertiesFormat class.
     */
    public ApplicationGatewaySslPredefinedPolicyPropertiesFormat() {
    }

    /**
     * Get the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     * 
     * @return the cipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set the cipherSuites property: Ssl cipher suites to be enabled in the specified order for application gateway.
     * 
     * @param cipherSuites the cipherSuites value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyPropertiesFormat object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyPropertiesFormat
        withCipherSuites(List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     * 
     * @return the minProtocolVersion value.
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set the minProtocolVersion property: Minimum version of Ssl protocol to be supported on application gateway.
     * 
     * @param minProtocolVersion the minProtocolVersion value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyPropertiesFormat object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyPropertiesFormat
        withMinProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
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
