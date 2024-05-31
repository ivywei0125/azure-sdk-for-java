// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DbServers.
 */
public interface DbServers {
    /**
     * List DbServer resources by CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DbServer list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DbServer> listByCloudExadataInfrastructure(String resourceGroupName,
        String cloudexadatainfrastructurename);

    /**
     * List DbServer resources by CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DbServer list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DbServer> listByCloudExadataInfrastructure(String resourceGroupName,
        String cloudexadatainfrastructurename, Context context);

    /**
     * Get a DbServer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param dbserverocid DbServer OCID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DbServer along with {@link Response}.
     */
    Response<DbServer> getWithResponse(String resourceGroupName, String cloudexadatainfrastructurename,
        String dbserverocid, Context context);

    /**
     * Get a DbServer.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param dbserverocid DbServer OCID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DbServer.
     */
    DbServer get(String resourceGroupName, String cloudexadatainfrastructurename, String dbserverocid);
}
