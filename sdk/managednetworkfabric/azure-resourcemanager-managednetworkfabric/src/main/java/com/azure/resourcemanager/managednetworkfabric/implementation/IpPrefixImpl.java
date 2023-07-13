// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpPrefixInner;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefix;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefixPatch;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefixPropertiesIpPrefixRulesItem;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IpPrefixImpl implements IpPrefix, IpPrefix.Definition, IpPrefix.Update {
    private IpPrefixInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<IpPrefixPropertiesIpPrefixRulesItem> ipPrefixRules() {
        List<IpPrefixPropertiesIpPrefixRulesItem> inner = this.innerModel().ipPrefixRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String annotation() {
        return this.innerModel().annotation();
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

    public IpPrefixInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ipPrefixName;

    private IpPrefixPatch updateBody;

    public IpPrefixImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IpPrefix create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpPrefixes()
                .create(resourceGroupName, ipPrefixName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpPrefix create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpPrefixes()
                .create(resourceGroupName, ipPrefixName, this.innerModel(), context);
        return this;
    }

    IpPrefixImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new IpPrefixInner();
        this.serviceManager = serviceManager;
        this.ipPrefixName = name;
    }

    public IpPrefixImpl update() {
        this.updateBody = new IpPrefixPatch();
        return this;
    }

    public IpPrefix apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpPrefixes()
                .update(resourceGroupName, ipPrefixName, updateBody, Context.NONE);
        return this;
    }

    public IpPrefix apply(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getIpPrefixes().update(resourceGroupName, ipPrefixName, updateBody, context);
        return this;
    }

    IpPrefixImpl(
        IpPrefixInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ipPrefixName = Utils.getValueFromIdByName(innerObject.id(), "ipPrefixes");
    }

    public IpPrefix refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpPrefixes()
                .getByResourceGroupWithResponse(resourceGroupName, ipPrefixName, Context.NONE)
                .getValue();
        return this;
    }

    public IpPrefix refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpPrefixes()
                .getByResourceGroupWithResponse(resourceGroupName, ipPrefixName, context)
                .getValue();
        return this;
    }

    public IpPrefixImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IpPrefixImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IpPrefixImpl withIpPrefixRules(List<IpPrefixPropertiesIpPrefixRulesItem> ipPrefixRules) {
        this.innerModel().withIpPrefixRules(ipPrefixRules);
        return this;
    }

    public IpPrefixImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public IpPrefixImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
