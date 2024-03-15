// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.TopologiesClient;
import com.azure.resourcemanager.security.fluent.models.TopologyResourceInner;
import com.azure.resourcemanager.security.models.Topologies;
import com.azure.resourcemanager.security.models.TopologyResource;

public final class TopologiesImpl implements Topologies {
    private static final ClientLogger LOGGER = new ClientLogger(TopologiesImpl.class);

    private final TopologiesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public TopologiesImpl(TopologiesClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TopologyResource> list() {
        PagedIterable<TopologyResourceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopologyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopologyResource> list(Context context) {
        PagedIterable<TopologyResourceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopologyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopologyResource> listByHomeRegion(String ascLocation) {
        PagedIterable<TopologyResourceInner> inner = this.serviceClient().listByHomeRegion(ascLocation);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopologyResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopologyResource> listByHomeRegion(String ascLocation, Context context) {
        PagedIterable<TopologyResourceInner> inner = this.serviceClient().listByHomeRegion(ascLocation, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopologyResourceImpl(inner1, this.manager()));
    }

    public Response<TopologyResource> getWithResponse(String resourceGroupName, String ascLocation,
        String topologyResourceName, Context context) {
        Response<TopologyResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, ascLocation, topologyResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new TopologyResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TopologyResource get(String resourceGroupName, String ascLocation, String topologyResourceName) {
        TopologyResourceInner inner = this.serviceClient().get(resourceGroupName, ascLocation, topologyResourceName);
        if (inner != null) {
            return new TopologyResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private TopologiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
