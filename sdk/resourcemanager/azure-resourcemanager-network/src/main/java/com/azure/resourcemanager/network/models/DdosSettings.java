// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the DDoS protection settings of the public IP. */
@Fluent
public final class DdosSettings {
    /*
     * The DDoS protection mode of the public IP
     */
    @JsonProperty(value = "protectionMode")
    private DdosSettingsProtectionMode protectionMode;

    /*
     * The DDoS protection plan associated with the public IP. Can only be set if ProtectionMode is Enabled
     */
    @JsonProperty(value = "ddosProtectionPlan")
    private SubResource ddosProtectionPlan;

    /** Creates an instance of DdosSettings class. */
    public DdosSettings() {
    }

    /**
     * Get the protectionMode property: The DDoS protection mode of the public IP.
     *
     * @return the protectionMode value.
     */
    public DdosSettingsProtectionMode protectionMode() {
        return this.protectionMode;
    }

    /**
     * Set the protectionMode property: The DDoS protection mode of the public IP.
     *
     * @param protectionMode the protectionMode value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectionMode(DdosSettingsProtectionMode protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * Get the ddosProtectionPlan property: The DDoS protection plan associated with the public IP. Can only be set if
     * ProtectionMode is Enabled.
     *
     * @return the ddosProtectionPlan value.
     */
    public SubResource ddosProtectionPlan() {
        return this.ddosProtectionPlan;
    }

    /**
     * Set the ddosProtectionPlan property: The DDoS protection plan associated with the public IP. Can only be set if
     * ProtectionMode is Enabled.
     *
     * @param ddosProtectionPlan the ddosProtectionPlan value to set.
     * @return the DdosSettings object itself.
     */
    public DdosSettings withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.ddosProtectionPlan = ddosProtectionPlan;
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
