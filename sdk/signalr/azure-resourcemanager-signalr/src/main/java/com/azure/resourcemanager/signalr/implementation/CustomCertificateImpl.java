// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.CustomCertificateInner;
import com.azure.resourcemanager.signalr.models.CustomCertificate;
import com.azure.resourcemanager.signalr.models.ProvisioningState;

public final class CustomCertificateImpl
    implements CustomCertificate, CustomCertificate.Definition, CustomCertificate.Update {
    private CustomCertificateInner innerObject;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String keyVaultBaseUri() {
        return this.innerModel().keyVaultBaseUri();
    }

    public String keyVaultSecretName() {
        return this.innerModel().keyVaultSecretName();
    }

    public String keyVaultSecretVersion() {
        return this.innerModel().keyVaultSecretVersion();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CustomCertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String certificateName;

    public CustomCertificateImpl withExistingSignalR(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public CustomCertificate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .createOrUpdate(resourceGroupName, resourceName, certificateName, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomCertificate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .createOrUpdate(resourceGroupName, resourceName, certificateName, this.innerModel(), context);
        return this;
    }

    CustomCertificateImpl(String name, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = new CustomCertificateInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
    }

    public CustomCertificateImpl update() {
        return this;
    }

    public CustomCertificate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .createOrUpdate(resourceGroupName, resourceName, certificateName, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomCertificate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .createOrUpdate(resourceGroupName, resourceName, certificateName, this.innerModel(), context);
        return this;
    }

    CustomCertificateImpl(
        CustomCertificateInner innerObject, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "signalR");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "customCertificates");
    }

    public CustomCertificate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .getWithResponse(resourceGroupName, resourceName, certificateName, Context.NONE)
                .getValue();
        return this;
    }

    public CustomCertificate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRCustomCertificates()
                .getWithResponse(resourceGroupName, resourceName, certificateName, context)
                .getValue();
        return this;
    }

    public CustomCertificateImpl withKeyVaultBaseUri(String keyVaultBaseUri) {
        this.innerModel().withKeyVaultBaseUri(keyVaultBaseUri);
        return this;
    }

    public CustomCertificateImpl withKeyVaultSecretName(String keyVaultSecretName) {
        this.innerModel().withKeyVaultSecretName(keyVaultSecretName);
        return this;
    }

    public CustomCertificateImpl withKeyVaultSecretVersion(String keyVaultSecretVersion) {
        this.innerModel().withKeyVaultSecretVersion(keyVaultSecretVersion);
        return this;
    }
}
