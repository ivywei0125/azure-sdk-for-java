// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Type of issue.
 */
public final class IssueType extends ExpandableStringEnum<IssueType> {
    /**
     * Static value Unknown for IssueType.
     */
    public static final IssueType UNKNOWN = fromString("Unknown");

    /**
     * Static value ConfigurationPropagationFailure for IssueType.
     */
    public static final IssueType CONFIGURATION_PROPAGATION_FAILURE = fromString("ConfigurationPropagationFailure");

    /**
     * Creates a new instance of IssueType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IssueType() {
    }

    /**
     * Creates or finds a IssueType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IssueType.
     */
    @JsonCreator
    public static IssueType fromString(String name) {
        return fromString(name, IssueType.class);
    }

    /**
     * Gets known IssueType values.
     *
     * @return known IssueType values.
     */
    public static Collection<IssueType> values() {
        return values(IssueType.class);
    }
}
