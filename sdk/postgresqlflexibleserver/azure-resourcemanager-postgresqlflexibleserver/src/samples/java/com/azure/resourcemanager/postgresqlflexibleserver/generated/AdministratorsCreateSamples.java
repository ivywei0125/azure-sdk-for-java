// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;

/** Samples for Administrators Create. */
public final class AdministratorsCreateSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-12-01/examples/AdministratorAdd.json
     */
    /**
     * Sample code: Adds an Active DIrectory Administrator for the server.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void addsAnActiveDIrectoryAdministratorForTheServer(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager
            .administrators()
            .define("oooooooo-oooo-oooo-oooo-oooooooooooo")
            .withExistingFlexibleServer("testrg", "testserver")
            .withPrincipalType(PrincipalType.USER)
            .withPrincipalName("testuser1@microsoft.com")
            .withTenantId("tttttttt-tttt-tttt-tttt-tttttttttttt")
            .create();
    }
}