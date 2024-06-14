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
 * Connection state details of the private endpoint.
 */
@Fluent
public final class PrivateLinkServiceConnectionState implements JsonSerializable<PrivateLinkServiceConnectionState> {
    /*
     * The private link service connection status.
     */
    private String status;

    /*
     * The private link service connection description.
     */
    private String description;

    /*
     * The actions required for private link service connection.
     */
    private String actionsRequired;

    /**
     * Creates an instance of PrivateLinkServiceConnectionState class.
     */
    public PrivateLinkServiceConnectionState() {
    }

    /**
     * Get the status property: The private link service connection status.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The private link service connection description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The private link service connection description.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: The actions required for private link service connection.
     * 
     * @return the actionsRequired value.
     */
    public String getActionsRequired() {
        return this.actionsRequired;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceConnectionState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceConnectionState if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceConnectionState.
     */
    public static PrivateLinkServiceConnectionState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceConnectionState deserializedPrivateLinkServiceConnectionState
                = new PrivateLinkServiceConnectionState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.status = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.description = reader.getString();
                } else if ("actionsRequired".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.actionsRequired = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceConnectionState;
        });
    }
}
