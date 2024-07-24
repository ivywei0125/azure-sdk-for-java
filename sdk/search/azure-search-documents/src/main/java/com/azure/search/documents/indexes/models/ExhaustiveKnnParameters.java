// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains the parameters specific to exhaustive KNN algorithm.
 */
@Fluent
public final class ExhaustiveKnnParameters implements JsonSerializable<ExhaustiveKnnParameters> {
    /*
     * The similarity metric to use for vector comparisons.
     */
    private VectorSearchAlgorithmMetric metric;

    /**
     * Creates an instance of ExhaustiveKnnParameters class.
     */
    public ExhaustiveKnnParameters() {
    }

    /**
     * Get the metric property: The similarity metric to use for vector comparisons.
     * 
     * @return the metric value.
     */
    public VectorSearchAlgorithmMetric getMetric() {
        return this.metric;
    }

    /**
     * Set the metric property: The similarity metric to use for vector comparisons.
     * 
     * @param metric the metric value to set.
     * @return the ExhaustiveKnnParameters object itself.
     */
    public ExhaustiveKnnParameters setMetric(VectorSearchAlgorithmMetric metric) {
        this.metric = metric;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("metric", this.metric == null ? null : this.metric.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExhaustiveKnnParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExhaustiveKnnParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExhaustiveKnnParameters.
     */
    public static ExhaustiveKnnParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExhaustiveKnnParameters deserializedExhaustiveKnnParameters = new ExhaustiveKnnParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metric".equals(fieldName)) {
                    deserializedExhaustiveKnnParameters.metric
                        = VectorSearchAlgorithmMetric.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExhaustiveKnnParameters;
        });
    }
}
