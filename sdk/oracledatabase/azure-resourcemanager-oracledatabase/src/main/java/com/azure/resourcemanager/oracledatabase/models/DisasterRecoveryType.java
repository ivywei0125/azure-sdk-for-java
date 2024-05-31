// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * DisasterRecoveryType enum.
 */
public final class DisasterRecoveryType extends ExpandableStringEnum<DisasterRecoveryType> {
    /**
     * Static value Adg for DisasterRecoveryType.
     */
    public static final DisasterRecoveryType ADG = fromString("Adg");

    /**
     * Static value BackupBased for DisasterRecoveryType.
     */
    public static final DisasterRecoveryType BACKUP_BASED = fromString("BackupBased");

    /**
     * Creates a new instance of DisasterRecoveryType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DisasterRecoveryType() {
    }

    /**
     * Creates or finds a DisasterRecoveryType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DisasterRecoveryType.
     */
    @JsonCreator
    public static DisasterRecoveryType fromString(String name) {
        return fromString(name, DisasterRecoveryType.class);
    }

    /**
     * Gets known DisasterRecoveryType values.
     * 
     * @return known DisasterRecoveryType values.
     */
    public static Collection<DisasterRecoveryType> values() {
        return values(DisasterRecoveryType.class);
    }
}
