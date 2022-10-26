// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.HubRouteTableInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of RouteTables and a URL nextLink to get the next set of results. */
@Fluent
public final class ListHubRouteTablesResult {
    /*
     * List of RouteTables.
     */
    @JsonProperty(value = "value")
    private List<HubRouteTableInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ListHubRouteTablesResult class. */
    public ListHubRouteTablesResult() {
    }

    /**
     * Get the value property: List of RouteTables.
     *
     * @return the value value.
     */
    public List<HubRouteTableInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of RouteTables.
     *
     * @param value the value value to set.
     * @return the ListHubRouteTablesResult object itself.
     */
    public ListHubRouteTablesResult withValue(List<HubRouteTableInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListHubRouteTablesResult object itself.
     */
    public ListHubRouteTablesResult withNextLink(String nextLink) {
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
