// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for CloudVmClusters GetByResourceGroup.
 */
public final class CloudVmClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/vmClusters_get.json
     */
    /**
     * Sample code: Get VM Cluster.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void getVMCluster(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.cloudVmClusters().getByResourceGroupWithResponse("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
