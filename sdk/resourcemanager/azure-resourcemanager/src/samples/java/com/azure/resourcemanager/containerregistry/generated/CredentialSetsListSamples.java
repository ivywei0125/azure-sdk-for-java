// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for CredentialSets List. */
public final class CredentialSetsListSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/CredentialSetList.json
     */
    /**
     * Sample code: CredentialSetList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void credentialSetList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getCredentialSets()
            .list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
