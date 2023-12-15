// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteLinkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpressRouteLink List Result
 * 
 * Response for ListExpressRouteLinks API service call.
 */
@Fluent
public final class ExpressRouteLinkListResult {
    /*
     * The list of ExpressRouteLink sub-resources.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteLinkInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ExpressRouteLinkListResult class.
     */
    public ExpressRouteLinkListResult() {
    }

    /**
     * Get the value property: The list of ExpressRouteLink sub-resources.
     * 
     * @return the value value.
     */
    public List<ExpressRouteLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of ExpressRouteLink sub-resources.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteLinkListResult object itself.
     */
    public ExpressRouteLinkListResult withValue(List<ExpressRouteLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteLinkListResult object itself.
     */
    public ExpressRouteLinkListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
