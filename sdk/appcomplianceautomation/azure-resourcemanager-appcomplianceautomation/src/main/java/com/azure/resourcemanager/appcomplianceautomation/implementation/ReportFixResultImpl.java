// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.implementation;

import com.azure.resourcemanager.appcomplianceautomation.fluent.models.ReportFixResultInner;
import com.azure.resourcemanager.appcomplianceautomation.models.ReportFixResult;
import com.azure.resourcemanager.appcomplianceautomation.models.Result;

public final class ReportFixResultImpl implements ReportFixResult {
    private ReportFixResultInner innerObject;

    private final com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager;

    ReportFixResultImpl(ReportFixResultInner innerObject,
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Result result() {
        return this.innerModel().result();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public ReportFixResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager() {
        return this.serviceManager;
    }
}
