// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of troubleshooter provisioning.
 */
public final class TroubleshooterProvisioningState extends ExpandableStringEnum<TroubleshooterProvisioningState> {
    /**
     * Static value Succeeded for TroubleshooterProvisioningState.
     */
    public static final TroubleshooterProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for TroubleshooterProvisioningState.
     */
    public static final TroubleshooterProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for TroubleshooterProvisioningState.
     */
    public static final TroubleshooterProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Running for TroubleshooterProvisioningState.
     */
    public static final TroubleshooterProvisioningState RUNNING = fromString("Running");

    /**
     * Static value AutoContinue for TroubleshooterProvisioningState.
     */
    public static final TroubleshooterProvisioningState AUTO_CONTINUE = fromString("AutoContinue");

    /**
     * Creates a new instance of TroubleshooterProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TroubleshooterProvisioningState() {
    }

    /**
     * Creates or finds a TroubleshooterProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TroubleshooterProvisioningState.
     */
    public static TroubleshooterProvisioningState fromString(String name) {
        return fromString(name, TroubleshooterProvisioningState.class);
    }

    /**
     * Gets known TroubleshooterProvisioningState values.
     * 
     * @return known TroubleshooterProvisioningState values.
     */
    public static Collection<TroubleshooterProvisioningState> values() {
        return values(TroubleshooterProvisioningState.class);
    }
}
