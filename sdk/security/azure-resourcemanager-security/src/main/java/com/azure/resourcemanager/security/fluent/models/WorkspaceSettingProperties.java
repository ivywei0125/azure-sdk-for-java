// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Workspace setting data.
 */
@Fluent
public final class WorkspaceSettingProperties {
    /*
     * The full Azure ID of the workspace to save the data in
     */
    @JsonProperty(value = "workspaceId", required = true)
    private String workspaceId;

    /*
     * All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a
     * setting with more specific scope
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /**
     * Creates an instance of WorkspaceSettingProperties class.
     */
    public WorkspaceSettingProperties() {
    }

    /**
     * Get the workspaceId property: The full Azure ID of the workspace to save the data in.
     * 
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The full Azure ID of the workspace to save the data in.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the WorkspaceSettingProperties object itself.
     */
    public WorkspaceSettingProperties withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the scope property: All the VMs in this scope will send their security data to the mentioned workspace
     * unless overridden by a setting with more specific scope.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: All the VMs in this scope will send their security data to the mentioned workspace
     * unless overridden by a setting with more specific scope.
     * 
     * @param scope the scope value to set.
     * @return the WorkspaceSettingProperties object itself.
     */
    public WorkspaceSettingProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workspaceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property workspaceId in model WorkspaceSettingProperties"));
        }
        if (scope() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property scope in model WorkspaceSettingProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkspaceSettingProperties.class);
}
