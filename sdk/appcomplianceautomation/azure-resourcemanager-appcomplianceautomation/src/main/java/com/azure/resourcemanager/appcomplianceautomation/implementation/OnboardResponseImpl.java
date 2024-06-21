// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.resourcemanager.appcomplianceautomation.fluent.models.OnboardResponseInner;
import com.azure.resourcemanager.appcomplianceautomation.models.OnboardResponse;
import java.util.Collections;
import java.util.List;

public final class OnboardResponseImpl implements OnboardResponse {
    private OnboardResponseInner innerObject;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    OnboardResponseImpl(OnboardResponseInner innerObject,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> subscriptionIds() {
        List<String> inner = this.innerModel().subscriptionIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OnboardResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
