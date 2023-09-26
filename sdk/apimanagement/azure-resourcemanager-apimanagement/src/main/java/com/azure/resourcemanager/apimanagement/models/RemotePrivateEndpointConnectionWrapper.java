// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateEndpointConnectionWrapperProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Remote Private Endpoint Connection resource. */
@Fluent
public final class RemotePrivateEndpointConnectionWrapper {
    /*
     * Private Endpoint connection resource id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Private Endpoint Connection Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Private Endpoint Connection Resource Type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointConnectionWrapperProperties innerProperties;

    /** Creates an instance of RemotePrivateEndpointConnectionWrapper class. */
    public RemotePrivateEndpointConnectionWrapper() {
    }

    /**
     * Get the id property: Private Endpoint connection resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Private Endpoint connection resource id.
     *
     * @param id the id value to set.
     * @return the RemotePrivateEndpointConnectionWrapper object itself.
     */
    public RemotePrivateEndpointConnectionWrapper withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Private Endpoint Connection Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Private Endpoint Connection Name.
     *
     * @param name the name value to set.
     * @return the RemotePrivateEndpointConnectionWrapper object itself.
     */
    public RemotePrivateEndpointConnectionWrapper withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Private Endpoint Connection Resource Type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Private Endpoint Connection Resource Type.
     *
     * @param type the type value to set.
     * @return the RemotePrivateEndpointConnectionWrapper object itself.
     */
    public RemotePrivateEndpointConnectionWrapper withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private PrivateEndpointConnectionWrapperProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the privateEndpoint property: The resource of private end point.
     *
     * @return the privateEndpoint value.
     */
    public ArmIdWrapper privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Set the privateEndpoint property: The resource of private end point.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the RemotePrivateEndpointConnectionWrapper object itself.
     */
    public RemotePrivateEndpointConnectionWrapper withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionWrapperProperties();
        }
        this.innerProperties().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnectionState();
    }

    /**
     * Set the privateLinkServiceConnectionState property: A collection of information about the state of the connection
     * between service consumer and provider.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the RemotePrivateEndpointConnectionWrapper object itself.
     */
    public RemotePrivateEndpointConnectionWrapper withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointConnectionWrapperProperties();
        }
        this.innerProperties().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint connection resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the groupIds property: All the Group ids.
     *
     * @return the groupIds value.
     */
    public List<String> groupIds() {
        return this.innerProperties() == null ? null : this.innerProperties().groupIds();
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
    }
}
