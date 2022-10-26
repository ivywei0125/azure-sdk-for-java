// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Diagnostics data collection for a resource. */
@Fluent
public final class DiagnosticsCollectionInner {
    /*
     * Collection of diagnostic data.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiagnosticsInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of DiagnosticsCollectionInner class. */
    public DiagnosticsCollectionInner() {
    }

    /**
     * Get the value property: Collection of diagnostic data.
     *
     * @return the value value.
     */
    public List<DiagnosticsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of diagnostic data.
     *
     * @param value the value value to set.
     * @return the DiagnosticsCollectionInner object itself.
     */
    public DiagnosticsCollectionInner withValue(List<DiagnosticsInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
                    new IllegalArgumentException(
                        "Missing required property value in model DiagnosticsCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticsCollectionInner.class);
}
