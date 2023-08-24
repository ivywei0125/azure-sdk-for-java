// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.StorageAppliancesClient;
import com.azure.resourcemanager.networkcloud.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.networkcloud.fluent.models.StorageApplianceInner;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;
import com.azure.resourcemanager.networkcloud.models.StorageAppliance;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceEnableRemoteVendorManagementParameters;
import com.azure.resourcemanager.networkcloud.models.StorageAppliances;

public final class StorageAppliancesImpl implements StorageAppliances {
    private static final ClientLogger LOGGER = new ClientLogger(StorageAppliancesImpl.class);

    private final StorageAppliancesClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public StorageAppliancesImpl(
        StorageAppliancesClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageAppliance> list() {
        PagedIterable<StorageApplianceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new StorageApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageAppliance> list(Context context) {
        PagedIterable<StorageApplianceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new StorageApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageAppliance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<StorageApplianceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new StorageApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageAppliance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<StorageApplianceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new StorageApplianceImpl(inner1, this.manager()));
    }

    public Response<StorageAppliance> getByResourceGroupWithResponse(
        String resourceGroupName, String storageApplianceName, Context context) {
        Response<StorageApplianceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, storageApplianceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageApplianceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageAppliance getByResourceGroup(String resourceGroupName, String storageApplianceName) {
        StorageApplianceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, storageApplianceName);
        if (inner != null) {
            return new StorageApplianceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String storageApplianceName) {
        this.serviceClient().delete(resourceGroupName, storageApplianceName);
    }

    public void delete(String resourceGroupName, String storageApplianceName, Context context) {
        this.serviceClient().delete(resourceGroupName, storageApplianceName, context);
    }

    public OperationStatusResult disableRemoteVendorManagement(String resourceGroupName, String storageApplianceName) {
        OperationStatusResultInner inner =
            this.serviceClient().disableRemoteVendorManagement(resourceGroupName, storageApplianceName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult disableRemoteVendorManagement(
        String resourceGroupName, String storageApplianceName, Context context) {
        OperationStatusResultInner inner =
            this.serviceClient().disableRemoteVendorManagement(resourceGroupName, storageApplianceName, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult enableRemoteVendorManagement(String resourceGroupName, String storageApplianceName) {
        OperationStatusResultInner inner =
            this.serviceClient().enableRemoteVendorManagement(resourceGroupName, storageApplianceName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult enableRemoteVendorManagement(
        String resourceGroupName,
        String storageApplianceName,
        StorageApplianceEnableRemoteVendorManagementParameters storageApplianceEnableRemoteVendorManagementParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .enableRemoteVendorManagement(
                    resourceGroupName,
                    storageApplianceName,
                    storageApplianceEnableRemoteVendorManagementParameters,
                    context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public StorageAppliance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageApplianceName = Utils.getValueFromIdByName(id, "storageAppliances");
        if (storageApplianceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageAppliances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, storageApplianceName, Context.NONE).getValue();
    }

    public Response<StorageAppliance> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageApplianceName = Utils.getValueFromIdByName(id, "storageAppliances");
        if (storageApplianceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageAppliances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, storageApplianceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageApplianceName = Utils.getValueFromIdByName(id, "storageAppliances");
        if (storageApplianceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageAppliances'.", id)));
        }
        this.delete(resourceGroupName, storageApplianceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageApplianceName = Utils.getValueFromIdByName(id, "storageAppliances");
        if (storageApplianceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageAppliances'.", id)));
        }
        this.delete(resourceGroupName, storageApplianceName, context);
    }

    private StorageAppliancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public StorageApplianceImpl define(String name) {
        return new StorageApplianceImpl(name, this.manager());
    }
}
