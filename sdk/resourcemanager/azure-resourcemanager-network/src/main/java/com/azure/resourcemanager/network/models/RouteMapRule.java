// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A RouteMap Rule. */
@Fluent
public final class RouteMapRule {
    /*
     * The unique name for the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * List of matching criterion which will be applied to traffic.
     */
    @JsonProperty(value = "matchCriteria")
    private List<Criterion> matchCriteria;

    /*
     * List of actions which will be applied on a match.
     */
    @JsonProperty(value = "actions")
    private List<Action> actions;

    /*
     * Next step after rule is evaluated. Current supported behaviors are 'Continue'(to next rule) and 'Terminate'.
     */
    @JsonProperty(value = "nextStepIfMatched")
    private NextStep nextStepIfMatched;

    /** Creates an instance of RouteMapRule class. */
    public RouteMapRule() {
    }

    /**
     * Get the name property: The unique name for the rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name for the rule.
     *
     * @param name the name value to set.
     * @return the RouteMapRule object itself.
     */
    public RouteMapRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the matchCriteria property: List of matching criterion which will be applied to traffic.
     *
     * @return the matchCriteria value.
     */
    public List<Criterion> matchCriteria() {
        return this.matchCriteria;
    }

    /**
     * Set the matchCriteria property: List of matching criterion which will be applied to traffic.
     *
     * @param matchCriteria the matchCriteria value to set.
     * @return the RouteMapRule object itself.
     */
    public RouteMapRule withMatchCriteria(List<Criterion> matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }

    /**
     * Get the actions property: List of actions which will be applied on a match.
     *
     * @return the actions value.
     */
    public List<Action> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: List of actions which will be applied on a match.
     *
     * @param actions the actions value to set.
     * @return the RouteMapRule object itself.
     */
    public RouteMapRule withActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the nextStepIfMatched property: Next step after rule is evaluated. Current supported behaviors are
     * 'Continue'(to next rule) and 'Terminate'.
     *
     * @return the nextStepIfMatched value.
     */
    public NextStep nextStepIfMatched() {
        return this.nextStepIfMatched;
    }

    /**
     * Set the nextStepIfMatched property: Next step after rule is evaluated. Current supported behaviors are
     * 'Continue'(to next rule) and 'Terminate'.
     *
     * @param nextStepIfMatched the nextStepIfMatched value to set.
     * @return the RouteMapRule object itself.
     */
    public RouteMapRule withNextStepIfMatched(NextStep nextStepIfMatched) {
        this.nextStepIfMatched = nextStepIfMatched;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (matchCriteria() != null) {
            matchCriteria().forEach(e -> e.validate());
        }
        if (actions() != null) {
            actions().forEach(e -> e.validate());
        }
    }
}
