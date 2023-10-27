// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Lists the operations available. */
@Fluent
public final class OperationsList {
    /*
     * Url to follow for getting next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of operations
     */
    @JsonProperty(value = "value", required = true)
    private List<OperationInner> value;

    /** Creates an instance of OperationsList class. */
    public OperationsList() {
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationsList object itself.
     */
    public OperationsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of operations.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of operations.
     *
     * @param value the value value to set.
     * @return the OperationsList object itself.
     */
    public OperationsList withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model OperationsList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationsList.class);
}
