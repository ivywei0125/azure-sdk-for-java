// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The agents will run on Virtual Machine Scale Sets.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = VmssFabricProfile.class, visible = true)
@JsonTypeName("Vmss")
@Fluent
public final class VmssFabricProfile extends FabricProfile {
    /*
     * The kind property.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private String kind = "Vmss";

    /*
     * The Azure SKU of the machines in the pool.
     */
    @JsonProperty(value = "sku", required = true)
    private DevOpsAzureSku sku;

    /*
     * The VM images of the machines in the pool.
     */
    @JsonProperty(value = "images", required = true)
    private List<PoolImage> images;

    /*
     * The OS profile of the machines in the pool.
     */
    @JsonProperty(value = "osProfile")
    private OsProfile osProfile;

    /*
     * The storage profile of the machines in the pool.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * The network profile of the machines in the pool.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /**
     * Creates an instance of VmssFabricProfile class.
     */
    public VmssFabricProfile() {
    }

    /**
     * Get the kind property: The kind property.
     * 
     * @return the kind value.
     */
    @Override
    public String kind() {
        return this.kind;
    }

    /**
     * Get the sku property: The Azure SKU of the machines in the pool.
     * 
     * @return the sku value.
     */
    public DevOpsAzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Azure SKU of the machines in the pool.
     * 
     * @param sku the sku value to set.
     * @return the VmssFabricProfile object itself.
     */
    public VmssFabricProfile withSku(DevOpsAzureSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the images property: The VM images of the machines in the pool.
     * 
     * @return the images value.
     */
    public List<PoolImage> images() {
        return this.images;
    }

    /**
     * Set the images property: The VM images of the machines in the pool.
     * 
     * @param images the images value to set.
     * @return the VmssFabricProfile object itself.
     */
    public VmssFabricProfile withImages(List<PoolImage> images) {
        this.images = images;
        return this;
    }

    /**
     * Get the osProfile property: The OS profile of the machines in the pool.
     * 
     * @return the osProfile value.
     */
    public OsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: The OS profile of the machines in the pool.
     * 
     * @param osProfile the osProfile value to set.
     * @return the VmssFabricProfile object itself.
     */
    public VmssFabricProfile withOsProfile(OsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the storageProfile property: The storage profile of the machines in the pool.
     * 
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: The storage profile of the machines in the pool.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the VmssFabricProfile object itself.
     */
    public VmssFabricProfile withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the networkProfile property: The network profile of the machines in the pool.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: The network profile of the machines in the pool.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the VmssFabricProfile object itself.
     */
    public VmssFabricProfile withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model VmssFabricProfile"));
        } else {
            sku().validate();
        }
        if (images() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property images in model VmssFabricProfile"));
        } else {
            images().forEach(e -> e.validate());
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VmssFabricProfile.class);
}
