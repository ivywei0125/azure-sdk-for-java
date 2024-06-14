// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The policy definition group.
 */
@Fluent
public final class PolicyDefinitionGroup {
    /*
     * The name of the group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The group's display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The group's category.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The group's description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A resource ID of a resource that contains additional metadata about the group.
     */
    @JsonProperty(value = "additionalMetadataId")
    private String additionalMetadataId;

    /**
     * Creates an instance of PolicyDefinitionGroup class.
     */
    public PolicyDefinitionGroup() {
    }

    /**
     * Get the name property: The name of the group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the group.
     * 
     * @param name the name value to set.
     * @return the PolicyDefinitionGroup object itself.
     */
    public PolicyDefinitionGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The group's display name.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The group's display name.
     * 
     * @param displayName the displayName value to set.
     * @return the PolicyDefinitionGroup object itself.
     */
    public PolicyDefinitionGroup withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the category property: The group's category.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The group's category.
     * 
     * @param category the category value to set.
     * @return the PolicyDefinitionGroup object itself.
     */
    public PolicyDefinitionGroup withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the description property: The group's description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The group's description.
     * 
     * @param description the description value to set.
     * @return the PolicyDefinitionGroup object itself.
     */
    public PolicyDefinitionGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the additionalMetadataId property: A resource ID of a resource that contains additional metadata about the
     * group.
     * 
     * @return the additionalMetadataId value.
     */
    public String additionalMetadataId() {
        return this.additionalMetadataId;
    }

    /**
     * Set the additionalMetadataId property: A resource ID of a resource that contains additional metadata about the
     * group.
     * 
     * @param additionalMetadataId the additionalMetadataId value to set.
     * @return the PolicyDefinitionGroup object itself.
     */
    public PolicyDefinitionGroup withAdditionalMetadataId(String additionalMetadataId) {
        this.additionalMetadataId = additionalMetadataId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model PolicyDefinitionGroup"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyDefinitionGroup.class);
}
