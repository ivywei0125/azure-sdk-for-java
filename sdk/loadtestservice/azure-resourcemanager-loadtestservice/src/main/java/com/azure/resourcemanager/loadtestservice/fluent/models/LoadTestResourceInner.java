// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtestservice.models.EncryptionProperties;
import com.azure.resourcemanager.loadtestservice.models.ManagedServiceIdentity;
import com.azure.resourcemanager.loadtestservice.models.ResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** LoadTest details. */
@Fluent
public final class LoadTestResourceInner extends Resource {
    /*
     * Load Test resource properties
     */
    @JsonProperty(value = "properties")
    private LoadTestProperties innerProperties;

    /*
     * The type of identity used for the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of LoadTestResourceInner class. */
    public LoadTestResourceInner() {
    }

    /**
     * Get the innerProperties property: Load Test resource properties.
     *
     * @return the innerProperties value.
     */
    private LoadTestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The type of identity used for the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The type of identity used for the resource.
     *
     * @param identity the identity value to set.
     * @return the LoadTestResourceInner object itself.
     */
    public LoadTestResourceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public LoadTestResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadTestResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: Description of the resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the resource.
     *
     * @param description the description value to set.
     * @return the LoadTestResourceInner object itself.
     */
    public LoadTestResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadTestProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ResourceState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the dataPlaneUri property: Resource data plane URI.
     *
     * @return the dataPlaneUri value.
     */
    public String dataPlaneUri() {
        return this.innerProperties() == null ? null : this.innerProperties().dataPlaneUri();
    }

    /**
     * Get the encryption property: CMK Encryption property.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: CMK Encryption property.
     *
     * @param encryption the encryption value to set.
     * @return the LoadTestResourceInner object itself.
     */
    public LoadTestResourceInner withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadTestProperties();
        }
        this.innerProperties().withEncryption(encryption);
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
