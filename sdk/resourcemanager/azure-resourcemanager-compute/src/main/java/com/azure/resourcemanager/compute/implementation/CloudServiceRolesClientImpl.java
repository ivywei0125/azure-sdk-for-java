// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.compute.fluent.CloudServiceRolesClient;
import com.azure.resourcemanager.compute.fluent.models.CloudServiceRoleInner;
import com.azure.resourcemanager.compute.models.ApiErrorException;
import com.azure.resourcemanager.compute.models.CloudServiceRoleListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in CloudServiceRolesClient.
 */
public final class CloudServiceRolesClientImpl implements CloudServiceRolesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final CloudServiceRolesService service;

    /**
     * The service client containing this operation class.
     */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of CloudServiceRolesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    CloudServiceRolesClientImpl(ComputeManagementClientImpl client) {
        this.service
            = RestProxy.create(CloudServiceRolesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientCloudServiceRoles to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    public interface CloudServiceRolesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/cloudServices/{cloudServiceName}/roles/{roleName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CloudServiceRoleInner>> get(@HostParam("$host") String endpoint,
            @PathParam("roleName") String roleName, @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("cloudServiceName") String cloudServiceName, @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/cloudServices/{cloudServiceName}/roles")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CloudServiceRoleListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("cloudServiceName") String cloudServiceName, @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ApiErrorException.class)
        Mono<Response<CloudServiceRoleListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets a role from a cloud service.
     * 
     * @param roleName Name of the role.
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CloudServiceRoleInner>> getWithResponseAsync(String roleName, String resourceGroupName,
        String cloudServiceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (roleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter roleName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (cloudServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter cloudServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-09-04";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), roleName, resourceGroupName,
                cloudServiceName, this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a role from a cloud service.
     * 
     * @param roleName Name of the role.
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CloudServiceRoleInner>> getWithResponseAsync(String roleName, String resourceGroupName,
        String cloudServiceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (roleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter roleName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (cloudServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter cloudServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-09-04";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), roleName, resourceGroupName, cloudServiceName,
            this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Gets a role from a cloud service.
     * 
     * @param roleName Name of the role.
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CloudServiceRoleInner> getAsync(String roleName, String resourceGroupName, String cloudServiceName) {
        return getWithResponseAsync(roleName, resourceGroupName, cloudServiceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a role from a cloud service.
     * 
     * @param roleName Name of the role.
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CloudServiceRoleInner> getWithResponse(String roleName, String resourceGroupName,
        String cloudServiceName, Context context) {
        return getWithResponseAsync(roleName, resourceGroupName, cloudServiceName, context).block();
    }

    /**
     * Gets a role from a cloud service.
     * 
     * @param roleName Name of the role.
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role from a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CloudServiceRoleInner get(String roleName, String resourceGroupName, String cloudServiceName) {
        return getWithResponse(roleName, resourceGroupName, cloudServiceName, Context.NONE).getValue();
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CloudServiceRoleInner>> listSinglePageAsync(String resourceGroupName,
        String cloudServiceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (cloudServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter cloudServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-09-04";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), resourceGroupName, cloudServiceName,
                this.client.getSubscriptionId(), apiVersion, accept, context))
            .<PagedResponse<CloudServiceRoleInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CloudServiceRoleInner>> listSinglePageAsync(String resourceGroupName,
        String cloudServiceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (cloudServiceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter cloudServiceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2022-09-04";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), resourceGroupName, cloudServiceName, this.client.getSubscriptionId(),
                apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CloudServiceRoleInner> listAsync(String resourceGroupName, String cloudServiceName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cloudServiceName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CloudServiceRoleInner> listAsync(String resourceGroupName, String cloudServiceName,
        Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cloudServiceName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CloudServiceRoleInner> list(String resourceGroupName, String cloudServiceName) {
        return new PagedIterable<>(listAsync(resourceGroupName, cloudServiceName));
    }

    /**
     * Gets a list of all roles in a cloud service. Use nextLink property in the response to get the next page of roles.
     * Do this till nextLink is null to fetch all the roles.
     * 
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all roles in a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CloudServiceRoleInner> list(String resourceGroupName, String cloudServiceName,
        Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, cloudServiceName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation result along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CloudServiceRoleInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<CloudServiceRoleInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation result along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CloudServiceRoleInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
