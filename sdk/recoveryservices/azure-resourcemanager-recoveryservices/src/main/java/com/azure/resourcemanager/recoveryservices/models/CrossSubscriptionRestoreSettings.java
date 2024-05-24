// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for Cross Subscription Restore Settings.
 */
@Fluent
public final class CrossSubscriptionRestoreSettings {
    /*
     * The crossSubscriptionRestoreState property.
     */
    @JsonProperty(value = "crossSubscriptionRestoreState")
    private CrossSubscriptionRestoreState crossSubscriptionRestoreState;

    /**
     * Creates an instance of CrossSubscriptionRestoreSettings class.
     */
    public CrossSubscriptionRestoreSettings() {
    }

    /**
     * Get the crossSubscriptionRestoreState property: The crossSubscriptionRestoreState property.
     * 
     * @return the crossSubscriptionRestoreState value.
     */
    public CrossSubscriptionRestoreState crossSubscriptionRestoreState() {
        return this.crossSubscriptionRestoreState;
    }

    /**
     * Set the crossSubscriptionRestoreState property: The crossSubscriptionRestoreState property.
     * 
     * @param crossSubscriptionRestoreState the crossSubscriptionRestoreState value to set.
     * @return the CrossSubscriptionRestoreSettings object itself.
     */
    public CrossSubscriptionRestoreSettings
        withCrossSubscriptionRestoreState(CrossSubscriptionRestoreState crossSubscriptionRestoreState) {
        this.crossSubscriptionRestoreState = crossSubscriptionRestoreState;
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
