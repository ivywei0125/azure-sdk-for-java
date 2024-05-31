// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for VirtualNetworkAddresses ListByCloudVmCluster.
 */
public final class VirtualNetworkAddressesListByCloudVmClusterSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_listByParent.json
     */
    /**
     * Sample code: List Virtual Network Addresses by VM Cluster.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        listVirtualNetworkAddressesByVMCluster(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.virtualNetworkAddresses().listByCloudVmCluster("rg000", "cluster1", com.azure.core.util.Context.NONE);
    }
}
