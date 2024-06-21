// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the lease action. Can be one of the available actions.
 */
public final class LeaseContainerRequestAction extends ExpandableStringEnum<LeaseContainerRequestAction> {
    /**
     * Static value Acquire for LeaseContainerRequestAction.
     */
    public static final LeaseContainerRequestAction ACQUIRE = fromString("Acquire");

    /**
     * Static value Renew for LeaseContainerRequestAction.
     */
    public static final LeaseContainerRequestAction RENEW = fromString("Renew");

    /**
     * Static value Change for LeaseContainerRequestAction.
     */
    public static final LeaseContainerRequestAction CHANGE = fromString("Change");

    /**
     * Static value Release for LeaseContainerRequestAction.
     */
    public static final LeaseContainerRequestAction RELEASE = fromString("Release");

    /**
     * Static value Break for LeaseContainerRequestAction.
     */
    public static final LeaseContainerRequestAction BREAK = fromString("Break");

    /**
     * Creates a new instance of LeaseContainerRequestAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LeaseContainerRequestAction() {
    }

    /**
     * Creates or finds a LeaseContainerRequestAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LeaseContainerRequestAction.
     */
    @JsonCreator
    public static LeaseContainerRequestAction fromString(String name) {
        return fromString(name, LeaseContainerRequestAction.class);
    }

    /**
     * Gets known LeaseContainerRequestAction values.
     * 
     * @return known LeaseContainerRequestAction values.
     */
    public static Collection<LeaseContainerRequestAction> values() {
        return values(LeaseContainerRequestAction.class);
    }
}
