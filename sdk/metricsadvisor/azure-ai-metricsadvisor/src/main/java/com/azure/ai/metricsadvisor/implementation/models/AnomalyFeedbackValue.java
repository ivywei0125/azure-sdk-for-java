// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.models.AnomalyValue;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The AnomalyFeedbackValue model.
 */
@Fluent
public final class AnomalyFeedbackValue implements JsonSerializable<AnomalyFeedbackValue> {
    /*
     * The anomalyValue property.
     */
    private AnomalyValue anomalyValue;

    /**
     * Creates an instance of AnomalyFeedbackValue class.
     */
    public AnomalyFeedbackValue() {
    }

    /**
     * Get the anomalyValue property: The anomalyValue property.
     * 
     * @return the anomalyValue value.
     */
    public AnomalyValue getAnomalyValue() {
        return this.anomalyValue;
    }

    /**
     * Set the anomalyValue property: The anomalyValue property.
     * 
     * @param anomalyValue the anomalyValue value to set.
     * @return the AnomalyFeedbackValue object itself.
     */
    public AnomalyFeedbackValue setAnomalyValue(AnomalyValue anomalyValue) {
        this.anomalyValue = anomalyValue;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("anomalyValue", Objects.toString(this.anomalyValue, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnomalyFeedbackValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnomalyFeedbackValue if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnomalyFeedbackValue.
     */
    public static AnomalyFeedbackValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnomalyFeedbackValue deserializedAnomalyFeedbackValue = new AnomalyFeedbackValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("anomalyValue".equals(fieldName)) {
                    deserializedAnomalyFeedbackValue.anomalyValue = AnomalyValue.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnomalyFeedbackValue;
        });
    }
}
