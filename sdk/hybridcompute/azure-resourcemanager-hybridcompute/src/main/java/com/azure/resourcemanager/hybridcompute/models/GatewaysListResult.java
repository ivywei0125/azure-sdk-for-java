// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcompute.fluent.models.GatewayInner;
import java.io.IOException;
import java.util.List;

/**
 * The List license operation response.
 */
@Fluent
public final class GatewaysListResult implements JsonSerializable<GatewaysListResult> {
    /*
     * The list of Gateways.
     */
    private List<GatewayInner> value;

    /*
     * The URI to fetch the next page of Gateways. Call ListNext() with this URI to fetch the next page of Gateways.
     */
    private String nextLink;

    /**
     * Creates an instance of GatewaysListResult class.
     */
    public GatewaysListResult() {
    }

    /**
     * Get the value property: The list of Gateways.
     * 
     * @return the value value.
     */
    public List<GatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Gateways.
     * 
     * @param value the value value to set.
     * @return the GatewaysListResult object itself.
     */
    public GatewaysListResult withValue(List<GatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Gateways. Call ListNext() with this URI to fetch the
     * next page of Gateways.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Gateways. Call ListNext() with this URI to fetch the
     * next page of Gateways.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GatewaysListResult object itself.
     */
    public GatewaysListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model GatewaysListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GatewaysListResult.class);

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
     * Reads an instance of GatewaysListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewaysListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GatewaysListResult.
     */
    public static GatewaysListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewaysListResult deserializedGatewaysListResult = new GatewaysListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<GatewayInner> value = reader.readArray(reader1 -> GatewayInner.fromJson(reader1));
                    deserializedGatewaysListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedGatewaysListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewaysListResult;
        });
    }
}
