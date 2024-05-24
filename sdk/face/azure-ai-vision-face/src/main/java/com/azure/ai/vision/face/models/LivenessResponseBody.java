// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * The response body of detect liveness API call.
 */
@Immutable
public final class LivenessResponseBody {

    /*
     * The liveness classification for the target face.
     */
    @Generated
    @JsonProperty(value = "livenessDecision")
    private FaceLivenessDecision livenessDecision;

    /*
     * Specific targets used for liveness classification.
     */
    @Generated
    @JsonProperty(value = "target")
    private LivenessOutputsTarget target;

    /*
     * The model version used for liveness classification.
     */
    @Generated
    @JsonProperty(value = "modelVersionUsed")
    private LivenessModel modelVersionUsed;

    /*
     * The face verification output. Only available when the request is liveness with verify.
     */
    @Generated
    @JsonProperty(value = "verifyResult")
    private LivenessWithVerifyOutputs verifyResult;

    /*
     * The response body of detect liveness API call.
     * 
     * Additional properties
     */
    @Generated
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of LivenessResponseBody class.
     */
    @Generated
    private LivenessResponseBody() {
    }

    /**
     * Get the livenessDecision property: The liveness classification for the target face.
     *
     * @return the livenessDecision value.
     */
    @Generated
    public FaceLivenessDecision getLivenessDecision() {
        return this.livenessDecision;
    }

    /**
     * Get the target property: Specific targets used for liveness classification.
     *
     * @return the target value.
     */
    @Generated
    public LivenessOutputsTarget getTarget() {
        return this.target;
    }

    /**
     * Get the modelVersionUsed property: The model version used for liveness classification.
     *
     * @return the modelVersionUsed value.
     */
    @Generated
    public LivenessModel getModelVersionUsed() {
        return this.modelVersionUsed;
    }

    /**
     * Get the verifyResult property: The face verification output. Only available when the request is liveness with
     * verify.
     *
     * @return the verifyResult value.
     */
    @Generated
    public LivenessWithVerifyOutputs getVerifyResult() {
        return this.verifyResult;
    }

    /**
     * Get the additionalProperties property: The response body of detect liveness API call.
     *
     * Additional properties.
     *
     * @return the additionalProperties value.
     */
    @Generated
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Generated
    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
