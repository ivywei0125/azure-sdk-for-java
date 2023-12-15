// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The details of a a vectorization source, used by Azure OpenAI On Your Data when applying vector search, that is
 * based
 * on a search service model ID. Currently only supported by Elasticsearch®.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ModelId")
@Immutable
public final class OnYourDataModelIdVectorizationSource extends OnYourDataVectorizationSource {

    /*
     * The embedding model ID build inside the search service. Currently only supported by Elasticsearch®.
     */
    @Generated
    @JsonProperty(value = "modelId")
    private String modelId;

    /**
     * Creates an instance of OnYourDataModelIdVectorizationSource class.
     *
     * @param modelId the modelId value to set.
     */
    @Generated
    @JsonCreator
    public OnYourDataModelIdVectorizationSource(@JsonProperty(value = "modelId") String modelId) {
        this.modelId = modelId;
    }

    /**
     * Get the modelId property: The embedding model ID build inside the search service. Currently only supported by
     * Elasticsearch®.
     *
     * @return the modelId value.
     */
    @Generated
    public String getModelId() {
        return this.modelId;
    }
}
