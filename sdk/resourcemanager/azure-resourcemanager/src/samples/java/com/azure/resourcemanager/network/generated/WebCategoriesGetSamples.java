// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for WebCategories Get.
 */
public final class WebCategoriesGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/AzureWebCategoryGet.json
     */
    /**
     * Sample code: Get Azure Web Category by name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAzureWebCategoryByName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getWebCategories().getWithResponse("Arts", null,
            com.azure.core.util.Context.NONE);
    }
}
