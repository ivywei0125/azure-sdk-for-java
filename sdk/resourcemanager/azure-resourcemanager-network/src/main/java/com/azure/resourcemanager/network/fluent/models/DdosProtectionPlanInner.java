// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * A DDoS protection plan in a resource group.
 */
@Fluent
public final class DdosProtectionPlanInner extends Resource {
    /*
     * Properties of the DDoS protection plan.
     */
    @JsonProperty(value = "properties")
    private DdosProtectionPlanPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of DdosProtectionPlanInner class.
     */
    public DdosProtectionPlanInner() {
    }

    /**
     * Get the innerProperties property: Properties of the DDoS protection plan.
     * 
     * @return the innerProperties value.
     */
    private DdosProtectionPlanPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdosProtectionPlanInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DdosProtectionPlanInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS protection plan resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS protection plan resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the publicIpAddresses property: The list of public IPs associated with the DDoS protection plan resource.
     * This list is read-only.
     * 
     * @return the publicIpAddresses value.
     */
    public List<SubResource> publicIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddresses();
    }

    /**
     * Get the virtualNetworks property: The list of virtual networks associated with the DDoS protection plan resource.
     * This list is read-only.
     * 
     * @return the virtualNetworks value.
     */
    public List<SubResource> virtualNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworks();
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
