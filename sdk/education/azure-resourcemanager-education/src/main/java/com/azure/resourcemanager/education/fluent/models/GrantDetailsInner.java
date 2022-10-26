// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.education.models.GrantStatus;
import com.azure.resourcemanager.education.models.GrantType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Grant details. */
@Immutable
public final class GrantDetailsInner extends ProxyResource {
    /*
     * Grant detail properties.
     */
    @JsonProperty(value = "properties")
    private GrantDetailProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of GrantDetailsInner class. */
    public GrantDetailsInner() {
    }

    /**
     * Get the innerProperties property: Grant detail properties.
     *
     * @return the innerProperties value.
     */
    private GrantDetailProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the offerCap property: Offer Cap.
     *
     * @return the offerCap value.
     */
    public Amount offerCap() {
        return this.innerProperties() == null ? null : this.innerProperties().offerCap();
    }

    /**
     * Get the effectiveDate property: Grant Effective Date.
     *
     * @return the effectiveDate value.
     */
    public OffsetDateTime effectiveDate() {
        return this.innerProperties() == null ? null : this.innerProperties().effectiveDate();
    }

    /**
     * Get the offerType property: Grant Offer Type.
     *
     * @return the offerType value.
     */
    public GrantType offerType() {
        return this.innerProperties() == null ? null : this.innerProperties().offerType();
    }

    /**
     * Get the expirationDate property: Expiration Date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Get the status property: Grant status.
     *
     * @return the status value.
     */
    public GrantStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the allocatedBudget property: allocated budget.
     *
     * @return the allocatedBudget value.
     */
    public Amount allocatedBudget() {
        return this.innerProperties() == null ? null : this.innerProperties().allocatedBudget();
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
