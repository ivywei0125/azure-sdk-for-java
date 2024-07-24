// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Results of the last detection.
 */
@Immutable
public final class MultivariateLastDetectionResult implements JsonSerializable<MultivariateLastDetectionResult> {

    /*
     * Variable status.
     */
    @Generated
    private List<VariableState> variableStates;

    /*
     * Anomaly status and information.
     */
    @Generated
    private List<AnomalyState> results;

    /**
     * Creates an instance of MultivariateLastDetectionResult class.
     */
    @Generated
    private MultivariateLastDetectionResult() {
    }

    /**
     * Get the variableStates property: Variable status.
     *
     * @return the variableStates value.
     */
    @Generated
    public List<VariableState> getVariableStates() {
        return this.variableStates;
    }

    /**
     * Get the results property: Anomaly status and information.
     *
     * @return the results value.
     */
    @Generated
    public List<AnomalyState> getResults() {
        return this.results;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("variableStates", this.variableStates,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("results", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MultivariateLastDetectionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MultivariateLastDetectionResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MultivariateLastDetectionResult.
     */
    @Generated
    public static MultivariateLastDetectionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MultivariateLastDetectionResult deserializedMultivariateLastDetectionResult
                = new MultivariateLastDetectionResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("variableStates".equals(fieldName)) {
                    List<VariableState> variableStates = reader.readArray(reader1 -> VariableState.fromJson(reader1));
                    deserializedMultivariateLastDetectionResult.variableStates = variableStates;
                } else if ("results".equals(fieldName)) {
                    List<AnomalyState> results = reader.readArray(reader1 -> AnomalyState.fromJson(reader1));
                    deserializedMultivariateLastDetectionResult.results = results;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMultivariateLastDetectionResult;
        });
    }
}
