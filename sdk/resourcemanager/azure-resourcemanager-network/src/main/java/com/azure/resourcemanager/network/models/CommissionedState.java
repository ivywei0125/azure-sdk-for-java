// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The commissioned state of the Custom IP Prefix. */
public final class CommissionedState extends ExpandableStringEnum<CommissionedState> {
    /** Static value Provisioning for CommissionedState. */
    public static final CommissionedState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for CommissionedState. */
    public static final CommissionedState PROVISIONED = fromString("Provisioned");

    /** Static value Commissioning for CommissionedState. */
    public static final CommissionedState COMMISSIONING = fromString("Commissioning");

    /** Static value CommissionedNoInternetAdvertise for CommissionedState. */
    public static final CommissionedState COMMISSIONED_NO_INTERNET_ADVERTISE =
        fromString("CommissionedNoInternetAdvertise");

    /** Static value Commissioned for CommissionedState. */
    public static final CommissionedState COMMISSIONED = fromString("Commissioned");

    /** Static value Decommissioning for CommissionedState. */
    public static final CommissionedState DECOMMISSIONING = fromString("Decommissioning");

    /** Static value Deprovisioning for CommissionedState. */
    public static final CommissionedState DEPROVISIONING = fromString("Deprovisioning");

    /** Static value Deprovisioned for CommissionedState. */
    public static final CommissionedState DEPROVISIONED = fromString("Deprovisioned");

    /**
     * Creates or finds a CommissionedState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CommissionedState.
     */
    @JsonCreator
    public static CommissionedState fromString(String name) {
        return fromString(name, CommissionedState.class);
    }

    /**
     * Gets known CommissionedState values.
     *
     * @return known CommissionedState values.
     */
    public static Collection<CommissionedState> values() {
        return values(CommissionedState.class);
    }
}
