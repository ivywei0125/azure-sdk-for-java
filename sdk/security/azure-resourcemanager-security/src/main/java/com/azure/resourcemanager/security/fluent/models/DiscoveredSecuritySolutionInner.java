// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DiscoveredSecuritySolution model.
 */
@Fluent
public final class DiscoveredSecuritySolutionInner extends ProxyResource {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties", required = true)
    private DiscoveredSecuritySolutionProperties innerProperties = new DiscoveredSecuritySolutionProperties();

    /*
     * Location where the resource is stored
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Creates an instance of DiscoveredSecuritySolutionInner class.
     */
    public DiscoveredSecuritySolutionInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private DiscoveredSecuritySolutionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Location where the resource is stored.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the securityFamily property: The security family of the discovered solution.
     * 
     * @return the securityFamily value.
     */
    public SecurityFamily securityFamily() {
        return this.innerProperties() == null ? null : this.innerProperties().securityFamily();
    }

    /**
     * Set the securityFamily property: The security family of the discovered solution.
     * 
     * @param securityFamily the securityFamily value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSecurityFamily(SecurityFamily securityFamily) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withSecurityFamily(securityFamily);
        return this;
    }

    /**
     * Get the offer property: The security solutions' image offer.
     * 
     * @return the offer value.
     */
    public String offer() {
        return this.innerProperties() == null ? null : this.innerProperties().offer();
    }

    /**
     * Set the offer property: The security solutions' image offer.
     * 
     * @param offer the offer value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withOffer(String offer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withOffer(offer);
        return this;
    }

    /**
     * Get the publisher property: The security solutions' image publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Set the publisher property: The security solutions' image publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withPublisher(String publisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withPublisher(publisher);
        return this;
    }

    /**
     * Get the sku property: The security solutions' image sku.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The security solutions' image sku.
     * 
     * @param sku the sku value to set.
     * @return the DiscoveredSecuritySolutionInner object itself.
     */
    public DiscoveredSecuritySolutionInner withSku(String sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiscoveredSecuritySolutionProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model DiscoveredSecuritySolutionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiscoveredSecuritySolutionInner.class);
}
