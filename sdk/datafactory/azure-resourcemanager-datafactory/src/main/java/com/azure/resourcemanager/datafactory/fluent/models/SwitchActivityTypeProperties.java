// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.SwitchCase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Switch activity properties.
 */
@Fluent
public final class SwitchActivityTypeProperties {
    /*
     * An expression that would evaluate to a string or integer. This is used to determine the block of activities in
     * cases that will be executed.
     */
    @JsonProperty(value = "on", required = true)
    private Expression on;

    /*
     * List of cases that correspond to expected values of the 'on' property. This is an optional property and if not
     * provided, the activity will execute activities provided in defaultActivities.
     */
    @JsonProperty(value = "cases")
    private List<SwitchCase> cases;

    /*
     * List of activities to execute if no case condition is satisfied. This is an optional property and if not
     * provided, the activity will exit without any action.
     */
    @JsonProperty(value = "defaultActivities")
    private List<Activity> defaultActivities;

    /**
     * Creates an instance of SwitchActivityTypeProperties class.
     */
    public SwitchActivityTypeProperties() {
    }

    /**
     * Get the on property: An expression that would evaluate to a string or integer. This is used to determine the
     * block of activities in cases that will be executed.
     * 
     * @return the on value.
     */
    public Expression on() {
        return this.on;
    }

    /**
     * Set the on property: An expression that would evaluate to a string or integer. This is used to determine the
     * block of activities in cases that will be executed.
     * 
     * @param on the on value to set.
     * @return the SwitchActivityTypeProperties object itself.
     */
    public SwitchActivityTypeProperties withOn(Expression on) {
        this.on = on;
        return this;
    }

    /**
     * Get the cases property: List of cases that correspond to expected values of the 'on' property. This is an
     * optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
     * @return the cases value.
     */
    public List<SwitchCase> cases() {
        return this.cases;
    }

    /**
     * Set the cases property: List of cases that correspond to expected values of the 'on' property. This is an
     * optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
     * @param cases the cases value to set.
     * @return the SwitchActivityTypeProperties object itself.
     */
    public SwitchActivityTypeProperties withCases(List<SwitchCase> cases) {
        this.cases = cases;
        return this;
    }

    /**
     * Get the defaultActivities property: List of activities to execute if no case condition is satisfied. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @return the defaultActivities value.
     */
    public List<Activity> defaultActivities() {
        return this.defaultActivities;
    }

    /**
     * Set the defaultActivities property: List of activities to execute if no case condition is satisfied. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @param defaultActivities the defaultActivities value to set.
     * @return the SwitchActivityTypeProperties object itself.
     */
    public SwitchActivityTypeProperties withDefaultActivities(List<Activity> defaultActivities) {
        this.defaultActivities = defaultActivities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (on() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property on in model SwitchActivityTypeProperties"));
        } else {
            on().validate();
        }
        if (cases() != null) {
            cases().forEach(e -> e.validate());
        }
        if (defaultActivities() != null) {
            defaultActivities().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SwitchActivityTypeProperties.class);
}
