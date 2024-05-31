// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for OracleSubscriptions Delete.
 */
public final class OracleSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/oracleSubscriptions_delete.json
     */
    /**
     * Sample code: Delete Oracle Subscription.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        deleteOracleSubscription(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.oracleSubscriptions().delete(com.azure.core.util.Context.NONE);
    }
}
