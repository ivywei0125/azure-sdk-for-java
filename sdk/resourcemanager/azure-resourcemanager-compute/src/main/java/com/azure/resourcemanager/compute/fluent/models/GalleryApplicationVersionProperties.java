// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.GalleryApplicationVersionSafetyProfile;
import com.azure.resourcemanager.compute.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.models.ReplicationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a gallery image version.
 */
@Fluent
public final class GalleryApplicationVersionProperties {
    /*
     * The publishing profile of a gallery image version.
     */
    @JsonProperty(value = "publishingProfile", required = true)
    private GalleryApplicationVersionPublishingProfile publishingProfile;

    /*
     * The safety profile of the Gallery Application Version.
     */
    @JsonProperty(value = "safetyProfile")
    private GalleryApplicationVersionSafetyProfile safetyProfile;

    /*
     * The current state of the gallery or gallery artifact.
     * 
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryProvisioningState provisioningState;

    /*
     * This is the replication status of the gallery image version.
     */
    @JsonProperty(value = "replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Creates an instance of GalleryApplicationVersionProperties class.
     */
    public GalleryApplicationVersionProperties() {
    }

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image version.
     * 
     * @return the publishingProfile value.
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image version.
     * 
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryApplicationVersionProperties object itself.
     */
    public GalleryApplicationVersionProperties
        withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the safetyProfile property: The safety profile of the Gallery Application Version.
     * 
     * @return the safetyProfile value.
     */
    public GalleryApplicationVersionSafetyProfile safetyProfile() {
        return this.safetyProfile;
    }

    /**
     * Set the safetyProfile property: The safety profile of the Gallery Application Version.
     * 
     * @param safetyProfile the safetyProfile value to set.
     * @return the GalleryApplicationVersionProperties object itself.
     */
    public GalleryApplicationVersionProperties withSafetyProfile(GalleryApplicationVersionSafetyProfile safetyProfile) {
        this.safetyProfile = safetyProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery or gallery artifact.
     * 
     * The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public GalleryProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery image version.
     * 
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publishingProfile() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property publishingProfile in model GalleryApplicationVersionProperties"));
        } else {
            publishingProfile().validate();
        }
        if (safetyProfile() != null) {
            safetyProfile().validate();
        }
        if (replicationStatus() != null) {
            replicationStatus().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationVersionProperties.class);
}
