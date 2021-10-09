// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Current TCP connectivity information from the App Service Environment to a single endpoint. */
@Fluent
public final class EndpointDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointDetail.class);

    /*
     * An IP Address that Domain Name currently resolves to.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The port an endpoint is connected to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The time in milliseconds it takes for a TCP connection to be created
     * from the App Service Environment to this IpAddress at this Port.
     */
    @JsonProperty(value = "latency")
    private Double latency;

    /*
     * Whether it is possible to create a TCP connection from the App Service
     * Environment to this IpAddress at this Port.
     */
    @JsonProperty(value = "isAccessible")
    private Boolean isAccessible;

    /**
     * Get the ipAddress property: An IP Address that Domain Name currently resolves to.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: An IP Address that Domain Name currently resolves to.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the port property: The port an endpoint is connected to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port an endpoint is connected to.
     *
     * @param port the port value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the latency property: The time in milliseconds it takes for a TCP connection to be created from the App
     * Service Environment to this IpAddress at this Port.
     *
     * @return the latency value.
     */
    public Double latency() {
        return this.latency;
    }

    /**
     * Set the latency property: The time in milliseconds it takes for a TCP connection to be created from the App
     * Service Environment to this IpAddress at this Port.
     *
     * @param latency the latency value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withLatency(Double latency) {
        this.latency = latency;
        return this;
    }

    /**
     * Get the isAccessible property: Whether it is possible to create a TCP connection from the App Service Environment
     * to this IpAddress at this Port.
     *
     * @return the isAccessible value.
     */
    public Boolean isAccessible() {
        return this.isAccessible;
    }

    /**
     * Set the isAccessible property: Whether it is possible to create a TCP connection from the App Service Environment
     * to this IpAddress at this Port.
     *
     * @param isAccessible the isAccessible value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIsAccessible(Boolean isAccessible) {
        this.isAccessible = isAccessible;
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
