// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Dedicated host unutilized capacity.
 */
@Fluent
public final class DedicatedHostAvailableCapacity {
    /*
     * The unutilized capacity of the dedicated host represented in terms of each VM size that is allowed to be
     * deployed to the dedicated host.
     */
    @JsonProperty(value = "allocatableVMs")
    private List<DedicatedHostAllocatableVM> allocatableVMs;

    /**
     * Creates an instance of DedicatedHostAvailableCapacity class.
     */
    public DedicatedHostAvailableCapacity() {
    }

    /**
     * Get the allocatableVMs property: The unutilized capacity of the dedicated host represented in terms of each VM
     * size that is allowed to be deployed to the dedicated host.
     * 
     * @return the allocatableVMs value.
     */
    public List<DedicatedHostAllocatableVM> allocatableVMs() {
        return this.allocatableVMs;
    }

    /**
     * Set the allocatableVMs property: The unutilized capacity of the dedicated host represented in terms of each VM
     * size that is allowed to be deployed to the dedicated host.
     * 
     * @param allocatableVMs the allocatableVMs value to set.
     * @return the DedicatedHostAvailableCapacity object itself.
     */
    public DedicatedHostAvailableCapacity withAllocatableVMs(List<DedicatedHostAllocatableVM> allocatableVMs) {
        this.allocatableVMs = allocatableVMs;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allocatableVMs() != null) {
            allocatableVMs().forEach(e -> e.validate());
        }
    }
}
