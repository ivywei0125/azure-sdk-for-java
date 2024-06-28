// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Describes the status of a trigger.
 */
@Immutable
public final class TriggerStatus implements JsonSerializable<TriggerStatus> {
    /*
     * The status code.
     */
    private String code;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    private String message;

    /*
     * The time of the status.
     */
    private OffsetDateTime time;

    /**
     * Creates an instance of TriggerStatus class.
     */
    public TriggerStatus() {
    }

    /**
     * Get the code property: The status code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the time property: The time of the status.
     * 
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggerStatus.
     */
    public static TriggerStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerStatus deserializedTriggerStatus = new TriggerStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedTriggerStatus.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedTriggerStatus.message = reader.getString();
                } else if ("time".equals(fieldName)) {
                    deserializedTriggerStatus.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerStatus;
        });
    }
}
