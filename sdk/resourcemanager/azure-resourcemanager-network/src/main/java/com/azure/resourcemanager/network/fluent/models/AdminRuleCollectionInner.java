// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.NetworkManagerSecurityGroupItem;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the admin rule collection. */
@Fluent
public final class AdminRuleCollectionInner extends ChildResource {
    /*
     * Indicates the properties for the network manager admin rule collection.
     */
    @JsonProperty(value = "properties")
    private AdminRuleCollectionPropertiesFormat innerProperties;

    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AdminRuleCollectionInner class. */
    public AdminRuleCollectionInner() {
    }

    /**
     * Get the innerProperties property: Indicates the properties for the network manager admin rule collection.
     *
     * @return the innerProperties value.
     */
    private AdminRuleCollectionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: A description of the admin rule collection.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the admin rule collection.
     *
     * @param description the description value to set.
     * @return the AdminRuleCollectionInner object itself.
     */
    public AdminRuleCollectionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the appliesToGroups property: Groups for configuration.
     *
     * @return the appliesToGroups value.
     */
    public List<NetworkManagerSecurityGroupItem> appliesToGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().appliesToGroups();
    }

    /**
     * Set the appliesToGroups property: Groups for configuration.
     *
     * @param appliesToGroups the appliesToGroups value to set.
     * @return the AdminRuleCollectionInner object itself.
     */
    public AdminRuleCollectionInner withAppliesToGroups(List<NetworkManagerSecurityGroupItem> appliesToGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdminRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withAppliesToGroups(appliesToGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
