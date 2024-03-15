// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.InformationType;
import com.azure.resourcemanager.security.models.SensitivityLabel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Information protection policy.
 */
@Fluent
public final class InformationProtectionPolicyInner extends ProxyResource {
    /*
     * Information protection policy data
     */
    @JsonProperty(value = "properties")
    private InformationProtectionPolicyProperties innerProperties;

    /**
     * Creates an instance of InformationProtectionPolicyInner class.
     */
    public InformationProtectionPolicyInner() {
    }

    /**
     * Get the innerProperties property: Information protection policy data.
     * 
     * @return the innerProperties value.
     */
    private InformationProtectionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the lastModifiedUtc property: Describes the last UTC time the policy was modified.
     * 
     * @return the lastModifiedUtc value.
     */
    public OffsetDateTime lastModifiedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedUtc();
    }

    /**
     * Get the version property: Describes the version of the policy.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the labels property: Dictionary of sensitivity labels.
     * 
     * @return the labels value.
     */
    public Map<String, SensitivityLabel> labels() {
        return this.innerProperties() == null ? null : this.innerProperties().labels();
    }

    /**
     * Set the labels property: Dictionary of sensitivity labels.
     * 
     * @param labels the labels value to set.
     * @return the InformationProtectionPolicyInner object itself.
     */
    public InformationProtectionPolicyInner withLabels(Map<String, SensitivityLabel> labels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InformationProtectionPolicyProperties();
        }
        this.innerProperties().withLabels(labels);
        return this;
    }

    /**
     * Get the informationTypes property: The sensitivity information types.
     * 
     * @return the informationTypes value.
     */
    public Map<String, InformationType> informationTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().informationTypes();
    }

    /**
     * Set the informationTypes property: The sensitivity information types.
     * 
     * @param informationTypes the informationTypes value to set.
     * @return the InformationProtectionPolicyInner object itself.
     */
    public InformationProtectionPolicyInner withInformationTypes(Map<String, InformationType> informationTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InformationProtectionPolicyProperties();
        }
        this.innerProperties().withInformationTypes(informationTypes);
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
    }
}
