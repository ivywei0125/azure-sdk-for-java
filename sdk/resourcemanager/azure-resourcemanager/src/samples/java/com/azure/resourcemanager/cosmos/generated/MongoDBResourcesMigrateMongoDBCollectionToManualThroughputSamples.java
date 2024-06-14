// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources MigrateMongoDBCollectionToManualThroughput.
 */
public final class MongoDBResourcesMigrateMongoDBCollectionToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/CosmosDBMongoDBCollectionMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionMigrateToManualThroughput.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        cosmosDBMongoDBCollectionMigrateToManualThroughput(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .migrateMongoDBCollectionToManualThroughput("rg1", "ddb1", "databaseName", "collectionName",
                com.azure.core.util.Context.NONE);
    }
}
