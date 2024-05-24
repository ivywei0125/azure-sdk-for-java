// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The result of uploading Batch service log files from a specific Compute Node.
 */
@Immutable
public final class UploadBatchServiceLogsResult implements JsonSerializable<UploadBatchServiceLogsResult> {

    /*
     * The virtual directory within Azure Blob Storage container to which the Batch Service log file(s) will be
     * uploaded. The virtual directory name is part of the blob name for each log file uploaded, and it is built based
     * poolId, nodeId and a unique identifier.
     */
    @Generated
    private final String virtualDirectoryName;

    /*
     * The number of log files which will be uploaded.
     */
    @Generated
    private final int numberOfFilesUploaded;

    /**
     * Creates an instance of UploadBatchServiceLogsResult class.
     *
     * @param virtualDirectoryName the virtualDirectoryName value to set.
     * @param numberOfFilesUploaded the numberOfFilesUploaded value to set.
     */
    @Generated
    private UploadBatchServiceLogsResult(String virtualDirectoryName, int numberOfFilesUploaded) {
        this.virtualDirectoryName = virtualDirectoryName;
        this.numberOfFilesUploaded = numberOfFilesUploaded;
    }

    /**
     * Get the virtualDirectoryName property: The virtual directory within Azure Blob Storage container to which the
     * Batch Service log file(s) will be uploaded. The virtual directory name is part of the blob name for each log file
     * uploaded, and it is built based poolId, nodeId and a unique identifier.
     *
     * @return the virtualDirectoryName value.
     */
    @Generated
    public String getVirtualDirectoryName() {
        return this.virtualDirectoryName;
    }

    /**
     * Get the numberOfFilesUploaded property: The number of log files which will be uploaded.
     *
     * @return the numberOfFilesUploaded value.
     */
    @Generated
    public int getNumberOfFilesUploaded() {
        return this.numberOfFilesUploaded;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("virtualDirectoryName", this.virtualDirectoryName);
        jsonWriter.writeIntField("numberOfFilesUploaded", this.numberOfFilesUploaded);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UploadBatchServiceLogsResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UploadBatchServiceLogsResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UploadBatchServiceLogsResult.
     */
    @Generated
    public static UploadBatchServiceLogsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String virtualDirectoryName = null;
            int numberOfFilesUploaded = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("virtualDirectoryName".equals(fieldName)) {
                    virtualDirectoryName = reader.getString();
                } else if ("numberOfFilesUploaded".equals(fieldName)) {
                    numberOfFilesUploaded = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new UploadBatchServiceLogsResult(virtualDirectoryName, numberOfFilesUploaded);
        });
    }
}
