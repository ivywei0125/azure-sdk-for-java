// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of managed identity assigned to this resource. */
public final class ManagedIdentityType extends ExpandableStringEnum<ManagedIdentityType> {
    /** Static value SystemAssigned for ManagedIdentityType. */
    public static final ManagedIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for ManagedIdentityType. */
    public static final ManagedIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /** Static value SystemAndUserAssigned for ManagedIdentityType. */
    public static final ManagedIdentityType SYSTEM_AND_USER_ASSIGNED = fromString("SystemAndUserAssigned");

    /**
     * Creates a new instance of ManagedIdentityType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedIdentityType() {
    }

    /**
     * Creates or finds a ManagedIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityType.
     */
    @JsonCreator
    public static ManagedIdentityType fromString(String name) {
        return fromString(name, ManagedIdentityType.class);
    }

    /**
     * Gets known ManagedIdentityType values.
     *
     * @return known ManagedIdentityType values.
     */
    public static Collection<ManagedIdentityType> values() {
        return values(ManagedIdentityType.class);
    }
}
