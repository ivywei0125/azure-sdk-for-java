// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnServerConfiguration PolicyGroup member.
 */
@Fluent
public final class VpnServerConfigurationPolicyGroupMember {
    /*
     * Name of the VpnServerConfigurationPolicyGroupMember.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The Vpn Policy member attribute type.
     */
    @JsonProperty(value = "attributeType")
    private VpnPolicyMemberAttributeType attributeType;

    /*
     * The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     */
    @JsonProperty(value = "attributeValue")
    private String attributeValue;

    /**
     * Creates an instance of VpnServerConfigurationPolicyGroupMember class.
     */
    public VpnServerConfigurationPolicyGroupMember() {
    }

    /**
     * Get the name property: Name of the VpnServerConfigurationPolicyGroupMember.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the VpnServerConfigurationPolicyGroupMember.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the attributeType property: The Vpn Policy member attribute type.
     * 
     * @return the attributeType value.
     */
    public VpnPolicyMemberAttributeType attributeType() {
        return this.attributeType;
    }

    /**
     * Set the attributeType property: The Vpn Policy member attribute type.
     * 
     * @param attributeType the attributeType value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withAttributeType(VpnPolicyMemberAttributeType attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * Get the attributeValue property: The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     * 
     * @return the attributeValue value.
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    /**
     * Set the attributeValue property: The value of Attribute used for this VpnServerConfigurationPolicyGroupMember.
     * 
     * @param attributeValue the attributeValue value to set.
     * @return the VpnServerConfigurationPolicyGroupMember object itself.
     */
    public VpnServerConfigurationPolicyGroupMember withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
