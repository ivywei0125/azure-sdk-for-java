// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.ObjectReplicationPolicyRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The Storage Account ObjectReplicationPolicy properties.
 */
@Fluent
public final class ObjectReplicationPolicyProperties {
    /*
     * A unique id for object replication policy.
     */
    @JsonProperty(value = "policyId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyId;

    /*
     * Indicates when the policy is enabled on the source account.
     */
    @JsonProperty(value = "enabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime enabledTime;

    /*
     * Required. Source account name. It should be full resource id if allowCrossTenantReplication set to false.
     */
    @JsonProperty(value = "sourceAccount", required = true)
    private String sourceAccount;

    /*
     * Required. Destination account name. It should be full resource id if allowCrossTenantReplication set to false.
     */
    @JsonProperty(value = "destinationAccount", required = true)
    private String destinationAccount;

    /*
     * The storage account object replication rules.
     */
    @JsonProperty(value = "rules")
    private List<ObjectReplicationPolicyRule> rules;

    /**
     * Creates an instance of ObjectReplicationPolicyProperties class.
     */
    public ObjectReplicationPolicyProperties() {
    }

    /**
     * Get the policyId property: A unique id for object replication policy.
     * 
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Get the enabledTime property: Indicates when the policy is enabled on the source account.
     * 
     * @return the enabledTime value.
     */
    public OffsetDateTime enabledTime() {
        return this.enabledTime;
    }

    /**
     * Get the sourceAccount property: Required. Source account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the sourceAccount value.
     */
    public String sourceAccount() {
        return this.sourceAccount;
    }

    /**
     * Set the sourceAccount property: Required. Source account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @param sourceAccount the sourceAccount value to set.
     * @return the ObjectReplicationPolicyProperties object itself.
     */
    public ObjectReplicationPolicyProperties withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Get the destinationAccount property: Required. Destination account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @return the destinationAccount value.
     */
    public String destinationAccount() {
        return this.destinationAccount;
    }

    /**
     * Set the destinationAccount property: Required. Destination account name. It should be full resource id if
     * allowCrossTenantReplication set to false.
     * 
     * @param destinationAccount the destinationAccount value to set.
     * @return the ObjectReplicationPolicyProperties object itself.
     */
    public ObjectReplicationPolicyProperties withDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
        return this;
    }

    /**
     * Get the rules property: The storage account object replication rules.
     * 
     * @return the rules value.
     */
    public List<ObjectReplicationPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The storage account object replication rules.
     * 
     * @param rules the rules value to set.
     * @return the ObjectReplicationPolicyProperties object itself.
     */
    public ObjectReplicationPolicyProperties withRules(List<ObjectReplicationPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceAccount() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceAccount in model ObjectReplicationPolicyProperties"));
        }
        if (destinationAccount() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property destinationAccount in model ObjectReplicationPolicyProperties"));
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ObjectReplicationPolicyProperties.class);
}
