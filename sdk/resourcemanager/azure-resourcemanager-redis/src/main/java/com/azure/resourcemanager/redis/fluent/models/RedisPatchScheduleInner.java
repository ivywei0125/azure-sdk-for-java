// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.models.ScheduleEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response to put/get patch schedules for Redis cache.
 */
@Fluent
public final class RedisPatchScheduleInner extends ProxyResource {
    /*
     * List of patch schedules for a Redis cache.
     */
    @JsonProperty(value = "properties", required = true)
    private ScheduleEntries innerProperties = new ScheduleEntries();

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Creates an instance of RedisPatchScheduleInner class.
     */
    public RedisPatchScheduleInner() {
    }

    /**
     * Get the innerProperties property: List of patch schedules for a Redis cache.
     * 
     * @return the innerProperties value.
     */
    private ScheduleEntries innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the scheduleEntries property: List of patch schedules for a Redis cache.
     * 
     * @return the scheduleEntries value.
     */
    public List<ScheduleEntry> scheduleEntries() {
        return this.innerProperties() == null ? null : this.innerProperties().scheduleEntries();
    }

    /**
     * Set the scheduleEntries property: List of patch schedules for a Redis cache.
     * 
     * @param scheduleEntries the scheduleEntries value to set.
     * @return the RedisPatchScheduleInner object itself.
     */
    public RedisPatchScheduleInner withScheduleEntries(List<ScheduleEntry> scheduleEntries) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleEntries();
        }
        this.innerProperties().withScheduleEntries(scheduleEntries);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model RedisPatchScheduleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisPatchScheduleInner.class);
}
