// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Marketo server source.
 */
@Fluent
public final class MarketoSource extends TabularSource {
    /*
     * Copy source type.
     */
    private String type = "MarketoSource";

    /*
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     */
    private Object query;

    /**
     * Creates an instance of MarketoSource class.
     */
    public MarketoSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @param query the query value to set.
     * @return the MarketoSource object itself.
     */
    public MarketoSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketoSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        jsonWriter.writeUntypedField("queryTimeout", getQueryTimeout());
        jsonWriter.writeUntypedField("additionalColumns", getAdditionalColumns());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("query", this.query);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MarketoSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketoSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MarketoSource.
     */
    public static MarketoSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketoSource deserializedMarketoSource = new MarketoSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedMarketoSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedMarketoSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedMarketoSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedMarketoSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedMarketoSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedMarketoSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedMarketoSource.query = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMarketoSource.setAdditionalProperties(additionalProperties);

            return deserializedMarketoSource;
        });
    }
}
