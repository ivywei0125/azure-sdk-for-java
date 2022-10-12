// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VirtualNetworksInner;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPatch;

/** An instance of this class provides access to all the operations defined in VirtualNetworksOperationsClient. */
public interface VirtualNetworksOperationsClient {
    /**
     * Gets the virtual network
     *
     * <p>Gets the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS virtual network along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworksInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworksName, Context context);

    /**
     * Gets the virtual network
     *
     * <p>Gets the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Hybrid AKS virtual network.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworksInner getByResourceGroup(String resourceGroupName, String virtualNetworksName);

    /**
     * Puts the virtual network
     *
     * <p>Puts the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworksInner>, VirtualNetworksInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksInner virtualNetworks);

    /**
     * Puts the virtual network
     *
     * <p>Puts the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworksInner>, VirtualNetworksInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksInner virtualNetworks, Context context);

    /**
     * Puts the virtual network
     *
     * <p>Puts the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworksInner createOrUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksInner virtualNetworks);

    /**
     * Puts the virtual network
     *
     * <p>Puts the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworksInner createOrUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksInner virtualNetworks, Context context);

    /**
     * Deletes the virtual network
     *
     * <p>Deletes the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String virtualNetworksName, Context context);

    /**
     * Deletes the virtual network
     *
     * <p>Deletes the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworksName);

    /**
     * Patches the virtual network
     *
     * <p>Patches the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworksInner>, VirtualNetworksInner> beginUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksPatch virtualNetworks);

    /**
     * Patches the virtual network
     *
     * <p>Patches the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualNetworksInner>, VirtualNetworksInner> beginUpdate(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksPatch virtualNetworks, Context context);

    /**
     * Patches the virtual network
     *
     * <p>Patches the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource patch definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworksInner update(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksPatch virtualNetworks);

    /**
     * Patches the virtual network
     *
     * <p>Patches the Hybrid AKS virtual network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param virtualNetworksName Parameter for the name of the virtual network.
     * @param virtualNetworks The virtualNetworks resource patch definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtualNetworks resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworksInner update(
        String resourceGroupName, String virtualNetworksName, VirtualNetworksPatch virtualNetworks, Context context);

    /**
     * List virtual networks by resource group
     *
     * <p>Lists the Hybrid AKS virtual networks by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworksInner> listByResourceGroup(String resourceGroupName);

    /**
     * List virtual networks by resource group
     *
     * <p>Lists the Hybrid AKS virtual networks by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworksInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List virtual networks by subscription
     *
     * <p>Lists the Hybrid AKS virtual networks by subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworksInner> list();

    /**
     * List virtual networks by subscription
     *
     * <p>Lists the Hybrid AKS virtual networks by subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworksInner> list(Context context);
}
