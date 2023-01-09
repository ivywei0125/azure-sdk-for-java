// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Database query. */
@Fluent
public final class ManagedInstanceQueryInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private QueryProperties innerProperties;

    /** Creates an instance of ManagedInstanceQueryInner class. */
    public ManagedInstanceQueryInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private QueryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the queryText property: Query text.
     *
     * @return the queryText value.
     */
    public String queryText() {
        return this.innerProperties() == null ? null : this.innerProperties().queryText();
    }

    /**
     * Set the queryText property: Query text.
     *
     * @param queryText the queryText value to set.
     * @return the ManagedInstanceQueryInner object itself.
     */
    public ManagedInstanceQueryInner withQueryText(String queryText) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryProperties();
        }
        this.innerProperties().withQueryText(queryText);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}