// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * CloudVmClusterLifecycleState enum.
 */
public final class CloudVmClusterLifecycleState extends ExpandableStringEnum<CloudVmClusterLifecycleState> {
    /**
     * Static value Provisioning for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState PROVISIONING = fromString("Provisioning");

    /**
     * Static value Available for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState AVAILABLE = fromString("Available");

    /**
     * Static value Updating for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState UPDATING = fromString("Updating");

    /**
     * Static value Terminating for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState TERMINATING = fromString("Terminating");

    /**
     * Static value Terminated for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState TERMINATED = fromString("Terminated");

    /**
     * Static value MaintenanceInProgress for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState MAINTENANCE_IN_PROGRESS = fromString("MaintenanceInProgress");

    /**
     * Static value Failed for CloudVmClusterLifecycleState.
     */
    public static final CloudVmClusterLifecycleState FAILED = fromString("Failed");

    /**
     * Creates a new instance of CloudVmClusterLifecycleState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CloudVmClusterLifecycleState() {
    }

    /**
     * Creates or finds a CloudVmClusterLifecycleState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CloudVmClusterLifecycleState.
     */
    @JsonCreator
    public static CloudVmClusterLifecycleState fromString(String name) {
        return fromString(name, CloudVmClusterLifecycleState.class);
    }

    /**
     * Gets known CloudVmClusterLifecycleState values.
     * 
     * @return known CloudVmClusterLifecycleState values.
     */
    public static Collection<CloudVmClusterLifecycleState> values() {
        return values(CloudVmClusterLifecycleState.class);
    }
}
