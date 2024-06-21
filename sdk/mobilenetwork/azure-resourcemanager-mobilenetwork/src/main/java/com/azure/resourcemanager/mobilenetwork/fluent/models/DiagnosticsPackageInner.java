// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsPackageStatus;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Diagnostics package resource.
 */
@Immutable
public final class DiagnosticsPackageInner extends ProxyResource {
    /*
     * Diagnostics package properties. A diagnostics package file derived from the name of this resource will be uploaded to the Storage Account Container URL in the packet core control plane properties
     */
    @JsonProperty(value = "properties", required = true)
    private DiagnosticsPackagePropertiesFormat innerProperties = new DiagnosticsPackagePropertiesFormat();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DiagnosticsPackageInner class.
     */
    public DiagnosticsPackageInner() {
    }

    /**
     * Get the innerProperties property: Diagnostics package properties. A diagnostics package file derived from the
     * name of this resource will be uploaded to the Storage Account Container URL in the packet core control plane
     * properties.
     * 
     * @return the innerProperties value.
     */
    private DiagnosticsPackagePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the diagnostics package resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The status of the diagnostics package collection.
     * 
     * @return the status value.
     */
    public DiagnosticsPackageStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the reason property: The reason for the current state of the diagnostics package collection.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model DiagnosticsPackageInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiagnosticsPackageInner.class);
}
