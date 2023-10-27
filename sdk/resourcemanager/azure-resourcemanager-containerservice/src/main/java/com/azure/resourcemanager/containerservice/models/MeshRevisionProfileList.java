// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.fluent.models.MeshRevisionProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Holds an array of MeshRevisionsProfiles. */
@Fluent
public final class MeshRevisionProfileList {
    /*
     * Array of service mesh add-on revision profiles for all supported mesh modes.
     */
    @JsonProperty(value = "value")
    private List<MeshRevisionProfileInner> value;

    /*
     * The URL to get the next set of mesh revision profile.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of MeshRevisionProfileList class. */
    public MeshRevisionProfileList() {
    }

    /**
     * Get the value property: Array of service mesh add-on revision profiles for all supported mesh modes.
     *
     * @return the value value.
     */
    public List<MeshRevisionProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of service mesh add-on revision profiles for all supported mesh modes.
     *
     * @param value the value value to set.
     * @return the MeshRevisionProfileList object itself.
     */
    public MeshRevisionProfileList withValue(List<MeshRevisionProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of mesh revision profile.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
