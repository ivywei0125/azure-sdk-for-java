// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.DppTrackedResource;
import java.io.IOException;
import java.util.Map;

/**
 * BackupVault Resource
 * 
 * Backup Vault Resource.
 */
@Fluent
public final class BackupVaultResourceInner extends DppTrackedResource {
    /*
     * BackupVaultResource properties
     */
    private BackupVault properties;

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
     * Creates an instance of BackupVaultResourceInner class.
     */
    public BackupVaultResourceInner() {
    }

    /**
     * Get the properties property: BackupVaultResource properties.
     * 
     * @return the properties value.
     */
    public BackupVault properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BackupVaultResource properties.
     * 
     * @param properties the properties value to set.
     * @return the BackupVaultResourceInner object itself.
     */
    public BackupVaultResourceInner withProperties(BackupVault properties) {
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
    public BackupVaultResourceInner withIdentity(DppIdentityDetails identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupVaultResourceInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupVaultResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BackupVaultResourceInner withTags(Map<String, String> tags) {
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
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model BackupVaultResourceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupVaultResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("eTag", etag());
        jsonWriter.writeJsonField("identity", identity());
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BackupVaultResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BackupVaultResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BackupVaultResourceInner.
     */
    public static BackupVaultResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BackupVaultResourceInner deserializedBackupVaultResourceInner = new BackupVaultResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBackupVaultResourceInner.withTags(tags);
                } else if ("eTag".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.withEtag(reader.getString());
                } else if ("systemData".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.systemData = SystemData.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.withIdentity(DppIdentityDetails.fromJson(reader));
                } else if ("properties".equals(fieldName)) {
                    deserializedBackupVaultResourceInner.properties = BackupVault.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackupVaultResourceInner;
        });
    }
}
