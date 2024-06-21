// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AutonomousDatabases.
 */
public interface AutonomousDatabases {
    /**
     * List AutonomousDatabase resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabase> list();

    /**
     * List AutonomousDatabase resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabase> list(Context context);

    /**
     * List AutonomousDatabase resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabase> listByResourceGroup(String resourceGroupName);

    /**
     * List AutonomousDatabase resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AutonomousDatabase list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutonomousDatabase> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase along with {@link Response}.
     */
    Response<AutonomousDatabase> getByResourceGroupWithResponse(String resourceGroupName, String autonomousdatabasename,
        Context context);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase.
     */
    AutonomousDatabase getByResourceGroup(String resourceGroupName, String autonomousdatabasename);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String autonomousdatabasename);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String autonomousdatabasename, Context context);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase failover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform failover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase failover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body,
        Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model along with {@link Response}.
     */
    Response<AutonomousDatabaseWalletFile> generateWalletWithResponse(String resourceGroupName,
        String autonomousdatabasename, GenerateAutonomousDatabaseWalletDetails body, Context context);

    /**
     * Generate wallet action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database Wallet File resource model.
     */
    AutonomousDatabaseWalletFile generateWallet(String resourceGroupName, String autonomousdatabasename,
        GenerateAutonomousDatabaseWalletDetails body);

    /**
     * Restores an Autonomous Database based on the provided request parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase restore(String resourceGroupName, String autonomousdatabasename,
        RestoreAutonomousDatabaseDetails body);

    /**
     * Restores an Autonomous Database based on the provided request parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase restore(String resourceGroupName, String autonomousdatabasename,
        RestoreAutonomousDatabaseDetails body, Context context);

    /**
     * This operation shrinks the current allocated storage down to the current actual used data storage.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase shrink(String resourceGroupName, String autonomousdatabasename);

    /**
     * This operation shrinks the current allocated storage down to the current actual used data storage.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase shrink(String resourceGroupName, String autonomousdatabasename, Context context);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase switchover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body);

    /**
     * Perform switchover action on Autonomous Database.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param autonomousdatabasename The database name.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return autonomous Database resource model.
     */
    AutonomousDatabase switchover(String resourceGroupName, String autonomousdatabasename, PeerDbDetails body,
        Context context);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase along with {@link Response}.
     */
    AutonomousDatabase getById(String id);

    /**
     * Get a AutonomousDatabase.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AutonomousDatabase along with {@link Response}.
     */
    Response<AutonomousDatabase> getByIdWithResponse(String id, Context context);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a AutonomousDatabase.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AutonomousDatabase resource.
     * 
     * @param name resource name.
     * @return the first stage of the new AutonomousDatabase definition.
     */
    AutonomousDatabase.DefinitionStages.Blank define(String name);
}
