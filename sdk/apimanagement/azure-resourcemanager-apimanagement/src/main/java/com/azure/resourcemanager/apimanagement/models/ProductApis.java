// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ProductApis. */
public interface ProductApis {
    /**
     * Lists a collection of the APIs associated with a product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged API list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApiContract> listByProduct(String resourceGroupName, String serviceName, String productId);

    /**
     * Lists a collection of the APIs associated with a product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt,
     *     lt | substringof, contains, startswith, endswith |&lt;/br&gt;| serviceUrl | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| path | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged API list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApiContract> listByProduct(
        String resourceGroupName,
        String serviceName,
        String productId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Checks that API entity specified by identifier is associated with the Product entity.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> checkEntityExistsWithResponse(
        String resourceGroupName, String serviceName, String productId, String apiId, Context context);

    /**
     * Checks that API entity specified by identifier is associated with the Product entity.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void checkEntityExists(String resourceGroupName, String serviceName, String productId, String apiId);

    /**
     * Adds an API to the specified product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI details along with {@link Response}.
     */
    Response<ApiContract> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, String productId, String apiId, Context context);

    /**
     * Adds an API to the specified product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI details.
     */
    ApiContract createOrUpdate(String resourceGroupName, String serviceName, String productId, String apiId);

    /**
     * Deletes the specified API from the specified product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String productId, String apiId, Context context);

    /**
     * Deletes the specified API from the specified product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String productId, String apiId);
}
