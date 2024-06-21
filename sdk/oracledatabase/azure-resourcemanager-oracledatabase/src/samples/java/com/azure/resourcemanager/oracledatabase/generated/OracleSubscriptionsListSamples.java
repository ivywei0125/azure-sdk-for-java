// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for OracleSubscriptions List.
 */
public final class OracleSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/
     * oracleSubscriptions_listBySubscription.json
     */
    /**
     * Sample code: List Oracle Subscriptions by subscription.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        listOracleSubscriptionsBySubscription(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.oracleSubscriptions().list(com.azure.core.util.Context.NONE);
    }
}
