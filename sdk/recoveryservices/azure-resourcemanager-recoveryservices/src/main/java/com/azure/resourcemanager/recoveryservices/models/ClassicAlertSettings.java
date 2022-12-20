// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for classic alerts. */
@Fluent
public final class ClassicAlertSettings {
    /*
     * The alertsForCriticalOperations property.
     */
    @JsonProperty(value = "alertsForCriticalOperations")
    private AlertsState alertsForCriticalOperations;

    /** Creates an instance of ClassicAlertSettings class. */
    public ClassicAlertSettings() {
    }

    /**
     * Get the alertsForCriticalOperations property: The alertsForCriticalOperations property.
     *
     * @return the alertsForCriticalOperations value.
     */
    public AlertsState alertsForCriticalOperations() {
        return this.alertsForCriticalOperations;
    }

    /**
     * Set the alertsForCriticalOperations property: The alertsForCriticalOperations property.
     *
     * @param alertsForCriticalOperations the alertsForCriticalOperations value to set.
     * @return the ClassicAlertSettings object itself.
     */
    public ClassicAlertSettings withAlertsForCriticalOperations(AlertsState alertsForCriticalOperations) {
        this.alertsForCriticalOperations = alertsForCriticalOperations;
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
