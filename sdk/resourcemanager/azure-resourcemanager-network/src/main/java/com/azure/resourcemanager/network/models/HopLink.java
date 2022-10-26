// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.fluent.models.HopLinkProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Hop link. */
@Immutable
public final class HopLink {
    /*
     * The ID of the next hop.
     */
    @JsonProperty(value = "nextHopId", access = JsonProperty.Access.WRITE_ONLY)
    private String nextHopId;

    /*
     * Link type.
     */
    @JsonProperty(value = "linkType", access = JsonProperty.Access.WRITE_ONLY)
    private String linkType;

    /*
     * Hop link properties.
     */
    @JsonProperty(value = "properties")
    private HopLinkProperties innerProperties;

    /*
     * List of issues.
     */
    @JsonProperty(value = "issues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityIssue> issues;

    /*
     * Provides additional context on links.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> context;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /** Creates an instance of HopLink class. */
    public HopLink() {
    }

    /**
     * Get the nextHopId property: The ID of the next hop.
     *
     * @return the nextHopId value.
     */
    public String nextHopId() {
        return this.nextHopId;
    }

    /**
     * Get the linkType property: Link type.
     *
     * @return the linkType value.
     */
    public String linkType() {
        return this.linkType;
    }

    /**
     * Get the innerProperties property: Hop link properties.
     *
     * @return the innerProperties value.
     */
    private HopLinkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the issues property: List of issues.
     *
     * @return the issues value.
     */
    public List<ConnectivityIssue> issues() {
        return this.issues;
    }

    /**
     * Get the context property: Provides additional context on links.
     *
     * @return the context value.
     */
    public Map<String, String> context() {
        return this.context;
    }

    /**
     * Get the resourceId property: Resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the roundTripTimeMin property: Minimum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMin value.
     */
    public Long roundTripTimeMin() {
        return this.innerProperties() == null ? null : this.innerProperties().roundTripTimeMin();
    }

    /**
     * Get the roundTripTimeAvg property: Average roundtrip time in milliseconds.
     *
     * @return the roundTripTimeAvg value.
     */
    public Long roundTripTimeAvg() {
        return this.innerProperties() == null ? null : this.innerProperties().roundTripTimeAvg();
    }

    /**
     * Get the roundTripTimeMax property: Maximum roundtrip time in milliseconds.
     *
     * @return the roundTripTimeMax value.
     */
    public Long roundTripTimeMax() {
        return this.innerProperties() == null ? null : this.innerProperties().roundTripTimeMax();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }
}
