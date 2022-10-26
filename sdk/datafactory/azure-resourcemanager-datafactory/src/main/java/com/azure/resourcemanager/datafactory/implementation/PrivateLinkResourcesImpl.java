// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateLinkResourcesWrapperInner;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResources;
import com.azure.resourcemanager.datafactory.models.PrivateLinkResourcesWrapper;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PrivateLinkResourcesWrapper> getWithResponse(
        String resourceGroupName, String factoryName, Context context) {
        Response<PrivateLinkResourcesWrapperInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, factoryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourcesWrapperImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResourcesWrapper get(String resourceGroupName, String factoryName) {
        PrivateLinkResourcesWrapperInner inner = this.serviceClient().get(resourceGroupName, factoryName);
        if (inner != null) {
            return new PrivateLinkResourcesWrapperImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
