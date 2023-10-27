// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Event model properties. */
@Fluent
public final class EventModelProperties {
    /*
     * Gets or sets the resource type.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * Gets or sets the resource name.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /*
     * Gets or sets the event type.
     */
    @JsonProperty(value = "eventType", access = JsonProperty.Access.WRITE_ONLY)
    private String eventType;

    /*
     * Gets or sets the event name.
     */
    @JsonProperty(value = "eventName", access = JsonProperty.Access.WRITE_ONLY)
    private String eventName;

    /*
     * Gets or sets the time at which the event occurred at source.
     */
    @JsonProperty(value = "timeOfOccurrence", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeOfOccurrence;

    /*
     * Gets or sets the event severity.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private String severity;

    /*
     * Gets or sets the event description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Gets or sets the event correlation Id.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /*
     * Gets or sets the errors associated with this event.
     */
    @JsonProperty(value = "healthErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<HealthErrorModel> healthErrors;

    /*
     * Event model custom properties.
     */
    @JsonProperty(value = "customProperties", required = true)
    private EventModelCustomProperties customProperties;

    /** Creates an instance of EventModelProperties class. */
    public EventModelProperties() {
    }

    /**
     * Get the resourceType property: Gets or sets the resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the resourceName property: Gets or sets the resource name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the eventType property: Gets or sets the event type.
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Get the eventName property: Gets or sets the event name.
     *
     * @return the eventName value.
     */
    public String eventName() {
        return this.eventName;
    }

    /**
     * Get the timeOfOccurrence property: Gets or sets the time at which the event occurred at source.
     *
     * @return the timeOfOccurrence value.
     */
    public OffsetDateTime timeOfOccurrence() {
        return this.timeOfOccurrence;
    }

    /**
     * Get the severity property: Gets or sets the event severity.
     *
     * @return the severity value.
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Get the description property: Gets or sets the event description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the correlationId property: Gets or sets the event correlation Id.
     *
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the healthErrors property: Gets or sets the errors associated with this event.
     *
     * @return the healthErrors value.
     */
    public List<HealthErrorModel> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Get the customProperties property: Event model custom properties.
     *
     * @return the customProperties value.
     */
    public EventModelCustomProperties customProperties() {
        return this.customProperties;
    }

    /**
     * Set the customProperties property: Event model custom properties.
     *
     * @param customProperties the customProperties value to set.
     * @return the EventModelProperties object itself.
     */
    public EventModelProperties withCustomProperties(EventModelCustomProperties customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthErrors() != null) {
            healthErrors().forEach(e -> e.validate());
        }
        if (customProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property customProperties in model EventModelProperties"));
        } else {
            customProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventModelProperties.class);
}
