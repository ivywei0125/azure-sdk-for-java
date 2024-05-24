// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.fluent.VaultCertificatesClient;
import com.azure.resourcemanager.recoveryservices.models.VaultCertificates;

public final class VaultCertificatesImpl implements VaultCertificates {
    private static final ClientLogger LOGGER = new ClientLogger(VaultCertificatesImpl.class);

    private final VaultCertificatesClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager;

    public VaultCertificatesImpl(VaultCertificatesClient innerClient,
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    private VaultCertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager() {
        return this.serviceManager;
    }

    public VaultCertificateResponseImpl define(String name) {
        return new VaultCertificateResponseImpl(name, this.manager());
    }
}
