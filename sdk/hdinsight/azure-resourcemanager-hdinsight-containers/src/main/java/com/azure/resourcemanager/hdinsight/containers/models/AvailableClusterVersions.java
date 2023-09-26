// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of AvailableClusterVersions. */
public interface AvailableClusterVersions {
    /**
     * Returns a list of available cluster versions.
     *
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster versions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterVersion> listByLocation(String location);

    /**
     * Returns a list of available cluster versions.
     *
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster versions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterVersion> listByLocation(String location, Context context);
}
