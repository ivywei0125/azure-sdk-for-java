// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Description for what data to store in the designated search index. */
@Immutable
public final class SearchIndexerIndexProjectionSelector
        implements JsonSerializable<SearchIndexerIndexProjectionSelector> {
    /*
     * Name of the search index to project to. Must have a key field with the 'keyword' analyzer set.
     */
    private final String targetIndexName;

    /*
     * Name of the field in the search index to map the parent document's key value to. Must be a string field that is
     * filterable and not the key field.
     */
    private final String parentKeyFieldName;

    /*
     * Source context for the projections. Represents the cardinality at which the document will be split into multiple
     * sub documents.
     */
    private final String sourceContext;

    /*
     * Mappings for the projection, or which source should be mapped to which field in the target index.
     */
    private final List<InputFieldMappingEntry> mappings;

    /**
     * Creates an instance of SearchIndexerIndexProjectionSelector class.
     *
     * @param targetIndexName the targetIndexName value to set.
     * @param parentKeyFieldName the parentKeyFieldName value to set.
     * @param sourceContext the sourceContext value to set.
     * @param mappings the mappings value to set.
     */
    public SearchIndexerIndexProjectionSelector(
            String targetIndexName,
            String parentKeyFieldName,
            String sourceContext,
            List<InputFieldMappingEntry> mappings) {
        this.targetIndexName = targetIndexName;
        this.parentKeyFieldName = parentKeyFieldName;
        this.sourceContext = sourceContext;
        this.mappings = mappings;
    }

    /**
     * Get the targetIndexName property: Name of the search index to project to. Must have a key field with the
     * 'keyword' analyzer set.
     *
     * @return the targetIndexName value.
     */
    public String getTargetIndexName() {
        return this.targetIndexName;
    }

    /**
     * Get the parentKeyFieldName property: Name of the field in the search index to map the parent document's key value
     * to. Must be a string field that is filterable and not the key field.
     *
     * @return the parentKeyFieldName value.
     */
    public String getParentKeyFieldName() {
        return this.parentKeyFieldName;
    }

    /**
     * Get the sourceContext property: Source context for the projections. Represents the cardinality at which the
     * document will be split into multiple sub documents.
     *
     * @return the sourceContext value.
     */
    public String getSourceContext() {
        return this.sourceContext;
    }

    /**
     * Get the mappings property: Mappings for the projection, or which source should be mapped to which field in the
     * target index.
     *
     * @return the mappings value.
     */
    public List<InputFieldMappingEntry> getMappings() {
        return this.mappings;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetIndexName", this.targetIndexName);
        jsonWriter.writeStringField("parentKeyFieldName", this.parentKeyFieldName);
        jsonWriter.writeStringField("sourceContext", this.sourceContext);
        jsonWriter.writeArrayField("mappings", this.mappings, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerIndexProjectionSelector from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerIndexProjectionSelector if the JsonReader was pointing to an instance of it,
     *     or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerIndexProjectionSelector.
     */
    public static SearchIndexerIndexProjectionSelector fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean targetIndexNameFound = false;
                    String targetIndexName = null;
                    boolean parentKeyFieldNameFound = false;
                    String parentKeyFieldName = null;
                    boolean sourceContextFound = false;
                    String sourceContext = null;
                    boolean mappingsFound = false;
                    List<InputFieldMappingEntry> mappings = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("targetIndexName".equals(fieldName)) {
                            targetIndexName = reader.getString();
                            targetIndexNameFound = true;
                        } else if ("parentKeyFieldName".equals(fieldName)) {
                            parentKeyFieldName = reader.getString();
                            parentKeyFieldNameFound = true;
                        } else if ("sourceContext".equals(fieldName)) {
                            sourceContext = reader.getString();
                            sourceContextFound = true;
                        } else if ("mappings".equals(fieldName)) {
                            mappings = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            mappingsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (targetIndexNameFound && parentKeyFieldNameFound && sourceContextFound && mappingsFound) {
                        SearchIndexerIndexProjectionSelector deserializedSearchIndexerIndexProjectionSelector =
                                new SearchIndexerIndexProjectionSelector(
                                        targetIndexName, parentKeyFieldName, sourceContext, mappings);

                        return deserializedSearchIndexerIndexProjectionSelector;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!targetIndexNameFound) {
                        missingProperties.add("targetIndexName");
                    }
                    if (!parentKeyFieldNameFound) {
                        missingProperties.add("parentKeyFieldName");
                    }
                    if (!sourceContextFound) {
                        missingProperties.add("sourceContext");
                    }
                    if (!mappingsFound) {
                        missingProperties.add("mappings");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
