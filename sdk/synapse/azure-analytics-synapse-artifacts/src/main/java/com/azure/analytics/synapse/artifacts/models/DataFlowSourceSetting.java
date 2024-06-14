// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Definition of data flow source setting for debug.
 */
@Fluent
public final class DataFlowSourceSetting implements JsonSerializable<DataFlowSourceSetting> {
    /*
     * The data flow source name.
     */
    private String sourceName;

    /*
     * Defines the row limit of data flow source in debug.
     */
    private Integer rowLimit;

    /*
     * Definition of data flow source setting for debug.
     */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceName", this.sourceName);
        jsonWriter.writeNumberField("rowLimit", this.rowLimit);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFlowSourceSetting from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFlowSourceSetting if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataFlowSourceSetting.
     */
    public static DataFlowSourceSetting fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataFlowSourceSetting deserializedDataFlowSourceSetting = new DataFlowSourceSetting();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceName".equals(fieldName)) {
                    deserializedDataFlowSourceSetting.sourceName = reader.getString();
                } else if ("rowLimit".equals(fieldName)) {
                    deserializedDataFlowSourceSetting.rowLimit = reader.getNullable(JsonReader::getInt);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedDataFlowSourceSetting.additionalProperties = additionalProperties;

            return deserializedDataFlowSourceSetting;
        });
    }
}
