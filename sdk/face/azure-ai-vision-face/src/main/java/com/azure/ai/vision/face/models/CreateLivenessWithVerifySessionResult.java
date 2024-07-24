// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response of liveness session with verify creation with verify image provided.
 */
@Immutable
public final class CreateLivenessWithVerifySessionResult
    implements JsonSerializable<CreateLivenessWithVerifySessionResult> {

    /*
     * The unique session ID of the created session. It will expire 48 hours after it was created or may be deleted
     * sooner using the corresponding Session DELETE operation.
     */
    @Generated
    private final String sessionId;

    /*
     * Bearer token to provide authentication for the Vision SDK running on a client application. This Bearer token has
     * limited permissions to perform only the required action and expires after the TTL time. It is also auditable.
     */
    @Generated
    private final String authToken;

    /*
     * The detail of face for verification.
     */
    @Generated
    private LivenessWithVerifyImage verifyImage;

    /**
     * Creates an instance of CreateLivenessWithVerifySessionResult class.
     *
     * @param sessionId the sessionId value to set.
     * @param authToken the authToken value to set.
     */
    @Generated
    private CreateLivenessWithVerifySessionResult(String sessionId, String authToken) {
        this.sessionId = sessionId;
        this.authToken = authToken;
    }

    /**
     * Get the sessionId property: The unique session ID of the created session. It will expire 48 hours after it was
     * created or may be deleted sooner using the corresponding Session DELETE operation.
     *
     * @return the sessionId value.
     */
    @Generated
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Get the authToken property: Bearer token to provide authentication for the Vision SDK running on a client
     * application. This Bearer token has limited permissions to perform only the required action and expires after the
     * TTL time. It is also auditable.
     *
     * @return the authToken value.
     */
    @Generated
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * Get the verifyImage property: The detail of face for verification.
     *
     * @return the verifyImage value.
     */
    @Generated
    public LivenessWithVerifyImage getVerifyImage() {
        return this.verifyImage;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sessionId", this.sessionId);
        jsonWriter.writeStringField("authToken", this.authToken);
        jsonWriter.writeJsonField("verifyImage", this.verifyImage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateLivenessWithVerifySessionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateLivenessWithVerifySessionResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateLivenessWithVerifySessionResult.
     */
    @Generated
    public static CreateLivenessWithVerifySessionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String sessionId = null;
            String authToken = null;
            LivenessWithVerifyImage verifyImage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("sessionId".equals(fieldName)) {
                    sessionId = reader.getString();
                } else if ("authToken".equals(fieldName)) {
                    authToken = reader.getString();
                } else if ("verifyImage".equals(fieldName)) {
                    verifyImage = LivenessWithVerifyImage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            CreateLivenessWithVerifySessionResult deserializedCreateLivenessWithVerifySessionResult
                = new CreateLivenessWithVerifySessionResult(sessionId, authToken);
            deserializedCreateLivenessWithVerifySessionResult.verifyImage = verifyImage;
            return deserializedCreateLivenessWithVerifySessionResult;
        });
    }
}
