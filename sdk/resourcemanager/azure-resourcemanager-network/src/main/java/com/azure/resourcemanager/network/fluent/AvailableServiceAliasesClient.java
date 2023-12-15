// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.AvailableServiceAliasInner;

/**
 * An instance of this class provides access to all the operations defined in AvailableServiceAliasesClient.
 */
public interface AvailableServiceAliasesClient {
    /**
     * Gets all available service aliases for this subscription in this region.
     * 
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this subscription in this region as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AvailableServiceAliasInner> listAsync(String location);

    /**
     * Gets all available service aliases for this subscription in this region.
     * 
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this subscription in this region as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableServiceAliasInner> list(String location);

    /**
     * Gets all available service aliases for this subscription in this region.
     * 
     * @param location The location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this subscription in this region as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableServiceAliasInner> list(String location, Context context);

    /**
     * Gets all available service aliases for this resource group in this region.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this resource group in this region as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AvailableServiceAliasInner> listByResourceGroupAsync(String resourceGroupName, String location);

    /**
     * Gets all available service aliases for this resource group in this region.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this resource group in this region as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableServiceAliasInner> listByResourceGroup(String resourceGroupName, String location);

    /**
     * Gets all available service aliases for this resource group in this region.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param location The location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available service aliases for this resource group in this region as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AvailableServiceAliasInner> listByResourceGroup(String resourceGroupName, String location,
        Context context);
}
