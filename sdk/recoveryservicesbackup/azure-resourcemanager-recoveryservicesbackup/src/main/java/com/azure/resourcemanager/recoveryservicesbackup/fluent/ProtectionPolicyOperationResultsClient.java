// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;

/**
 * An instance of this class provides access to all the operations defined in ProtectionPolicyOperationResultsClient.
 */
public interface ProtectionPolicyOperationResultsClient {
    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProtectionPolicyResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String policyName, String operationId, Context context);

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionPolicyResourceInner get(
        String vaultName, String resourceGroupName, String policyName, String operationId);
}
