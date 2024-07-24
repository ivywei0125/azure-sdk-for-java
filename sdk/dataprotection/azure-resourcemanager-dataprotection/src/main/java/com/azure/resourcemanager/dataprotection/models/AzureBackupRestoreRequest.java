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
import java.util.List;

/**
 * AzureBackupRestoreRequest
 * 
 * Azure backup restore request.
 */
@Fluent
public class AzureBackupRestoreRequest implements JsonSerializable<AzureBackupRestoreRequest> {
    /*
     * The objectType property.
     */
    private String objectType = "AzureBackupRestoreRequest";

    /*
     * Gets or sets the restore target information.
     */
    private RestoreTargetInfoBase restoreTargetInfo;

    /*
     * Gets or sets the type of the source data store.
     */
    private SourceDataStoreType sourceDataStoreType;

    /*
     * Fully qualified Azure Resource Manager ID of the datasource which is being recovered.
     */
    private String sourceResourceId;

    /*
     * ResourceGuardOperationRequests on which LAC check will be performed
     */
    private List<String> resourceGuardOperationRequests;

    /*
     * Contains information of the Identity Details for the BI.
     * If it is null, default will be considered as System Assigned.
     */
    private IdentityDetails identityDetails;

    /**
     * Creates an instance of AzureBackupRestoreRequest class.
     */
    public AzureBackupRestoreRequest() {
    }

    /**
     * Get the objectType property: The objectType property.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the restoreTargetInfo property: Gets or sets the restore target information.
     * 
     * @return the restoreTargetInfo value.
     */
    public RestoreTargetInfoBase restoreTargetInfo() {
        return this.restoreTargetInfo;
    }

    /**
     * Set the restoreTargetInfo property: Gets or sets the restore target information.
     * 
     * @param restoreTargetInfo the restoreTargetInfo value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withRestoreTargetInfo(RestoreTargetInfoBase restoreTargetInfo) {
        this.restoreTargetInfo = restoreTargetInfo;
        return this;
    }

    /**
     * Get the sourceDataStoreType property: Gets or sets the type of the source data store.
     * 
     * @return the sourceDataStoreType value.
     */
    public SourceDataStoreType sourceDataStoreType() {
        return this.sourceDataStoreType;
    }

    /**
     * Set the sourceDataStoreType property: Gets or sets the type of the source data store.
     * 
     * @param sourceDataStoreType the sourceDataStoreType value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withSourceDataStoreType(SourceDataStoreType sourceDataStoreType) {
        this.sourceDataStoreType = sourceDataStoreType;
        return this;
    }

    /**
     * Get the sourceResourceId property: Fully qualified Azure Resource Manager ID of the datasource which is being
     * recovered.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: Fully qualified Azure Resource Manager ID of the datasource which is being
     * recovered.
     * 
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Get the identityDetails property: Contains information of the Identity Details for the BI.
     * If it is null, default will be considered as System Assigned.
     * 
     * @return the identityDetails value.
     */
    public IdentityDetails identityDetails() {
        return this.identityDetails;
    }

    /**
     * Set the identityDetails property: Contains information of the Identity Details for the BI.
     * If it is null, default will be considered as System Assigned.
     * 
     * @param identityDetails the identityDetails value to set.
     * @return the AzureBackupRestoreRequest object itself.
     */
    public AzureBackupRestoreRequest withIdentityDetails(IdentityDetails identityDetails) {
        this.identityDetails = identityDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreTargetInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property restoreTargetInfo in model AzureBackupRestoreRequest"));
        } else {
            restoreTargetInfo().validate();
        }
        if (sourceDataStoreType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceDataStoreType in model AzureBackupRestoreRequest"));
        }
        if (identityDetails() != null) {
            identityDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBackupRestoreRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("restoreTargetInfo", this.restoreTargetInfo);
        jsonWriter.writeStringField("sourceDataStoreType",
            this.sourceDataStoreType == null ? null : this.sourceDataStoreType.toString());
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeStringField("sourceResourceId", this.sourceResourceId);
        jsonWriter.writeArrayField("resourceGuardOperationRequests", this.resourceGuardOperationRequests,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identityDetails", this.identityDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureBackupRestoreRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureBackupRestoreRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureBackupRestoreRequest.
     */
    public static AzureBackupRestoreRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("objectType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("AzureBackupRecoveryPointBasedRestoreRequest".equals(discriminatorValue)) {
                    return AzureBackupRecoveryPointBasedRestoreRequest.fromJsonKnownDiscriminator(readerToUse.reset());
                } else if ("AzureBackupRestoreWithRehydrationRequest".equals(discriminatorValue)) {
                    return AzureBackupRestoreWithRehydrationRequest.fromJson(readerToUse.reset());
                } else if ("AzureBackupRecoveryTimeBasedRestoreRequest".equals(discriminatorValue)) {
                    return AzureBackupRecoveryTimeBasedRestoreRequest.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AzureBackupRestoreRequest fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureBackupRestoreRequest deserializedAzureBackupRestoreRequest = new AzureBackupRestoreRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("restoreTargetInfo".equals(fieldName)) {
                    deserializedAzureBackupRestoreRequest.restoreTargetInfo = RestoreTargetInfoBase.fromJson(reader);
                } else if ("sourceDataStoreType".equals(fieldName)) {
                    deserializedAzureBackupRestoreRequest.sourceDataStoreType
                        = SourceDataStoreType.fromString(reader.getString());
                } else if ("objectType".equals(fieldName)) {
                    deserializedAzureBackupRestoreRequest.objectType = reader.getString();
                } else if ("sourceResourceId".equals(fieldName)) {
                    deserializedAzureBackupRestoreRequest.sourceResourceId = reader.getString();
                } else if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureBackupRestoreRequest.resourceGuardOperationRequests
                        = resourceGuardOperationRequests;
                } else if ("identityDetails".equals(fieldName)) {
                    deserializedAzureBackupRestoreRequest.identityDetails = IdentityDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureBackupRestoreRequest;
        });
    }
}
