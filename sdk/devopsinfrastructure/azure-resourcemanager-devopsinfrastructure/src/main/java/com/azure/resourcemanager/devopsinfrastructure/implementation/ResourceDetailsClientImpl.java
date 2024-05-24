// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.devopsinfrastructure.fluent.ResourceDetailsClient;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.ResourceDetailsObjectInner;
import com.azure.resourcemanager.devopsinfrastructure.implementation.models.ResourceDetailsObjectListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ResourceDetailsClient.
 */
public final class ResourceDetailsClientImpl implements ResourceDetailsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ResourceDetailsService service;

    /**
     * The service client containing this operation class.
     */
    private final DevOpsInfrastructureClientImpl client;

    /**
     * Initializes an instance of ResourceDetailsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ResourceDetailsClientImpl(DevOpsInfrastructureClientImpl client) {
        this.service
            = RestProxy.create(ResourceDetailsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DevOpsInfrastructureClientResourceDetails to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "DevOpsInfrastructure")
    public interface ResourceDetailsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DevOpsInfrastructure/pools/{poolName}/resources")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceDetailsObjectListResult>> listByPool(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("poolName") String poolName,
            @HeaderParam("accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ResourceDetailsObjectListResult>> listByPoolNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("accept") String accept, Context context);
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceDetailsObjectInner>> listByPoolSinglePageAsync(String resourceGroupName,
        String poolName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (poolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter poolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByPool(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, poolName, accept, context))
            .<PagedResponse<ResourceDetailsObjectInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceDetailsObjectInner>> listByPoolSinglePageAsync(String resourceGroupName,
        String poolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (poolName == null) {
            return Mono.error(new IllegalArgumentException("Parameter poolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByPool(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, poolName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ResourceDetailsObjectInner> listByPoolAsync(String resourceGroupName, String poolName) {
        return new PagedFlux<>(() -> listByPoolSinglePageAsync(resourceGroupName, poolName),
            nextLink -> listByPoolNextSinglePageAsync(nextLink));
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ResourceDetailsObjectInner> listByPoolAsync(String resourceGroupName, String poolName,
        Context context) {
        return new PagedFlux<>(() -> listByPoolSinglePageAsync(resourceGroupName, poolName, context),
            nextLink -> listByPoolNextSinglePageAsync(nextLink, context));
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceDetailsObjectInner> listByPool(String resourceGroupName, String poolName) {
        return new PagedIterable<>(listByPoolAsync(resourceGroupName, poolName));
    }

    /**
     * List ResourceDetailsObject resources by Pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param poolName Name of the pool. It needs to be globally unique.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ResourceDetailsObjectInner> listByPool(String resourceGroupName, String poolName,
        Context context) {
        return new PagedIterable<>(listByPoolAsync(resourceGroupName, poolName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceDetailsObjectInner>> listByPoolNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByPoolNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ResourceDetailsObjectInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a ResourceDetailsObject list operation along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ResourceDetailsObjectInner>> listByPoolNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByPoolNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
