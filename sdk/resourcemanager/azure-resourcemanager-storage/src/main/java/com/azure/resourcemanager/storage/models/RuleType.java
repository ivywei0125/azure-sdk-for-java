// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The valid value is Lifecycle. */
public final class RuleType extends ExpandableStringEnum<RuleType> {
    /** Static value Lifecycle for RuleType. */
    public static final RuleType LIFECYCLE = fromString("Lifecycle");

    /**
     * Creates a new instance of RuleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleType() {
    }

    /**
     * Creates or finds a RuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuleType.
     */
    @JsonCreator
    public static RuleType fromString(String name) {
        return fromString(name, RuleType.class);
    }

    /**
     * Gets known RuleType values.
     *
     * @return known RuleType values.
     */
    public static Collection<RuleType> values() {
        return values(RuleType.class);
    }
}
