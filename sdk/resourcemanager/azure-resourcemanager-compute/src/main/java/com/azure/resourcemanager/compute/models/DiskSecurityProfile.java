// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the security related information for the resource.
 */
@Fluent
public final class DiskSecurityProfile {
    /*
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     */
    @JsonProperty(value = "securityType")
    private DiskSecurityTypes securityType;

    /*
     * ResourceId of the disk encryption set associated to Confidential VM supported disk encrypted with customer
     * managed key
     */
    @JsonProperty(value = "secureVMDiskEncryptionSetId")
    private String secureVMDiskEncryptionSetId;

    /**
     * Creates an instance of DiskSecurityProfile class.
     */
    public DiskSecurityProfile() {
    }

    /**
     * Get the securityType property: Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     * @return the securityType value.
     */
    public DiskSecurityTypes securityType() {
        return this.securityType;
    }

    /**
     * Set the securityType property: Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     * @param securityType the securityType value to set.
     * @return the DiskSecurityProfile object itself.
     */
    public DiskSecurityProfile withSecurityType(DiskSecurityTypes securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * Get the secureVMDiskEncryptionSetId property: ResourceId of the disk encryption set associated to Confidential VM
     * supported disk encrypted with customer managed key.
     * 
     * @return the secureVMDiskEncryptionSetId value.
     */
    public String secureVMDiskEncryptionSetId() {
        return this.secureVMDiskEncryptionSetId;
    }

    /**
     * Set the secureVMDiskEncryptionSetId property: ResourceId of the disk encryption set associated to Confidential VM
     * supported disk encrypted with customer managed key.
     * 
     * @param secureVMDiskEncryptionSetId the secureVMDiskEncryptionSetId value to set.
     * @return the DiskSecurityProfile object itself.
     */
    public DiskSecurityProfile withSecureVMDiskEncryptionSetId(String secureVMDiskEncryptionSetId) {
        this.secureVMDiskEncryptionSetId = secureVMDiskEncryptionSetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
