// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.RestorableSqlDatabasePropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Azure Cosmos DB SQL database event. */
@Fluent
public final class RestorableSqlDatabaseGetResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorableSqlDatabaseGetResultInner.class);

    /*
     * The properties of a SQL database event.
     */
    @JsonProperty(value = "properties")
    private RestorableSqlDatabaseProperties innerProperties;

    /*
     * The unique resource Identifier of the ARM resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the ARM resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type of Azure resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: The properties of a SQL database event.
     *
     * @return the innerProperties value.
     */
    private RestorableSqlDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: The unique resource Identifier of the ARM resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the ARM resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of Azure resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the resource property: The resource of an Azure Cosmos DB SQL database event.
     *
     * @return the resource value.
     */
    public RestorableSqlDatabasePropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB SQL database event.
     *
     * @param resource the resource value to set.
     * @return the RestorableSqlDatabaseGetResultInner object itself.
     */
    public RestorableSqlDatabaseGetResultInner withResource(RestorableSqlDatabasePropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorableSqlDatabaseProperties();
        }
        this.innerProperties().withResource(resource);
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
