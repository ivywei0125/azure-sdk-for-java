// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ResourceGuardProxyBase model.
 */
@Fluent
public final class ResourceGuardProxyBase {
    /*
     * The resourceGuardResourceId property.
     */
    @JsonProperty(value = "resourceGuardResourceId", required = true)
    private String resourceGuardResourceId;

    /*
     * The resourceGuardOperationDetails property.
     */
    @JsonProperty(value = "resourceGuardOperationDetails")
    private List<ResourceGuardOperationDetail> resourceGuardOperationDetails;

    /*
     * The lastUpdatedTime property.
     */
    @JsonProperty(value = "lastUpdatedTime")
    private String lastUpdatedTime;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ResourceGuardProxyBase class.
     */
    public ResourceGuardProxyBase() {
    }

    /**
     * Get the resourceGuardResourceId property: The resourceGuardResourceId property.
     * 
     * @return the resourceGuardResourceId value.
     */
    public String resourceGuardResourceId() {
        return this.resourceGuardResourceId;
    }

    /**
     * Set the resourceGuardResourceId property: The resourceGuardResourceId property.
     * 
     * @param resourceGuardResourceId the resourceGuardResourceId value to set.
     * @return the ResourceGuardProxyBase object itself.
     */
    public ResourceGuardProxyBase withResourceGuardResourceId(String resourceGuardResourceId) {
        this.resourceGuardResourceId = resourceGuardResourceId;
        return this;
    }

    /**
     * Get the resourceGuardOperationDetails property: The resourceGuardOperationDetails property.
     * 
     * @return the resourceGuardOperationDetails value.
     */
    public List<ResourceGuardOperationDetail> resourceGuardOperationDetails() {
        return this.resourceGuardOperationDetails;
    }

    /**
     * Set the resourceGuardOperationDetails property: The resourceGuardOperationDetails property.
     * 
     * @param resourceGuardOperationDetails the resourceGuardOperationDetails value to set.
     * @return the ResourceGuardProxyBase object itself.
     */
    public ResourceGuardProxyBase
        withResourceGuardOperationDetails(List<ResourceGuardOperationDetail> resourceGuardOperationDetails) {
        this.resourceGuardOperationDetails = resourceGuardOperationDetails;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: The lastUpdatedTime property.
     * 
     * @return the lastUpdatedTime value.
     */
    public String lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the lastUpdatedTime property: The lastUpdatedTime property.
     * 
     * @param lastUpdatedTime the lastUpdatedTime value to set.
     * @return the ResourceGuardProxyBase object itself.
     */
    public ResourceGuardProxyBase withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the description property: The description property.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     * 
     * @param description the description value to set.
     * @return the ResourceGuardProxyBase object itself.
     */
    public ResourceGuardProxyBase withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceGuardResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceGuardResourceId in model ResourceGuardProxyBase"));
        }
        if (resourceGuardOperationDetails() != null) {
            resourceGuardOperationDetails().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceGuardProxyBase.class);
}
