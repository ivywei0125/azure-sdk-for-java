// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVmTroubleshootingInner;

/** Resource collection API of SqlVirtualMachineTroubleshoots. */
public interface SqlVirtualMachineTroubleshoots {
    /**
     * Starts SQL virtual machine troubleshooting.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine troubleshooting entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details required for SQL VM troubleshooting.
     */
    SqlVmTroubleshooting troubleshoot(
        String resourceGroupName, String sqlVirtualMachineName, SqlVmTroubleshootingInner parameters);

    /**
     * Starts SQL virtual machine troubleshooting.
     *
     * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from
     *     the Azure Resource Manager API or the portal.
     * @param sqlVirtualMachineName Name of the SQL virtual machine.
     * @param parameters The SQL virtual machine troubleshooting entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details required for SQL VM troubleshooting.
     */
    SqlVmTroubleshooting troubleshoot(
        String resourceGroupName, String sqlVirtualMachineName, SqlVmTroubleshootingInner parameters, Context context);
}
