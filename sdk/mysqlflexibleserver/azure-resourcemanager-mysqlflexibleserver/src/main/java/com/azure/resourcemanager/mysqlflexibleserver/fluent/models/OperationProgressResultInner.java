// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationProgressResponseType;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationStatusResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Represents Operation Results API Response.
 */
@Fluent
public final class OperationProgressResultInner extends OperationStatusResult {
    /*
     * The response properties specific to the operation
     */
    @JsonProperty(value = "properties")
    private OperationProgressResponseType properties;

    /**
     * Creates an instance of OperationProgressResultInner class.
     */
    public OperationProgressResultInner() {
    }

    /**
     * Get the properties property: The response properties specific to the operation.
     * 
     * @return the properties value.
     */
    public OperationProgressResponseType properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The response properties specific to the operation.
     * 
     * @param properties the properties value to set.
     * @return the OperationProgressResultInner object itself.
     */
    public OperationProgressResultInner withProperties(OperationProgressResponseType properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withStatus(String status) {
        super.withStatus(status);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withPercentComplete(Float percentComplete) {
        super.withPercentComplete(percentComplete);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withOperations(List<OperationStatusResult> operations) {
        super.withOperations(operations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperationProgressResultInner withError(ManagementError error) {
        super.withError(error);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
