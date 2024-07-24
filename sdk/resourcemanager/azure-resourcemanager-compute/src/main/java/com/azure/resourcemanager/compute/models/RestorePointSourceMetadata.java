// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of the Virtual Machine for which the restore point was created. The properties provided are
 * a subset and the snapshot of the overall Virtual Machine properties captured at the time of the restore point
 * creation.
 */
@Fluent
public final class RestorePointSourceMetadata {
    /*
     * Gets the hardware profile.
     */
    @JsonProperty(value = "hardwareProfile", access = JsonProperty.Access.WRITE_ONLY)
    private HardwareProfile hardwareProfile;

    /*
     * Gets the storage profile.
     */
    @JsonProperty(value = "storageProfile")
    private RestorePointSourceVMStorageProfile storageProfile;

    /*
     * Gets the OS profile.
     */
    @JsonProperty(value = "osProfile", access = JsonProperty.Access.WRITE_ONLY)
    private OSProfile osProfile;

    /*
     * Gets the diagnostics profile.
     */
    @JsonProperty(value = "diagnosticsProfile", access = JsonProperty.Access.WRITE_ONLY)
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Gets the license type, which is for bring your own license scenario.
     */
    @JsonProperty(value = "licenseType", access = JsonProperty.Access.WRITE_ONLY)
    private String licenseType;

    /*
     * Gets the virtual machine unique id.
     */
    @JsonProperty(value = "vmId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmId;

    /*
     * Gets the security profile.
     */
    @JsonProperty(value = "securityProfile", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityProfile securityProfile;

    /*
     * Location of the VM from which the restore point was created.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * UserData associated with the source VM for which restore point is captured, which is a base-64 encoded value.
     */
    @JsonProperty(value = "userData", access = JsonProperty.Access.WRITE_ONLY)
    private String userData;

    /*
     * HyperVGeneration of the source VM for which restore point is captured.
     */
    @JsonProperty(value = "hyperVGeneration", access = JsonProperty.Access.WRITE_ONLY)
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Creates an instance of RestorePointSourceMetadata class.
     */
    public RestorePointSourceMetadata() {
    }

    /**
     * Get the hardwareProfile property: Gets the hardware profile.
     * 
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Get the storageProfile property: Gets the storage profile.
     * 
     * @return the storageProfile value.
     */
    public RestorePointSourceVMStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Gets the storage profile.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withStorageProfile(RestorePointSourceVMStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile property: Gets the OS profile.
     * 
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Get the diagnosticsProfile property: Gets the diagnostics profile.
     * 
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Get the licenseType property: Gets the license type, which is for bring your own license scenario.
     * 
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Get the vmId property: Gets the virtual machine unique id.
     * 
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the securityProfile property: Gets the security profile.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Get the location property: Location of the VM from which the restore point was created.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the userData property: UserData associated with the source VM for which restore point is captured, which is a
     * base-64 encoded value.
     * 
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Get the hyperVGeneration property: HyperVGeneration of the source VM for which restore point is captured.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }
}
