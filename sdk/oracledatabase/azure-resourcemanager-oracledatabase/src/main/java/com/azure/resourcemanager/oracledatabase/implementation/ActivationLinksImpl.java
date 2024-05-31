// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.implementation;

import com.azure.resourcemanager.oracledatabase.fluent.models.ActivationLinksInner;
import com.azure.resourcemanager.oracledatabase.models.ActivationLinks;

public final class ActivationLinksImpl implements ActivationLinks {
    private ActivationLinksInner innerObject;

    private final com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager;

    ActivationLinksImpl(ActivationLinksInner innerObject,
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String newCloudAccountActivationLink() {
        return this.innerModel().newCloudAccountActivationLink();
    }

    public String existingCloudAccountActivationLink() {
        return this.innerModel().existingCloudAccountActivationLink();
    }

    public ActivationLinksInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager() {
        return this.serviceManager;
    }
}
