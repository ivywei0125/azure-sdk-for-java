// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkPublicIpInner;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPublicIp;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPublicIpProvisioningState;

public final class WorkloadNetworkPublicIpImpl implements WorkloadNetworkPublicIp, WorkloadNetworkPublicIp.Definition {
    private WorkloadNetworkPublicIpInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    WorkloadNetworkPublicIpImpl(WorkloadNetworkPublicIpInner innerObject,
        com.azure.resourcemanager.avs.AvsManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Long numberOfPublicIPs() {
        return this.innerModel().numberOfPublicIPs();
    }

    public String publicIpBlock() {
        return this.innerModel().publicIpBlock();
    }

    public WorkloadNetworkPublicIpProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public WorkloadNetworkPublicIpInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String privateCloudName;

    private String publicIpId;

    public WorkloadNetworkPublicIpImpl withExistingPrivateCloud(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    public WorkloadNetworkPublicIp create() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .createPublicIp(resourceGroupName, privateCloudName, publicIpId, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkloadNetworkPublicIp create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .createPublicIp(resourceGroupName, privateCloudName, publicIpId, this.innerModel(), context);
        return this;
    }

    WorkloadNetworkPublicIpImpl(String name, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = new WorkloadNetworkPublicIpInner();
        this.serviceManager = serviceManager;
        this.publicIpId = name;
    }

    public WorkloadNetworkPublicIp refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .getPublicIpWithResponse(resourceGroupName, privateCloudName, publicIpId, Context.NONE)
            .getValue();
        return this;
    }

    public WorkloadNetworkPublicIp refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkloadNetworks()
            .getPublicIpWithResponse(resourceGroupName, privateCloudName, publicIpId, context)
            .getValue();
        return this;
    }

    public WorkloadNetworkPublicIpImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public WorkloadNetworkPublicIpImpl withNumberOfPublicIPs(Long numberOfPublicIPs) {
        this.innerModel().withNumberOfPublicIPs(numberOfPublicIPs);
        return this;
    }
}
