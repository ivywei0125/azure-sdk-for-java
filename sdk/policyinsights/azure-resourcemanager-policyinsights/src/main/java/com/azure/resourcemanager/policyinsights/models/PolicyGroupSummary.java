// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Policy definition group summary. */
@Fluent
public final class PolicyGroupSummary {
    /*
     * Policy group name.
     */
    @JsonProperty(value = "policyGroupName")
    private String policyGroupName;

    /*
     * Compliance summary for the policy definition group.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /** Creates an instance of PolicyGroupSummary class. */
    public PolicyGroupSummary() {
    }

    /**
     * Get the policyGroupName property: Policy group name.
     *
     * @return the policyGroupName value.
     */
    public String policyGroupName() {
        return this.policyGroupName;
    }

    /**
     * Set the policyGroupName property: Policy group name.
     *
     * @param policyGroupName the policyGroupName value to set.
     * @return the PolicyGroupSummary object itself.
     */
    public PolicyGroupSummary withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * Get the results property: Compliance summary for the policy definition group.
     *
     * @return the results value.
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set the results property: Compliance summary for the policy definition group.
     *
     * @param results the results value to set.
     * @return the PolicyGroupSummary object itself.
     */
    public PolicyGroupSummary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() != null) {
            results().validate();
        }
    }
}
