// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

/**
 * Samples for InventoryItems Delete.
 */
public final class InventoryItemsDeleteSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * InventoryItems_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: InventoryItems_Delete_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void inventoryItemsDeleteMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.inventoryItems()
            .deleteWithResponse("rgscvmm", "b", "EcECadfd-Eaaa-e5Ce-ebdA-badeEd3c6af1",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * InventoryItems_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: InventoryItems_Delete_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void inventoryItemsDeleteMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.inventoryItems()
            .deleteWithResponse("rgscvmm", "_", "cDBcbae6-BC3d-52fe-CedC-7eFeaBFabb82",
                com.azure.core.util.Context.NONE);
    }
}
