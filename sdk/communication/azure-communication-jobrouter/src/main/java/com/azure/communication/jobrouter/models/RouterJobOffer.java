// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * An offer of a job to a worker.
 */
@Immutable
public final class RouterJobOffer {

    /*
     * Id of an offer.
     */
    @JsonProperty(value = "offerId")
    private String offerId;

    /*
     * Id of the job.
     */
    @JsonProperty(value = "jobId")
    private final String jobId;

    /*
     * The capacity cost consumed by the job offer.
     */
    @JsonProperty(value = "capacityCost")
    private final int capacityCost;

    /*
     * Timestamp when the offer was created in UTC.
     */
    @JsonProperty(value = "offeredAt")
    private OffsetDateTime offeredAt;

    /*
     * Timestamp when the offer will expire in UTC.
     */
    @JsonProperty(value = "expiresAt")
    private OffsetDateTime expiresAt;

    /**
     * Get the offerId property: Id of an offer.
     *
     * @return the offerId value.
     */
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Get the jobId property: Id of the job.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @return the capacityCost value.
     */
    public int getCapacityCost() {
        return this.capacityCost;
    }

    /**
     * Get the offeredAt property: Timestamp when the offer was created in UTC.
     *
     * @return the offeredAt value.
     */
    public OffsetDateTime getOfferedAt() {
        return this.offeredAt;
    }

    /**
     * Get the expiresAt property: Timestamp when the offer will expire in UTC.
     *
     * @return the expiresAt value.
     */
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Creates an instance of RouterJobOffer class.
     *
     * @param jobId the jobId value to set.
     * @param capacityCost the capacityCost value to set.
     */
    @JsonCreator
    private RouterJobOffer(@JsonProperty(value = "jobId") String jobId,
        @JsonProperty(value = "capacityCost") int capacityCost) {
        this.jobId = jobId;
        this.capacityCost = capacityCost;
    }
}
