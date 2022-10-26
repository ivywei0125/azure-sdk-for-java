// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates whether the Arc agents on the provisioned clusters be upgraded automatically to the latest version.
 * Defaults to Enabled.
 */
public final class AutoUpgradeOptions extends ExpandableStringEnum<AutoUpgradeOptions> {
    /** Static value Enabled for AutoUpgradeOptions. */
    public static final AutoUpgradeOptions ENABLED = fromString("Enabled");

    /** Static value Disabled for AutoUpgradeOptions. */
    public static final AutoUpgradeOptions DISABLED = fromString("Disabled");

    /**
     * Creates or finds a AutoUpgradeOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoUpgradeOptions.
     */
    @JsonCreator
    public static AutoUpgradeOptions fromString(String name) {
        return fromString(name, AutoUpgradeOptions.class);
    }

    /**
     * Gets known AutoUpgradeOptions values.
     *
     * @return known AutoUpgradeOptions values.
     */
    public static Collection<AutoUpgradeOptions> values() {
        return values(AutoUpgradeOptions.class);
    }
}
