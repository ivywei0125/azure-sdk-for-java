// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the MoveType. */
public final class MoveType extends ExpandableStringEnum<MoveType> {
    /** Static value RegionToRegion for MoveType. */
    public static final MoveType REGION_TO_REGION = fromString("RegionToRegion");

    /** Static value RegionToZone for MoveType. */
    public static final MoveType REGION_TO_ZONE = fromString("RegionToZone");

    /**
     * Creates a new instance of MoveType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MoveType() {
    }

    /**
     * Creates or finds a MoveType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MoveType.
     */
    @JsonCreator
    public static MoveType fromString(String name) {
        return fromString(name, MoveType.class);
    }

    /**
     * Gets known MoveType values.
     *
     * @return known MoveType values.
     */
    public static Collection<MoveType> values() {
        return values(MoveType.class);
    }
}
