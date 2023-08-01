// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Expression type. */
public final class ExpressionType extends ExpandableStringEnum<ExpressionType> {
    /** Static value Expression for ExpressionType. */
    public static final ExpressionType EXPRESSION = fromString("Expression");

    /**
     * Creates a new instance of ExpressionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpressionType() {}

    /**
     * Creates or finds a ExpressionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressionType.
     */
    @JsonCreator
    public static ExpressionType fromString(String name) {
        return fromString(name, ExpressionType.class);
    }

    /**
     * Gets known ExpressionType values.
     *
     * @return known ExpressionType values.
     */
    public static Collection<ExpressionType> values() {
        return values(ExpressionType.class);
    }
}
