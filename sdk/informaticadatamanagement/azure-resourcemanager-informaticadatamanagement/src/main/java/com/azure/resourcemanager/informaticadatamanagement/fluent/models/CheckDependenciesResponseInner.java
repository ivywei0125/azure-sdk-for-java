// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeDependency;
import java.io.IOException;
import java.util.List;

/**
 * Model for the check dependencies API for an informatica serverless runtime resource.
 */
@Immutable
public final class CheckDependenciesResponseInner implements JsonSerializable<CheckDependenciesResponseInner> {
    /*
     * Count of dependencies
     */
    private int count;

    /*
     * id of resource
     */
    private String id;

    /*
     * List of dependencies
     */
    private List<ServerlessRuntimeDependency> references;

    /**
     * Creates an instance of CheckDependenciesResponseInner class.
     */
    private CheckDependenciesResponseInner() {
    }

    /**
     * Get the count property: Count of dependencies.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Get the id property: id of resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the references property: List of dependencies.
     * 
     * @return the references value.
     */
    public List<ServerlessRuntimeDependency> references() {
        return this.references;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property id in model CheckDependenciesResponseInner"));
        }
        if (references() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property references in model CheckDependenciesResponseInner"));
        } else {
            references().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckDependenciesResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeArrayField("references", this.references, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckDependenciesResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckDependenciesResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CheckDependenciesResponseInner.
     */
    public static CheckDependenciesResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckDependenciesResponseInner deserializedCheckDependenciesResponseInner
                = new CheckDependenciesResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedCheckDependenciesResponseInner.count = reader.getInt();
                } else if ("id".equals(fieldName)) {
                    deserializedCheckDependenciesResponseInner.id = reader.getString();
                } else if ("references".equals(fieldName)) {
                    List<ServerlessRuntimeDependency> references
                        = reader.readArray(reader1 -> ServerlessRuntimeDependency.fromJson(reader1));
                    deserializedCheckDependenciesResponseInner.references = references;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckDependenciesResponseInner;
        });
    }
}
