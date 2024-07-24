// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Pagination model.
 */
@Fluent
public final class Pagination implements JsonSerializable<Pagination> {
    /*
     * The nextLink property.
     */
    private String nextLink;

    /**
     * Creates an instance of Pagination class.
     */
    public Pagination() {
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the Pagination object itself.
     */
    public Pagination setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Pagination from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Pagination if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Pagination.
     */
    public static Pagination fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Pagination deserializedPagination = new Pagination();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedPagination.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPagination;
        });
    }
}
