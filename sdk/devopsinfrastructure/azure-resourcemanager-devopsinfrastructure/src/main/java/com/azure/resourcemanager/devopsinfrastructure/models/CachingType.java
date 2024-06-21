// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of caching in a data disk.
 */
public final class CachingType extends ExpandableStringEnum<CachingType> {
    /**
     * Static value None for CachingType.
     */
    public static final CachingType NONE = fromString("None");

    /**
     * Static value ReadOnly for CachingType.
     */
    public static final CachingType READ_ONLY = fromString("ReadOnly");

    /**
     * Static value ReadWrite for CachingType.
     */
    public static final CachingType READ_WRITE = fromString("ReadWrite");

    /**
     * Creates a new instance of CachingType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CachingType() {
    }

    /**
     * Creates or finds a CachingType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CachingType.
     */
    public static CachingType fromString(String name) {
        return fromString(name, CachingType.class);
    }

    /**
     * Gets known CachingType values.
     * 
     * @return known CachingType values.
     */
    public static Collection<CachingType> values() {
        return values(CachingType.class);
    }
}
