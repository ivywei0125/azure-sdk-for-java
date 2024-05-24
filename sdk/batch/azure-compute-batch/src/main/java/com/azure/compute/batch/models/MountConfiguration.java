// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The file system to mount on each node.
 */
@Fluent
public final class MountConfiguration implements JsonSerializable<MountConfiguration> {

    /*
     * The Azure Storage Container to mount using blob FUSE on each node. This property is mutually exclusive with all
     * other properties.
     */
    @Generated
    private AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration;

    /*
     * The NFS file system to mount on each node. This property is mutually exclusive with all other properties.
     */
    @Generated
    private NfsMountConfiguration nfsMountConfiguration;

    /*
     * The CIFS/SMB file system to mount on each node. This property is mutually exclusive with all other properties.
     */
    @Generated
    private CifsMountConfiguration cifsMountConfiguration;

    /*
     * The Azure File Share to mount on each node. This property is mutually exclusive with all other properties.
     */
    @Generated
    private AzureFileShareConfiguration azureFileShareConfiguration;

    /**
     * Creates an instance of MountConfiguration class.
     */
    @Generated
    public MountConfiguration() {
    }

    /**
     * Get the azureBlobFileSystemConfiguration property: The Azure Storage Container to mount using blob FUSE on each
     * node. This property is mutually exclusive with all other properties.
     *
     * @return the azureBlobFileSystemConfiguration value.
     */
    @Generated
    public AzureBlobFileSystemConfiguration getAzureBlobFileSystemConfiguration() {
        return this.azureBlobFileSystemConfiguration;
    }

    /**
     * Set the azureBlobFileSystemConfiguration property: The Azure Storage Container to mount using blob FUSE on each
     * node. This property is mutually exclusive with all other properties.
     *
     * @param azureBlobFileSystemConfiguration the azureBlobFileSystemConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    @Generated
    public MountConfiguration
        setAzureBlobFileSystemConfiguration(AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        return this;
    }

    /**
     * Get the nfsMountConfiguration property: The NFS file system to mount on each node. This property is mutually
     * exclusive with all other properties.
     *
     * @return the nfsMountConfiguration value.
     */
    @Generated
    public NfsMountConfiguration getNfsMountConfiguration() {
        return this.nfsMountConfiguration;
    }

    /**
     * Set the nfsMountConfiguration property: The NFS file system to mount on each node. This property is mutually
     * exclusive with all other properties.
     *
     * @param nfsMountConfiguration the nfsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    @Generated
    public MountConfiguration setNfsMountConfiguration(NfsMountConfiguration nfsMountConfiguration) {
        this.nfsMountConfiguration = nfsMountConfiguration;
        return this;
    }

    /**
     * Get the cifsMountConfiguration property: The CIFS/SMB file system to mount on each node. This property is
     * mutually exclusive with all other properties.
     *
     * @return the cifsMountConfiguration value.
     */
    @Generated
    public CifsMountConfiguration getCifsMountConfiguration() {
        return this.cifsMountConfiguration;
    }

    /**
     * Set the cifsMountConfiguration property: The CIFS/SMB file system to mount on each node. This property is
     * mutually exclusive with all other properties.
     *
     * @param cifsMountConfiguration the cifsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    @Generated
    public MountConfiguration setCifsMountConfiguration(CifsMountConfiguration cifsMountConfiguration) {
        this.cifsMountConfiguration = cifsMountConfiguration;
        return this;
    }

    /**
     * Get the azureFileShareConfiguration property: The Azure File Share to mount on each node. This property is
     * mutually exclusive with all other properties.
     *
     * @return the azureFileShareConfiguration value.
     */
    @Generated
    public AzureFileShareConfiguration getAzureFileShareConfiguration() {
        return this.azureFileShareConfiguration;
    }

    /**
     * Set the azureFileShareConfiguration property: The Azure File Share to mount on each node. This property is
     * mutually exclusive with all other properties.
     *
     * @param azureFileShareConfiguration the azureFileShareConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    @Generated
    public MountConfiguration setAzureFileShareConfiguration(AzureFileShareConfiguration azureFileShareConfiguration) {
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("azureBlobFileSystemConfiguration", this.azureBlobFileSystemConfiguration);
        jsonWriter.writeJsonField("nfsMountConfiguration", this.nfsMountConfiguration);
        jsonWriter.writeJsonField("cifsMountConfiguration", this.cifsMountConfiguration);
        jsonWriter.writeJsonField("azureFileShareConfiguration", this.azureFileShareConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MountConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MountConfiguration if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MountConfiguration.
     */
    @Generated
    public static MountConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MountConfiguration deserializedMountConfiguration = new MountConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("azureBlobFileSystemConfiguration".equals(fieldName)) {
                    deserializedMountConfiguration.azureBlobFileSystemConfiguration
                        = AzureBlobFileSystemConfiguration.fromJson(reader);
                } else if ("nfsMountConfiguration".equals(fieldName)) {
                    deserializedMountConfiguration.nfsMountConfiguration = NfsMountConfiguration.fromJson(reader);
                } else if ("cifsMountConfiguration".equals(fieldName)) {
                    deserializedMountConfiguration.cifsMountConfiguration = CifsMountConfiguration.fromJson(reader);
                } else if ("azureFileShareConfiguration".equals(fieldName)) {
                    deserializedMountConfiguration.azureFileShareConfiguration
                        = AzureFileShareConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMountConfiguration;
        });
    }
}
