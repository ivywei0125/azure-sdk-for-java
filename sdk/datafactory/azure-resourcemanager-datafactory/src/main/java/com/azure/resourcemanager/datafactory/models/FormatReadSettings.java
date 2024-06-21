// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Format read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = FormatReadSettings.class, visible = true)
@JsonTypeName("FormatReadSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ParquetReadSettings", value = ParquetReadSettings.class),
    @JsonSubTypes.Type(name = "DelimitedTextReadSettings", value = DelimitedTextReadSettings.class),
    @JsonSubTypes.Type(name = "JsonReadSettings", value = JsonReadSettings.class),
    @JsonSubTypes.Type(name = "XmlReadSettings", value = XmlReadSettings.class),
    @JsonSubTypes.Type(name = "BinaryReadSettings", value = BinaryReadSettings.class) })
@Fluent
public class FormatReadSettings {
    /*
     * The read setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "FormatReadSettings";

    /*
     * Format read settings.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of FormatReadSettings class.
     */
    public FormatReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the additionalProperties property: Format read settings.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Format read settings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the FormatReadSettings object itself.
     */
    public FormatReadSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new LinkedHashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
