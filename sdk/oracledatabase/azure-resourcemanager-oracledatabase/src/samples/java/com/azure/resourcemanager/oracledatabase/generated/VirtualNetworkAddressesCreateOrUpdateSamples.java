// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.resourcemanager.oracledatabase.models.VirtualNetworkAddressProperties;

/**
 * Samples for VirtualNetworkAddresses CreateOrUpdate.
 */
public final class VirtualNetworkAddressesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/virtualNetworkAddresses_create.json
     */
    /**
     * Sample code: Create Virtual Network Address.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        createVirtualNetworkAddress(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.virtualNetworkAddresses()
            .define("hostname1")
            .withExistingCloudVmCluster("rg000", "cluster1")
            .withProperties(
                new VirtualNetworkAddressProperties().withIpAddress("192.168.0.1").withVmOcid("ocid1..aaaa"))
            .create();
    }
}
