// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for DatabaseAccounts ListConnectionStrings.
 */
public final class DatabaseAccountsListConnectionStringsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/CosmosDBDatabaseAccountListConnectionStrings.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountListConnectionStrings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBDatabaseAccountListConnectionStrings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .listConnectionStringsWithResponse("rg1", "ddb1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/CosmosDBDatabaseAccountListConnectionStringsMongo.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountListConnectionStringsMongo.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBDatabaseAccountListConnectionStringsMongo(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .listConnectionStringsWithResponse("rg1", "mongo-ddb1", com.azure.core.util.Context.NONE);
    }
}
