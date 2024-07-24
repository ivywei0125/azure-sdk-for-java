// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteGatewayPropertiesAutoScaleConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualHubId;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ExpressRoute gateway resource properties.
 */
@Fluent
public final class ExpressRouteGatewayProperties {
    /*
     * Configuration for auto scaling.
     */
    @JsonProperty(value = "autoScaleConfiguration")
    private ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration;

    /*
     * List of ExpressRoute connections to the ExpressRoute gateway.
     */
    @JsonProperty(value = "expressRouteConnections")
    private List<ExpressRouteConnectionInner> expressRouteConnections;

    /*
     * The provisioning state of the express route gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     */
    @JsonProperty(value = "virtualHub", required = true)
    private VirtualHubId virtualHub;

    /*
     * Configures this gateway to accept traffic from non Virtual WAN networks.
     */
    @JsonProperty(value = "allowNonVirtualWanTraffic")
    private Boolean allowNonVirtualWanTraffic;

    /**
     * Creates an instance of ExpressRouteGatewayProperties class.
     */
    public ExpressRouteGatewayProperties() {
    }

    /**
     * Get the autoScaleConfiguration property: Configuration for auto scaling.
     * 
     * @return the autoScaleConfiguration value.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }

    /**
     * Set the autoScaleConfiguration property: Configuration for auto scaling.
     * 
     * @param autoScaleConfiguration the autoScaleConfiguration value to set.
     * @return the ExpressRouteGatewayProperties object itself.
     */
    public ExpressRouteGatewayProperties
        withAutoScaleConfiguration(ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        return this;
    }

    /**
     * Get the expressRouteConnections property: List of ExpressRoute connections to the ExpressRoute gateway.
     * 
     * @return the expressRouteConnections value.
     */
    public List<ExpressRouteConnectionInner> expressRouteConnections() {
        return this.expressRouteConnections;
    }

    /**
     * Set the expressRouteConnections property: List of ExpressRoute connections to the ExpressRoute gateway.
     * 
     * @param expressRouteConnections the expressRouteConnections value to set.
     * @return the ExpressRouteGatewayProperties object itself.
     */
    public ExpressRouteGatewayProperties
        withExpressRouteConnections(List<ExpressRouteConnectionInner> expressRouteConnections) {
        this.expressRouteConnections = expressRouteConnections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * 
     * @return the virtualHub value.
     */
    public VirtualHubId virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the ExpressRouteGatewayProperties object itself.
     */
    public ExpressRouteGatewayProperties withVirtualHub(VirtualHubId virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the allowNonVirtualWanTraffic property: Configures this gateway to accept traffic from non Virtual WAN
     * networks.
     * 
     * @return the allowNonVirtualWanTraffic value.
     */
    public Boolean allowNonVirtualWanTraffic() {
        return this.allowNonVirtualWanTraffic;
    }

    /**
     * Set the allowNonVirtualWanTraffic property: Configures this gateway to accept traffic from non Virtual WAN
     * networks.
     * 
     * @param allowNonVirtualWanTraffic the allowNonVirtualWanTraffic value to set.
     * @return the ExpressRouteGatewayProperties object itself.
     */
    public ExpressRouteGatewayProperties withAllowNonVirtualWanTraffic(Boolean allowNonVirtualWanTraffic) {
        this.allowNonVirtualWanTraffic = allowNonVirtualWanTraffic;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoScaleConfiguration() != null) {
            autoScaleConfiguration().validate();
        }
        if (expressRouteConnections() != null) {
            expressRouteConnections().forEach(e -> e.validate());
        }
        if (virtualHub() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property virtualHub in model ExpressRouteGatewayProperties"));
        } else {
            virtualHub().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteGatewayProperties.class);
}
