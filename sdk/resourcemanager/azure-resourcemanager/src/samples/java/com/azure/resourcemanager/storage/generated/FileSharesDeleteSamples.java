// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for FileShares Delete.
 */
public final class FileSharesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2023-05-01/examples/FileSharesDelete.json
     */
    /**
     * Sample code: DeleteShares.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteShares(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getFileShares()
            .deleteWithResponse("res4079", "sto4506", "share9689", null, null, com.azure.core.util.Context.NONE);
    }
}
