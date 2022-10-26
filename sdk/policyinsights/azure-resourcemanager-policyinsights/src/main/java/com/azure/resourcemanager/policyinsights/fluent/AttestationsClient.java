// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.policyinsights.fluent.models.AttestationInner;

/** An instance of this class provides access to all the operations defined in AttestationsClient. */
public interface AttestationsClient {
    /**
     * Gets all attestations for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for the subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> list();

    /**
     * Gets all attestations for the subscription.
     *
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for the subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> list(Integer top, String filter, Context context);

    /**
     * Creates or updates an attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtSubscription(
        String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtSubscription(
        String attestationName, AttestationInner parameters, Context context);

    /**
     * Creates or updates an attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtSubscription(String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtSubscription(String attestationName, AttestationInner parameters, Context context);

    /**
     * Gets an existing attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at subscription scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationInner> getAtSubscriptionWithResponse(String attestationName, Context context);

    /**
     * Gets an existing attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at subscription scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner getAtSubscription(String attestationName);

    /**
     * Deletes an existing attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAtSubscriptionWithResponse(String attestationName, Context context);

    /**
     * Deletes an existing attestation at subscription scope.
     *
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAtSubscription(String attestationName);

    /**
     * Gets all attestations for the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for the resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all attestations for the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for the resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> listByResourceGroup(
        String resourceGroupName, Integer top, String filter, Context context);

    /**
     * Creates or updates an attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtResourceGroup(
        String resourceGroupName, String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtResourceGroup(
        String resourceGroupName, String attestationName, AttestationInner parameters, Context context);

    /**
     * Creates or updates an attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtResourceGroup(
        String resourceGroupName, String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtResourceGroup(
        String resourceGroupName, String attestationName, AttestationInner parameters, Context context);

    /**
     * Gets an existing attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at resource group scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationInner> getByResourceGroupWithResponse(
        String resourceGroupName, String attestationName, Context context);

    /**
     * Gets an existing attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at resource group scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner getByResourceGroup(String resourceGroupName, String attestationName);

    /**
     * Deletes an existing attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String attestationName, Context context);

    /**
     * Deletes an existing attestation at resource group scope.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String attestationName);

    /**
     * Gets all attestations for a resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for a resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> listForResource(String resourceId);

    /**
     * Gets all attestations for a resource.
     *
     * @param resourceId Resource ID.
     * @param top Maximum number of records to return.
     * @param filter OData filter expression.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all attestations for a resource as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttestationInner> listForResource(String resourceId, Integer top, String filter, Context context);

    /**
     * Creates or updates an attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtResource(
        String resourceId, String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttestationInner>, AttestationInner> beginCreateOrUpdateAtResource(
        String resourceId, String attestationName, AttestationInner parameters, Context context);

    /**
     * Creates or updates an attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtResource(String resourceId, String attestationName, AttestationInner parameters);

    /**
     * Creates or updates an attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param parameters The attestation parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an attestation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner createOrUpdateAtResource(
        String resourceId, String attestationName, AttestationInner parameters, Context context);

    /**
     * Gets an existing attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at resource scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationInner> getAtResourceWithResponse(String resourceId, String attestationName, Context context);

    /**
     * Gets an existing attestation at resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing attestation at resource scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationInner getAtResource(String resourceId, String attestationName);

    /**
     * Deletes an existing attestation at individual resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAtResourceWithResponse(String resourceId, String attestationName, Context context);

    /**
     * Deletes an existing attestation at individual resource scope.
     *
     * @param resourceId Resource ID.
     * @param attestationName The name of the attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAtResource(String resourceId, String attestationName);
}
