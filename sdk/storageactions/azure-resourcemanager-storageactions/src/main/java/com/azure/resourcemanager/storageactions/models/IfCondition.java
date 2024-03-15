// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The if block of storage task operation.
 */
@Fluent
public final class IfCondition {
    /*
     * The condition predicate which is composed of object properties, eg: blob and container properties.
     */
    @JsonProperty(value = "condition", required = true)
    private String condition;

    /*
     * List of operations to execute when the condition predicate satisfies.
     */
    @JsonProperty(value = "operations", required = true)
    private List<StorageTaskOperation> operations;

    /**
     * Creates an instance of IfCondition class.
     */
    public IfCondition() {
    }

    /**
     * Get the condition property: The condition predicate which is composed of object properties, eg: blob and
     * container properties.
     * 
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition predicate which is composed of object properties, eg: blob and
     * container properties.
     * 
     * @param condition the condition value to set.
     * @return the IfCondition object itself.
     */
    public IfCondition withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the operations property: List of operations to execute when the condition predicate satisfies.
     * 
     * @return the operations value.
     */
    public List<StorageTaskOperation> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: List of operations to execute when the condition predicate satisfies.
     * 
     * @param operations the operations value to set.
     * @return the IfCondition object itself.
     */
    public IfCondition withOperations(List<StorageTaskOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (condition() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property condition in model IfCondition"));
        }
        if (operations() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property operations in model IfCondition"));
        } else {
            operations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IfCondition.class);
}
