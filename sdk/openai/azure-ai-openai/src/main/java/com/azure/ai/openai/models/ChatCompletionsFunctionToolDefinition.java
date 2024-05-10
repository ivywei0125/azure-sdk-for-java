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
 * The definition information for a chat completions function tool that can call a function in response to a tool call.
 */
@Immutable
public final class ChatCompletionsFunctionToolDefinition extends ChatCompletionsToolDefinition {

    /*
     * The function definition details for the function tool.
     */
    @Generated
    private final FunctionDefinition function;

    /**
     * Creates an instance of ChatCompletionsFunctionToolDefinition class.
     *
     * @param function the function value to set.
     */
    @Generated
    public ChatCompletionsFunctionToolDefinition(FunctionDefinition function) {
        this.function = function;
    }

    /**
     * Get the function property: The function definition details for the function tool.
     *
     * @return the function value.
     */
    @Generated
    public FunctionDefinition getFunction() {
        return this.function;
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "function";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("function", this.function);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionsFunctionToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionsFunctionToolDefinition if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionsFunctionToolDefinition.
     */
    @Generated
    public static ChatCompletionsFunctionToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionDefinition function = null;
            String type = "function";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("function".equals(fieldName)) {
                    function = FunctionDefinition.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatCompletionsFunctionToolDefinition deserializedChatCompletionsFunctionToolDefinition
                = new ChatCompletionsFunctionToolDefinition(function);
            deserializedChatCompletionsFunctionToolDefinition.type = type;
            return deserializedChatCompletionsFunctionToolDefinition;
        });
    }
}
