// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

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
import com.azure.resourcemanager.scvmm.fluent.VmInstanceHybridIdentityMetadatasClient;
import com.azure.resourcemanager.scvmm.fluent.models.VmInstanceHybridIdentityMetadataInner;
import com.azure.resourcemanager.scvmm.models.VmInstanceHybridIdentityMetadataListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VmInstanceHybridIdentityMetadatasClient.
 */
public final class VmInstanceHybridIdentityMetadatasClientImpl implements VmInstanceHybridIdentityMetadatasClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VmInstanceHybridIdentityMetadatasService service;

    /**
     * The service client containing this operation class.
     */
    private final ScvmmClientImpl client;

    /**
     * Initializes an instance of VmInstanceHybridIdentityMetadatasClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VmInstanceHybridIdentityMetadatasClientImpl(ScvmmClientImpl client) {
        this.service = RestProxy.create(VmInstanceHybridIdentityMetadatasService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ScvmmClientVmInstanceHybridIdentityMetadatas to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ScvmmClientVmInstanc")
    public interface VmInstanceHybridIdentityMetadatasService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.ScVmm/virtualMachineInstances/default/hybridIdentityMetadata")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VmInstanceHybridIdentityMetadataListResult>> listByVirtualMachineInstance(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/Microsoft.ScVmm/virtualMachineInstances/default/hybridIdentityMetadata/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VmInstanceHybridIdentityMetadataInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VmInstanceHybridIdentityMetadataListResult>> listByVirtualMachineInstanceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VmInstanceHybridIdentityMetadataInner>>
        listByVirtualMachineInstanceSinglePageAsync(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByVirtualMachineInstance(this.client.getEndpoint(),
                this.client.getApiVersion(), resourceUri, accept, context))
            .<PagedResponse<VmInstanceHybridIdentityMetadataInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VmInstanceHybridIdentityMetadataInner>>
        listByVirtualMachineInstanceSinglePageAsync(String resourceUri, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByVirtualMachineInstance(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri, accept,
                context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VmInstanceHybridIdentityMetadataInner> listByVirtualMachineInstanceAsync(String resourceUri) {
        return new PagedFlux<>(() -> listByVirtualMachineInstanceSinglePageAsync(resourceUri),
            nextLink -> listByVirtualMachineInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VmInstanceHybridIdentityMetadataInner> listByVirtualMachineInstanceAsync(String resourceUri,
        Context context) {
        return new PagedFlux<>(() -> listByVirtualMachineInstanceSinglePageAsync(resourceUri, context),
            nextLink -> listByVirtualMachineInstanceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VmInstanceHybridIdentityMetadataInner> listByVirtualMachineInstance(String resourceUri) {
        return new PagedIterable<>(listByVirtualMachineInstanceAsync(resourceUri));
    }

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     * 
     * Returns the list of HybridIdentityMetadata of the given VM.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VmInstanceHybridIdentityMetadataInner> listByVirtualMachineInstance(String resourceUri,
        Context context) {
        return new PagedIterable<>(listByVirtualMachineInstanceAsync(resourceUri, context));
    }

    /**
     * Gets HybridIdentityMetadata.
     * 
     * Implements HybridIdentityMetadata GET method.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VmInstanceHybridIdentityMetadataInner>> getWithResponseAsync(String resourceUri) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets HybridIdentityMetadata.
     * 
     * Implements HybridIdentityMetadata GET method.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VmInstanceHybridIdentityMetadataInner>> getWithResponseAsync(String resourceUri,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceUri, accept, context);
    }

    /**
     * Gets HybridIdentityMetadata.
     * 
     * Implements HybridIdentityMetadata GET method.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VmInstanceHybridIdentityMetadataInner> getAsync(String resourceUri) {
        return getWithResponseAsync(resourceUri).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets HybridIdentityMetadata.
     * 
     * Implements HybridIdentityMetadata GET method.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VmInstanceHybridIdentityMetadataInner> getWithResponse(String resourceUri, Context context) {
        return getWithResponseAsync(resourceUri, context).block();
    }

    /**
     * Gets HybridIdentityMetadata.
     * 
     * Implements HybridIdentityMetadata GET method.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VmInstanceHybridIdentityMetadataInner get(String resourceUri) {
        return getWithResponse(resourceUri, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VmInstanceHybridIdentityMetadataInner>>
        listByVirtualMachineInstanceNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.listByVirtualMachineInstanceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<VmInstanceHybridIdentityMetadataInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VmInstanceHybridIdentityMetadata list operation along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VmInstanceHybridIdentityMetadataInner>>
        listByVirtualMachineInstanceNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByVirtualMachineInstanceNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
