// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the organization in which the pool will be used.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = OrganizationProfile.class, visible = true)
@JsonTypeName("OrganizationProfile")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "GitHub", value = GitHubOrganizationProfile.class),
    @JsonSubTypes.Type(name = "AzureDevOps", value = AzureDevOpsOrganizationProfile.class) })
@Immutable
public class OrganizationProfile {
    /*
     * The kind property.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * Creates an instance of OrganizationProfile class.
     */
    public OrganizationProfile() {
        this.kind = "OrganizationProfile";
    }

    /**
     * Get the kind property: The kind property.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
