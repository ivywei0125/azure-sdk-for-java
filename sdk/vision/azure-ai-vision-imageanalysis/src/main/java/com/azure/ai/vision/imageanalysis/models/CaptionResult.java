// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a generated phrase that describes the content of the whole image.
 */
@Immutable
public final class CaptionResult implements JsonSerializable<CaptionResult> {

    /*
     * A score, in the range of 0 to 1 (inclusive), representing the confidence that this description is accurate.
     * Higher values indicating higher confidence.
     */
    @Generated
    private final double confidence;

    /*
     * The text of the caption.
     */
    @Generated
    private final String text;

    /**
     * Creates an instance of CaptionResult class.
     *
     * @param confidence the confidence value to set.
     * @param text the text value to set.
     */
    @Generated
    private CaptionResult(double confidence, String text) {
        this.confidence = confidence;
        this.text = text;
    }

    /**
     * Get the confidence property: A score, in the range of 0 to 1 (inclusive), representing the confidence that this
     * description is accurate.
     * Higher values indicating higher confidence.
     *
     * @return the confidence value.
     */
    @Generated
    public double getConfidence() {
        return this.confidence;
    }

    /**
     * Get the text property: The text of the caption.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("confidence", this.confidence);
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CaptionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CaptionResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CaptionResult.
     */
    @Generated
    public static CaptionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            double confidence = 0.0;
            String text = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("confidence".equals(fieldName)) {
                    confidence = reader.getDouble();
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new CaptionResult(confidence, text);
        });
    }
}
