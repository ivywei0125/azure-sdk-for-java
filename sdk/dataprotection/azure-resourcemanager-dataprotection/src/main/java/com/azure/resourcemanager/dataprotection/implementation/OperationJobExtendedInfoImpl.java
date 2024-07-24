// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;
import com.azure.resourcemanager.dataprotection.models.OperationJobExtendedInfo;

public final class OperationJobExtendedInfoImpl implements OperationJobExtendedInfo {
    private OperationJobExtendedInfoInner innerObject;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    OperationJobExtendedInfoImpl(OperationJobExtendedInfoInner innerObject,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String objectType() {
        return this.innerModel().objectType();
    }

    public String jobId() {
        return this.innerModel().jobId();
    }

    public OperationJobExtendedInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
