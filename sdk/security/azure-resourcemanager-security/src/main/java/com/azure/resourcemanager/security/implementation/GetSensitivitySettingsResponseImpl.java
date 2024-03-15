// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.GetSensitivitySettingsResponseInner;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponse;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponseProperties;

public final class GetSensitivitySettingsResponseImpl implements GetSensitivitySettingsResponse {
    private GetSensitivitySettingsResponseInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    GetSensitivitySettingsResponseImpl(GetSensitivitySettingsResponseInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public GetSensitivitySettingsResponseProperties properties() {
        return this.innerModel().properties();
    }

    public GetSensitivitySettingsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
