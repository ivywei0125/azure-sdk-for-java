// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.Delete;
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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.apimanagement.fluent.DeletedServicesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.DeletedServiceContractInner;
import com.azure.resourcemanager.apimanagement.models.DeletedServicesCollection;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedServicesClient. */
public final class DeletedServicesClientImpl implements DeletedServicesClient {
    /** The proxy service used to perform REST calls. */
    private final DeletedServicesService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of DeletedServicesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeletedServicesClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(DeletedServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientDeletedServices to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientD")
    public interface DeletedServicesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ApiManagement/deletedservices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeletedServicesCollection>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ApiManagement/locations/{location}/deletedservices/{serviceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeletedServiceContractInner>> getByName(
            @HostParam("$host") String endpoint,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/providers/Microsoft.ApiManagement/locations/{location}/deletedservices/{serviceName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> purge(
            @HostParam("$host") String endpoint,
            @PathParam("serviceName") String serviceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeletedServicesCollection>> listBySubscriptionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeletedServiceContractInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .<PagedResponse<DeletedServiceContractInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeletedServiceContractInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DeletedServiceContractInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DeletedServiceContractInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeletedServiceContractInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all soft-deleted services available for undelete for the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeletedServiceContractInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Get soft-deleted Api Management Service by name.
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return soft-deleted Api Management Service by name along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeletedServiceContractInner>> getByNameWithResponseAsync(
        String serviceName, String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByName(
                            this.client.getEndpoint(),
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get soft-deleted Api Management Service by name.
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return soft-deleted Api Management Service by name along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DeletedServiceContractInner>> getByNameWithResponseAsync(
        String serviceName, String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByName(
                this.client.getEndpoint(),
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                accept,
                context);
    }

    /**
     * Get soft-deleted Api Management Service by name.
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return soft-deleted Api Management Service by name on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeletedServiceContractInner> getByNameAsync(String serviceName, String location) {
        return getByNameWithResponseAsync(serviceName, location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get soft-deleted Api Management Service by name.
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return soft-deleted Api Management Service by name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DeletedServiceContractInner> getByNameWithResponse(
        String serviceName, String location, Context context) {
        return getByNameWithResponseAsync(serviceName, location, context).block();
    }

    /**
     * Get soft-deleted Api Management Service by name.
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return soft-deleted Api Management Service by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeletedServiceContractInner getByName(String serviceName, String location) {
        return getByNameWithResponse(serviceName, location, Context.NONE).getValue();
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> purgeWithResponseAsync(String serviceName, String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .purge(
                            this.client.getEndpoint(),
                            serviceName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> purgeWithResponseAsync(
        String serviceName, String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .purge(
                this.client.getEndpoint(),
                serviceName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                accept,
                context);
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<DeletedServiceContractInner>, DeletedServiceContractInner> beginPurgeAsync(
        String serviceName, String location) {
        Mono<Response<Flux<ByteBuffer>>> mono = purgeWithResponseAsync(serviceName, location);
        return this
            .client
            .<DeletedServiceContractInner, DeletedServiceContractInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                DeletedServiceContractInner.class,
                DeletedServiceContractInner.class,
                this.client.getContext());
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<DeletedServiceContractInner>, DeletedServiceContractInner> beginPurgeAsync(
        String serviceName, String location, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = purgeWithResponseAsync(serviceName, location, context);
        return this
            .client
            .<DeletedServiceContractInner, DeletedServiceContractInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                DeletedServiceContractInner.class,
                DeletedServiceContractInner.class,
                context);
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<DeletedServiceContractInner>, DeletedServiceContractInner> beginPurge(
        String serviceName, String location) {
        return this.beginPurgeAsync(serviceName, location).getSyncPoller();
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<DeletedServiceContractInner>, DeletedServiceContractInner> beginPurge(
        String serviceName, String location, Context context) {
        return this.beginPurgeAsync(serviceName, location, context).getSyncPoller();
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeletedServiceContractInner> purgeAsync(String serviceName, String location) {
        return beginPurgeAsync(serviceName, location).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DeletedServiceContractInner> purgeAsync(String serviceName, String location, Context context) {
        return beginPurgeAsync(serviceName, location, context).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeletedServiceContractInner purge(String serviceName, String location) {
        return purgeAsync(serviceName, location).block();
    }

    /**
     * Purges Api Management Service (deletes it with no option to undelete).
     *
     * @param serviceName The name of the API Management service.
     * @param location The location of the deleted API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DeletedServiceContractInner purge(String serviceName, String location, Context context) {
        return purgeAsync(serviceName, location, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeletedServiceContractInner>> listBySubscriptionNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listBySubscriptionNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DeletedServiceContractInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged deleted API Management Services List Representation along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeletedServiceContractInner>> listBySubscriptionNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listBySubscriptionNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
