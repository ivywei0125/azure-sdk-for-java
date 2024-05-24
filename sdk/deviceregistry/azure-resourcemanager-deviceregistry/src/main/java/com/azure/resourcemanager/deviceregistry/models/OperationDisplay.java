// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localized display information for and operation.
 */
@Immutable
public final class OperationDisplay {
    /*
     * The localized friendly form of the resource provider name, e.g. "Microsoft Monitoring Insights" or
     * "Microsoft Compute".
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The localized friendly name of the resource type related to this operation. E.g. "Virtual Machines" or
     * "Job Schedule Collections".
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The concise, localized friendly name for the operation; suitable for dropdowns. E.g.
     * "Create or Update Virtual Machine", "Restart Virtual Machine".
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The short, localized friendly description of the operation; suitable for tool tips and detailed views.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of OperationDisplay class.
     */
    private OperationDisplay() {
    }

    /**
     * Get the provider property: The localized friendly form of the resource provider name, e.g. "Microsoft Monitoring
     * Insights" or "Microsoft Compute".
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: The localized friendly name of the resource type related to this operation. E.g.
     * "Virtual Machines" or "Job Schedule Collections".
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation property: The concise, localized friendly name for the operation; suitable for dropdowns. E.g.
     * "Create or Update Virtual Machine", "Restart Virtual Machine".
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: The short, localized friendly description of the operation; suitable for tool tips
     * and detailed views.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
