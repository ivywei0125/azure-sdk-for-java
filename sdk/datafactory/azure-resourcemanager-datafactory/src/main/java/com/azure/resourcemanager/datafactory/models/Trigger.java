// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure data factory nested object which contains information about creating pipeline run.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = Trigger.class, visible = true)
@JsonTypeName("Trigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MultiplePipelineTrigger", value = MultiplePipelineTrigger.class),
    @JsonSubTypes.Type(name = "TumblingWindowTrigger", value = TumblingWindowTrigger.class),
    @JsonSubTypes.Type(name = "RerunTumblingWindowTrigger", value = RerunTumblingWindowTrigger.class),
    @JsonSubTypes.Type(name = "ChainingTrigger", value = ChainingTrigger.class) })
@Fluent
public class Trigger {
    /*
     * Trigger type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "Trigger";

    /*
     * Trigger description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     */
    @JsonProperty(value = "runtimeState", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerRuntimeState runtimeState;

    /*
     * List of tags that can be used for describing the trigger.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /*
     * Azure data factory nested object which contains information about creating pipeline run
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of Trigger class.
     */
    public Trigger() {
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the description property: Trigger description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Trigger description.
     * 
     * @param description the description value to set.
     * @return the Trigger object itself.
     */
    public Trigger withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the runtimeState property: Indicates if trigger is running or not. Updated when Start/Stop APIs are called on
     * the Trigger.
     * 
     * @return the runtimeState value.
     */
    public TriggerRuntimeState runtimeState() {
        return this.runtimeState;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the trigger.
     * 
     * @return the annotations value.
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the trigger.
     * 
     * @param annotations the annotations value to set.
     * @return the Trigger object itself.
     */
    public Trigger withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the additionalProperties property: Azure data factory nested object which contains information about creating
     * pipeline run.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Azure data factory nested object which contains information about creating
     * pipeline run.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the Trigger object itself.
     */
    public Trigger withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new LinkedHashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
