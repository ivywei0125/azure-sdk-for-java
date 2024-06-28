// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Addon provisioning state.
 */
public final class AddonProvisioningState extends ExpandableStringEnum<AddonProvisioningState> {
    /**
     * Static value Succeeded for AddonProvisioningState.
     */
    public static final AddonProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for AddonProvisioningState.
     */
    public static final AddonProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for AddonProvisioningState.
     */
    public static final AddonProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Cancelled for AddonProvisioningState.
     */
    public static final AddonProvisioningState CANCELLED = fromString("Cancelled");

    /**
     * Static value Building for AddonProvisioningState.
     */
    public static final AddonProvisioningState BUILDING = fromString("Building");

    /**
     * Static value Deleting for AddonProvisioningState.
     */
    public static final AddonProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Updating for AddonProvisioningState.
     */
    public static final AddonProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of AddonProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AddonProvisioningState() {
    }

    /**
     * Creates or finds a AddonProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AddonProvisioningState.
     */
    public static AddonProvisioningState fromString(String name) {
        return fromString(name, AddonProvisioningState.class);
    }

    /**
     * Gets known AddonProvisioningState values.
     * 
     * @return known AddonProvisioningState values.
     */
    public static Collection<AddonProvisioningState> values() {
        return values(AddonProvisioningState.class);
    }
}
