// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AttachedNetworks. */
public interface AttachedNetworks {
    /**
     * Lists the attached NetworkConnections for a Project.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the Attached Networks list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AttachedNetworkConnection> listByProject(String resourceGroupName, String projectName);

    /**
     * Lists the attached NetworkConnections for a Project.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the Attached Networks list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AttachedNetworkConnection> listByProject(
        String resourceGroupName, String projectName, Integer top, Context context);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection along with {@link Response}.
     */
    Response<AttachedNetworkConnection> getByProjectWithResponse(
        String resourceGroupName, String projectName, String attachedNetworkConnectionName, Context context);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param projectName The name of the project.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection.
     */
    AttachedNetworkConnection getByProject(
        String resourceGroupName, String projectName, String attachedNetworkConnectionName);

    /**
     * Lists the attached NetworkConnections for a DevCenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the Attached Networks list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AttachedNetworkConnection> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists the attached NetworkConnections for a DevCenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the Attached Networks list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AttachedNetworkConnection> listByDevCenter(
        String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection along with {@link Response}.
     */
    Response<AttachedNetworkConnection> getByDevCenterWithResponse(
        String resourceGroupName, String devCenterName, String attachedNetworkConnectionName, Context context);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection.
     */
    AttachedNetworkConnection getByDevCenter(
        String resourceGroupName, String devCenterName, String attachedNetworkConnectionName);

    /**
     * Un-attach a NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String attachedNetworkConnectionName);

    /**
     * Un-attach a NetworkConnection.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param attachedNetworkConnectionName The name of the attached NetworkConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String devCenterName, String attachedNetworkConnectionName, Context context);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection along with {@link Response}.
     */
    AttachedNetworkConnection getById(String id);

    /**
     * Gets an attached NetworkConnection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attached NetworkConnection along with {@link Response}.
     */
    Response<AttachedNetworkConnection> getByIdWithResponse(String id, Context context);

    /**
     * Un-attach a NetworkConnection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Un-attach a NetworkConnection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AttachedNetworkConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new AttachedNetworkConnection definition.
     */
    AttachedNetworkConnection.DefinitionStages.Blank define(String name);
}
