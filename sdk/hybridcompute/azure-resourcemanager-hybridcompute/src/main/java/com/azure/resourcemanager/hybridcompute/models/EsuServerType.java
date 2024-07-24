// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The server types for Esu.
 */
public final class EsuServerType extends ExpandableStringEnum<EsuServerType> {
    /**
     * Static value Standard for EsuServerType.
     */
    public static final EsuServerType STANDARD = fromString("Standard");

    /**
     * Static value Datacenter for EsuServerType.
     */
    public static final EsuServerType DATACENTER = fromString("Datacenter");

    /**
     * Creates a new instance of EsuServerType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EsuServerType() {
    }

    /**
     * Creates or finds a EsuServerType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EsuServerType.
     */
    public static EsuServerType fromString(String name) {
        return fromString(name, EsuServerType.class);
    }

    /**
     * Gets known EsuServerType values.
     * 
     * @return known EsuServerType values.
     */
    public static Collection<EsuServerType> values() {
        return values(EsuServerType.class);
    }
}
