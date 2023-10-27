// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

/** Samples for Accounts Delete. */
public final class AccountsDeleteSamples {
    /*
     * x-ms-original-file: specification/playwrighttesting/resource-manager/Microsoft.AzurePlaywrightService/preview/2023-10-01-preview/examples/Accounts_Delete.json
     */
    /**
     * Sample code: Accounts_Delete.
     *
     * @param manager Entry point to PlaywrightTestingManager.
     */
    public static void accountsDelete(com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager manager) {
        manager.accounts().delete("dummyrg", "myPlaywrightAccount", com.azure.core.util.Context.NONE);
    }
}
