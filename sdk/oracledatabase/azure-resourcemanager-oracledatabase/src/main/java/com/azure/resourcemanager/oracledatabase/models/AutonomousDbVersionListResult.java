// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDbVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a AutonomousDbVersion list operation.
 */
@Immutable
public final class AutonomousDbVersionListResult implements JsonSerializable<AutonomousDbVersionListResult> {
    /*
     * The AutonomousDbVersion items on this page
     */
    private List<AutonomousDbVersionInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of AutonomousDbVersionListResult class.
     */
    private AutonomousDbVersionListResult() {
    }

    /**
     * Get the value property: The AutonomousDbVersion items on this page.
     * 
     * @return the value value.
     */
    public List<AutonomousDbVersionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model AutonomousDbVersionListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutonomousDbVersionListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutonomousDbVersionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutonomousDbVersionListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AutonomousDbVersionListResult.
     */
    public static AutonomousDbVersionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutonomousDbVersionListResult deserializedAutonomousDbVersionListResult
                = new AutonomousDbVersionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AutonomousDbVersionInner> value
                        = reader.readArray(reader1 -> AutonomousDbVersionInner.fromJson(reader1));
                    deserializedAutonomousDbVersionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAutonomousDbVersionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutonomousDbVersionListResult;
        });
    }
}
