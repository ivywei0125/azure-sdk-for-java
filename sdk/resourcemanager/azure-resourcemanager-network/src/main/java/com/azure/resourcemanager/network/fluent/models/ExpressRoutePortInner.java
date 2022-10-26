// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ExpressRoutePortsBillingType;
import com.azure.resourcemanager.network.models.ExpressRoutePortsEncapsulation;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * ExpressRoute Port
 *
 * <p>ExpressRoutePort resource definition.
 */
@Fluent
public final class ExpressRoutePortInner extends Resource {
    /*
     * ExpressRoutePort Properties
     *
     * ExpressRoutePort properties.
     */
    @JsonProperty(value = "properties")
    private ExpressRoutePortPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The identity of ExpressRoutePort, if configured.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of ExpressRoutePortInner class. */
    public ExpressRoutePortInner() {
    }

    /**
     * Get the innerProperties property: ExpressRoutePort Properties
     *
     * <p>ExpressRoutePort properties.
     *
     * @return the innerProperties value.
     */
    private ExpressRoutePortPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity property: The identity of ExpressRoutePort, if configured.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of ExpressRoutePort, if configured.
     *
     * @param identity the identity value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRoutePortInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRoutePortInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringLocation();
    }

    /**
     * Set the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withPeeringLocation(String peeringLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortPropertiesFormat();
        }
        this.innerProperties().withPeeringLocation(peeringLocation);
        return this;
    }

    /**
     * Get the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     *
     * @return the bandwidthInGbps value.
     */
    public Integer bandwidthInGbps() {
        return this.innerProperties() == null ? null : this.innerProperties().bandwidthInGbps();
    }

    /**
     * Set the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withBandwidthInGbps(Integer bandwidthInGbps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortPropertiesFormat();
        }
        this.innerProperties().withBandwidthInGbps(bandwidthInGbps);
        return this;
    }

    /**
     * Get the provisionedBandwidthInGbps property: Aggregate Gbps of associated circuit bandwidths.
     *
     * @return the provisionedBandwidthInGbps value.
     */
    public Float provisionedBandwidthInGbps() {
        return this.innerProperties() == null ? null : this.innerProperties().provisionedBandwidthInGbps();
    }

    /**
     * Get the mtu property: Maximum transmission unit of the physical port pair(s).
     *
     * @return the mtu value.
     */
    public String mtu() {
        return this.innerProperties() == null ? null : this.innerProperties().mtu();
    }

    /**
     * Get the encapsulation property: Encapsulation method on physical ports.
     *
     * @return the encapsulation value.
     */
    public ExpressRoutePortsEncapsulation encapsulation() {
        return this.innerProperties() == null ? null : this.innerProperties().encapsulation();
    }

    /**
     * Set the encapsulation property: Encapsulation method on physical ports.
     *
     * @param encapsulation the encapsulation value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withEncapsulation(ExpressRoutePortsEncapsulation encapsulation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortPropertiesFormat();
        }
        this.innerProperties().withEncapsulation(encapsulation);
        return this;
    }

    /**
     * Get the etherType property: Ether type of the physical port.
     *
     * @return the etherType value.
     */
    public String etherType() {
        return this.innerProperties() == null ? null : this.innerProperties().etherType();
    }

    /**
     * Get the allocationDate property: Date of the physical port allocation to be used in Letter of Authorization.
     *
     * @return the allocationDate value.
     */
    public String allocationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationDate();
    }

    /**
     * Get the links property: ExpressRouteLink Sub-Resources
     *
     * <p>The set of physical links of the ExpressRoutePort resource.
     *
     * @return the links value.
     */
    public List<ExpressRouteLinkInner> links() {
        return this.innerProperties() == null ? null : this.innerProperties().links();
    }

    /**
     * Set the links property: ExpressRouteLink Sub-Resources
     *
     * <p>The set of physical links of the ExpressRoutePort resource.
     *
     * @param links the links value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withLinks(List<ExpressRouteLinkInner> links) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortPropertiesFormat();
        }
        this.innerProperties().withLinks(links);
        return this;
    }

    /**
     * Get the circuits property: Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort
     * resource.
     *
     * @return the circuits value.
     */
    public List<SubResource> circuits() {
        return this.innerProperties() == null ? null : this.innerProperties().circuits();
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route port resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the express route port resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the billingType property: The billing type of the ExpressRoutePort resource.
     *
     * @return the billingType value.
     */
    public ExpressRoutePortsBillingType billingType() {
        return this.innerProperties() == null ? null : this.innerProperties().billingType();
    }

    /**
     * Set the billingType property: The billing type of the ExpressRoutePort resource.
     *
     * @param billingType the billingType value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withBillingType(ExpressRoutePortsBillingType billingType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortPropertiesFormat();
        }
        this.innerProperties().withBillingType(billingType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
