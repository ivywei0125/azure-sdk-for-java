// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Status of the vault upgrade operation. */
public final class VaultUpgradeState extends ExpandableStringEnum<VaultUpgradeState> {
    /** Static value Unknown for VaultUpgradeState. */
    public static final VaultUpgradeState UNKNOWN = fromString("Unknown");

    /** Static value InProgress for VaultUpgradeState. */
    public static final VaultUpgradeState IN_PROGRESS = fromString("InProgress");

    /** Static value Upgraded for VaultUpgradeState. */
    public static final VaultUpgradeState UPGRADED = fromString("Upgraded");

    /** Static value Failed for VaultUpgradeState. */
    public static final VaultUpgradeState FAILED = fromString("Failed");

    /**
     * Creates or finds a VaultUpgradeState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VaultUpgradeState.
     */
    @JsonCreator
    public static VaultUpgradeState fromString(String name) {
        return fromString(name, VaultUpgradeState.class);
    }

    /**
     * Gets known VaultUpgradeState values.
     *
     * @return known VaultUpgradeState values.
     */
    public static Collection<VaultUpgradeState> values() {
        return values(VaultUpgradeState.class);
    }
}
