// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.PlannedFailoverModelInner;

/** Resource collection API of ProtectedItems. */
public interface ProtectedItems {
    /**
     * Gets the protected item.
     *
     * <p>Gets the details of the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the protected item along with {@link Response}.
     */
    Response<ProtectedItemModel> getWithResponse(
        String resourceGroupName, String vaultName, String protectedItemName, Context context);

    /**
     * Gets the protected item.
     *
     * <p>Gets the details of the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the protected item.
     */
    ProtectedItemModel get(String resourceGroupName, String vaultName, String protectedItemName);

    /**
     * Deletes the protected item.
     *
     * <p>Removes the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vaultName, String protectedItemName);

    /**
     * Deletes the protected item.
     *
     * <p>Removes the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @param forceDelete A flag indicating whether to do force delete or not.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String vaultName, String protectedItemName, Boolean forceDelete, Context context);

    /**
     * Lists the protected items.
     *
     * <p>Gets the list of protected items in the given vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of protected items in the given vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProtectedItemModel> list(String resourceGroupName, String vaultName);

    /**
     * Lists the protected items.
     *
     * <p>Gets the list of protected items in the given vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of protected items in the given vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ProtectedItemModel> list(String resourceGroupName, String vaultName, Context context);

    /**
     * Performs planned failover.
     *
     * <p>Performs the planned failover on the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned failover model.
     */
    PlannedFailoverModel plannedFailover(String resourceGroupName, String vaultName, String protectedItemName);

    /**
     * Performs planned failover.
     *
     * <p>Performs the planned failover on the protected item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param protectedItemName The protected item name.
     * @param body Planned failover model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return planned failover model.
     */
    PlannedFailoverModel plannedFailover(
        String resourceGroupName,
        String vaultName,
        String protectedItemName,
        PlannedFailoverModelInner body,
        Context context);

    /**
     * Gets the protected item.
     *
     * <p>Gets the details of the protected item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the protected item along with {@link Response}.
     */
    ProtectedItemModel getById(String id);

    /**
     * Gets the protected item.
     *
     * <p>Gets the details of the protected item.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the protected item along with {@link Response}.
     */
    Response<ProtectedItemModel> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the protected item.
     *
     * <p>Removes the protected item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the protected item.
     *
     * <p>Removes the protected item.
     *
     * @param id the resource ID.
     * @param forceDelete A flag indicating whether to do force delete or not.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean forceDelete, Context context);

    /**
     * Begins definition for a new ProtectedItemModel resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProtectedItemModel definition.
     */
    ProtectedItemModel.DefinitionStages.Blank define(String name);
}
