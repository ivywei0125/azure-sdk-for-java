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
 * Specifies how a Job should be assigned to a Pool.
 */
@Fluent
public final class BatchPoolInfo implements JsonSerializable<BatchPoolInfo> {

    /*
     * The ID of an existing Pool. All the Tasks of the Job will run on the specified Pool. You must ensure that the
     * Pool referenced by this property exists. If the Pool does not exist at the time the Batch service tries to
     * schedule a Job, no Tasks for the Job will run until you create a Pool with that id. Note that the Batch service
     * will not reject the Job request; it will simply not run Tasks until the Pool exists. You must specify either the
     * Pool ID or the auto Pool specification, but not both.
     */
    @Generated
    private String poolId;

    /*
     * Characteristics for a temporary 'auto pool'. The Batch service will create this auto Pool when the Job is
     * submitted. If auto Pool creation fails, the Batch service moves the Job to a completed state, and the Pool
     * creation error is set in the Job's scheduling error property. The Batch service manages the lifetime (both
     * creation and, unless keepAlive is specified, deletion) of the auto Pool. Any user actions that affect the
     * lifetime of the auto Pool while the Job is active will result in unexpected behavior. You must specify either the
     * Pool ID or the auto Pool specification, but not both.
     */
    @Generated
    private BatchAutoPoolSpecification autoPoolSpecification;

    /**
     * Creates an instance of BatchPoolInfo class.
     */
    @Generated
    public BatchPoolInfo() {
    }

    /**
     * Get the poolId property: The ID of an existing Pool. All the Tasks of the Job will run on the specified Pool. You
     * must ensure that the Pool referenced by this property exists. If the Pool does not exist at the time the Batch
     * service tries to schedule a Job, no Tasks for the Job will run until you create a Pool with that id. Note that
     * the Batch service will not reject the Job request; it will simply not run Tasks until the Pool exists. You must
     * specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Set the poolId property: The ID of an existing Pool. All the Tasks of the Job will run on the specified Pool. You
     * must ensure that the Pool referenced by this property exists. If the Pool does not exist at the time the Batch
     * service tries to schedule a Job, no Tasks for the Job will run until you create a Pool with that id. Note that
     * the Batch service will not reject the Job request; it will simply not run Tasks until the Pool exists. You must
     * specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @param poolId the poolId value to set.
     * @return the BatchPoolInfo object itself.
     */
    @Generated
    public BatchPoolInfo setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * Get the autoPoolSpecification property: Characteristics for a temporary 'auto pool'. The Batch service will
     * create this auto Pool when the Job is submitted. If auto Pool creation fails, the Batch service moves the Job to
     * a completed state, and the Pool creation error is set in the Job's scheduling error property. The Batch service
     * manages the lifetime (both creation and, unless keepAlive is specified, deletion) of the auto Pool. Any user
     * actions that affect the lifetime of the auto Pool while the Job is active will result in unexpected behavior. You
     * must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @return the autoPoolSpecification value.
     */
    @Generated
    public BatchAutoPoolSpecification getAutoPoolSpecification() {
        return this.autoPoolSpecification;
    }

    /**
     * Set the autoPoolSpecification property: Characteristics for a temporary 'auto pool'. The Batch service will
     * create this auto Pool when the Job is submitted. If auto Pool creation fails, the Batch service moves the Job to
     * a completed state, and the Pool creation error is set in the Job's scheduling error property. The Batch service
     * manages the lifetime (both creation and, unless keepAlive is specified, deletion) of the auto Pool. Any user
     * actions that affect the lifetime of the auto Pool while the Job is active will result in unexpected behavior. You
     * must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @param autoPoolSpecification the autoPoolSpecification value to set.
     * @return the BatchPoolInfo object itself.
     */
    @Generated
    public BatchPoolInfo setAutoPoolSpecification(BatchAutoPoolSpecification autoPoolSpecification) {
        this.autoPoolSpecification = autoPoolSpecification;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("poolId", this.poolId);
        jsonWriter.writeJsonField("autoPoolSpecification", this.autoPoolSpecification);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchPoolInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchPoolInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchPoolInfo.
     */
    @Generated
    public static BatchPoolInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchPoolInfo deserializedBatchPoolInfo = new BatchPoolInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("poolId".equals(fieldName)) {
                    deserializedBatchPoolInfo.poolId = reader.getString();
                } else if ("autoPoolSpecification".equals(fieldName)) {
                    deserializedBatchPoolInfo.autoPoolSpecification = BatchAutoPoolSpecification.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchPoolInfo;
        });
    }
}
