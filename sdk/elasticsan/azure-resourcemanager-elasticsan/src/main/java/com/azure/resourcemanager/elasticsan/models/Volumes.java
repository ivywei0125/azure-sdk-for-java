// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Volumes. */
public interface Volumes {
    /**
     * Delete an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName);

    /**
     * Delete an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param xMsDeleteSnapshots Optional, used to delete snapshots under volume. Allowed value are only true or false.
     *     Default value is false.
     * @param xMsForceDelete Optional, used to delete volume if active sessions present. Allowed value are only true or
     *     false. Default value is false.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String elasticSanName,
        String volumeGroupName,
        String volumeName,
        XMsDeleteSnapshots xMsDeleteSnapshots,
        XMsForceDelete xMsForceDelete,
        Context context);

    /**
     * Get an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Volume along with {@link Response}.
     */
    Response<Volume> getWithResponse(
        String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName, Context context);

    /**
     * Get an Volume.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param volumeName The name of the Volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Volume.
     */
    Volume get(String resourceGroupName, String elasticSanName, String volumeGroupName, String volumeName);

    /**
     * List Volumes in a VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volumes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Volume> listByVolumeGroup(String resourceGroupName, String elasticSanName, String volumeGroupName);

    /**
     * List Volumes in a VolumeGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param elasticSanName The name of the ElasticSan.
     * @param volumeGroupName The name of the VolumeGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Volumes as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Volume> listByVolumeGroup(
        String resourceGroupName, String elasticSanName, String volumeGroupName, Context context);

    /**
     * Get an Volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Volume along with {@link Response}.
     */
    Volume getById(String id);

    /**
     * Get an Volume.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Volume along with {@link Response}.
     */
    Response<Volume> getByIdWithResponse(String id, Context context);

    /**
     * Delete an Volume.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an Volume.
     *
     * @param id the resource ID.
     * @param xMsDeleteSnapshots Optional, used to delete snapshots under volume. Allowed value are only true or false.
     *     Default value is false.
     * @param xMsForceDelete Optional, used to delete volume if active sessions present. Allowed value are only true or
     *     false. Default value is false.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(
        String id, XMsDeleteSnapshots xMsDeleteSnapshots, XMsForceDelete xMsForceDelete, Context context);

    /**
     * Begins definition for a new Volume resource.
     *
     * @param name resource name.
     * @return the first stage of the new Volume definition.
     */
    Volume.DefinitionStages.Blank define(String name);
}
