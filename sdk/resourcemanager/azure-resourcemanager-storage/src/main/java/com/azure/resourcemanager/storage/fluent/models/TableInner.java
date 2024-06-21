// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.models.TableSignedIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the table, including Id, resource name, resource type.
 */
@Fluent
public final class TableInner extends ProxyResource {
    /*
     * Table resource properties.
     */
    @JsonProperty(value = "properties")
    private TableProperties innerTableProperties;

    /**
     * Creates an instance of TableInner class.
     */
    public TableInner() {
    }

    /**
     * Get the innerTableProperties property: Table resource properties.
     * 
     * @return the innerTableProperties value.
     */
    private TableProperties innerTableProperties() {
        return this.innerTableProperties;
    }

    /**
     * Get the tableName property: Table name under the specified account.
     * 
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerTableProperties() == null ? null : this.innerTableProperties().tableName();
    }

    /**
     * Get the signedIdentifiers property: List of stored access policies specified on the table.
     * 
     * @return the signedIdentifiers value.
     */
    public List<TableSignedIdentifier> signedIdentifiers() {
        return this.innerTableProperties() == null ? null : this.innerTableProperties().signedIdentifiers();
    }

    /**
     * Set the signedIdentifiers property: List of stored access policies specified on the table.
     * 
     * @param signedIdentifiers the signedIdentifiers value to set.
     * @return the TableInner object itself.
     */
    public TableInner withSignedIdentifiers(List<TableSignedIdentifier> signedIdentifiers) {
        if (this.innerTableProperties() == null) {
            this.innerTableProperties = new TableProperties();
        }
        this.innerTableProperties().withSignedIdentifiers(signedIdentifiers);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerTableProperties() != null) {
            innerTableProperties().validate();
        }
    }
}
