// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CloudExadataInfrastructures.
 */
public interface CloudExadataInfrastructures {
    /**
     * List CloudExadataInfrastructure resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudExadataInfrastructure list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CloudExadataInfrastructure> list();

    /**
     * List CloudExadataInfrastructure resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudExadataInfrastructure list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CloudExadataInfrastructure> list(Context context);

    /**
     * List CloudExadataInfrastructure resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudExadataInfrastructure list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CloudExadataInfrastructure> listByResourceGroup(String resourceGroupName);

    /**
     * List CloudExadataInfrastructure resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CloudExadataInfrastructure list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<CloudExadataInfrastructure> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudExadataInfrastructure along with {@link Response}.
     */
    Response<CloudExadataInfrastructure> getByResourceGroupWithResponse(String resourceGroupName,
        String cloudexadatainfrastructurename, Context context);

    /**
     * Get a CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudExadataInfrastructure.
     */
    CloudExadataInfrastructure getByResourceGroup(String resourceGroupName, String cloudexadatainfrastructurename);

    /**
     * Delete a CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String cloudexadatainfrastructurename);

    /**
     * Delete a CloudExadataInfrastructure.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudexadatainfrastructurename, Context context);

    /**
     * Perform add storage capacity on exadata infra.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudExadataInfrastructure resource definition.
     */
    CloudExadataInfrastructure addStorageCapacity(String resourceGroupName, String cloudexadatainfrastructurename);

    /**
     * Perform add storage capacity on exadata infra.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudexadatainfrastructurename CloudExadataInfrastructure name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cloudExadataInfrastructure resource definition.
     */
    CloudExadataInfrastructure addStorageCapacity(String resourceGroupName, String cloudexadatainfrastructurename,
        Context context);

    /**
     * Get a CloudExadataInfrastructure.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudExadataInfrastructure along with {@link Response}.
     */
    CloudExadataInfrastructure getById(String id);

    /**
     * Get a CloudExadataInfrastructure.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CloudExadataInfrastructure along with {@link Response}.
     */
    Response<CloudExadataInfrastructure> getByIdWithResponse(String id, Context context);

    /**
     * Delete a CloudExadataInfrastructure.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a CloudExadataInfrastructure.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CloudExadataInfrastructure resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CloudExadataInfrastructure definition.
     */
    CloudExadataInfrastructure.DefinitionStages.Blank define(String name);
}
