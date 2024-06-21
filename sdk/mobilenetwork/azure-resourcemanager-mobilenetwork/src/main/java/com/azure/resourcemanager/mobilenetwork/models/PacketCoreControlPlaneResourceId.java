// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to an packet core control plane resource.
 */
@Fluent
public final class PacketCoreControlPlaneResourceId {
    /*
     * Packet core control plane resource ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of PacketCoreControlPlaneResourceId class.
     */
    public PacketCoreControlPlaneResourceId() {
    }

    /**
     * Get the id property: Packet core control plane resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Packet core control plane resource ID.
     * 
     * @param id the id value to set.
     * @return the PacketCoreControlPlaneResourceId object itself.
     */
    public PacketCoreControlPlaneResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property id in model PacketCoreControlPlaneResourceId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlaneResourceId.class);
}
