// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The paths that are included in indexing.
 */
@Fluent
public final class IncludedPath {
    /*
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * List of indexes for this path
     */
    @JsonProperty(value = "indexes")
    private List<Indexes> indexes;

    /**
     * Creates an instance of IncludedPath class.
     */
    public IncludedPath() {
    }

    /**
     * Get the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     *
     * @param path the path value to set.
     * @return the IncludedPath object itself.
     */
    public IncludedPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the indexes property: List of indexes for this path.
     *
     * @return the indexes value.
     */
    public List<Indexes> indexes() {
        return this.indexes;
    }

    /**
     * Set the indexes property: List of indexes for this path.
     *
     * @param indexes the indexes value to set.
     * @return the IncludedPath object itself.
     */
    public IncludedPath withIndexes(List<Indexes> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (indexes() != null) {
            indexes().forEach(e -> e.validate());
        }
    }
}
