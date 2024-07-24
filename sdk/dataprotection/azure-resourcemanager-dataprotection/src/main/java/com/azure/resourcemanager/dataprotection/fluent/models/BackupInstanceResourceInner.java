// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dataprotection.models.BackupInstance;
import com.azure.resourcemanager.dataprotection.models.DppProxyResource;
import java.io.IOException;
import java.util.Map;

/**
 * BackupInstanceResource
 * 
 * BackupInstance Resource.
 */
@Fluent
public final class BackupInstanceResourceInner extends DppProxyResource {
    /*
     * BackupInstanceResource properties
     */
    private BackupInstance properties;

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

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /**
     * Creates an instance of BackupInstanceResourceInner class.
     */
    public BackupInstanceResourceInner() {
    }

    /**
     * Get the properties property: BackupInstanceResource properties.
     * 
     * @return the properties value.
     */
    public BackupInstance properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupInstanceResource properties.
     * 
     * @param properties the properties value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withProperties(BackupInstance properties) {
        this.properties = properties;
        return this;
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
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupInstanceResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupInstanceResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupInstanceResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupInstanceResourceInner.
     */
    public static BackupInstanceResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupInstanceResourceInner deserializedBackupInstanceResourceInner = new BackupInstanceResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBackupInstanceResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBackupInstanceResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBackupInstanceResourceInner.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBackupInstanceResourceInner.withTags(tags);
                } else if ("systemData".equals(fieldName)) {
                    deserializedBackupInstanceResourceInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedBackupInstanceResourceInner.properties = BackupInstance.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupInstanceResourceInner;
        });
    }
}
