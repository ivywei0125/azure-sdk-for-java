// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The authentication options for Azure OpenAI On Your Data vector search when using access token.
 */
@Immutable
public final class OnYourDataVectorSearchAccessTokenAuthenticationOptions
    extends OnYourDataVectorSearchAuthenticationOptions {

    /*
     * The type of authentication to use.
     */
    @Generated
    private OnYourDataVectorSearchAuthenticationType type = OnYourDataVectorSearchAuthenticationType.ACCESS_TOKEN;

    /*
     * The access token to use for authentication.
     */
    @Generated
    private final String accessToken;

    /**
     * Creates an instance of OnYourDataVectorSearchAccessTokenAuthenticationOptions class.
     *
     * @param accessToken the accessToken value to set.
     */
    @Generated
    public OnYourDataVectorSearchAccessTokenAuthenticationOptions(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Get the type property: The type of authentication to use.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public OnYourDataVectorSearchAuthenticationType getType() {
        return this.type;
    }

    /**
     * Get the accessToken property: The access token to use for authentication.
     *
     * @return the accessToken value.
     */
    @Generated
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("access_token", this.accessToken);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnYourDataVectorSearchAccessTokenAuthenticationOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnYourDataVectorSearchAccessTokenAuthenticationOptions if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OnYourDataVectorSearchAccessTokenAuthenticationOptions.
     */
    @Generated
    public static OnYourDataVectorSearchAccessTokenAuthenticationOptions fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String accessToken = null;
            OnYourDataVectorSearchAuthenticationType type = OnYourDataVectorSearchAuthenticationType.ACCESS_TOKEN;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("access_token".equals(fieldName)) {
                    accessToken = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = OnYourDataVectorSearchAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            OnYourDataVectorSearchAccessTokenAuthenticationOptions deserializedOnYourDataVectorSearchAccessTokenAuthenticationOptions
                = new OnYourDataVectorSearchAccessTokenAuthenticationOptions(accessToken);
            deserializedOnYourDataVectorSearchAccessTokenAuthenticationOptions.type = type;
            return deserializedOnYourDataVectorSearchAccessTokenAuthenticationOptions;
        });
    }
}
