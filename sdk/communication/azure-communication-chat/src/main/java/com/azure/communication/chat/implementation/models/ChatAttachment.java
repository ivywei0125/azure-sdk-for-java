// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An attachment in a chat message.
 */
@Fluent
public final class ChatAttachment implements JsonSerializable<ChatAttachment> {
    /*
     * Id of the attachment
     */
    private String id;

    /*
     * The type of attachment.
     */
    private ChatAttachmentType attachmentType;

    /*
     * The name of the attachment content.
     */
    private String name;

    /*
     * The URL where the attachment can be downloaded
     */
    private String url;

    /*
     * The URL where the preview of attachment can be downloaded
     */
    private String previewUrl;

    /**
     * Creates an instance of ChatAttachment class.
     */
    public ChatAttachment() {
    }

    /**
     * Get the id property: Id of the attachment.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of the attachment.
     * 
     * @param id the id value to set.
     * @return the ChatAttachment object itself.
     */
    public ChatAttachment setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the attachmentType property: The type of attachment.
     * 
     * @return the attachmentType value.
     */
    public ChatAttachmentType getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * Set the attachmentType property: The type of attachment.
     * 
     * @param attachmentType the attachmentType value to set.
     * @return the ChatAttachment object itself.
     */
    public ChatAttachment setAttachmentType(ChatAttachmentType attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * Get the name property: The name of the attachment content.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the attachment content.
     * 
     * @param name the name value to set.
     * @return the ChatAttachment object itself.
     */
    public ChatAttachment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the url property: The URL where the attachment can be downloaded.
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The URL where the attachment can be downloaded.
     * 
     * @param url the url value to set.
     * @return the ChatAttachment object itself.
     */
    public ChatAttachment setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the previewUrl property: The URL where the preview of attachment can be downloaded.
     * 
     * @return the previewUrl value.
     */
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    /**
     * Set the previewUrl property: The URL where the preview of attachment can be downloaded.
     * 
     * @param previewUrl the previewUrl value to set.
     * @return the ChatAttachment object itself.
     */
    public ChatAttachment setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("attachmentType",
            this.attachmentType == null ? null : this.attachmentType.toString());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("previewUrl", this.previewUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatAttachment from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatAttachment if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatAttachment.
     */
    public static ChatAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatAttachment deserializedChatAttachment = new ChatAttachment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedChatAttachment.id = reader.getString();
                } else if ("attachmentType".equals(fieldName)) {
                    deserializedChatAttachment.attachmentType = ChatAttachmentType.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedChatAttachment.name = reader.getString();
                } else if ("url".equals(fieldName)) {
                    deserializedChatAttachment.url = reader.getString();
                } else if ("previewUrl".equals(fieldName)) {
                    deserializedChatAttachment.previewUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChatAttachment;
        });
    }
}
