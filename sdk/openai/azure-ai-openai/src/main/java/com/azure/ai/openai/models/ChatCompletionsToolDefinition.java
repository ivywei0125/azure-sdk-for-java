// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a tool that can be used by the model to improve a chat completions response.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ChatCompletionsToolDefinition.class)
@JsonTypeName("ChatCompletionsToolDefinition")
@JsonSubTypes({ @JsonSubTypes.Type(name = "function", value = ChatCompletionsFunctionToolDefinition.class) })
@Immutable
public class ChatCompletionsToolDefinition {

    /**
     * Creates an instance of ChatCompletionsToolDefinition class.
     */
    @Generated
    public ChatCompletionsToolDefinition() {
    }
}
