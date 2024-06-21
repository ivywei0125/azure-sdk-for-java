// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Activation Links model.
 */
@Immutable
public final class ActivationLinksInner implements JsonSerializable<ActivationLinksInner> {
    /*
     * New Cloud Account Activation Link
     */
    private String newCloudAccountActivationLink;

    /*
     * Existing Cloud Account Activation Link
     */
    private String existingCloudAccountActivationLink;

    /**
     * Creates an instance of ActivationLinksInner class.
     */
    public ActivationLinksInner() {
    }

    /**
     * Get the newCloudAccountActivationLink property: New Cloud Account Activation Link.
     * 
     * @return the newCloudAccountActivationLink value.
     */
    public String newCloudAccountActivationLink() {
        return this.newCloudAccountActivationLink;
    }

    /**
     * Get the existingCloudAccountActivationLink property: Existing Cloud Account Activation Link.
     * 
     * @return the existingCloudAccountActivationLink value.
     */
    public String existingCloudAccountActivationLink() {
        return this.existingCloudAccountActivationLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActivationLinksInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActivationLinksInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ActivationLinksInner.
     */
    public static ActivationLinksInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActivationLinksInner deserializedActivationLinksInner = new ActivationLinksInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("newCloudAccountActivationLink".equals(fieldName)) {
                    deserializedActivationLinksInner.newCloudAccountActivationLink = reader.getString();
                } else if ("existingCloudAccountActivationLink".equals(fieldName)) {
                    deserializedActivationLinksInner.existingCloudAccountActivationLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActivationLinksInner;
        });
    }
}
