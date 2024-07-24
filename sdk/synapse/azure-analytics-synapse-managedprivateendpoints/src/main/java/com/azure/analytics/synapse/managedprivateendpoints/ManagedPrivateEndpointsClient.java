// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.managedprivateendpoints;

import com.azure.analytics.synapse.managedprivateendpoints.implementation.ManagedPrivateEndpointsImpl;
import com.azure.analytics.synapse.managedprivateendpoints.models.ManagedPrivateEndpoint;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Initializes a new instance of the synchronous ManagedPrivateEndpointsClient type.
 */
@ServiceClient(builder = ManagedPrivateEndpointsClientBuilder.class)
public final class ManagedPrivateEndpointsClient {
    @Generated
    private final ManagedPrivateEndpointsImpl serviceClient;

    /**
     * Initializes an instance of ManagedPrivateEndpointsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ManagedPrivateEndpointsClient(ManagedPrivateEndpointsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedPrivateEndpoint> getWithResponse(String managedVirtualNetworkName,
        String managedPrivateEndpointName, Context context) {
        return this.serviceClient.getWithResponse(managedVirtualNetworkName, managedPrivateEndpointName, context);
    }

    /**
     * Get Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Private Endpoints.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedPrivateEndpoint get(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        return this.serviceClient.get(managedVirtualNetworkName, managedPrivateEndpointName);
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagedPrivateEndpoint> createWithResponse(String managedVirtualNetworkName,
        String managedPrivateEndpointName, ManagedPrivateEndpoint managedPrivateEndpoint, Context context) {
        return this.serviceClient.createWithResponse(managedVirtualNetworkName, managedPrivateEndpointName,
            managedPrivateEndpoint, context);
    }

    /**
     * Create Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param managedPrivateEndpoint Managed private endpoint properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed private endpoint.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedPrivateEndpoint create(String managedVirtualNetworkName, String managedPrivateEndpointName,
        ManagedPrivateEndpoint managedPrivateEndpoint) {
        return this.serviceClient.create(managedVirtualNetworkName, managedPrivateEndpointName, managedPrivateEndpoint);
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String managedVirtualNetworkName, String managedPrivateEndpointName,
        Context context) {
        return this.serviceClient.deleteWithResponse(managedVirtualNetworkName, managedPrivateEndpointName, context);
    }

    /**
     * Delete Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param managedPrivateEndpointName Managed private endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String managedVirtualNetworkName, String managedPrivateEndpointName) {
        this.serviceClient.delete(managedVirtualNetworkName, managedPrivateEndpointName);
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedPrivateEndpoint> list(String managedVirtualNetworkName) {
        return this.serviceClient.list(managedVirtualNetworkName);
    }

    /**
     * List Managed Private Endpoints.
     * 
     * @param managedVirtualNetworkName Managed virtual network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed private endpoints as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedPrivateEndpoint> list(String managedVirtualNetworkName, Context context) {
        return this.serviceClient.list(managedVirtualNetworkName, context);
    }
}
