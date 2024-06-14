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

/**
 * Run notebook parameter.
 */
@Fluent
public final class RunNotebookParameter implements JsonSerializable<RunNotebookParameter> {
    /*
     * Parameter type.
     */
    private String type;

    /*
     * Parameter value.
     */
    private Object value;

    /**
     * Creates an instance of RunNotebookParameter class.
     */
    public RunNotebookParameter() {
    }

    /**
     * Get the type property: Parameter type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Parameter type.
     * 
     * @param type the type value to set.
     * @return the RunNotebookParameter object itself.
     */
    public RunNotebookParameter setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Parameter value.
     * 
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: Parameter value.
     * 
     * @param value the value value to set.
     * @return the RunNotebookParameter object itself.
     */
    public RunNotebookParameter setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunNotebookParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunNotebookParameter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunNotebookParameter.
     */
    public static RunNotebookParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunNotebookParameter deserializedRunNotebookParameter = new RunNotebookParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRunNotebookParameter.type = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedRunNotebookParameter.value = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRunNotebookParameter;
        });
    }
}
