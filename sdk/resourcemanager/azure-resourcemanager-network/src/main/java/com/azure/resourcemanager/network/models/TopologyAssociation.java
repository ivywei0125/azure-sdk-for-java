// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resources that have an association with the parent resource. */
@Fluent
public final class TopologyAssociation {
    /*
     * The name of the resource that is associated with the parent resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ID of the resource that is associated with the parent resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The association type of the child resource to the parent resource.
     */
    @JsonProperty(value = "associationType")
    private AssociationType associationType;

    /** Creates an instance of TopologyAssociation class. */
    public TopologyAssociation() {
    }

    /**
     * Get the name property: The name of the resource that is associated with the parent resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is associated with the parent resource.
     *
     * @param name the name value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resourceId property: The ID of the resource that is associated with the parent resource.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource that is associated with the parent resource.
     *
     * @param resourceId the resourceId value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the associationType property: The association type of the child resource to the parent resource.
     *
     * @return the associationType value.
     */
    public AssociationType associationType() {
        return this.associationType;
    }

    /**
     * Set the associationType property: The association type of the child resource to the parent resource.
     *
     * @param associationType the associationType value to set.
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withAssociationType(AssociationType associationType) {
        this.associationType = associationType;
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
