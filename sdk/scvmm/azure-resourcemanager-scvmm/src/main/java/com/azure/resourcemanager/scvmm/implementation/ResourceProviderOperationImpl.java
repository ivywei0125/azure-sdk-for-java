// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.resourcemanager.scvmm.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.scvmm.models.ResourceProviderOperation;
import com.azure.resourcemanager.scvmm.models.ResourceProviderOperationDisplay;

public final class ResourceProviderOperationImpl implements ResourceProviderOperation {
    private ResourceProviderOperationInner innerObject;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    ResourceProviderOperationImpl(
        ResourceProviderOperationInner innerObject, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String name() {
        return this.innerModel().name();
    }

    public ResourceProviderOperationDisplay display() {
        return this.innerModel().display();
    }

    public ResourceProviderOperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }
}
