// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * DeleteOption
 * 
 * Delete Option.
 */
@Fluent
public class DeleteOption implements JsonSerializable<DeleteOption> {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "DeleteOption";

    /*
     * Duration of deletion after given timespan
     */
    private String duration;

    /**
     * Creates an instance of DeleteOption class.
     */
    public DeleteOption() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the duration property: Duration of deletion after given timespan.
     * 
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of deletion after given timespan.
     * 
     * @param duration the duration value to set.
     * @return the DeleteOption object itself.
     */
    public DeleteOption withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (duration() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property duration in model DeleteOption"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeleteOption.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("duration", this.duration);
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteOption from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteOption if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeleteOption.
     */
    public static DeleteOption fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AbsoluteDeleteOption".equals(discriminatorValue)) {
                    return AbsoluteDeleteOption.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static DeleteOption fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeleteOption deserializedDeleteOption = new DeleteOption();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("duration".equals(fieldName)) {
                    deserializedDeleteOption.duration = reader.getString();
                } else if ("objectType".equals(fieldName)) {
                    deserializedDeleteOption.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeleteOption;
        });
    }
}
