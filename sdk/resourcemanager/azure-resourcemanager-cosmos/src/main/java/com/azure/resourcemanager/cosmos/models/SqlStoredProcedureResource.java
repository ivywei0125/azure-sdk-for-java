// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB SQL storedProcedure resource object.
 */
@Fluent
public class SqlStoredProcedureResource {
    /*
     * Name of the Cosmos DB SQL storedProcedure
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Body of the Stored Procedure
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Creates an instance of SqlStoredProcedureResource class.
     */
    public SqlStoredProcedureResource() {
    }

    /**
     * Get the id property: Name of the Cosmos DB SQL storedProcedure.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB SQL storedProcedure.
     * 
     * @param id the id value to set.
     * @return the SqlStoredProcedureResource object itself.
     */
    public SqlStoredProcedureResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the body property: Body of the Stored Procedure.
     * 
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Body of the Stored Procedure.
     * 
     * @param body the body value to set.
     * @return the SqlStoredProcedureResource object itself.
     */
    public SqlStoredProcedureResource withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model SqlStoredProcedureResource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlStoredProcedureResource.class);
}
