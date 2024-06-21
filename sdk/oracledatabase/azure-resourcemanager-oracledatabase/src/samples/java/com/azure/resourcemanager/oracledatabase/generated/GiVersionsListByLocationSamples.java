// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for GiVersions ListByLocation.
 */
public final class GiVersionsListByLocationSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/
     * giVersions_listByLocation.json
     */
    /**
     * Sample code: List GiVersions by location.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        listGiVersionsByLocation(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.giVersions().listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
