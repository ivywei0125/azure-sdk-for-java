// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.models.CorsRules;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a storage account’s Table service.
 */
@Fluent
public final class TableServicePropertiesInner extends ProxyResource {
    /*
     * The properties of a storage account’s Table service.
     */
    @JsonProperty(value = "properties")
    private TableServicePropertiesProperties innerTableServiceProperties;

    /**
     * Creates an instance of TableServicePropertiesInner class.
     */
    public TableServicePropertiesInner() {
    }

    /**
     * Get the innerTableServiceProperties property: The properties of a storage account’s Table service.
     * 
     * @return the innerTableServiceProperties value.
     */
    private TableServicePropertiesProperties innerTableServiceProperties() {
        return this.innerTableServiceProperties;
    }

    /**
     * Get the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     * 
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.innerTableServiceProperties() == null ? null : this.innerTableServiceProperties().cors();
    }

    /**
     * Set the cors property: Specifies CORS rules for the Table service. You can include up to five CorsRule elements
     * in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and
     * CORS will be disabled for the Table service.
     * 
     * @param cors the cors value to set.
     * @return the TableServicePropertiesInner object itself.
     */
    public TableServicePropertiesInner withCors(CorsRules cors) {
        if (this.innerTableServiceProperties() == null) {
            this.innerTableServiceProperties = new TableServicePropertiesProperties();
        }
        this.innerTableServiceProperties().withCors(cors);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerTableServiceProperties() != null) {
            innerTableServiceProperties().validate();
        }
    }
}
