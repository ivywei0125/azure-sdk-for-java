// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Define match conditions.
 */
@Fluent
public final class MatchCondition {
    /*
     * List of match variables.
     */
    @JsonProperty(value = "matchVariables", required = true)
    private List<MatchVariable> matchVariables;

    /*
     * The operator to be matched.
     */
    @JsonProperty(value = "operator", required = true)
    private WebApplicationFirewallOperator operator;

    /*
     * Whether this is negate condition or not.
     */
    @JsonProperty(value = "negationConditon")
    private Boolean negationConditon;

    /*
     * Match value.
     */
    @JsonProperty(value = "matchValues", required = true)
    private List<String> matchValues;

    /*
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<WebApplicationFirewallTransform> transforms;

    /**
     * Creates an instance of MatchCondition class.
     */
    public MatchCondition() {
    }

    /**
     * Get the matchVariables property: List of match variables.
     * 
     * @return the matchVariables value.
     */
    public List<MatchVariable> matchVariables() {
        return this.matchVariables;
    }

    /**
     * Set the matchVariables property: List of match variables.
     * 
     * @param matchVariables the matchVariables value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariables(List<MatchVariable> matchVariables) {
        this.matchVariables = matchVariables;
        return this;
    }

    /**
     * Get the operator property: The operator to be matched.
     * 
     * @return the operator value.
     */
    public WebApplicationFirewallOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator to be matched.
     * 
     * @param operator the operator value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(WebApplicationFirewallOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negationConditon property: Whether this is negate condition or not.
     * 
     * @return the negationConditon value.
     */
    public Boolean negationConditon() {
        return this.negationConditon;
    }

    /**
     * Set the negationConditon property: Whether this is negate condition or not.
     * 
     * @param negationConditon the negationConditon value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegationConditon(Boolean negationConditon) {
        this.negationConditon = negationConditon;
        return this;
    }

    /**
     * Get the matchValues property: Match value.
     * 
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: Match value.
     * 
     * @param matchValues the matchValues value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     * 
     * @return the transforms value.
     */
    public List<WebApplicationFirewallTransform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     * 
     * @param transforms the transforms value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withTransforms(List<WebApplicationFirewallTransform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchVariables() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property matchVariables in model MatchCondition"));
        } else {
            matchVariables().forEach(e -> e.validate());
        }
        if (operator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property operator in model MatchCondition"));
        }
        if (matchValues() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property matchValues in model MatchCondition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MatchCondition.class);
}
