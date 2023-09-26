// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentContractInner;
import com.azure.resourcemanager.apimanagement.models.PolicyFragmentCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyFragmentContract;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PolicyFragmentCollectionImpl implements PolicyFragmentCollection {
    private PolicyFragmentCollectionInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    PolicyFragmentCollectionImpl(
        PolicyFragmentCollectionInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PolicyFragmentContract> value() {
        List<PolicyFragmentContractInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PolicyFragmentContractImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Long count() {
        return this.innerModel().count();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PolicyFragmentCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
