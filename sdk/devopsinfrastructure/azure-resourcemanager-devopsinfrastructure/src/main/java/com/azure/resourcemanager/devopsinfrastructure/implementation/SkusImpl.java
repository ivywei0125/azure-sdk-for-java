// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devopsinfrastructure.fluent.SkusClient;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourceSku;
import com.azure.resourcemanager.devopsinfrastructure.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager;

    public SkusImpl(SkusClient innerClient,
        com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> listByLocation(String locationName) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().listByLocation(locationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> listByLocation(String locationName, Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().listByLocation(locationName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager() {
        return this.serviceManager;
    }
}
