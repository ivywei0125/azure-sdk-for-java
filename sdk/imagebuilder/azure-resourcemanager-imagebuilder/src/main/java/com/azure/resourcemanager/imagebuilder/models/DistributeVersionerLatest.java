// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Generates version number that will be latest based on existing version numbers.
 */
@Fluent
public final class DistributeVersionerLatest extends DistributeVersioner {
    /*
     * Version numbering scheme to be used.
     */
    private String scheme = "Latest";

    /*
     * Major version for the generated version number. Determine what is "latest" based on versions with this value as
     * the major version. -1 is equivalent to leaving it unset.
     */
    private Integer major;

    /**
     * Creates an instance of DistributeVersionerLatest class.
     */
    public DistributeVersionerLatest() {
    }

    /**
     * Get the scheme property: Version numbering scheme to be used.
     * 
     * @return the scheme value.
     */
    @Override
    public String scheme() {
        return this.scheme;
    }

    /**
     * Get the major property: Major version for the generated version number. Determine what is "latest" based on
     * versions with this value as the major version. -1 is equivalent to leaving it unset.
     * 
     * @return the major value.
     */
    public Integer major() {
        return this.major;
    }

    /**
     * Set the major property: Major version for the generated version number. Determine what is "latest" based on
     * versions with this value as the major version. -1 is equivalent to leaving it unset.
     * 
     * @param major the major value to set.
     * @return the DistributeVersionerLatest object itself.
     */
    public DistributeVersionerLatest withMajor(Integer major) {
        this.major = major;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scheme", this.scheme);
        jsonWriter.writeNumberField("major", this.major);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DistributeVersionerLatest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DistributeVersionerLatest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DistributeVersionerLatest.
     */
    public static DistributeVersionerLatest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DistributeVersionerLatest deserializedDistributeVersionerLatest = new DistributeVersionerLatest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scheme".equals(fieldName)) {
                    deserializedDistributeVersionerLatest.scheme = reader.getString();
                } else if ("major".equals(fieldName)) {
                    deserializedDistributeVersionerLatest.major = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDistributeVersionerLatest;
        });
    }
}
