// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The Storage Account ManagementPolicies Rules. See more details in:
 * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
 */
@Fluent
public final class ManagementPolicySchema {
    /*
     * The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ManagementPolicyRule> rules;

    /**
     * Creates an instance of ManagementPolicySchema class.
     */
    public ManagementPolicySchema() {
    }

    /**
     * Get the rules property: The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @return the rules value.
     */
    public List<ManagementPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The Storage Account ManagementPolicies Rules. See more details in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @param rules the rules value to set.
     * @return the ManagementPolicySchema object itself.
     */
    public ManagementPolicySchema withRules(List<ManagementPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property rules in model ManagementPolicySchema"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementPolicySchema.class);
}
