// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The request payload for muting participants from the call.
 */
@Fluent
public final class MuteParticipantsRequestInternal implements JsonSerializable<MuteParticipantsRequestInternal> {
    /*
     * Participants to be muted from the call.
     * Only ACS Users are supported.
     */
    private List<CommunicationIdentifierModel> targetParticipants;

    /*
     * Used by customers when calling mid-call actions to correlate the request to the response event.
     */
    private String operationContext;

    /**
     * Creates an instance of MuteParticipantsRequestInternal class.
     */
    public MuteParticipantsRequestInternal() {
    }

    /**
     * Get the targetParticipants property: Participants to be muted from the call.
     * Only ACS Users are supported.
     * 
     * @return the targetParticipants value.
     */
    public List<CommunicationIdentifierModel> getTargetParticipants() {
        return this.targetParticipants;
    }

    /**
     * Set the targetParticipants property: Participants to be muted from the call.
     * Only ACS Users are supported.
     * 
     * @param targetParticipants the targetParticipants value to set.
     * @return the MuteParticipantsRequestInternal object itself.
     */
    public MuteParticipantsRequestInternal
        setTargetParticipants(List<CommunicationIdentifierModel> targetParticipants) {
        this.targetParticipants = targetParticipants;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     * 
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     * 
     * @param operationContext the operationContext value to set.
     * @return the MuteParticipantsRequestInternal object itself.
     */
    public MuteParticipantsRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("targetParticipants", this.targetParticipants,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("operationContext", this.operationContext);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MuteParticipantsRequestInternal from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MuteParticipantsRequestInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MuteParticipantsRequestInternal.
     */
    public static MuteParticipantsRequestInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MuteParticipantsRequestInternal deserializedMuteParticipantsRequestInternal
                = new MuteParticipantsRequestInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetParticipants".equals(fieldName)) {
                    List<CommunicationIdentifierModel> targetParticipants
                        = reader.readArray(reader1 -> CommunicationIdentifierModel.fromJson(reader1));
                    deserializedMuteParticipantsRequestInternal.targetParticipants = targetParticipants;
                } else if ("operationContext".equals(fieldName)) {
                    deserializedMuteParticipantsRequestInternal.operationContext = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMuteParticipantsRequestInternal;
        });
    }
}
