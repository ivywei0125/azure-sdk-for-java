// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mongocluster.models.PrivateLinkResourceProperties;
import java.io.IOException;

/**
 * Concrete proxy resource types can be created by aliasing this type using a specific property type.
 */
@Immutable
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private PrivateLinkResourceProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    private PrivateLinkResourceInner() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceInner.
     */
    public static PrivateLinkResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceInner deserializedPrivateLinkResourceInner = new PrivateLinkResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.properties = PrivateLinkResourceProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceInner;
        });
    }
}
