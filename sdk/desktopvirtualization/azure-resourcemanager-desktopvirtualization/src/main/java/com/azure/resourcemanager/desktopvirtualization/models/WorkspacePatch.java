// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.WorkspacePatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Workspace properties that can be patched. */
@Fluent
public final class WorkspacePatch {
    /*
     * tags to be updated
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Detailed properties for Workspace
     */
    @JsonProperty(value = "properties")
    private WorkspacePatchProperties innerProperties;

    /**
     * Get the tags property: tags to be updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: tags to be updated.
     *
     * @param tags the tags value to set.
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Detailed properties for Workspace.
     *
     * @return the innerProperties value.
     */
    private WorkspacePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Description of Workspace.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of Workspace.
     *
     * @param description the description value to set.
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Workspace.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of Workspace.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the applicationGroupReferences property: List of applicationGroup links.
     *
     * @return the applicationGroupReferences value.
     */
    public List<String> applicationGroupReferences() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGroupReferences();
    }

    /**
     * Set the applicationGroupReferences property: List of applicationGroup links.
     *
     * @param applicationGroupReferences the applicationGroupReferences value to set.
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withApplicationGroupReferences(List<String> applicationGroupReferences) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withApplicationGroupReferences(applicationGroupReferences);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Enabled to allow this resource to be access from the public network.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspacePatch object itself.
     */
    public WorkspacePatch withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
