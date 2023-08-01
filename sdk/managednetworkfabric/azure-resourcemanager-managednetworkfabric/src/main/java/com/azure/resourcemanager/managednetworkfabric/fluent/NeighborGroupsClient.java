// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NeighborGroupInner;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupPatch;

/** An instance of this class provides access to all the operations defined in NeighborGroupsClient. */
public interface NeighborGroupsClient {
    /**
     * Creates the Neighbor Group.
     *
     * <p>Implements the Neighbor Group PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NeighborGroupInner>, NeighborGroupInner> beginCreate(
        String resourceGroupName, String neighborGroupName, NeighborGroupInner body);

    /**
     * Creates the Neighbor Group.
     *
     * <p>Implements the Neighbor Group PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NeighborGroupInner>, NeighborGroupInner> beginCreate(
        String resourceGroupName, String neighborGroupName, NeighborGroupInner body, Context context);

    /**
     * Creates the Neighbor Group.
     *
     * <p>Implements the Neighbor Group PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NeighborGroupInner create(String resourceGroupName, String neighborGroupName, NeighborGroupInner body);

    /**
     * Creates the Neighbor Group.
     *
     * <p>Implements the Neighbor Group PUT method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NeighborGroupInner create(
        String resourceGroupName, String neighborGroupName, NeighborGroupInner body, Context context);

    /**
     * Retrieves details of neighbor Group using GET method.
     *
     * <p>Gets the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Neighbor Group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NeighborGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String neighborGroupName, Context context);

    /**
     * Retrieves details of neighbor Group using GET method.
     *
     * <p>Gets the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NeighborGroupInner getByResourceGroup(String resourceGroupName, String neighborGroupName);

    /**
     * API to update certain properties of the Neighbor Group Resources.
     *
     * <p>Updates the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Neighbor Group properties to update. Only annotations are supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NeighborGroupInner>, NeighborGroupInner> beginUpdate(
        String resourceGroupName, String neighborGroupName, NeighborGroupPatch body);

    /**
     * API to update certain properties of the Neighbor Group Resources.
     *
     * <p>Updates the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Neighbor Group properties to update. Only annotations are supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NeighborGroupInner>, NeighborGroupInner> beginUpdate(
        String resourceGroupName, String neighborGroupName, NeighborGroupPatch body, Context context);

    /**
     * API to update certain properties of the Neighbor Group Resources.
     *
     * <p>Updates the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Neighbor Group properties to update. Only annotations are supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NeighborGroupInner update(String resourceGroupName, String neighborGroupName, NeighborGroupPatch body);

    /**
     * API to update certain properties of the Neighbor Group Resources.
     *
     * <p>Updates the Neighbor Group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param body Neighbor Group properties to update. Only annotations are supported.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the Neighbor Group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NeighborGroupInner update(
        String resourceGroupName, String neighborGroupName, NeighborGroupPatch body, Context context);

    /**
     * Deletes a Neighbor Group.
     *
     * <p>Implements Neighbor Group DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String neighborGroupName);

    /**
     * Deletes a Neighbor Group.
     *
     * <p>Implements Neighbor Group DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String neighborGroupName, Context context);

    /**
     * Deletes a Neighbor Group.
     *
     * <p>Implements Neighbor Group DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String neighborGroupName);

    /**
     * Deletes a Neighbor Group.
     *
     * <p>Implements Neighbor Group DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param neighborGroupName Name of the Neighbor Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String neighborGroupName, Context context);

    /**
     * List Neighbor Groups by resource group.
     *
     * <p>Displays NeighborGroups list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Neighbor Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NeighborGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Neighbor Groups by resource group.
     *
     * <p>Displays NeighborGroups list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Neighbor Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NeighborGroupInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List Neighbor Groups by subscription.
     *
     * <p>Displays NeighborGroups list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Neighbor Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NeighborGroupInner> list();

    /**
     * List Neighbor Groups by subscription.
     *
     * <p>Displays NeighborGroups list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Neighbor Group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NeighborGroupInner> list(Context context);
}
