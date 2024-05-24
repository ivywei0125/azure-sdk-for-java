// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/**
 * Samples for ScheduledEvent Acknowledge.
 */
public final class ScheduledEventAcknowledgeSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/preview/2023-10-01-preview/examples/ScheduledEvents_Acknowledge.json
     */
    /**
     * Sample code: ScheduledEvents_Acknowledge.
     * 
     * @param manager Entry point to MaintenanceManager.
     */
    public static void scheduledEventsAcknowledge(com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager.scheduledEvents()
            .acknowledgeWithResponse("examplerg", "virtualMachines", "configuration1",
                "ad6d85cf-2c9e-4eec-9a1e-af3213cc0486", com.azure.core.util.Context.NONE);
    }
}
