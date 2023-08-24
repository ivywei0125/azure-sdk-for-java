// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.BareMetalMachinesClient;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineInner;
import com.azure.resourcemanager.networkcloud.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachine;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCordonParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachinePowerOffParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineReplaceParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunCommandParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunDataExtractsParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunReadCommandsParameters;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachines;
import com.azure.resourcemanager.networkcloud.models.OperationStatusResult;

public final class BareMetalMachinesImpl implements BareMetalMachines {
    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachinesImpl.class);

    private final BareMetalMachinesClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public BareMetalMachinesImpl(
        BareMetalMachinesClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BareMetalMachine> list() {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> list(Context context) {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BareMetalMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BareMetalMachineInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineImpl(inner1, this.manager()));
    }

    public Response<BareMetalMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String bareMetalMachineName, Context context) {
        Response<BareMetalMachineInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BareMetalMachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BareMetalMachine getByResourceGroup(String resourceGroupName, String bareMetalMachineName) {
        BareMetalMachineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new BareMetalMachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String bareMetalMachineName) {
        this.serviceClient().delete(resourceGroupName, bareMetalMachineName);
    }

    public void delete(String resourceGroupName, String bareMetalMachineName, Context context) {
        this.serviceClient().delete(resourceGroupName, bareMetalMachineName, context);
    }

    public OperationStatusResult cordon(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().cordon(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult cordon(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineCordonParameters bareMetalMachineCordonParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .cordon(resourceGroupName, bareMetalMachineName, bareMetalMachineCordonParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult powerOff(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().powerOff(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult powerOff(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachinePowerOffParameters bareMetalMachinePowerOffParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .powerOff(resourceGroupName, bareMetalMachineName, bareMetalMachinePowerOffParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult reimage(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().reimage(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult reimage(String resourceGroupName, String bareMetalMachineName, Context context) {
        OperationStatusResultInner inner =
            this.serviceClient().reimage(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult replace(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().replace(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult replace(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineReplaceParameters bareMetalMachineReplaceParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .replace(resourceGroupName, bareMetalMachineName, bareMetalMachineReplaceParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult restart(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().restart(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult restart(String resourceGroupName, String bareMetalMachineName, Context context) {
        OperationStatusResultInner inner =
            this.serviceClient().restart(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runCommand(resourceGroupName, bareMetalMachineName, bareMetalMachineRunCommandParameters);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runCommand(resourceGroupName, bareMetalMachineName, bareMetalMachineRunCommandParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runDataExtracts(resourceGroupName, bareMetalMachineName, bareMetalMachineRunDataExtractsParameters);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runDataExtracts(
                    resourceGroupName, bareMetalMachineName, bareMetalMachineRunDataExtractsParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runReadCommands(resourceGroupName, bareMetalMachineName, bareMetalMachineRunReadCommandsParameters);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters,
        Context context) {
        OperationStatusResultInner inner =
            this
                .serviceClient()
                .runReadCommands(
                    resourceGroupName, bareMetalMachineName, bareMetalMachineRunReadCommandsParameters, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult start(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().start(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult start(String resourceGroupName, String bareMetalMachineName, Context context) {
        OperationStatusResultInner inner = this.serviceClient().start(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult uncordon(String resourceGroupName, String bareMetalMachineName) {
        OperationStatusResultInner inner = this.serviceClient().uncordon(resourceGroupName, bareMetalMachineName);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatusResult uncordon(String resourceGroupName, String bareMetalMachineName, Context context) {
        OperationStatusResultInner inner =
            this.serviceClient().uncordon(resourceGroupName, bareMetalMachineName, context);
        if (inner != null) {
            return new OperationStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BareMetalMachine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, Context.NONE).getValue();
    }

    public Response<BareMetalMachine> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, bareMetalMachineName, context);
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
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        this.delete(resourceGroupName, bareMetalMachineName, Context.NONE);
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
        String bareMetalMachineName = Utils.getValueFromIdByName(id, "bareMetalMachines");
        if (bareMetalMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachines'.", id)));
        }
        this.delete(resourceGroupName, bareMetalMachineName, context);
    }

    private BareMetalMachinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public BareMetalMachineImpl define(String name) {
        return new BareMetalMachineImpl(name, this.manager());
    }
}
