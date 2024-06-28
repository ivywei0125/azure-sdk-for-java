// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Workload Network DNS Service provisioning state.
 */
public final class WorkloadNetworkDnsServiceProvisioningState
    extends ExpandableStringEnum<WorkloadNetworkDnsServiceProvisioningState> {
    /**
     * Static value Succeeded for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Building for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState BUILDING = fromString("Building");

    /**
     * Static value Deleting for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Updating for WorkloadNetworkDnsServiceProvisioningState.
     */
    public static final WorkloadNetworkDnsServiceProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of WorkloadNetworkDnsServiceProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WorkloadNetworkDnsServiceProvisioningState() {
    }

    /**
     * Creates or finds a WorkloadNetworkDnsServiceProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WorkloadNetworkDnsServiceProvisioningState.
     */
    public static WorkloadNetworkDnsServiceProvisioningState fromString(String name) {
        return fromString(name, WorkloadNetworkDnsServiceProvisioningState.class);
    }

    /**
     * Gets known WorkloadNetworkDnsServiceProvisioningState values.
     * 
     * @return known WorkloadNetworkDnsServiceProvisioningState values.
     */
    public static Collection<WorkloadNetworkDnsServiceProvisioningState> values() {
        return values(WorkloadNetworkDnsServiceProvisioningState.class);
    }
}
