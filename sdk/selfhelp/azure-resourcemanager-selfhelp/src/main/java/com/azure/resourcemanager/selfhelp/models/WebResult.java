// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * AzureKB web result.
 */
@Fluent
public final class WebResult implements JsonSerializable<WebResult> {
    /*
     * Place holder used in HTML Content replace control with the content
     */
    private String replacementKey;

    /*
     * AzureKB search results
     */
    private List<SearchResult> searchResults;

    /**
     * Creates an instance of WebResult class.
     */
    public WebResult() {
    }

    /**
     * Get the replacementKey property: Place holder used in HTML Content replace control with the content.
     * 
     * @return the replacementKey value.
     */
    public String replacementKey() {
        return this.replacementKey;
    }

    /**
     * Set the replacementKey property: Place holder used in HTML Content replace control with the content.
     * 
     * @param replacementKey the replacementKey value to set.
     * @return the WebResult object itself.
     */
    public WebResult withReplacementKey(String replacementKey) {
        this.replacementKey = replacementKey;
        return this;
    }

    /**
     * Get the searchResults property: AzureKB search results.
     * 
     * @return the searchResults value.
     */
    public List<SearchResult> searchResults() {
        return this.searchResults;
    }

    /**
     * Set the searchResults property: AzureKB search results.
     * 
     * @param searchResults the searchResults value to set.
     * @return the WebResult object itself.
     */
    public WebResult withSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (searchResults() != null) {
            searchResults().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("replacementKey", this.replacementKey);
        jsonWriter.writeArrayField("searchResults", this.searchResults, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebResult if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the WebResult.
     */
    public static WebResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebResult deserializedWebResult = new WebResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("replacementKey".equals(fieldName)) {
                    deserializedWebResult.replacementKey = reader.getString();
                } else if ("searchResults".equals(fieldName)) {
                    List<SearchResult> searchResults = reader.readArray(reader1 -> SearchResult.fromJson(reader1));
                    deserializedWebResult.searchResults = searchResults;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebResult;
        });
    }
}
