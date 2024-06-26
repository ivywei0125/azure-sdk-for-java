// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInstanceViewResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The instance view of a HDInsight Cluster.
 */
@Fluent
public final class ClusterInstanceViewsResult {
    /*
     * Cluster instance view array.
     */
    @JsonProperty(value = "value")
    private List<ClusterInstanceViewResultInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ClusterInstanceViewsResult class.
     */
    public ClusterInstanceViewsResult() {
    }

    /**
     * Get the value property: Cluster instance view array.
     * 
     * @return the value value.
     */
    public List<ClusterInstanceViewResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Cluster instance view array.
     * 
     * @param value the value value to set.
     * @return the ClusterInstanceViewsResult object itself.
     */
    public ClusterInstanceViewsResult withValue(List<ClusterInstanceViewResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
