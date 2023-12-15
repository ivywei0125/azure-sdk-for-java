// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Big data pool reference type.
 */
public final class BigDataPoolReferenceType extends ExpandableStringEnum<BigDataPoolReferenceType> {
    /**
     * Static value BigDataPoolReference for BigDataPoolReferenceType.
     */
    public static final BigDataPoolReferenceType BIG_DATA_POOL_REFERENCE = fromString("BigDataPoolReference");

    /**
     * Creates a new instance of BigDataPoolReferenceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BigDataPoolReferenceType() {
    }

    /**
     * Creates or finds a BigDataPoolReferenceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BigDataPoolReferenceType.
     */
    @JsonCreator
    public static BigDataPoolReferenceType fromString(String name) {
        return fromString(name, BigDataPoolReferenceType.class);
    }

    /**
     * Gets known BigDataPoolReferenceType values.
     * 
     * @return known BigDataPoolReferenceType values.
     */
    public static Collection<BigDataPoolReferenceType> values() {
        return values(BigDataPoolReferenceType.class);
    }
}
