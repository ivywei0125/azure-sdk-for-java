// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type used for update operations of the OracleSubscription.
 */
@Fluent
public final class OracleSubscriptionUpdate {
    /*
     * Details of the resource plan.
     */
    @JsonProperty(value = "plan")
    private ResourcePlanTypeUpdate plan;

    /*
     * The updatable properties of the OracleSubscription.
     */
    @JsonProperty(value = "properties")
    private OracleSubscriptionUpdateProperties properties;

    /**
     * Creates an instance of OracleSubscriptionUpdate class.
     */
    public OracleSubscriptionUpdate() {
    }

    /**
     * Get the plan property: Details of the resource plan.
     * 
     * @return the plan value.
     */
    public ResourcePlanTypeUpdate plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Details of the resource plan.
     * 
     * @param plan the plan value to set.
     * @return the OracleSubscriptionUpdate object itself.
     */
    public OracleSubscriptionUpdate withPlan(ResourcePlanTypeUpdate plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the properties property: The updatable properties of the OracleSubscription.
     * 
     * @return the properties value.
     */
    public OracleSubscriptionUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updatable properties of the OracleSubscription.
     * 
     * @param properties the properties value to set.
     * @return the OracleSubscriptionUpdate object itself.
     */
    public OracleSubscriptionUpdate withProperties(OracleSubscriptionUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
