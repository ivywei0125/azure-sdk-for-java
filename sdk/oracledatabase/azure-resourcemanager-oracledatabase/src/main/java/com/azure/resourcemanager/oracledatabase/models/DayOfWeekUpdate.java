// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DayOfWeek resource properties.
 */
@Fluent
public final class DayOfWeekUpdate {
    /*
     * Name of the day of the week.
     */
    @JsonProperty(value = "name")
    private DayOfWeekName name;

    /**
     * Creates an instance of DayOfWeekUpdate class.
     */
    public DayOfWeekUpdate() {
    }

    /**
     * Get the name property: Name of the day of the week.
     * 
     * @return the name value.
     */
    public DayOfWeekName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the day of the week.
     * 
     * @param name the name value to set.
     * @return the DayOfWeekUpdate object itself.
     */
    public DayOfWeekUpdate withName(DayOfWeekName name) {
        this.name = name;
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
