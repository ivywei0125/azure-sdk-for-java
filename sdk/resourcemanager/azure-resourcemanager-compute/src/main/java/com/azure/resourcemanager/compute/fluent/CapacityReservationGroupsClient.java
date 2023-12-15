// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.CapacityReservationGroupInner;
import com.azure.resourcemanager.compute.models.CapacityReservationGroupInstanceViewTypes;
import com.azure.resourcemanager.compute.models.CapacityReservationGroupUpdate;
import com.azure.resourcemanager.compute.models.ExpandTypesForGetCapacityReservationGroups;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CapacityReservationGroupsClient.
 */
public interface CapacityReservationGroupsClient extends InnerSupportsGet<CapacityReservationGroupInner>,
    InnerSupportsListing<CapacityReservationGroupInner>, InnerSupportsDelete<Void> {
    /**
     * The operation to create or update a capacity reservation group. When updating a capacity reservation group, only
     * tags and sharing profile may be modified. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Create capacity reservation Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CapacityReservationGroupInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupInner parameters);

    /**
     * The operation to create or update a capacity reservation group. When updating a capacity reservation group, only
     * tags and sharing profile may be modified. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Create capacity reservation Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CapacityReservationGroupInner> createOrUpdateAsync(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupInner parameters);

    /**
     * The operation to create or update a capacity reservation group. When updating a capacity reservation group, only
     * tags and sharing profile may be modified. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Create capacity reservation Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapacityReservationGroupInner> createOrUpdateWithResponse(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupInner parameters, Context context);

    /**
     * The operation to create or update a capacity reservation group. When updating a capacity reservation group, only
     * tags and sharing profile may be modified. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Create capacity reservation Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationGroupInner createOrUpdate(String resourceGroupName, String capacityReservationGroupName,
        CapacityReservationGroupInner parameters);

    /**
     * The operation to update a capacity reservation group. When updating a capacity reservation group, only tags and
     * sharing profile may be modified.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Update capacity reservation Group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CapacityReservationGroupInner>> updateWithResponseAsync(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupUpdate parameters);

    /**
     * The operation to update a capacity reservation group. When updating a capacity reservation group, only tags and
     * sharing profile may be modified.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Update capacity reservation Group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CapacityReservationGroupInner> updateAsync(String resourceGroupName, String capacityReservationGroupName,
        CapacityReservationGroupUpdate parameters);

    /**
     * The operation to update a capacity reservation group. When updating a capacity reservation group, only tags and
     * sharing profile may be modified.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Update capacity reservation Group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapacityReservationGroupInner> updateWithResponse(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupUpdate parameters, Context context);

    /**
     * The operation to update a capacity reservation group. When updating a capacity reservation group, only tags and
     * sharing profile may be modified.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param parameters Parameters supplied to the Update capacity reservation Group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationGroupInner update(String resourceGroupName, String capacityReservationGroupName,
        CapacityReservationGroupUpdate parameters);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String capacityReservationGroupName);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String capacityReservationGroupName);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String capacityReservationGroupName, Context context);

    /**
     * The operation to delete a capacity reservation group. This operation is allowed only if all the associated
     * resources are disassociated from the reservation group and all capacity reservations under the reservation group
     * have also been deleted. Please refer to https://aka.ms/CapacityReservation for more details.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String capacityReservationGroupName);

    /**
     * The operation that retrieves information about a capacity reservation group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     * views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime
     * properties of a capacity reservation that is managed by the platform and can change outside of control plane
     * operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CapacityReservationGroupInner>> getByResourceGroupWithResponseAsync(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupInstanceViewTypes expand);

    /**
     * The operation that retrieves information about a capacity reservation group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CapacityReservationGroupInner> getByResourceGroupAsync(String resourceGroupName,
        String capacityReservationGroupName);

    /**
     * The operation that retrieves information about a capacity reservation group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     * views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime
     * properties of a capacity reservation that is managed by the platform and can change outside of control plane
     * operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapacityReservationGroupInner> getByResourceGroupWithResponse(String resourceGroupName,
        String capacityReservationGroupName, CapacityReservationGroupInstanceViewTypes expand, Context context);

    /**
     * The operation that retrieves information about a capacity reservation group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation group that the capacity reservations should be
     * assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationGroupInner getByResourceGroup(String resourceGroupName, String capacityReservationGroupName);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     * Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group
     * in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CapacityReservationGroupInner> listByResourceGroupAsync(String resourceGroupName,
        ExpandTypesForGetCapacityReservationGroups expand);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CapacityReservationGroupInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the capacity reservation groups in the specified resource group. Use the nextLink property in the
     * response to get the next page of capacity reservation groups.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     * Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group
     * in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationGroupInner> listByResourceGroup(String resourceGroupName,
        ExpandTypesForGetCapacityReservationGroups expand, Context context);

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     * 
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     * Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group
     * in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CapacityReservationGroupInner> listAsync(ExpandTypesForGetCapacityReservationGroups expand);

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     * 
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CapacityReservationGroupInner> listAsync();

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     * 
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationGroupInner> list();

    /**
     * Lists all of the capacity reservation groups in the subscription. Use the nextLink property in the response to
     * get the next page of capacity reservation groups.
     * 
     * @param expand The expand expression to apply on the operation. Based on the expand param(s) specified we return
     * Virtual Machine or ScaleSet VM Instance or both resource Ids which are associated to capacity reservation group
     * in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List capacity reservation group with resource group response as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationGroupInner> list(ExpandTypesForGetCapacityReservationGroups expand,
        Context context);
}
