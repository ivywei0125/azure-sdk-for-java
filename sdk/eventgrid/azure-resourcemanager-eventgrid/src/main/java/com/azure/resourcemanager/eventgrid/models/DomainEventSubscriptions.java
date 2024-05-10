// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;

/**
 * Resource collection API of DomainEventSubscriptions.
 */
public interface DomainEventSubscriptions {
    /**
     * Get delivery attributes for an event subscription for domain.
     * 
     * Get all delivery attributes for an event subscription for domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain along with {@link Response}.
     */
    Response<DeliveryAttributeListResult> getDeliveryAttributesWithResponse(String resourceGroupName, String domainName,
        String eventSubscriptionName, Context context);

    /**
     * Get delivery attributes for an event subscription for domain.
     * 
     * Get all delivery attributes for an event subscription for domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain.
     */
    DeliveryAttributeListResult getDeliveryAttributes(String resourceGroupName, String domainName,
        String eventSubscriptionName);

    /**
     * Get an event subscription of a domain.
     * 
     * Get properties of an event subscription of a domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be found.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a domain along with {@link Response}.
     */
    Response<EventSubscription> getWithResponse(String resourceGroupName, String domainName,
        String eventSubscriptionName, Context context);

    /**
     * Get an event subscription of a domain.
     * 
     * Get properties of an event subscription of a domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be found.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a domain.
     */
    EventSubscription get(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Create or update an event subscription to a domain.
     * 
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 64 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription createOrUpdate(String resourceGroupName, String domainName, String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update an event subscription to a domain.
     * 
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 64 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription createOrUpdate(String resourceGroupName, String domainName, String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo, Context context);

    /**
     * Delete an event subscription for a domain.
     * 
     * Delete an existing event subscription for a domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Delete an event subscription for a domain.
     * 
     * Delete an existing event subscription for a domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String domainName, String eventSubscriptionName, Context context);

    /**
     * Update an event subscription for a domain.
     * 
     * Update an existing event subscription for a topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription update(String resourceGroupName, String domainName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update an event subscription for a domain.
     * 
     * Update an existing event subscription for a topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    EventSubscription update(String resourceGroupName, String domainName, String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context);

    /**
     * Get full URL of an event subscription for domain.
     * 
     * Get the full endpoint URL for an event subscription for domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription for domain along with {@link Response}.
     */
    Response<EventSubscriptionFullUrl> getFullUrlWithResponse(String resourceGroupName, String domainName,
        String eventSubscriptionName, Context context);

    /**
     * Get full URL of an event subscription for domain.
     * 
     * Get the full endpoint URL for an event subscription for domain.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription for domain.
     */
    EventSubscriptionFullUrl getFullUrl(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * List all event subscriptions for a specific domain.
     * 
     * List all event subscriptions that have been created for a specific topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list(String resourceGroupName, String domainName);

    /**
     * List all event subscriptions for a specific domain.
     * 
     * List all event subscriptions that have been created for a specific topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventSubscription> list(String resourceGroupName, String domainName, String filter, Integer top,
        Context context);
}
