// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceUsageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list resource usages. It contains a list of resource usages &amp; limits and a URL link to
 * get the next set of results.
 */
@Immutable
public final class ResourceUsagesListResult {
    /*
     * URL to get the next set of resource usage list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * List of usages and limits for resources controlled by the Microsoft.StorageCache resource provider.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceUsageInner> value;

    /**
     * Creates an instance of ResourceUsagesListResult class.
     */
    public ResourceUsagesListResult() {
    }

    /**
     * Get the nextLink property: URL to get the next set of resource usage list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: List of usages and limits for resources controlled by the Microsoft.StorageCache resource
     * provider.
     * 
     * @return the value value.
     */
    public List<ResourceUsageInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
