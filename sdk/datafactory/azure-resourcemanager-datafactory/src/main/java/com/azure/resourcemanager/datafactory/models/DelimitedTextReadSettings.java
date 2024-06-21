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
 * Delimited text read settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = DelimitedTextReadSettings.class,
    visible = true)
@JsonTypeName("DelimitedTextReadSettings")
@Fluent
public final class DelimitedTextReadSettings extends FormatReadSettings {
    /*
     * The read setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "DelimitedTextReadSettings";

    /*
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression
     * with resultType integer).
     */
    @JsonProperty(value = "skipLineCount")
    private Object skipLineCount;

    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Creates an instance of DelimitedTextReadSettings class.
     */
    public DelimitedTextReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the skipLineCount property: Indicates the number of non-empty rows to skip when reading data from input
     * files. Type: integer (or Expression with resultType integer).
     * 
     * @return the skipLineCount value.
     */
    public Object skipLineCount() {
        return this.skipLineCount;
    }

    /**
     * Set the skipLineCount property: Indicates the number of non-empty rows to skip when reading data from input
     * files. Type: integer (or Expression with resultType integer).
     * 
     * @param skipLineCount the skipLineCount value to set.
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings withSkipLineCount(Object skipLineCount) {
        this.skipLineCount = skipLineCount;
        return this;
    }

    /**
     * Get the compressionProperties property: Compression settings.
     * 
     * @return the compressionProperties value.
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     * 
     * @param compressionProperties the compressionProperties value to set.
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
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
        if (compressionProperties() != null) {
            compressionProperties().validate();
        }
    }
}
