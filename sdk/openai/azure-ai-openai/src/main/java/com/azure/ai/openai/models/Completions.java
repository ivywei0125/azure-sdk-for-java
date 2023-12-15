// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 * Representation of the response data from a completions request.
 * Completions support a wide variety of tasks and generate text that continues from or "completes"
 * provided prompt data.
 */
@Immutable
public final class Completions {

    /*
     * A unique identifier associated with this completions response.
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     */
    @Generated
    @JsonProperty(value = "choices")
    private List<Choice> choices;

    /*
     * Usage information for tokens processed and generated as part of this completions operation.
     */
    @Generated
    @JsonProperty(value = "usage")
    private CompletionsUsage usage;

    /**
     * Get the id property: A unique identifier associated with this completions response.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the choices property: The collection of completions choices associated with this completions response.
     * Generally, `n` choices are generated per provided prompt with a default value of 1.
     * Token limits and other settings may limit the number of choices generated.
     *
     * @return the choices value.
     */
    @Generated
    public List<Choice> getChoices() {
        return this.choices;
    }

    /**
     * Get the usage property: Usage information for tokens processed and generated as part of this completions
     * operation.
     *
     * @return the usage value.
     */
    @Generated
    public CompletionsUsage getUsage() {
        return this.usage;
    }

    /*
     * Content filtering results for zero or more prompts in the request. In a streaming request,
     * results for different prompts may arrive at different times or in different orders.
     */
    @Generated
    @JsonProperty(value = "prompt_filter_results")
    private List<ContentFilterResultsForPrompt> promptFilterResults;

    /**
     * Backing member for the prompt filtering result during the rename transition. More details <a
     * href="https://github.com/Azure/azure-rest-api-specs/pull/25880">here</a>
     *
     * @deprecated This field is only used for deserialization.
     */
    @Deprecated
    @JsonProperty(value = "prompt_annotations")
    private List<ContentFilterResultsForPrompt> promptAnnotations;

    /**
     * Get the promptFilterResults property: Content filtering results for zero or more prompts in the request. In a
     * streaming request,
     * results for different prompts may arrive at different times or in different orders.
     *
     * @return the promptFilterResults value.
     */
    public List<ContentFilterResultsForPrompt> getPromptFilterResults() {
        if (this.promptFilterResults != null) {
            return this.promptFilterResults;
        }
        return this.promptAnnotations;
    }

    /*
     * The first timestamp associated with generation activity for this completions response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     */
    @Generated
    @JsonProperty(value = "created")
    private long createdAt;

    /**
     * Creates an instance of Completions class.
     *
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param choices the choices value to set.
     * @param usage the usage value to set.
     */
    @Generated
    private Completions(String id, OffsetDateTime createdAt, List<Choice> choices, CompletionsUsage usage) {
        this.id = id;
        this.createdAt = createdAt.toEpochSecond();
        this.choices = choices;
        this.usage = usage;
    }

    @Generated
    @JsonCreator
    private Completions(@JsonProperty(value = "id") String id, @JsonProperty(value = "created") long createdAt,
        @JsonProperty(value = "choices") List<Choice> choices, @JsonProperty(value = "usage") CompletionsUsage usage) {
        this(id, OffsetDateTime.ofInstant(Instant.ofEpochSecond(createdAt), ZoneOffset.UTC), choices, usage);
    }

    /**
     * Get the createdAt property: The first timestamp associated with generation activity for this completions
     * response,
     * represented as seconds since the beginning of the Unix epoch of 00:00 on 1 Jan 1970.
     *
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }
}
