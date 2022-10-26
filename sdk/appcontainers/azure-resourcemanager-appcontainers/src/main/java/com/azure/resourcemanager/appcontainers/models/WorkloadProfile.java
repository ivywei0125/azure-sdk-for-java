// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workload profile to scope container app execution. */
@Fluent
public final class WorkloadProfile {
    /*
     * Workload profile type for the workloads to run on.
     */
    @JsonProperty(value = "workloadProfileType", required = true)
    private String workloadProfileType;

    /*
     * The minimum capacity.
     */
    @JsonProperty(value = "minimumCount", required = true)
    private int minimumCount;

    /*
     * The maximum capacity.
     */
    @JsonProperty(value = "maximumCount", required = true)
    private int maximumCount;

    /** Creates an instance of WorkloadProfile class. */
    public WorkloadProfile() {
    }

    /**
     * Get the workloadProfileType property: Workload profile type for the workloads to run on.
     *
     * @return the workloadProfileType value.
     */
    public String workloadProfileType() {
        return this.workloadProfileType;
    }

    /**
     * Set the workloadProfileType property: Workload profile type for the workloads to run on.
     *
     * @param workloadProfileType the workloadProfileType value to set.
     * @return the WorkloadProfile object itself.
     */
    public WorkloadProfile withWorkloadProfileType(String workloadProfileType) {
        this.workloadProfileType = workloadProfileType;
        return this;
    }

    /**
     * Get the minimumCount property: The minimum capacity.
     *
     * @return the minimumCount value.
     */
    public int minimumCount() {
        return this.minimumCount;
    }

    /**
     * Set the minimumCount property: The minimum capacity.
     *
     * @param minimumCount the minimumCount value to set.
     * @return the WorkloadProfile object itself.
     */
    public WorkloadProfile withMinimumCount(int minimumCount) {
        this.minimumCount = minimumCount;
        return this;
    }

    /**
     * Get the maximumCount property: The maximum capacity.
     *
     * @return the maximumCount value.
     */
    public int maximumCount() {
        return this.maximumCount;
    }

    /**
     * Set the maximumCount property: The maximum capacity.
     *
     * @param maximumCount the maximumCount value to set.
     * @return the WorkloadProfile object itself.
     */
    public WorkloadProfile withMaximumCount(int maximumCount) {
        this.maximumCount = maximumCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workloadProfileType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property workloadProfileType in model WorkloadProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WorkloadProfile.class);
}
