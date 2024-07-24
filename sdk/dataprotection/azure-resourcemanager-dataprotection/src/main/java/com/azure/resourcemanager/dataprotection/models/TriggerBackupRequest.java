// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * TriggerBackupRequest
 * 
 * Trigger backup request.
 */
@Fluent
public final class TriggerBackupRequest implements JsonSerializable<TriggerBackupRequest> {
    /*
     * Name for the Rule of the Policy which needs to be applied for this backup
     */
    private AdHocBackupRuleOptions backupRuleOptions;

    /**
     * Creates an instance of TriggerBackupRequest class.
     */
    public TriggerBackupRequest() {
    }

    /**
     * Get the backupRuleOptions property: Name for the Rule of the Policy which needs to be applied for this backup.
     * 
     * @return the backupRuleOptions value.
     */
    public AdHocBackupRuleOptions backupRuleOptions() {
        return this.backupRuleOptions;
    }

    /**
     * Set the backupRuleOptions property: Name for the Rule of the Policy which needs to be applied for this backup.
     * 
     * @param backupRuleOptions the backupRuleOptions value to set.
     * @return the TriggerBackupRequest object itself.
     */
    public TriggerBackupRequest withBackupRuleOptions(AdHocBackupRuleOptions backupRuleOptions) {
        this.backupRuleOptions = backupRuleOptions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupRuleOptions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property backupRuleOptions in model TriggerBackupRequest"));
        } else {
            backupRuleOptions().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TriggerBackupRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("backupRuleOptions", this.backupRuleOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerBackupRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerBackupRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TriggerBackupRequest.
     */
    public static TriggerBackupRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerBackupRequest deserializedTriggerBackupRequest = new TriggerBackupRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupRuleOptions".equals(fieldName)) {
                    deserializedTriggerBackupRequest.backupRuleOptions = AdHocBackupRuleOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerBackupRequest;
        });
    }
}
