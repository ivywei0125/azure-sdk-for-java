// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.OperationStatusInner;

/** An instance of this class provides access to all the operations defined in FabricOperationsStatusClient. */
public interface FabricOperationsStatusClient {
    /**
     * Gets the fabric operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the fabric.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationStatusInner> getWithResponse(
        String resourceGroupName, String fabricName, String operationId, Context context);

    /**
     * Gets the fabric operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the fabric.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fabricName The fabric name.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner get(String resourceGroupName, String fabricName, String operationId);
}
