// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.resourcemanager.cognitiveservices.fluent.models.UsageInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.UsageListResultInner;
import com.azure.resourcemanager.cognitiveservices.models.Usage;
import com.azure.resourcemanager.cognitiveservices.models.UsageListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class UsageListResultImpl implements UsageListResult {
    private UsageListResultInner innerObject;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    UsageListResultImpl(
        UsageListResultInner innerObject,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public List<Usage> value() {
        List<UsageInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new UsageImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public UsageListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
