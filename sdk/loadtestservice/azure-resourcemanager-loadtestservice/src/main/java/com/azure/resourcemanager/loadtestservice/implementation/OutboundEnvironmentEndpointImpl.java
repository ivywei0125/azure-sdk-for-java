// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.implementation;

import com.azure.resourcemanager.loadtestservice.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.loadtestservice.models.EndpointDependency;
import com.azure.resourcemanager.loadtestservice.models.OutboundEnvironmentEndpoint;
import java.util.Collections;
import java.util.List;

public final class OutboundEnvironmentEndpointImpl implements OutboundEnvironmentEndpoint {
    private OutboundEnvironmentEndpointInner innerObject;

    private final com.azure.resourcemanager.loadtestservice.LoadTestManager serviceManager;

    OutboundEnvironmentEndpointImpl(
        OutboundEnvironmentEndpointInner innerObject,
        com.azure.resourcemanager.loadtestservice.LoadTestManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String category() {
        return this.innerModel().category();
    }

    public List<EndpointDependency> endpoints() {
        List<EndpointDependency> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OutboundEnvironmentEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loadtestservice.LoadTestManager manager() {
        return this.serviceManager;
    }
}
