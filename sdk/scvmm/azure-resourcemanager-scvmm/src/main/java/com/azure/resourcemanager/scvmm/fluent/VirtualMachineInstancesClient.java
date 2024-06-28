// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInstanceInner;
import com.azure.resourcemanager.scvmm.models.DeleteFromHost;
import com.azure.resourcemanager.scvmm.models.ForceDelete;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.scvmm.models.VirtualMachineCreateCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineDeleteCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineInstanceUpdate;
import com.azure.resourcemanager.scvmm.models.VirtualMachineRestoreCheckpoint;

/**
 * An instance of this class provides access to all the operations defined in VirtualMachineInstancesClient.
 */
public interface VirtualMachineInstancesClient {
    /**
     * Implements List virtual machine instances.
     * 
     * Lists all of the virtual machine instances within the specified parent resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualMachineInstance list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInstanceInner> list(String resourceUri);

    /**
     * Implements List virtual machine instances.
     * 
     * Lists all of the virtual machine instances within the specified parent resource.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a VirtualMachineInstance list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInstanceInner> list(String resourceUri, Context context);

    /**
     * Gets a virtual machine.
     * 
     * Retrieves information about a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineInstanceInner> getWithResponse(String resourceUri, Context context);

    /**
     * Gets a virtual machine.
     * 
     * Retrieves information about a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstanceInner get(String resourceUri);

    /**
     * Implements virtual machine PUT method.
     * 
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstanceInner>, VirtualMachineInstanceInner>
        beginCreateOrUpdate(String resourceUri, VirtualMachineInstanceInner resource);

    /**
     * Implements virtual machine PUT method.
     * 
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstanceInner>, VirtualMachineInstanceInner>
        beginCreateOrUpdate(String resourceUri, VirtualMachineInstanceInner resource, Context context);

    /**
     * Implements virtual machine PUT method.
     * 
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstanceInner createOrUpdate(String resourceUri, VirtualMachineInstanceInner resource);

    /**
     * Implements virtual machine PUT method.
     * 
     * The operation to create or update a virtual machine instance. Please note some properties can be set only during
     * virtual machine instance creation.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstanceInner createOrUpdate(String resourceUri, VirtualMachineInstanceInner resource,
        Context context);

    /**
     * Updates a virtual machine.
     * 
     * The operation to update a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstanceInner>, VirtualMachineInstanceInner> beginUpdate(String resourceUri,
        VirtualMachineInstanceUpdate properties);

    /**
     * Updates a virtual machine.
     * 
     * The operation to update a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstanceInner>, VirtualMachineInstanceInner> beginUpdate(String resourceUri,
        VirtualMachineInstanceUpdate properties, Context context);

    /**
     * Updates a virtual machine.
     * 
     * The operation to update a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstanceInner update(String resourceUri, VirtualMachineInstanceUpdate properties);

    /**
     * Updates a virtual machine.
     * 
     * The operation to update a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachineInstance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstanceInner update(String resourceUri, VirtualMachineInstanceUpdate properties, Context context);

    /**
     * Deletes an virtual machine.
     * 
     * The operation to delete a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceUri);

    /**
     * Deletes an virtual machine.
     * 
     * The operation to delete a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param force Forces the resource to be deleted.
     * @param deleteFromHost Whether to disable the VM from azure and also delete it from Vmm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceUri, ForceDelete force, DeleteFromHost deleteFromHost,
        Context context);

    /**
     * Deletes an virtual machine.
     * 
     * The operation to delete a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri);

    /**
     * Deletes an virtual machine.
     * 
     * The operation to delete a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param force Forces the resource to be deleted.
     * @param deleteFromHost Whether to disable the VM from azure and also delete it from Vmm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri, ForceDelete force, DeleteFromHost deleteFromHost, Context context);

    /**
     * Implements the operation to creates a checkpoint in a virtual machine instance.
     * 
     * Creates a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreateCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body);

    /**
     * Implements the operation to creates a checkpoint in a virtual machine instance.
     * 
     * Creates a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreateCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body,
        Context context);

    /**
     * Implements the operation to creates a checkpoint in a virtual machine instance.
     * 
     * Creates a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body);

    /**
     * Implements the operation to creates a checkpoint in a virtual machine instance.
     * 
     * Creates a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body, Context context);

    /**
     * Implements the operation to delete a checkpoint in a virtual machine instance.
     * 
     * Deletes a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body);

    /**
     * Implements the operation to delete a checkpoint in a virtual machine instance.
     * 
     * Deletes a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body,
        Context context);

    /**
     * Implements the operation to delete a checkpoint in a virtual machine instance.
     * 
     * Deletes a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body);

    /**
     * Implements the operation to delete a checkpoint in a virtual machine instance.
     * 
     * Deletes a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body, Context context);

    /**
     * Implements the operation to restart a virtual machine.
     * 
     * The operation to restart a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceUri);

    /**
     * Implements the operation to restart a virtual machine.
     * 
     * The operation to restart a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceUri, Context context);

    /**
     * Implements the operation to restart a virtual machine.
     * 
     * The operation to restart a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceUri);

    /**
     * Implements the operation to restart a virtual machine.
     * 
     * The operation to restart a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceUri, Context context);

    /**
     * Implements the operation to restores to a checkpoint in a virtual machine instance.
     * 
     * Restores to a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body);

    /**
     * Implements the operation to restores to a checkpoint in a virtual machine instance.
     * 
     * Restores to a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body,
        Context context);

    /**
     * Implements the operation to restores to a checkpoint in a virtual machine instance.
     * 
     * Restores to a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body);

    /**
     * Implements the operation to restores to a checkpoint in a virtual machine instance.
     * 
     * Restores to a checkpoint in virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body, Context context);

    /**
     * Implements the operation to start a virtual machine.
     * 
     * The operation to start a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceUri);

    /**
     * Implements the operation to start a virtual machine.
     * 
     * The operation to start a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceUri, Context context);

    /**
     * Implements the operation to start a virtual machine.
     * 
     * The operation to start a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceUri);

    /**
     * Implements the operation to start a virtual machine.
     * 
     * The operation to start a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceUri, Context context);

    /**
     * Implements the operation to stop a virtual machine.
     * 
     * The operation to power off (stop) a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(String resourceUri, StopVirtualMachineOptions body);

    /**
     * Implements the operation to stop a virtual machine.
     * 
     * The operation to power off (stop) a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(String resourceUri, StopVirtualMachineOptions body, Context context);

    /**
     * Implements the operation to stop a virtual machine.
     * 
     * The operation to power off (stop) a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceUri, StopVirtualMachineOptions body);

    /**
     * Implements the operation to stop a virtual machine.
     * 
     * The operation to power off (stop) a virtual machine instance.
     * 
     * @param resourceUri The fully qualified Azure Resource manager identifier of the resource.
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceUri, StopVirtualMachineOptions body, Context context);
}
