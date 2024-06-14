// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Effective Virtual Networks Parameter.
 */
@Fluent
public final class ActiveConfigurationParameter {
    /*
     * List of regions.
     */
    @JsonProperty(value = "regions")
    private List<String> regions;

    /*
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     */
    @JsonProperty(value = "skipToken")
    private String skipToken;

    /**
     * Creates an instance of ActiveConfigurationParameter class.
     */
    public ActiveConfigurationParameter() {
    }

    /**
     * Get the regions property: List of regions.
     *
     * @return the regions value.
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: List of regions.
     *
     * @param regions the regions value to set.
     * @return the ActiveConfigurationParameter object itself.
     */
    public ActiveConfigurationParameter withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     *
     * @return the skipToken value.
     */
    public String skipToken() {
        return this.skipToken;
    }

    /**
     * Set the skipToken property: When present, the value can be passed to a subsequent query call (together with the
     * same query and scopes used in the current request) to retrieve the next page of data.
     *
     * @param skipToken the skipToken value to set.
     * @return the ActiveConfigurationParameter object itself.
     */
    public ActiveConfigurationParameter withSkipToken(String skipToken) {
        this.skipToken = skipToken;
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
