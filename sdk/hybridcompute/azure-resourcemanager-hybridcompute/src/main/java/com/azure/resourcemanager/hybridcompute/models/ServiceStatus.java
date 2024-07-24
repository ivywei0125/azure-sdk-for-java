// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the status and behavior of a service.
 */
@Fluent
public final class ServiceStatus implements JsonSerializable<ServiceStatus> {
    /*
     * The current status of the service.
     */
    private String status;

    /*
     * The behavior of the service when the Arc-enabled machine starts up.
     */
    private String startupType;

    /**
     * Creates an instance of ServiceStatus class.
     */
    public ServiceStatus() {
    }

    /**
     * Get the status property: The current status of the service.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the service.
     * 
     * @param status the status value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startupType property: The behavior of the service when the Arc-enabled machine starts up.
     * 
     * @return the startupType value.
     */
    public String startupType() {
        return this.startupType;
    }

    /**
     * Set the startupType property: The behavior of the service when the Arc-enabled machine starts up.
     * 
     * @param startupType the startupType value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus withStartupType(String startupType) {
        this.startupType = startupType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("startupType", this.startupType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceStatus.
     */
    public static ServiceStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceStatus deserializedServiceStatus = new ServiceStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedServiceStatus.status = reader.getString();
                } else if ("startupType".equals(fieldName)) {
                    deserializedServiceStatus.startupType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceStatus;
        });
    }
}
