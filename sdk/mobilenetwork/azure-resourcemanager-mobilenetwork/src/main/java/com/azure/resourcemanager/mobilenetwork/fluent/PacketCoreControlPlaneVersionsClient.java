// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionInner;

/** An instance of this class provides access to all the operations defined in PacketCoreControlPlaneVersionsClient. */
public interface PacketCoreControlPlaneVersionsClient {
    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreControlPlaneVersionInner> getWithResponse(String versionName, Context context);

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneVersionInner get(String versionName);

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneVersionInner> list();

    /**
     * Lists all supported packet core control planes versions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneVersionInner> list(Context context);

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PacketCoreControlPlaneVersionInner> getBySubscriptionWithResponse(String versionName, Context context);

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PacketCoreControlPlaneVersionInner getBySubscription(String versionName);

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneVersionInner> listBySubscription();

    /**
     * Lists all supported packet core control planes versions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PacketCoreControlPlaneVersionInner> listBySubscription(Context context);
}
