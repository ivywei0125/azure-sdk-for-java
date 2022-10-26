// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Check quota availability response properties. */
@Fluent
public final class CheckQuotaAvailabilityResponseProperties {
    /*
     * True/False indicating whether the quota request be granted based on availability.
     */
    @JsonProperty(value = "isAvailable")
    private Boolean isAvailable;

    /*
     * Message indicating additional details to add to quota support request.
     */
    @JsonProperty(value = "availabilityStatus")
    private String availabilityStatus;

    /** Creates an instance of CheckQuotaAvailabilityResponseProperties class. */
    public CheckQuotaAvailabilityResponseProperties() {
    }

    /**
     * Get the isAvailable property: True/False indicating whether the quota request be granted based on availability.
     *
     * @return the isAvailable value.
     */
    public Boolean isAvailable() {
        return this.isAvailable;
    }

    /**
     * Set the isAvailable property: True/False indicating whether the quota request be granted based on availability.
     *
     * @param isAvailable the isAvailable value to set.
     * @return the CheckQuotaAvailabilityResponseProperties object itself.
     */
    public CheckQuotaAvailabilityResponseProperties withIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * Get the availabilityStatus property: Message indicating additional details to add to quota support request.
     *
     * @return the availabilityStatus value.
     */
    public String availabilityStatus() {
        return this.availabilityStatus;
    }

    /**
     * Set the availabilityStatus property: Message indicating additional details to add to quota support request.
     *
     * @param availabilityStatus the availabilityStatus value to set.
     * @return the CheckQuotaAvailabilityResponseProperties object itself.
     */
    public CheckQuotaAvailabilityResponseProperties withAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
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
