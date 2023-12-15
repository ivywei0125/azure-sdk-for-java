// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition of data flow source setting for debug.
 */
@Fluent
public final class DataFlowSourceSetting {
    /*
     * The data flow source name.
     */
    @JsonProperty(value = "sourceName")
    private String sourceName;

    /*
     * Defines the row limit of data flow source in debug.
     */
    @JsonProperty(value = "rowLimit")
    private Integer rowLimit;

    /*
     * Definition of data flow source setting for debug.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of DataFlowSourceSetting class.
     */
    public DataFlowSourceSetting() {
    }

    /**
     * Get the sourceName property: The data flow source name.
     * 
     * @return the sourceName value.
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: The data flow source name.
     * 
     * @param sourceName the sourceName value to set.
     * @return the DataFlowSourceSetting object itself.
     */
    public DataFlowSourceSetting setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Get the rowLimit property: Defines the row limit of data flow source in debug.
     * 
     * @return the rowLimit value.
     */
    public Integer getRowLimit() {
        return this.rowLimit;
    }

    /**
     * Set the rowLimit property: Defines the row limit of data flow source in debug.
     * 
     * @param rowLimit the rowLimit value to set.
     * @return the DataFlowSourceSetting object itself.
     */
    public DataFlowSourceSetting setRowLimit(Integer rowLimit) {
        this.rowLimit = rowLimit;
        return this;
    }

    /**
     * Get the additionalProperties property: Definition of data flow source setting for debug.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Definition of data flow source setting for debug.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the DataFlowSourceSetting object itself.
     */
    public DataFlowSourceSetting setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
