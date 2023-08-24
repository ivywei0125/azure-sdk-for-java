// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dynatrace.models.SendingLogsStatus;
import com.azure.resourcemanager.dynatrace.models.SendingMetricsStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of resource being monitored by Dynatrace monitor resource. */
@Fluent
public final class MonitoredResourceInner {
    /*
     * The ARM id of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Flag indicating if resource is sending metrics to Dynatrace.
     */
    @JsonProperty(value = "sendingMetrics")
    private SendingMetricsStatus sendingMetrics;

    /*
     * Reason for why the resource is sending metrics (or why it is not sending).
     */
    @JsonProperty(value = "reasonForMetricsStatus")
    private String reasonForMetricsStatus;

    /*
     * Flag indicating if resource is sending logs to Dynatrace.
     */
    @JsonProperty(value = "sendingLogs")
    private SendingLogsStatus sendingLogs;

    /*
     * Reason for why the resource is sending logs (or why it is not sending).
     */
    @JsonProperty(value = "reasonForLogsStatus")
    private String reasonForLogsStatus;

    /** Creates an instance of MonitoredResourceInner class. */
    public MonitoredResourceInner() {
    }

    /**
     * Get the id property: The ARM id of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM id of the resource.
     *
     * @param id the id value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sendingMetrics property: Flag indicating if resource is sending metrics to Dynatrace.
     *
     * @return the sendingMetrics value.
     */
    public SendingMetricsStatus sendingMetrics() {
        return this.sendingMetrics;
    }

    /**
     * Set the sendingMetrics property: Flag indicating if resource is sending metrics to Dynatrace.
     *
     * @param sendingMetrics the sendingMetrics value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withSendingMetrics(SendingMetricsStatus sendingMetrics) {
        this.sendingMetrics = sendingMetrics;
        return this;
    }

    /**
     * Get the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     *
     * @return the reasonForMetricsStatus value.
     */
    public String reasonForMetricsStatus() {
        return this.reasonForMetricsStatus;
    }

    /**
     * Set the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     *
     * @param reasonForMetricsStatus the reasonForMetricsStatus value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withReasonForMetricsStatus(String reasonForMetricsStatus) {
        this.reasonForMetricsStatus = reasonForMetricsStatus;
        return this;
    }

    /**
     * Get the sendingLogs property: Flag indicating if resource is sending logs to Dynatrace.
     *
     * @return the sendingLogs value.
     */
    public SendingLogsStatus sendingLogs() {
        return this.sendingLogs;
    }

    /**
     * Set the sendingLogs property: Flag indicating if resource is sending logs to Dynatrace.
     *
     * @param sendingLogs the sendingLogs value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withSendingLogs(SendingLogsStatus sendingLogs) {
        this.sendingLogs = sendingLogs;
        return this;
    }

    /**
     * Get the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     *
     * @return the reasonForLogsStatus value.
     */
    public String reasonForLogsStatus() {
        return this.reasonForLogsStatus;
    }

    /**
     * Set the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     *
     * @param reasonForLogsStatus the reasonForLogsStatus value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withReasonForLogsStatus(String reasonForLogsStatus) {
        this.reasonForLogsStatus = reasonForLogsStatus;
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
