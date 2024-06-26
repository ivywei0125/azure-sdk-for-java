// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a streamed text content part within a streaming message delta chunk.
 */
@Immutable
public final class MessageDeltaTextContentObject extends MessageDeltaContent {

    /*
     * The type of content for this content part.
     */
    @Generated
    private String type = "text";

    /*
     * The text content details.
     */
    @Generated
    private MessageDeltaTextContent text;

    /**
     * Creates an instance of MessageDeltaTextContentObject class.
     *
     * @param index the index value to set.
     */
    @Generated
    private MessageDeltaTextContentObject(int index) {
        super(index);
    }

    /**
     * Get the type property: The type of content for this content part.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the text property: The text content details.
     *
     * @return the text value.
     */
    @Generated
    public MessageDeltaTextContent getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", getIndex());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaTextContentObject from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaTextContentObject if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageDeltaTextContentObject.
     */
    @Generated
    public static MessageDeltaTextContentObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "text";
            MessageDeltaTextContent text = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("text".equals(fieldName)) {
                    text = MessageDeltaTextContent.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            MessageDeltaTextContentObject deserializedMessageDeltaTextContentObject
                = new MessageDeltaTextContentObject(index);
            deserializedMessageDeltaTextContentObject.type = type;
            deserializedMessageDeltaTextContentObject.text = text;
            return deserializedMessageDeltaTextContentObject;
        });
    }
}
