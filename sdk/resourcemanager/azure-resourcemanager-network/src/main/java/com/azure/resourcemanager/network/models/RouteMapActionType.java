// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Kind of actions which can be taken on a matched route. Add, Replace, Remove refer to parameters on the route, like
 * community or prefix.
 */
public final class RouteMapActionType extends ExpandableStringEnum<RouteMapActionType> {
    /**
     * Static value Unknown for RouteMapActionType.
     */
    public static final RouteMapActionType UNKNOWN = fromString("Unknown");

    /**
     * Static value Remove for RouteMapActionType.
     */
    public static final RouteMapActionType REMOVE = fromString("Remove");

    /**
     * Static value Add for RouteMapActionType.
     */
    public static final RouteMapActionType ADD = fromString("Add");

    /**
     * Static value Replace for RouteMapActionType.
     */
    public static final RouteMapActionType REPLACE = fromString("Replace");

    /**
     * Static value Drop for RouteMapActionType.
     */
    public static final RouteMapActionType DROP = fromString("Drop");

    /**
     * Creates a new instance of RouteMapActionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouteMapActionType() {
    }

    /**
     * Creates or finds a RouteMapActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RouteMapActionType.
     */
    @JsonCreator
    public static RouteMapActionType fromString(String name) {
        return fromString(name, RouteMapActionType.class);
    }

    /**
     * Gets known RouteMapActionType values.
     * 
     * @return known RouteMapActionType values.
     */
    public static Collection<RouteMapActionType> values() {
        return values(RouteMapActionType.class);
    }
}
