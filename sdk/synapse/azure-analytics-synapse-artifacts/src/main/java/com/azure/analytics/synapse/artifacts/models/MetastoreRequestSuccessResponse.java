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
 * The MetastoreRequestSuccessResponse model.
 */
@Fluent
public final class MetastoreRequestSuccessResponse implements JsonSerializable<MetastoreRequestSuccessResponse> {
    /*
     * Enumerates possible Status of the resource.
     */
    private ResourceStatus status;

    /**
     * Creates an instance of MetastoreRequestSuccessResponse class.
     */
    public MetastoreRequestSuccessResponse() {
    }

    /**
     * Get the status property: Enumerates possible Status of the resource.
     * 
     * @return the status value.
     */
    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates possible Status of the resource.
     * 
     * @param status the status value to set.
     * @return the MetastoreRequestSuccessResponse object itself.
     */
    public MetastoreRequestSuccessResponse setStatus(ResourceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetastoreRequestSuccessResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetastoreRequestSuccessResponse if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetastoreRequestSuccessResponse.
     */
    public static MetastoreRequestSuccessResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetastoreRequestSuccessResponse deserializedMetastoreRequestSuccessResponse
                = new MetastoreRequestSuccessResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedMetastoreRequestSuccessResponse.status = ResourceStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetastoreRequestSuccessResponse;
        });
    }
}
