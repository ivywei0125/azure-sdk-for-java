// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of PrivateLinks.
 */
public interface PrivateLinks {
    /**
     * list private links on the given resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a PrivateLinkResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByMongoCluster(String resourceGroupName, String mongoClusterName);

    /**
     * list private links on the given resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a PrivateLinkResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listByMongoCluster(String resourceGroupName, String mongoClusterName,
        Context context);
}
