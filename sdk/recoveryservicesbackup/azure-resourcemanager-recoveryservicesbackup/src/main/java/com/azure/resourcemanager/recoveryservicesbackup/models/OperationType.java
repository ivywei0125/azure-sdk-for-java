// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Re-Do Operation. */
public final class OperationType extends ExpandableStringEnum<OperationType> {
    /** Static value Invalid for OperationType. */
    public static final OperationType INVALID = fromString("Invalid");

    /** Static value Register for OperationType. */
    public static final OperationType REGISTER = fromString("Register");

    /** Static value Reregister for OperationType. */
    public static final OperationType REREGISTER = fromString("Reregister");

    /**
     * Creates or finds a OperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationType.
     */
    @JsonCreator
    public static OperationType fromString(String name) {
        return fromString(name, OperationType.class);
    }

    /**
     * Gets known OperationType values.
     *
     * @return known OperationType values.
     */
    public static Collection<OperationType> values() {
        return values(OperationType.class);
    }
}
