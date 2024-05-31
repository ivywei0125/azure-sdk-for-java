// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * ProtocolType enum.
 */
public final class ProtocolType extends ExpandableStringEnum<ProtocolType> {
    /**
     * Static value TCP for ProtocolType.
     */
    public static final ProtocolType TCP = fromString("TCP");

    /**
     * Static value TCPS for ProtocolType.
     */
    public static final ProtocolType TCPS = fromString("TCPS");

    /**
     * Creates a new instance of ProtocolType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProtocolType() {
    }

    /**
     * Creates or finds a ProtocolType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProtocolType.
     */
    @JsonCreator
    public static ProtocolType fromString(String name) {
        return fromString(name, ProtocolType.class);
    }

    /**
     * Gets known ProtocolType values.
     * 
     * @return known ProtocolType values.
     */
    public static Collection<ProtocolType> values() {
        return values(ProtocolType.class);
    }
}
