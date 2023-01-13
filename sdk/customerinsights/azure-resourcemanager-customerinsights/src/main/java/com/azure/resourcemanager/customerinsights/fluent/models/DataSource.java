// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.customerinsights.models.DataSourceType;
import com.azure.resourcemanager.customerinsights.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Source is a way for us to know the source of instances. A single type can have data coming in from multiple
 * places. In activities we use this to determine precedence rules.
 */
@Immutable
public final class DataSource {
    /*
     * The data source name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The data source type.
     */
    @JsonProperty(value = "dataSourceType", access = JsonProperty.Access.WRITE_ONLY)
    private DataSourceType dataSourceType;

    /*
     * The data source status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The data source ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * The data source reference id.
     */
    @JsonProperty(value = "dataSourceReferenceId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataSourceReferenceId;

    /** Creates an instance of DataSource class. */
    public DataSource() {
    }

    /**
     * Get the name property: The data source name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the dataSourceType property: The data source type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * Get the status property: The data source status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the id property: The data source ID.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Get the dataSourceReferenceId property: The data source reference id.
     *
     * @return the dataSourceReferenceId value.
     */
    public String dataSourceReferenceId() {
        return this.dataSourceReferenceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}