// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import com.fasterxml.jackson.annotation.JsonProperty;

/** L3IsolationDomainPatchProperties define the patch resource properties. */
@Fluent
public class L3IsolationDomainPatchProperties {
    /*
     * Advertise Connected Subnets. Ex: "True" | "False".
     */
    @JsonProperty(value = "redistributeConnectedSubnets")
    private RedistributeConnectedSubnets redistributeConnectedSubnets;

    /*
     * Advertise Static Routes. Ex: "True" | "False".
     */
    @JsonProperty(value = "redistributeStaticRoutes")
    private RedistributeStaticRoutes redistributeStaticRoutes;

    /*
     * List of Ipv4 and Ipv6 route configurations.
     */
    @JsonProperty(value = "aggregateRouteConfiguration")
    private AggregateRouteConfiguration aggregateRouteConfiguration;

    /*
     * L3 Isolation Domain description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Connected Subnet RoutePolicy
     */
    @JsonProperty(value = "connectedSubnetRoutePolicy")
    private L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy connectedSubnetRoutePolicy;

    /** Creates an instance of L3IsolationDomainPatchProperties class. */
    public L3IsolationDomainPatchProperties() {
    }

    /**
     * Get the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @return the redistributeConnectedSubnets value.
     */
    public RedistributeConnectedSubnets redistributeConnectedSubnets() {
        return this.redistributeConnectedSubnets;
    }

    /**
     * Set the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @param redistributeConnectedSubnets the redistributeConnectedSubnets value to set.
     * @return the L3IsolationDomainPatchProperties object itself.
     */
    public L3IsolationDomainPatchProperties withRedistributeConnectedSubnets(
        RedistributeConnectedSubnets redistributeConnectedSubnets) {
        this.redistributeConnectedSubnets = redistributeConnectedSubnets;
        return this;
    }

    /**
     * Get the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @return the redistributeStaticRoutes value.
     */
    public RedistributeStaticRoutes redistributeStaticRoutes() {
        return this.redistributeStaticRoutes;
    }

    /**
     * Set the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @param redistributeStaticRoutes the redistributeStaticRoutes value to set.
     * @return the L3IsolationDomainPatchProperties object itself.
     */
    public L3IsolationDomainPatchProperties withRedistributeStaticRoutes(
        RedistributeStaticRoutes redistributeStaticRoutes) {
        this.redistributeStaticRoutes = redistributeStaticRoutes;
        return this;
    }

    /**
     * Get the aggregateRouteConfiguration property: List of Ipv4 and Ipv6 route configurations.
     *
     * @return the aggregateRouteConfiguration value.
     */
    public AggregateRouteConfiguration aggregateRouteConfiguration() {
        return this.aggregateRouteConfiguration;
    }

    /**
     * Set the aggregateRouteConfiguration property: List of Ipv4 and Ipv6 route configurations.
     *
     * @param aggregateRouteConfiguration the aggregateRouteConfiguration value to set.
     * @return the L3IsolationDomainPatchProperties object itself.
     */
    public L3IsolationDomainPatchProperties withAggregateRouteConfiguration(
        AggregateRouteConfiguration aggregateRouteConfiguration) {
        this.aggregateRouteConfiguration = aggregateRouteConfiguration;
        return this;
    }

    /**
     * Get the description property: L3 Isolation Domain description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: L3 Isolation Domain description.
     *
     * @param description the description value to set.
     * @return the L3IsolationDomainPatchProperties object itself.
     */
    public L3IsolationDomainPatchProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @return the connectedSubnetRoutePolicy value.
     */
    public L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy connectedSubnetRoutePolicy() {
        return this.connectedSubnetRoutePolicy;
    }

    /**
     * Set the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @param connectedSubnetRoutePolicy the connectedSubnetRoutePolicy value to set.
     * @return the L3IsolationDomainPatchProperties object itself.
     */
    public L3IsolationDomainPatchProperties withConnectedSubnetRoutePolicy(
        L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy connectedSubnetRoutePolicy) {
        this.connectedSubnetRoutePolicy = connectedSubnetRoutePolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregateRouteConfiguration() != null) {
            aggregateRouteConfiguration().validate();
        }
        if (connectedSubnetRoutePolicy() != null) {
            connectedSubnetRoutePolicy().validate();
        }
    }
}
