// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProbeProtocol;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Load balancer probe resource. */
@Fluent
public final class ProbePropertiesFormat {
    /*
     * The load balancer rules that use this probe.
     */
    @JsonProperty(value = "loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * The protocol of the end point. If 'Tcp' is specified, a received ACK is required for the probe to be successful.
     * If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is required for the probe to be
     * successful.
     */
    @JsonProperty(value = "protocol", required = true)
    private ProbeProtocol protocol;

    /*
     * The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /*
     * The interval, in seconds, for how frequently to probe the endpoint for health status. Typically, the interval is
     * slightly less than half the allocated timeout period (in seconds) which allows two full probes before taking the
     * instance out of rotation. The default value is 15, the minimum value is 5.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /*
     * The number of probes where if no response, will result in stopping further traffic from being delivered to the
     * endpoint. This values allows endpoints to be taken out of rotation faster or slower than the typical times used
     * in Azure.
     */
    @JsonProperty(value = "numberOfProbes")
    private Integer numberOfProbes;

    /*
     * The number of consecutive successful or failed probes in order to allow or deny traffic from being delivered to
     * this endpoint. After failing the number of consecutive probes equal to this value, the endpoint will be taken
     * out of rotation and require the same number of successful consecutive probes to be placed back in rotation.
     */
    @JsonProperty(value = "probeThreshold")
    private Integer probeThreshold;

    /*
     * The URI used for requesting health status from the VM. Path is required if a protocol is set to http. Otherwise,
     * it is not allowed. There is no default value.
     */
    @JsonProperty(value = "requestPath")
    private String requestPath;

    /*
     * The provisioning state of the probe resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ProbePropertiesFormat class. */
    public ProbePropertiesFormat() {
    }

    /**
     * Get the loadBalancingRules property: The load balancer rules that use this probe.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the protocol property: The protocol of the end point. If 'Tcp' is specified, a received ACK is required for
     * the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is
     * required for the probe to be successful.
     *
     * @return the protocol value.
     */
    public ProbeProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol of the end point. If 'Tcp' is specified, a received ACK is required for
     * the probe to be successful. If 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is
     * required for the probe to be successful.
     *
     * @param protocol the protocol value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withProtocol(ProbeProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: The port for communicating the probe. Possible values range from 1 to 65535, inclusive.
     *
     * @param port the port value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the intervalInSeconds property: The interval, in seconds, for how frequently to probe the endpoint for health
     * status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows
     * two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: The interval, in seconds, for how frequently to probe the endpoint for health
     * status. Typically, the interval is slightly less than half the allocated timeout period (in seconds) which allows
     * two full probes before taking the instance out of rotation. The default value is 15, the minimum value is 5.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the numberOfProbes property: The number of probes where if no response, will result in stopping further
     * traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or
     * slower than the typical times used in Azure.
     *
     * @return the numberOfProbes value.
     */
    public Integer numberOfProbes() {
        return this.numberOfProbes;
    }

    /**
     * Set the numberOfProbes property: The number of probes where if no response, will result in stopping further
     * traffic from being delivered to the endpoint. This values allows endpoints to be taken out of rotation faster or
     * slower than the typical times used in Azure.
     *
     * @param numberOfProbes the numberOfProbes value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withNumberOfProbes(Integer numberOfProbes) {
        this.numberOfProbes = numberOfProbes;
        return this;
    }

    /**
     * Get the probeThreshold property: The number of consecutive successful or failed probes in order to allow or deny
     * traffic from being delivered to this endpoint. After failing the number of consecutive probes equal to this
     * value, the endpoint will be taken out of rotation and require the same number of successful consecutive probes to
     * be placed back in rotation.
     *
     * @return the probeThreshold value.
     */
    public Integer probeThreshold() {
        return this.probeThreshold;
    }

    /**
     * Set the probeThreshold property: The number of consecutive successful or failed probes in order to allow or deny
     * traffic from being delivered to this endpoint. After failing the number of consecutive probes equal to this
     * value, the endpoint will be taken out of rotation and require the same number of successful consecutive probes to
     * be placed back in rotation.
     *
     * @param probeThreshold the probeThreshold value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withProbeThreshold(Integer probeThreshold) {
        this.probeThreshold = probeThreshold;
        return this;
    }

    /**
     * Get the requestPath property: The URI used for requesting health status from the VM. Path is required if a
     * protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @return the requestPath value.
     */
    public String requestPath() {
        return this.requestPath;
    }

    /**
     * Set the requestPath property: The URI used for requesting health status from the VM. Path is required if a
     * protocol is set to http. Otherwise, it is not allowed. There is no default value.
     *
     * @param requestPath the requestPath value to set.
     * @return the ProbePropertiesFormat object itself.
     */
    public ProbePropertiesFormat withRequestPath(String requestPath) {
        this.requestPath = requestPath;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the probe resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocol() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property protocol in model ProbePropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProbePropertiesFormat.class);
}
