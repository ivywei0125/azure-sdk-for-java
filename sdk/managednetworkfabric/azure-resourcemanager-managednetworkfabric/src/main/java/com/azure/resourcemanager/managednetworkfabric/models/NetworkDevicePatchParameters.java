// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDevicePatchParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Network Device Patch Parameters defines the patch parameters of the resource. */
@Fluent
public final class NetworkDevicePatchParameters extends TagsUpdate {
    /*
     * Network Device Patch properties.
     */
    @JsonProperty(value = "properties")
    private NetworkDevicePatchParametersProperties innerProperties;

    /** Creates an instance of NetworkDevicePatchParameters class. */
    public NetworkDevicePatchParameters() {
    }

    /**
     * Get the innerProperties property: Network Device Patch properties.
     *
     * @return the innerProperties value.
     */
    private NetworkDevicePatchParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkDevicePatchParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the hostname property: The host name of the device.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The host name of the device.
     *
     * @param hostname the hostname value to set.
     * @return the NetworkDevicePatchParameters object itself.
     */
    public NetworkDevicePatchParameters withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDevicePatchParametersProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the serialNumber property: Serial number of the device. Format of serial Number -
     * Make;Model;HardwareRevisionId;SerialNumber.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().serialNumber();
    }

    /**
     * Set the serialNumber property: Serial number of the device. Format of serial Number -
     * Make;Model;HardwareRevisionId;SerialNumber.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the NetworkDevicePatchParameters object itself.
     */
    public NetworkDevicePatchParameters withSerialNumber(String serialNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDevicePatchParametersProperties();
        }
        this.innerProperties().withSerialNumber(serialNumber);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the NetworkDevicePatchParameters object itself.
     */
    public NetworkDevicePatchParameters withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkDevicePatchParametersProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
