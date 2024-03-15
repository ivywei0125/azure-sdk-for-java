// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * Number of active connections is not in allowed range.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("ActiveConnectionsNotInAllowedRange")
@Fluent
public final class ActiveConnectionsNotInAllowedRange extends TimeWindowCustomAlertRule {
    /**
     * Creates an instance of ActiveConnectionsNotInAllowedRange class.
     */
    public ActiveConnectionsNotInAllowedRange() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectionsNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectionsNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectionsNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveConnectionsNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
