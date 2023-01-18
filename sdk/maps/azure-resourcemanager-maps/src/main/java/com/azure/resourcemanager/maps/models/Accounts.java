// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Accounts. */
public interface Accounts {
    /**
     * Delete a Maps Account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Delete a Maps Account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get a Maps Account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account along with {@link Response}.
     */
    Response<MapsAccount> getByResourceGroupWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Get a Maps Account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account.
     */
    MapsAccount getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Get all Maps Accounts in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Resource Group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MapsAccount> listByResourceGroup(String resourceGroupName);

    /**
     * Get all Maps Accounts in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Resource Group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MapsAccount> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get all Maps Accounts in a Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MapsAccount> list();

    /**
     * Get all Maps Accounts in a Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Maps Accounts in a Subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MapsAccount> list(Context context);

    /**
     * Get the keys to use with the Maps APIs. A key is used to authenticate and authorize access to the Maps REST APIs.
     * Only one key is needed at a time; two are given to provide seamless key regeneration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Maps APIs along with {@link Response}.
     */
    Response<MapsAccountKeys> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Get the keys to use with the Maps APIs. A key is used to authenticate and authorize access to the Maps REST APIs.
     * Only one key is needed at a time; two are given to provide seamless key regeneration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Maps APIs.
     */
    MapsAccountKeys listKeys(String resourceGroupName, String accountName);

    /**
     * Regenerate either the primary or secondary key for use with the Maps APIs. The old key will stop working
     * immediately.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of keys which can be used to access the Maps REST APIs along with {@link Response}.
     */
    Response<MapsAccountKeys> regenerateKeysWithResponse(
        String resourceGroupName, String accountName, MapsKeySpecification keySpecification, Context context);

    /**
     * Regenerate either the primary or secondary key for use with the Maps APIs. The old key will stop working
     * immediately.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the Maps Account.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the set of keys which can be used to access the Maps REST APIs.
     */
    MapsAccountKeys regenerateKeys(String resourceGroupName, String accountName, MapsKeySpecification keySpecification);

    /**
     * Get a Maps Account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account along with {@link Response}.
     */
    MapsAccount getById(String id);

    /**
     * Get a Maps Account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Maps Account along with {@link Response}.
     */
    Response<MapsAccount> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Maps Account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Maps Account.
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
     * Begins definition for a new MapsAccount resource.
     *
     * @param name resource name.
     * @return the first stage of the new MapsAccount definition.
     */
    MapsAccount.DefinitionStages.Blank define(String name);
}
