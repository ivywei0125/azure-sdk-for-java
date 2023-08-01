// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PacketCoreControlPlaneVersions. */
public interface PacketCoreControlPlaneVersions {
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
    Response<PacketCoreControlPlaneVersion> getWithResponse(String versionName, Context context);

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version.
     */
    PacketCoreControlPlaneVersion get(String versionName);

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PacketCoreControlPlaneVersion> list();

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
    PagedIterable<PacketCoreControlPlaneVersion> list(Context context);

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
    Response<PacketCoreControlPlaneVersion> getBySubscriptionWithResponse(String versionName, Context context);

    /**
     * Gets information about the specified packet core control plane version.
     *
     * @param versionName The name of the packet core control plane version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified packet core control plane version.
     */
    PacketCoreControlPlaneVersion getBySubscription(String versionName);

    /**
     * Lists all supported packet core control planes versions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for packet core control plane version API service call as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<PacketCoreControlPlaneVersion> listBySubscription();

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
    PagedIterable<PacketCoreControlPlaneVersion> listBySubscription(Context context);
}
