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
 * A copy activity source for SAP ODP source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SapOdpSource.class, visible = true)
@JsonTypeName("SapOdpSource")
@Fluent
public final class SapOdpSource extends TabularSource {
    /*
     * Copy source type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "SapOdpSource";

    /*
     * The extraction mode. Allowed value include: Full, Delta and Recovery. The default value is Full. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "extractionMode")
    private Object extractionMode;

    /*
     * The subscriber process to manage the delta process. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "subscriberProcess")
    private Object subscriberProcess;

    /*
     * Specifies the selection conditions from source data. Type: array of objects(selection) (or Expression with
     * resultType array of objects).
     */
    @JsonProperty(value = "selection")
    private Object selection;

    /*
     * Specifies the columns to be selected from source data. Type: array of objects(projection) (or Expression with
     * resultType array of objects).
     */
    @JsonProperty(value = "projection")
    private Object projection;

    /**
     * Creates an instance of SapOdpSource class.
     */
    public SapOdpSource() {
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
     * Get the extractionMode property: The extraction mode. Allowed value include: Full, Delta and Recovery. The
     * default value is Full. Type: string (or Expression with resultType string).
     * 
     * @return the extractionMode value.
     */
    public Object extractionMode() {
        return this.extractionMode;
    }

    /**
     * Set the extractionMode property: The extraction mode. Allowed value include: Full, Delta and Recovery. The
     * default value is Full. Type: string (or Expression with resultType string).
     * 
     * @param extractionMode the extractionMode value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource withExtractionMode(Object extractionMode) {
        this.extractionMode = extractionMode;
        return this;
    }

    /**
     * Get the subscriberProcess property: The subscriber process to manage the delta process. Type: string (or
     * Expression with resultType string).
     * 
     * @return the subscriberProcess value.
     */
    public Object subscriberProcess() {
        return this.subscriberProcess;
    }

    /**
     * Set the subscriberProcess property: The subscriber process to manage the delta process. Type: string (or
     * Expression with resultType string).
     * 
     * @param subscriberProcess the subscriberProcess value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource withSubscriberProcess(Object subscriberProcess) {
        this.subscriberProcess = subscriberProcess;
        return this;
    }

    /**
     * Get the selection property: Specifies the selection conditions from source data. Type: array of
     * objects(selection) (or Expression with resultType array of objects).
     * 
     * @return the selection value.
     */
    public Object selection() {
        return this.selection;
    }

    /**
     * Set the selection property: Specifies the selection conditions from source data. Type: array of
     * objects(selection) (or Expression with resultType array of objects).
     * 
     * @param selection the selection value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource withSelection(Object selection) {
        this.selection = selection;
        return this;
    }

    /**
     * Get the projection property: Specifies the columns to be selected from source data. Type: array of
     * objects(projection) (or Expression with resultType array of objects).
     * 
     * @return the projection value.
     */
    public Object projection() {
        return this.projection;
    }

    /**
     * Set the projection property: Specifies the columns to be selected from source data. Type: array of
     * objects(projection) (or Expression with resultType array of objects).
     * 
     * @param projection the projection value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource withProjection(Object projection) {
        this.projection = projection;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOdpSource withDisableMetricsCollection(Object disableMetricsCollection) {
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
