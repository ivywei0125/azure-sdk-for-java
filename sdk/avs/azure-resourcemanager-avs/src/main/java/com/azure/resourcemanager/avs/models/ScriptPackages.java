// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ScriptPackages.
 */
public interface ScriptPackages {
    /**
     * List ScriptPackage resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ScriptPackage list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ScriptPackage> list(String resourceGroupName, String privateCloudName);

    /**
     * List ScriptPackage resources by PrivateCloud.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ScriptPackage list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ScriptPackage> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a ScriptPackage.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScriptPackage along with {@link Response}.
     */
    Response<ScriptPackage> getWithResponse(String resourceGroupName, String privateCloudName, String scriptPackageName,
        Context context);

    /**
     * Get a ScriptPackage.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptPackageName Name of the script package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ScriptPackage.
     */
    ScriptPackage get(String resourceGroupName, String privateCloudName, String scriptPackageName);
}
