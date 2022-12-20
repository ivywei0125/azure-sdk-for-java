// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Vaults. */
public interface Vaults {
    /**
     * Fetches all the resources of the specified type in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a list of Vaults as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Vault> list();

    /**
     * Fetches all the resources of the specified type in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a list of Vaults as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Vault> list(Context context);

    /**
     * Retrieve a list of Vaults.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a list of Vaults as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Vault> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieve a list of Vaults.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a list of Vaults as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Vault> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the Vault details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Vault details along with {@link Response}.
     */
    Response<Vault> getByResourceGroupWithResponse(String resourceGroupName, String vaultName, Context context);

    /**
     * Get the Vault details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Vault details.
     */
    Vault getByResourceGroup(String resourceGroupName, String vaultName);

    /**
     * Deletes a vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String vaultName, Context context);

    /**
     * Deletes a vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String vaultName);

    /**
     * Get the Vault details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Vault details along with {@link Response}.
     */
    Vault getById(String id);

    /**
     * Get the Vault details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Vault details along with {@link Response}.
     */
    Response<Vault> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a vault.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a vault.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Vault resource.
     *
     * @param name resource name.
     * @return the first stage of the new Vault definition.
     */
    Vault.DefinitionStages.Blank define(String name);
}
