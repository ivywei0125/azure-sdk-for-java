// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current status of migration. */
public final class MigrationStatus extends ExpandableStringEnum<MigrationStatus> {
    /** Static value Invalid for MigrationStatus. */
    public static final MigrationStatus INVALID = fromString("Invalid");

    /** Static value SubmittedForConversion for MigrationStatus. */
    public static final MigrationStatus SUBMITTED_FOR_CONVERSION = fromString("SubmittedForConversion");

    /** Static value InProgress for MigrationStatus. */
    public static final MigrationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Complete for MigrationStatus. */
    public static final MigrationStatus COMPLETE = fromString("Complete");

    /** Static value Failed for MigrationStatus. */
    public static final MigrationStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of MigrationStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MigrationStatus() {
    }

    /**
     * Creates or finds a MigrationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationStatus.
     */
    @JsonCreator
    public static MigrationStatus fromString(String name) {
        return fromString(name, MigrationStatus.class);
    }

    /**
     * Gets known MigrationStatus values.
     *
     * @return known MigrationStatus values.
     */
    public static Collection<MigrationStatus> values() {
        return values(MigrationStatus.class);
    }
}
