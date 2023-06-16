// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutoBackupDaysOfWeek. */
public final class AutoBackupDaysOfWeek extends ExpandableStringEnum<AutoBackupDaysOfWeek> {
    /** Static value Monday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek MONDAY = fromString("Monday");

    /** Static value Tuesday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek THURSDAY = fromString("Thursday");

    /** Static value Friday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek FRIDAY = fromString("Friday");

    /** Static value Saturday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek SATURDAY = fromString("Saturday");

    /** Static value Sunday for AutoBackupDaysOfWeek. */
    public static final AutoBackupDaysOfWeek SUNDAY = fromString("Sunday");

    /**
     * Creates a new instance of AutoBackupDaysOfWeek value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoBackupDaysOfWeek() {
    }

    /**
     * Creates or finds a AutoBackupDaysOfWeek from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoBackupDaysOfWeek.
     */
    @JsonCreator
    public static AutoBackupDaysOfWeek fromString(String name) {
        return fromString(name, AutoBackupDaysOfWeek.class);
    }

    /**
     * Gets known AutoBackupDaysOfWeek values.
     *
     * @return known AutoBackupDaysOfWeek values.
     */
    public static Collection<AutoBackupDaysOfWeek> values() {
        return values(AutoBackupDaysOfWeek.class);
    }
}
