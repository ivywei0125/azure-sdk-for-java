// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Filter and return results from input array based on the conditions. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Filter")
@JsonFlatten
@Fluent
public class FilterActivity extends ControlActivity {
    /*
     * Input array on which filter should be applied.
     */
    @JsonProperty(value = "typeProperties.items", required = true)
    private Expression items;

    /*
     * Condition to be used for filtering the input.
     */
    @JsonProperty(value = "typeProperties.condition", required = true)
    private Expression condition;

    /** Creates an instance of FilterActivity class. */
    public FilterActivity() {}

    /**
     * Get the items property: Input array on which filter should be applied.
     *
     * @return the items value.
     */
    public Expression getItems() {
        return this.items;
    }

    /**
     * Set the items property: Input array on which filter should be applied.
     *
     * @param items the items value to set.
     * @return the FilterActivity object itself.
     */
    public FilterActivity setItems(Expression items) {
        this.items = items;
        return this;
    }

    /**
     * Get the condition property: Condition to be used for filtering the input.
     *
     * @return the condition value.
     */
    public Expression getCondition() {
        return this.condition;
    }

    /**
     * Set the condition property: Condition to be used for filtering the input.
     *
     * @param condition the condition value to set.
     * @return the FilterActivity object itself.
     */
    public FilterActivity setCondition(Expression condition) {
        this.condition = condition;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FilterActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
