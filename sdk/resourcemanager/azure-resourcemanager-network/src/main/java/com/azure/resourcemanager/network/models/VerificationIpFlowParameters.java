// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the IP flow to be verified.
 */
@Fluent
public final class VerificationIpFlowParameters {
    /*
     * The ID of the target resource to perform next-hop on.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * The direction of the packet represented as a 5-tuple.
     */
    @JsonProperty(value = "direction", required = true)
    private Direction direction;

    /*
     * Protocol to be verified on.
     */
    @JsonProperty(value = "protocol", required = true)
    private IpFlowProtocol protocol;

    /*
     * The local port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     */
    @JsonProperty(value = "localPort", required = true)
    private String localPort;

    /*
     * The remote port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     */
    @JsonProperty(value = "remotePort", required = true)
    private String remotePort;

    /*
     * The local IP address. Acceptable values are valid IPv4 addresses.
     */
    @JsonProperty(value = "localIPAddress", required = true)
    private String localIpAddress;

    /*
     * The remote IP address. Acceptable values are valid IPv4 addresses.
     */
    @JsonProperty(value = "remoteIPAddress", required = true)
    private String remoteIpAddress;

    /*
     * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of them, then this parameter must be specified. Otherwise optional).
     */
    @JsonProperty(value = "targetNicResourceId")
    private String targetNicResourceId;

    /**
     * Creates an instance of VerificationIpFlowParameters class.
     */
    public VerificationIpFlowParameters() {
    }

    /**
     * Get the targetResourceId property: The ID of the target resource to perform next-hop on.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the target resource to perform next-hop on.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the direction property: The direction of the packet represented as a 5-tuple.
     * 
     * @return the direction value.
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction property: The direction of the packet represented as a 5-tuple.
     * 
     * @param direction the direction value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the protocol property: Protocol to be verified on.
     * 
     * @return the protocol value.
     */
    public IpFlowProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol to be verified on.
     * 
     * @param protocol the protocol value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withProtocol(IpFlowProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the localPort property: The local port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @return the localPort value.
     */
    public String localPort() {
        return this.localPort;
    }

    /**
     * Set the localPort property: The local port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @param localPort the localPort value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withLocalPort(String localPort) {
        this.localPort = localPort;
        return this;
    }

    /**
     * Get the remotePort property: The remote port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @return the remotePort value.
     */
    public String remotePort() {
        return this.remotePort;
    }

    /**
     * Set the remotePort property: The remote port. Acceptable values are a single integer in the range (0-65535).
     * Support for * for the source port, which depends on the direction.
     * 
     * @param remotePort the remotePort value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withRemotePort(String remotePort) {
        this.remotePort = remotePort;
        return this;
    }

    /**
     * Get the localIpAddress property: The local IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @return the localIpAddress value.
     */
    public String localIpAddress() {
        return this.localIpAddress;
    }

    /**
     * Set the localIpAddress property: The local IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @param localIpAddress the localIpAddress value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withLocalIpAddress(String localIpAddress) {
        this.localIpAddress = localIpAddress;
        return this;
    }

    /**
     * Get the remoteIpAddress property: The remote IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @return the remoteIpAddress value.
     */
    public String remoteIpAddress() {
        return this.remoteIpAddress;
    }

    /**
     * Set the remoteIpAddress property: The remote IP address. Acceptable values are valid IPv4 addresses.
     * 
     * @param remoteIpAddress the remoteIpAddress value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withRemoteIpAddress(String remoteIpAddress) {
        this.remoteIpAddress = remoteIpAddress;
        return this;
    }

    /**
     * Get the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * them, then this parameter must be specified. Otherwise optional).
     * 
     * @return the targetNicResourceId value.
     */
    public String targetNicResourceId() {
        return this.targetNicResourceId;
    }

    /**
     * Set the targetNicResourceId property: The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of
     * them, then this parameter must be specified. Otherwise optional).
     * 
     * @param targetNicResourceId the targetNicResourceId value to set.
     * @return the VerificationIpFlowParameters object itself.
     */
    public VerificationIpFlowParameters withTargetNicResourceId(String targetNicResourceId) {
        this.targetNicResourceId = targetNicResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetResourceId in model VerificationIpFlowParameters"));
        }
        if (direction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property direction in model VerificationIpFlowParameters"));
        }
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property protocol in model VerificationIpFlowParameters"));
        }
        if (localPort() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property localPort in model VerificationIpFlowParameters"));
        }
        if (remotePort() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property remotePort in model VerificationIpFlowParameters"));
        }
        if (localIpAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property localIpAddress in model VerificationIpFlowParameters"));
        }
        if (remoteIpAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property remoteIpAddress in model VerificationIpFlowParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VerificationIpFlowParameters.class);
}
