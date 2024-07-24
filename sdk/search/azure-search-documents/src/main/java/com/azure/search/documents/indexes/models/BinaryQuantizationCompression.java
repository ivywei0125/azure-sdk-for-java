// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Contains configuration options specific to the binary quantization compression method used during indexing and
 * querying.
 */
@Fluent
public final class BinaryQuantizationCompression extends VectorSearchCompression {
    /*
     * The name of the kind of compression method being configured for use with vector search.
     */
    private VectorSearchCompressionKind kind = VectorSearchCompressionKind.BINARY_QUANTIZATION;

    /**
     * Creates an instance of BinaryQuantizationCompression class.
     * 
     * @param compressionName the compressionName value to set.
     */
    public BinaryQuantizationCompression(String compressionName) {
        super(compressionName);
    }

    /**
     * Get the kind property: The name of the kind of compression method being configured for use with vector search.
     * 
     * @return the kind value.
     */
    @Override
    public VectorSearchCompressionKind getKind() {
        return this.kind;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryQuantizationCompression setRerankWithOriginalVectors(Boolean rerankWithOriginalVectors) {
        super.setRerankWithOriginalVectors(rerankWithOriginalVectors);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryQuantizationCompression setDefaultOversampling(Double defaultOversampling) {
        super.setDefaultOversampling(defaultOversampling);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getCompressionName());
        jsonWriter.writeBooleanField("rerankWithOriginalVectors", isRerankWithOriginalVectors());
        jsonWriter.writeNumberField("defaultOversampling", getDefaultOversampling());
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BinaryQuantizationCompression from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BinaryQuantizationCompression if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BinaryQuantizationCompression.
     */
    public static BinaryQuantizationCompression fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean compressionNameFound = false;
            String compressionName = null;
            Boolean rerankWithOriginalVectors = null;
            Double defaultOversampling = null;
            VectorSearchCompressionKind kind = VectorSearchCompressionKind.BINARY_QUANTIZATION;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    compressionName = reader.getString();
                    compressionNameFound = true;
                } else if ("rerankWithOriginalVectors".equals(fieldName)) {
                    rerankWithOriginalVectors = reader.getNullable(JsonReader::getBoolean);
                } else if ("defaultOversampling".equals(fieldName)) {
                    defaultOversampling = reader.getNullable(JsonReader::getDouble);
                } else if ("kind".equals(fieldName)) {
                    kind = VectorSearchCompressionKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            if (compressionNameFound) {
                BinaryQuantizationCompression deserializedBinaryQuantizationCompression
                    = new BinaryQuantizationCompression(compressionName);
                deserializedBinaryQuantizationCompression.setRerankWithOriginalVectors(rerankWithOriginalVectors);
                deserializedBinaryQuantizationCompression.setDefaultOversampling(defaultOversampling);
                deserializedBinaryQuantizationCompression.kind = kind;

                return deserializedBinaryQuantizationCompression;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
