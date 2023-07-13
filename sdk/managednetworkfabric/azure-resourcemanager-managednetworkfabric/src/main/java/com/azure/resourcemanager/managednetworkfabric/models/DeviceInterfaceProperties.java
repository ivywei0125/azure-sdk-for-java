// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network device interface properties. */
@Fluent
public final class DeviceInterfaceProperties {
    /*
     * Interface identifier. Example: HundredGigE0/0.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * Interface type.
     */
    @JsonProperty(value = "interfaceType")
    private String interfaceType;

    /*
     * List of supported connector types.
     */
    @JsonProperty(value = "supportedConnectorTypes")
    private List<SupportedConnectorProperties> supportedConnectorTypes;

    /** Creates an instance of DeviceInterfaceProperties class. */
    public DeviceInterfaceProperties() {
    }

    /**
     * Get the identifier property: Interface identifier. Example: HundredGigE0/0.
     *
     * @return the identifier value.
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Interface identifier. Example: HundredGigE0/0.
     *
     * @param identifier the identifier value to set.
     * @return the DeviceInterfaceProperties object itself.
     */
    public DeviceInterfaceProperties withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the interfaceType property: Interface type.
     *
     * @return the interfaceType value.
     */
    public String interfaceType() {
        return this.interfaceType;
    }

    /**
     * Set the interfaceType property: Interface type.
     *
     * @param interfaceType the interfaceType value to set.
     * @return the DeviceInterfaceProperties object itself.
     */
    public DeviceInterfaceProperties withInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    /**
     * Get the supportedConnectorTypes property: List of supported connector types.
     *
     * @return the supportedConnectorTypes value.
     */
    public List<SupportedConnectorProperties> supportedConnectorTypes() {
        return this.supportedConnectorTypes;
    }

    /**
     * Set the supportedConnectorTypes property: List of supported connector types.
     *
     * @param supportedConnectorTypes the supportedConnectorTypes value to set.
     * @return the DeviceInterfaceProperties object itself.
     */
    public DeviceInterfaceProperties withSupportedConnectorTypes(
        List<SupportedConnectorProperties> supportedConnectorTypes) {
        this.supportedConnectorTypes = supportedConnectorTypes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedConnectorTypes() != null) {
            supportedConnectorTypes().forEach(e -> e.validate());
        }
    }
}
