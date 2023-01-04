// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Recovery plan test failover input properties. */
@Fluent
public final class RecoveryPlanTestFailoverInputProperties {
    /*
     * The failover direction.
     */
    @JsonProperty(value = "failoverDirection", required = true)
    private PossibleOperationsDirections failoverDirection;

    /*
     * The network type to be used for test failover.
     */
    @JsonProperty(value = "networkType", required = true)
    private String networkType;

    /*
     * The Id of the network to be used for test failover.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /*
     * The provider specific properties.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails;

    /** Creates an instance of RecoveryPlanTestFailoverInputProperties class. */
    public RecoveryPlanTestFailoverInputProperties() {
    }

    /**
     * Get the failoverDirection property: The failover direction.
     *
     * @return the failoverDirection value.
     */
    public PossibleOperationsDirections failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: The failover direction.
     *
     * @param failoverDirection the failoverDirection value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withFailoverDirection(
        PossibleOperationsDirections failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the networkType property: The network type to be used for test failover.
     *
     * @return the networkType value.
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set the networkType property: The network type to be used for test failover.
     *
     * @param networkType the networkType value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the networkId property: The Id of the network to be used for test failover.
     *
     * @return the networkId value.
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId property: The Id of the network to be used for test failover.
     *
     * @param networkId the networkId value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific properties.
     *
     * @return the providerSpecificDetails value.
     */
    public List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific properties.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the RecoveryPlanTestFailoverInputProperties object itself.
     */
    public RecoveryPlanTestFailoverInputProperties withProviderSpecificDetails(
        List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failoverDirection() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property failoverDirection in model"
                            + " RecoveryPlanTestFailoverInputProperties"));
        }
        if (networkType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkType in model RecoveryPlanTestFailoverInputProperties"));
        }
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanTestFailoverInputProperties.class);
}