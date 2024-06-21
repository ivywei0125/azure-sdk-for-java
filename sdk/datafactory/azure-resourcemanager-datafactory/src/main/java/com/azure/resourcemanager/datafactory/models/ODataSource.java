// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for OData source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = ODataSource.class, visible = true)
@JsonTypeName("ODataSource")
@Fluent
public final class ODataSource extends CopySource {
    /*
     * Copy source type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "ODataSource";

    /*
     * OData query. For example, "$top=1". Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read
     * response data. Default value: 00:05:00. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Creates an instance of ODataSource class.
     */
    public ODataSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the query property: OData query. For example, "$top=1". Type: string (or Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: OData query. For example, "$top=1". Type: string (or Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the ODataSource object itself.
     */
    public ODataSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:05:00. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the httpRequestTimeout value.
     */
    public Object httpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:05:00. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param httpRequestTimeout the httpRequestTimeout value to set.
     * @return the ODataSource object itself.
     */
    public ODataSource withHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the ODataSource object itself.
     */
    public ODataSource withAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ODataSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ODataSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ODataSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ODataSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
