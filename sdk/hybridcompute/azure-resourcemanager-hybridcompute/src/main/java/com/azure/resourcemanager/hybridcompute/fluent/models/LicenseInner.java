// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcompute.models.LicenseDetails;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes a license in a hybrid machine.
 */
@Fluent
public final class LicenseInner extends Resource {
    /*
     * Hybrid Compute License properties
     */
    @JsonProperty(value = "properties")
    private LicenseProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of LicenseInner class.
     */
    public LicenseInner() {
    }

    /**
     * Get the innerProperties property: Hybrid Compute License properties.
     * 
     * @return the innerProperties value.
     */
    private LicenseProperties innerProperties() {
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
     * {@inheritDoc}
     */
    @Override
    public LicenseInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicenseInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the tenantId property: Describes the tenant id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: Describes the tenant id.
     * 
     * @param tenantId the tenantId value to set.
     * @return the LicenseInner object itself.
     */
    public LicenseInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the licenseType property: The type of the license resource.
     * 
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: The type of the license resource.
     * 
     * @param licenseType the licenseType value to set.
     * @return the LicenseInner object itself.
     */
    public LicenseInner withLicenseType(LicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the licenseDetails property: Describes the properties of a License.
     * 
     * @return the licenseDetails value.
     */
    public LicenseDetails licenseDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseDetails();
    }

    /**
     * Set the licenseDetails property: Describes the properties of a License.
     * 
     * @param licenseDetails the licenseDetails value to set.
     * @return the LicenseInner object itself.
     */
    public LicenseInner withLicenseDetails(LicenseDetails licenseDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProperties();
        }
        this.innerProperties().withLicenseDetails(licenseDetails);
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
