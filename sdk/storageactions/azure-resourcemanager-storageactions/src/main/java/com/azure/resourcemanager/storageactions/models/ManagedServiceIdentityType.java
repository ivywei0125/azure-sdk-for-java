// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
 */
public final class ManagedServiceIdentityType extends ExpandableStringEnum<ManagedServiceIdentityType> {
    /**
     * Static value None for ManagedServiceIdentityType.
     */
    public static final ManagedServiceIdentityType NONE = fromString("None");

    /**
     * Static value SystemAssigned for ManagedServiceIdentityType.
     */
    public static final ManagedServiceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Static value UserAssigned for ManagedServiceIdentityType.
     */
    public static final ManagedServiceIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Static value SystemAssigned,UserAssigned for ManagedServiceIdentityType.
     */
    public static final ManagedServiceIdentityType SYSTEM_ASSIGNED_USER_ASSIGNED
        = fromString("SystemAssigned,UserAssigned");

    /**
     * Creates a new instance of ManagedServiceIdentityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedServiceIdentityType() {
    }

    /**
     * Creates or finds a ManagedServiceIdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedServiceIdentityType.
     */
    @JsonCreator
    public static ManagedServiceIdentityType fromString(String name) {
        return fromString(name, ManagedServiceIdentityType.class);
    }

    /**
     * Gets known ManagedServiceIdentityType values.
     * 
     * @return known ManagedServiceIdentityType values.
     */
    public static Collection<ManagedServiceIdentityType> values() {
        return values(ManagedServiceIdentityType.class);
    }
}
