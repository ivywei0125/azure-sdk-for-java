// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The meeting room. */
@Fluent
public final class RoomModel {
    /*
     * Unique identifier of a room. This id is server generated.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The timestamp when the room was created at the server. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "createdAt", required = true)
    private OffsetDateTime createdAt;

    /*
     * The timestamp from when the room is open for joining. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validFrom", required = true)
    private OffsetDateTime validFrom;

    /*
     * The timestamp from when the room can no longer be joined. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validUntil", required = true)
    private OffsetDateTime validUntil;

    /*
     * Set this flag to true if, at the time of the call, dial out to a PSTN number is enabled in a particular room. By
     * default, this flag is set to false.
     */
    @JsonProperty(value = "pstnDialOutEnabled", required = true)
    private boolean pstnDialOutEnabled;

    /** Creates an instance of RoomModel class. */
    public RoomModel() {}

    /**
     * Get the id property: Unique identifier of a room. This id is server generated.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique identifier of a room. This id is server generated.
     *
     * @param id the id value to set.
     * @return the RoomModel object itself.
     */
    public RoomModel setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the createdAt property: The timestamp when the room was created at the server. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The timestamp when the room was created at the server. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param createdAt the createdAt value to set.
     * @return the RoomModel object itself.
     */
    public RoomModel setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the validFrom property: The timestamp from when the room is open for joining. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validFrom value.
     */
    public OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     * Set the validFrom property: The timestamp from when the room is open for joining. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validFrom the validFrom value to set.
     * @return the RoomModel object itself.
     */
    public RoomModel setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Get the validUntil property: The timestamp from when the room can no longer be joined. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validUntil value.
     */
    public OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * Set the validUntil property: The timestamp from when the room can no longer be joined. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validUntil the validUntil value to set.
     * @return the RoomModel object itself.
     */
    public RoomModel setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Get the pstnDialOutEnabled property: Set this flag to true if, at the time of the call, dial out to a PSTN number
     * is enabled in a particular room. By default, this flag is set to false.
     *
     * @return the pstnDialOutEnabled value.
     */
    public boolean isPstnDialOutEnabled() {
        return this.pstnDialOutEnabled;
    }

    /**
     * Set the pstnDialOutEnabled property: Set this flag to true if, at the time of the call, dial out to a PSTN number
     * is enabled in a particular room. By default, this flag is set to false.
     *
     * @param pstnDialOutEnabled the pstnDialOutEnabled value to set.
     * @return the RoomModel object itself.
     */
    public RoomModel setPstnDialOutEnabled(boolean pstnDialOutEnabled) {
        this.pstnDialOutEnabled = pstnDialOutEnabled;
        return this;
    }
}
