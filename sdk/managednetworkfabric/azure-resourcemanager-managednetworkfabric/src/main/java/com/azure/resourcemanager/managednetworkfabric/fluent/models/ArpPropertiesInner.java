// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Show ARP table entry properties. */
@Fluent
public final class ArpPropertiesInner {
    /*
     * Ipv4 or Ipv6 address
     */
    @JsonProperty(value = "address", required = true)
    private String address;

    /*
     * Duration in seconds.
     */
    @JsonProperty(value = "age", required = true)
    private String age;

    /*
     * Hardware address.
     */
    @JsonProperty(value = "macAddress", required = true)
    private String macAddress;

    /*
     * Layer 2 interface name.
     */
    @JsonProperty(value = "interface", required = true)
    private String interfaceProperty;

    /*
     * ARP status
     */
    @JsonProperty(value = "state")
    private String state;

    /** Creates an instance of ArpPropertiesInner class. */
    public ArpPropertiesInner() {
    }

    /**
     * Get the address property: Ipv4 or Ipv6 address.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: Ipv4 or Ipv6 address.
     *
     * @param address the address value to set.
     * @return the ArpPropertiesInner object itself.
     */
    public ArpPropertiesInner withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the age property: Duration in seconds.
     *
     * @return the age value.
     */
    public String age() {
        return this.age;
    }

    /**
     * Set the age property: Duration in seconds.
     *
     * @param age the age value to set.
     * @return the ArpPropertiesInner object itself.
     */
    public ArpPropertiesInner withAge(String age) {
        this.age = age;
        return this;
    }

    /**
     * Get the macAddress property: Hardware address.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress property: Hardware address.
     *
     * @param macAddress the macAddress value to set.
     * @return the ArpPropertiesInner object itself.
     */
    public ArpPropertiesInner withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the interfaceProperty property: Layer 2 interface name.
     *
     * @return the interfaceProperty value.
     */
    public String interfaceProperty() {
        return this.interfaceProperty;
    }

    /**
     * Set the interfaceProperty property: Layer 2 interface name.
     *
     * @param interfaceProperty the interfaceProperty value to set.
     * @return the ArpPropertiesInner object itself.
     */
    public ArpPropertiesInner withInterfaceProperty(String interfaceProperty) {
        this.interfaceProperty = interfaceProperty;
        return this;
    }

    /**
     * Get the state property: ARP status.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: ARP status.
     *
     * @param state the state value to set.
     * @return the ArpPropertiesInner object itself.
     */
    public ArpPropertiesInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (address() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property address in model ArpPropertiesInner"));
        }
        if (age() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property age in model ArpPropertiesInner"));
        }
        if (macAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property macAddress in model ArpPropertiesInner"));
        }
        if (interfaceProperty() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property interfaceProperty in model ArpPropertiesInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ArpPropertiesInner.class);
}
