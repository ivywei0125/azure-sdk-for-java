// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsConnectorInner;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsConnector;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsConnectorProperties;
import java.util.Collections;
import java.util.Map;

public final class AzureDevOpsConnectorImpl
    implements AzureDevOpsConnector, AzureDevOpsConnector.Definition, AzureDevOpsConnector.Update {
    private AzureDevOpsConnectorInner innerObject;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public AzureDevOpsConnectorProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AzureDevOpsConnectorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String azureDevOpsConnectorName;

    public AzureDevOpsConnectorImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AzureDevOpsConnector create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .createOrUpdate(resourceGroupName, azureDevOpsConnectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureDevOpsConnector create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .createOrUpdate(resourceGroupName, azureDevOpsConnectorName, this.innerModel(), context);
        return this;
    }

    AzureDevOpsConnectorImpl(
        String name, com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = new AzureDevOpsConnectorInner();
        this.serviceManager = serviceManager;
        this.azureDevOpsConnectorName = name;
    }

    public AzureDevOpsConnectorImpl update() {
        return this;
    }

    public AzureDevOpsConnector apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .update(resourceGroupName, azureDevOpsConnectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureDevOpsConnector apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .update(resourceGroupName, azureDevOpsConnectorName, this.innerModel(), context);
        return this;
    }

    AzureDevOpsConnectorImpl(
        AzureDevOpsConnectorInner innerObject,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.azureDevOpsConnectorName = Utils.getValueFromIdByName(innerObject.id(), "azureDevOpsConnectors");
    }

    public AzureDevOpsConnector refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .getByResourceGroupWithResponse(resourceGroupName, azureDevOpsConnectorName, Context.NONE)
                .getValue();
        return this;
    }

    public AzureDevOpsConnector refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureDevOpsConnectors()
                .getByResourceGroupWithResponse(resourceGroupName, azureDevOpsConnectorName, context)
                .getValue();
        return this;
    }

    public AzureDevOpsConnectorImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AzureDevOpsConnectorImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AzureDevOpsConnectorImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AzureDevOpsConnectorImpl withProperties(AzureDevOpsConnectorProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
