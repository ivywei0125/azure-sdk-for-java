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
import com.azure.resourcemanager.oracledatabase.fluent.models.GiVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a GiVersion list operation.
 */
@Immutable
public final class GiVersionListResult implements JsonSerializable<GiVersionListResult> {
    /*
     * The GiVersion items on this page
     */
    private List<GiVersionInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of GiVersionListResult class.
     */
    private GiVersionListResult() {
    }

    /**
     * Get the value property: The GiVersion items on this page.
     * 
     * @return the value value.
     */
    public List<GiVersionInner> value() {
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
                .log(new IllegalArgumentException("Missing required property value in model GiVersionListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GiVersionListResult.class);

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
     * Reads an instance of GiVersionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GiVersionListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GiVersionListResult.
     */
    public static GiVersionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GiVersionListResult deserializedGiVersionListResult = new GiVersionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GiVersionInner> value = reader.readArray(reader1 -> GiVersionInner.fromJson(reader1));
                    deserializedGiVersionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGiVersionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGiVersionListResult;
        });
    }
}
